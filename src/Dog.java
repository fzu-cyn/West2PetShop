public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, String sex, int age, double weight, String ID, double purchase, double sale, String state) {
        super(name, sex, age, weight, ID, purchase, sale, state);
    }

    public Dog(String name, String sex, int age, double weight, String ID, String state) {
        super(name, sex, age, weight, ID, state);
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", ID='" + ID + '\'' +
                ", purchase=" + purchase +
                ", sale=" + sale +
                ", state='" + state + '\'' +
                '}';
    }
}
