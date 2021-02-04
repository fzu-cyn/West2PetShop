public class Fox extends Animal {
    public Fox() {
    }

    public Fox(String name, String sex, int age, double weight, String ID, double purchase, double sale, String state) {
        super(name, sex, age, weight, ID, purchase, sale, state);
    }

    public Fox(String name, String sex, int age, double weight, String ID, String state) {
        super(name, sex, age, weight, ID, state);
    }

    public String toString() {
        return "Fox{" +
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
