package Lesson1;

public class Test1 {

    public static void main(String[] args) {
        double a = 11.5;
        double b = 3;
        double intregul = a / b;
        double restul = a % b;

        System.out.println(intregul);
        System.out.println(restul);

        int x = 8;
        int y = 3;
        int z = x++ - ++y;

        System.out.println("z = " + z);
        System.out.println("x = " + x);
    }
}
