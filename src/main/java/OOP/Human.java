package OOP;

public class Human {
    private double height;
    private String name;
    private String nationality;
    private int age;
    private String gender;
    final int numberOfHearts = 1; // Final - semnifica o valoare constanta, care nu se schimbs dupa ce este initializata;
    private static int numbersofHumanCreated = 0;

    public Human(String name, String nationality, String gender, int age, double height) {
        this.name = name;
        this.nationality = nationality;
        this.gender = gender;
        this.height = height;
        this.age = age;
        numbersofHumanCreated++;
        }

        //GETTER
    public String getName() {
        return String.valueOf(this.name.charAt(0)) + ".";
        }

    public String getNationality() {
        return this.nationality = nationality;
        }

    public String getGender() {
        return this.gender = gender;
        }
    public double getHeight() {
        return this.height = height;
    }

    public int getAge() {
        return this.age = age;
    }

    public int setAge() {
        return this.age = age;
    }

    //SETTER
     public void setName(String name) {
        this.name = name;
     }
    public void setAge(int newAge){
        if(newAge >= 0 && newAge <= 120){
        this.age = newAge;
        } else {
                System.out.println((newAge + " is not a valid age, please choose between 0 and 120"));
            }

    }
    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void walk(double distance) {
        System.out.println(name + " walks " + distance + " meters");
    }

    public void walk(double distance, double speed) {
        System.out.println(name + " walks " + distance + " meters with " + speed + " km/h.");
    }
}

