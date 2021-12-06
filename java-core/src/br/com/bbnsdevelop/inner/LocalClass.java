package br.com.bbnsdevelop.inner;

public class LocalClass {
	
	
	void f1() {
		System.out.println("Inside f1()");
		class LocalInner {
			void f2() {
				System.out.println("Inside localInners f2()");
			}
		}
		
		LocalInner inner = new LocalInner();
		inner.f2();
	}
	
	
	public static void main(String[] args) {
		LocalClass l = new LocalClass();
		l.f1();
	}

}
