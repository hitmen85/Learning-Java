package Lesson1;

public class Test2 {
    public static void main(String[] args) {
     int a = 5;
     int c = a-- - --a + ++a + a++ + a;
     int b = 8;
     int d = ++b - b++ + ++b - --b;
   System.out.println("c = " + c);
   System.out.println("d = " + d);

   int i1 = 5;
   int i2 = 11;
   double d1 = 5.5;
   double d2 = 1.3;
   long l = 20l;
   double r = 0;
   r = i2/d1 + d2%i1 - l;
   System.out.println("r = " + r);

    }

}
