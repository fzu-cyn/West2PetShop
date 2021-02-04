public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, String sex, int age, double weight, String ID, double purchase, double sale, String state) {
        super(name, sex, age, weight, ID, purchase, sale, state);
    }

    public Cat(String name, String sex, int age, double weight, String ID, String state) {
        super(name, sex, age, weight, ID, state);
    }

    public String toString() {
        return "Cat{" +
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
