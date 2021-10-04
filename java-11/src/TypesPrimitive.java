public class TypesPrimitive {

    public static void main(String[] args) {
        int age = 20;
        String name = "Bruno";
        double salary = 10000.00;
        boolean isAdult = age > 18;

        String mySelf = String.format("I'm %s, I'm %d years old. I wanna receive %.2f on my first job and I'm %s", name, age, salary, (isAdult ? "Adult":"Not Adult"));
        System.out.println(mySelf);

        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer minimum value = " + minIntValue);
        System.out.println("Integer maximum value = " + maxIntValue);


        byte bMinValue = Byte.MIN_VALUE;
        byte bMaxValue = Byte.MAX_VALUE;

        System.out.println(bMinValue);
        System.out.println(bMaxValue);
        
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;


        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.println(minShort);
        System.out.println(maxShort);
        System.out.println(minLong);
        System.out.println(maxLong);

    }
}
