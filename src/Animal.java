public class Animal {
    protected  String name; // 动物名字
    protected  String sex;//动物性别
    protected int age; // 动物年龄
    protected double weight;//动物体重
    protected  String ID; // 动物编号
    protected  double purchase;//进货价
    protected  double sale;//出售价
    protected String state;//状态：已售出、未售出、顾客寄养

    public Animal(){}

    //进货
    public Animal(String name, String sex, int age, double weight, String ID, double purchase, double sale, String state) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.ID = ID;
        this.purchase = purchase;
        this.sale = sale;
        this.state = state;
    }

    //顾客寄养
    public Animal(String name, String sex, int age, double weight, String ID,  String state) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.ID = ID;
        this.state = state;
    }
    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSex() { return sex; }

    public void setSex(String sex) { this.sex = sex; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public double getWeight() { return weight; }

    public void setWeight(double weight) { this.weight = weight; }

    public String getID() { return ID; }

    public void setID(String ID) { this.ID = ID; }

    public double getPurchase() { return purchase; }

    public void setPurchase(double purchase) { this.purchase = purchase; }

    public double getSale() { return sale; }

    public void setSale(double sale) { this.sale = sale; }

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }

    //public abstract String toString();

}
