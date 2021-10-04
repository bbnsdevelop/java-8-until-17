public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello, Bruno");

        int myFirstNumber = (5 + 10) + (2 * 10);
        String numberFormatted = String.format("My number was initialized with: %d", myFirstNumber);
        System.out.println(myFirstNumber);
        System.out.println(numberFormatted);

        int total = (myFirstNumber + (myFirstNumber * 9)) / 3;

        System.out.println(total);

    }
}
