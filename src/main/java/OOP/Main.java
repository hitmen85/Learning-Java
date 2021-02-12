package OOP;

public class Main {
    public static void main(String[] args) {
        Human mark = new Human("Mark", "Armenian", "male", 53, 1.80);
        System.out.println(mark.getName());
        System.out.println(mark.getNationality());
        System.out.println(mark.getGender());
        System.out.println(mark.getAge());
        System.out.println(mark.getHeight());

        mark.setAge(Integer.MAX_VALUE);
        System.out.println(mark.getAge());

        System.out.println("\n############################################# \n");

        Female zina = new Female("Zina", "Moldoveanca",112, 1.52, 30, 58);
        System.out.println(zina.getName());
        System.out.println(zina.getNationality());
        System.out.println(zina.getGender());
        System.out.println(zina.getHeight());

        System.out.println("Zina's age is " + zina.getAge() + " years old.");
        System.out.println("Zina's weight is " + zina.getWeight() + " kg.");
        System.out.println("Zina's hair length is " + zina.getHairLength() + " cm.");
        mark.walk(3.2);
        zina.walk(2.8);

        mark.walk( 50, 3);
        zina.walk( 80, 2.7);
    }
}
