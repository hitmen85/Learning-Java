package OOP;

public class Female extends Human {

    private int hairLength;
    private int weight;

    public Female(String name, String nationality, int age, double height) { //Constructorul Female apeleaza prin metoda super constructorul Human
        super(name, nationality, "Female", age, height);
    }

    public Female(String name, String nationality, int age, double height, int hairLength, int weight) { //Constructorul Female apeleaza prin metoda super constructorul Human
        super(name, nationality, "Female", age, height);
        this.hairLength = hairLength;
        this.weight = weight;
    }

    public void setAge(int age) {
        if(age >= 0 && age <=115) {
            super.setAge(age);
        } else {
            System.out.println((age + " is not a valid age, please choose between 0 and 115"));
        }
    }

    public int getHairLength() {
        return hairLength;
    }

    public void setHairLength(int hairLength) {
        this.hairLength = hairLength;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public void walk (double distance) {
        System.out.println(super.getName() + " walks " + distance + " meters gracefully!");
    }
}
