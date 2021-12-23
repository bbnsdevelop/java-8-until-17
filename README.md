# java-8-until-17
![image](https://user-images.githubusercontent.com/36892558/147249337-2866dbe0-a11b-40c4-baac-f7376885215c.png)


updating my knowledge/Skill in Java 8 until 17.

Since the release of version 8, up to version 17, Java is shaped by 194 JDK Enhancement Proposals (JEPs), each of which brings some improvement to the platform. This page is a categorized and curated list of the most important improvements.

# Sealed Classes can restrict which other classes may extend them
* JDK 17 (Preview 🔍 in JDK 16 JDK 15)

```ruby
public abstract sealed class Shape
    permits Circle, Rectangle {...}

public final class Circle extends Shape {...} // OK
public final class Rectangle extends Shape {...} // OK
public final class Triangle extends Shape {...} // Compile error

// No need for default case if all permitted types are covered
double area = switch (shape) {
    case Circle c    -> Math.pow(c.radius(), 2) * Math.PI
    case Rectangle r -> r.a() * r.b()
};
```
* Pattern Matching for switch supporting type patterns and guarded patterns (Preview 🔍) JDK 17

```ruby
String formatted = switch (o) {
    case Integer i && i > 10 -> String.format("a large Integer %d", i);
    case Integer i -> String.format("a small Integer %d", i);
    case Long l    -> String.format("a Long %d", l);
    default        -> o.toString();
};

```

* Record Classes, terse syntax to define immutable DTOs JDK 16

```ruby
record Point(int x, int y) { }
  
var point = new Point(1, 2);
point.x(); // returns 1
point.y(); // returns 2

```

* Pattern Matching for instanceof to eliminate the need for explicit casts after a type check JDK 16 (Preview 🔍 in JDK 15 JDK 14)

``` ruby
if (obj instanceof String s && s.length() > 5) {
    System.out.println("obj is a String with more than 5 characters: " + s.toUpperCase());
}
```

* Text Blocks JDK 15 (Preview 🔍 in JDK 14 JDK 13)

``` ruby
String html = """
            <html>
                <body>
                    <p>Hello, world</p>
                </body>
            </html>
            """;
```

* Helpful NullPointerExceptions describing precisely which variable was null

``` ruby
a.b.c.i = 99;
---
Exception in thread "main" java.lang.NullPointerException:
      Cannot read field "c" because "a.b" is null

```


* Switch Expressions JDK 14 (Preview 🔍 in JDK 12 JDK 13)

``` ruby
int numLetters = switch (day) {
    case MONDAY, FRIDAY, SUNDAY -> 6;
    case TUESDAY                -> 7;
    default      -> {
      String s = day.toString();
      int result = s.length();
      yield result;
    }
};

```


* Introduction of var to make local variable declarations less ceremonious JDK 11 (Without lambda support in JDK 10)

``` ruby

var greeting = "Hello World!";

```

* Opt-in and backwards-compatible Module System to avoid ClassDefNotFoundErrors at runtime and create internal APIs JDK 9 (Project Jigsaw)

``` ruby
module hu.advancedweb.helloworld {
    requires hu.advancedweb.somedependency;
    exports hu.advancedweb.hello
}
```


* Private methods in interfaces JDK 9 (Milling Project Coin)

* Diamond operator for anonymous inner classes JDK 9 (Milling Project Coin)

* Try-with-resources allows effectively final variables JDK 9 (Milling Project Coin)

* @SafeVargs on private instance methods JDK 9 (Milling Project Coin)

* No deprecation warnings on import statements

# New APIs

* General
* Process::inputReader, Process::outputWritter, Process::errorReader to access the standard input, output and error streams of the process JDK 17

* java.time.InstantSource, an interface that provides the current instant, an abstraction from java.time.Clock that only focuses on the current instant and does not refer to the time zone JDK 17

* HexFormat to encode and decode of hexadecimal strings JDK 17

``` ruby

HexFormat.of().toHexDigits(123);
//  ==> "0000007b"
HexFormat.of().fromHexDigits("0000007b");
// ==> 123

```

* Vector API to express computations that compile to optimal hardware instructions (Incubator ) JDK 17 JDK 16

* Foreign linker API for statically-typed, pure-Java access to native code (Incubator ) JDK 17 JDK 16

* Foreign memory access API to access memory outside of the Java heap (Incubator ) JDK 17 JDK 16

* Align random generators (Random, ThreadLocalRandom, and SplittableRandom) by providing common interfaces making it easier to use PRNG algorithms interchangeably, provide random Streams. JDK 17


``` ruby

new Random().ints()
    .limit(10)
    .forEach(System.out::println);

```

* Stream.toList as convenience for the most typical collection method (instead of relying on .collect(Collectors.toList())) JDK 16

``` ruby

List<String> result =
  Stream.of("one", "two", "three").stream()
    .filter(s -> s.length() == 3)
    .toList();

```

* Stream.mapMulti to replace each element of this stream with zero or more elements, an alternative to flatMap JDK 16

``` ruby

Stream.of(1, 2, 3, 4)
    .mapMulti((number, downstream) -> downstream.accept(number))
    .forEach(System.out::print); 
    // prints 1234

```

* → Related: Faster flatMaps with Stream::mapMulti in Java 16

* New builder to HTTP client that specifies a header filter JDK 16

* DateTimeFormatterBuilder.html#appendDayPeriodText to support other day periods than AM/PM JDK 16



* Unix-domain socket channels and server socket channels JDK 16

* @Serial to indicate fields and methods that are part of the serialization mechanism (e.g. serialVersionUID and readObject) JDK 14

* Support Non-Volatile Mapped Byte Buffers in the FileChannel API JDK 14

* Files.mismatch: find the first mismatched byte in the content of two files JDK 12

* Collectors.teeing to create a Collector that is a composite of two downstream collectors JDK 12

* String enhancements: indent and transform JDK 12

* Standard HTTP Client featuring HTTP/2, WebSocket support and non-blocking API JDK 11 (Incubator in JDK 9)


``` ruby

HttpClient httpClient = HttpClient.newBuilder().build();

HttpRequest request =
  HttpRequest.newBuilder()
    .uri(URI.create("https://advancedweb.hu/"))
    .GET()
    .build();

HttpResponse<String> response =
  httpClient.send(request, BodyHandlers.ofString());


```

* String enhancements, like isBlank, lines, repeat and strip JDK 11


Convenience Factory Methods for Collections to ease the pain of not having collection literals JDK 9

``` ruby

Set<Integer> mySet = Set.of(1, 2, 3);
List<Integer> myList = List.of(1, 2, 3);
Map<String, Integer> myMap = Map.of("one", 1, "two", 2);

```


* Reactive Streams publish-subscribe framework for asynchronous stream processing with non-blocking backpressure JDK 9

* Time-based enhancements to CompletableFuture (timeout, delay) JDK 9

* More options to transform (dropWhile, takeWhile) and generate (iterate, ofNullable) streams; readonly collectors (toUnmodifiableList); optionals can be transformed to streams JDK 9

* Arrays.mismatch: find the first mismatching element between two arrays JDK 9

* System.Logger API providing a common mechanism to handle platform logs, allowing JDK platform classes to use the same logging framework as the application JDK 9

* Stack-Walking API that allows laziness and stack-frame filtering JDK 9

* Process API provides more info and control (e.g. process ID, arguments, CPU time, parent/child processes), enhance ProcessBuilder to aid the creation of process pipelines JDK 9

* VarHandle API to replace the field and array related operations of java.util.concurrent.atomic and sun.misc.Unsafe in order to and provide low-level access mechamisms, e.g. atomic write. JDK 9

* New combinators and lookup methods for MethodHandle JDK 9

* Enhanced Deprecation policy. @Deprecated can be marked with forRemoval, which emits a new warning. JDK 9

* OASIS Standard XML Catalog API to manage external resources in XMLs in a secure and performant manner JDK 9

* Update JDK’s XML parser, Xerces, to version 2.11.0 JDK 9

* TIFF Support for Image I/O Framework JDK 9


# Internationalization

* Unicode 10.0, adding roughly 27,000 characters, 10 blocks, and more than 30 scripts JDK 11 (Unicode 8.0 support in JDK 9)

* java.util.Locale and related APIs support currency type, time zone and more JDK 10

* ResourceBundle loads properties files in UTF-8 instead of ISO-8859-1 JDK 9

* CLDR Locale Data Enabled by Default JDK 9


# Graphics and Desktop Applications


* Desktop features for all platforms like login/logout/lock event listener and task bar interactions JDK 9

* MultiResolutionImage that makes easy to retrieve a resolution-specific image for a DPI JDK 9

* HiDPI Graphics on Windows and Linux JDK 9

* Enable GTK 3 on Linux for JavaFX, Swing, and AWT JDK 9

* Replace @beaninfo Javadoc tags with @BeanInfo annotations for Swing JDK 9

* Update GStreamer included in JavaFX/Media to version 1.4.4 JDK 9

* Replace the existing ICU OpenType font-layout engine with HarfBuzz JDK 9


# Performance Improvements
# General


* Elastic metaspace to return unused HotSpot class-metadata memory to the operating system more promptly JDK 16

* Foreign-Memory Access API to safely and efficiently use off-heap memory (Incubator 🥚) JDK 15 JDK 14

* Enable dynamic archiving of classes at the end of Java application execution JDK 13

* Class-Data Sharing archive of the default class list is enabled by default to improve out-of-the-box startup time JDK 12

* Application Class-Data Sharing to improve startup time and reduce footprint by sharing class metadata between Java processes. JDK 10

* Space-efficient, Compact Strings that stores Latin-1 only Strings more efficiently JDK 9

* Code caches of profiled and non-profiled compiled code is separated, resulting in improved performance and memory footprint JDK 9

* Store Interned Strings in Class-Data Sharing archives to reduce memory consumption JDK 9


# Library



* New internal macOS rendering pipeline that supports Apple’s new Metal Framework for the Java 2D API, replacing the old rendering pipeline that targets OpenGL which was deprecated by Apple in macOS 10.14 Performance comparision: JDK-8261408 JDK 17

* Improved intrinsics for java.lang.Math sin, cos and log functions on AArch64 processors JDK 11

* Security Manager performance improvements JDK 9

* Spin-Wait Hint (Thread#onSpinWait) to optimize busy-waiting style loops JDK 9

* Use Marlin Renderer in Java 2D as the default graphics rasterizer instead of Pisces JDK 9

* Improved GHASH and RSA performance by leveraging recently-introduced SPARC and Intel x64 CPU instructions JDK 9



# Concurrency



* Thread-Local Handshakes to stop individual threads JDK 10

* Improved performance of contended object monitors JDK 9

* Extra space on thread stack for critical sections, mitigating the risk of a deadlock in java.util.concurrent locks in case of a stack overflow JDK 9


# Compiler


* Java based JVM compiler interface (JVMCI) (Experimental 💥) JDK 9 (JVM Compiler Interface)

* Performance improvement in javac: new strategy for type checking poly expressions JDK 9


# G1 Garbage Collector (default)


* NUMA-Aware Memory Allocation JDK 14

* Abortable mixed collections to meet user-supplied pause goals JDK 12

* Automatically return heap memory to the operating system when idle JDK 12

* Parallel Full GC to improve worst-case latencies JDK 10

* G1 Garbage Collector is now the default instead of Parallel GC JDK 9


# Other Garbage Collectors

* Z Garbage Collector, offering very low pause times on large heaps JDK 16 JDK 15 (Experimental 💥 in JDK 14 (Windows) JDK 14 (OS X) JDK 11 (Linux) )

* Shenandoah Garbage Collector, offering similar benefits as ZGC but based on a different algorithm JDK 15 (Experimental 💥 in JDK 12 )

* Epsilon Garbage Collector, which does not implement actual memory reclamation, striving for the lowest overhead possible JDK 11

* XX:AllocateHeapAt=<path> to support Alternative Memory Devices JDK 10



# Diagnostic and Tools


* Flight Recorder Event Streaming: profiling data is available via an API, making it suitable for continuous monitoring JDK 14

* Microbenchmark Suite based on JMH JDK 12

* Flight Recorder is part of OpenJDK JDK 11

* Low-Overhead Heap Profiling via JMTI JDK 11

* Run-time manageable and method specific control of the C1 and C2 compilers that enables contained tests JDK 9

* Fine-grained, easy-to-configure Logging System for all components of the JVM JDK 9 (Unified JVM Logging) JDK 9 (Unified GC Logging)

* Allow the application to provide logger implementation to be used by platform classes JDK 9


# Security Improvements


* Validate Incoming Serialization Data JDK 17 JDK 9

* Default set of root Certification Authority (CA) certificates are provided with the JDK, so TLS connections are working out of the box JDK 10

* Default keystore type is the standard PKCS12 instead of the proprietary JKS JDK 9

* DRBG-Based SecureRandom JDK 9

* Disable X.509 certificate chains with SHA-1 based signatures JDK 9

* SHA-3 Hash Algorithms JDK 9


# TLS

* TLS 1.3 support JDK 11

* API for Datagram Transport Layer Security (DTLS) JDK 9

* OCSP stapling TLS to improve performance of certificate status checking JDK 9

* TLS Application-Layer Protocol Negotiation (ALPN) Extension which enables protocol negotiation without additional round trips; ALPN is a requirement for HTTP/2 connections JDK 9

# Crypto

* Edwards-Curve Digital Signature Algorithm (EdDSA) - RFC8032 JDK 15

* Key Agreement with Curve25519 and Curve448 JDK 11

* ChaCha20 and Poly1305 Cryptographic Algorithms JDK 11


# Launching


* Launch Single-File Source-Code Programs, including support for shebang (#!) line on Unix JDK 11

* jshell: the Java REPL JDK 9 (Project Kulla)
* → Related: Prototyping with JShell

* Compile for Older Platform Versions with --release, which configures --source and --target and links against the appropriate platform version JDK 9

* Early validatation of JVM Command-Line Flags to avoid crashes JDK 9

# Packaging

* Packaging Tool to create self-contained applications, also supporting native package formats: msi, exe, pkg, dmg, deb and rpm JDK 16 (Incubator 🥚 in JDK 14)
* → Related: Inside Java - Episode 12 “jpackage” with Kevin Rushforth

* jlink Java Linker that can build an optimized, slim run-time image for a modular Java application that contains only the required parts of the JDK JDK 9 - [2], [3], [4], [4], [5]

* Multi-Release JAR Files to allow multiple, Java-release-specific versions of class in a single archive JDK 9

# Javadoc


* The Javadoc tool now emits HTML5 markup instead of a frame-based layout and the documentation contains a search box to ease navigation JDK 9 - [2], [3]

# Bytecode

* Replace Unsafe::defineAnonymousClass() with Lookup::defineHiddenClass(), intended for frameworks to dynamically generate Hidden Classes that can’t be discovered, linked, and used directly by other classes. JDK 15

* java.lang.invoke.constant package to allow easy description of loadable constants (operands for the ldc instruction), which is less error-prone than relying on ad-hoc String representation JDK 12

* CONSTANT_Dynamic constant-pool entry which uses bootstrapping to perform the resolution, similarly to INVOKEDYNAMIC calls JDK 11

* Introduction of the Nest access-control context that wraps classes in the same code entity - such as nested classes - and eliminates the need for compiler to insert bridge methods to the generated bytecode. JDK 11

* Bytecode generated for static String-concatenation uses invokedynamic rather than directly creating StringBuilder#append chains. This will enable future optimizations of String concatenation without requiring bytecode changes. JDK 9

* INVOKEDYNAMIC can express high-level operations on object properties and or collections JDK 9


# New supported platforms


* macOS/AArch64 JDK 17

* Alpine JDK 16

* Windows/AArch64 JDK 16

* Linux/AArch64 JDK 9

* Linux/s390x JDK 9

* Unified arm32/arm64 JDK 9


# New Version Scheme

* Simpler Version-String Scheme. JDK 9 JDK 10


# Deprecation and removal


* Strongly encapsulate internal API’s (sun.*) except for critical APIs such as sun.misc.Unsafe.

* Remove the option for relaxed strong encapsulation via the --illegal-access launcher option\
JDK 17 (Strong encapsulation is the default in JDK 16 with the ability to opt-out with --illegal-access,\
Relaxed strong encapsulation (--illegal-access=permit) is the default in JDK 9 - [2] that warns on the first illegal reflective-access operation.)\
→ Related: Inside Java - Episode 18 “Java’s steady march towards strong encapsulation” with Alan Bateman\

* Make floating-point operations consistently strict by default, warn when the strictfp modifier is used JDK 17 → Related: Wikipedia article explaining what strictfp

* Remove RMI Activation, affecting the java.rmi.activation package and the rmid tool, does not affect Java RMI in general JDK 17 (Deprecated in JDK 15)

* Deprecate Applet API (java.applet.*, javax.swing.JApplet and java.beans.AppletInitializer) for removal JDK 17 (Deprecated in JDK 9)

* Deprecate the Security Manager for Removal Work ongoing to consider use cases where the Security Manager is useful and provide alternatives (e.g. JDK-8199704) JDK 17

* Remove the Experimental AOT and JIT compiler due to lack of interest. JDK 17

* Deprecate the constructors of primitive wrapper classes, disallow synchronization on wrapper objects (Byte, Short, Integer, Long, Float, Double, Boolean, and Character) JDK 16

* Remove the Nashorn Javascript Engine and the jjs tool JDK 15 (Deprecated in JDK 11)

* Remove the Solaris and SPARC Ports JDK 15 (Deprecated in JDK 14)

* Disable Biased Locking by default, deprecate related command-line flags JDK 15

* Deprecate Unsafe::defineAnonymousClass() JDK 15

* Remove the Concurrent Mark Sweep (CMS) Garbage Collector JDK 14

* Deprecate the ParallelScavenge + SerialOld GC Combination JDK 14

* Remove the Pack200 Tools and API JDK 14

* Deprecate the Pack200 Tools and API JDK 11

* Remove Java EE JDK 11

* Remove CORBA JDK 11

* Remove Thread#destroy and Thread#stop JDK 11

* var is no longer a valid class name JDK 10

* Remove the javah tool JDK 10

* Underscore is no longer a valid identifier JDK 9

* Remove apple.applescript and com.apple packages JDK 9

* Disable X.509 certificate chains with SHA-1 based signatures JDK 9

* Remove Launch-Time JRE Version Selection directives: JRE-Version manifest entry and -version: cli option JDK 9

* Remove the jhat tool JDK 9

* Remove the JVM TI hprof Agent JDK 9

* Remove GC Combinations Deprecated in JDK 8 JDK 9

* Deprecate the Concurrent Mark Sweep Garbage Collector JDK 9

* Deprecate Object.finalize() JDK 9

* Remove the Endorsed Standards Override (lib/endorsed) and Extensions (lib/ext) mechanisms from the JRE JDK 9

* Remove rt.jar from the JRE JDK 9

* If you are curious about all the API level differences between Java 8 and 14, check the Java Almanac project. Also check out jdeps, the Java class dependency analyzer to find out if your project is still using an old internal API.


# Summary


* JDK 8 was released in 2014. We had to wait for three and a half years for JDK 9. But since then things accelerated. Java has a new release structure that aims to deliver a new version in every six months. While Java 8 is still supported, migrating to the latest version brings considerable amount of improvements to the table.

# JDK 8
![image](https://user-images.githubusercontent.com/36892558/147246397-b5edef6b-c93c-4d7b-a079-3c92edf40877.png)

# Quick Overview of Java 8 Features
    
Some of the important Java 8 features are;
* forEach() method in Iterable interface
* default and static methods in Interfaces
* Functional Interfaces and Lambda Expressions
* Java Stream API for Bulk Data Operations on Collections
* Java Time API
* Collection API improvements
* Concurrency API improvements
* Java IO improvements
    
    
 Let’s have a brief look on these Java 8 features. I will provide some code snippets for better understanding the features in a simple way.
 
    
* forEach()   
    
```
 
public class Java8ForEachExample {
 
    public static void main(String[] args) {         

        List<Integer> myList = new ArrayList<Integer>();
        myList.add(10);
        myList.forEach(number -> System.out.println(number));
         
    } 
} 

```
