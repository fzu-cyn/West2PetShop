public class Bird extends Animal{
    public Bird() {}

    public Bird(String name, String sex, int age, double weight, String ID, double purchase, double sale, String state) {
        super(name, sex, age, weight, ID, purchase, sale, state);
    }

    public Bird(String name, String sex, int age, double weight, String ID, String state) {
        super(name, sex, age, weight, ID, state);
    }

    @Override
    public String toString() {
        return "Bird{" +
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
