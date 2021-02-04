import java.util.ArrayList;

/*宠物疫苗*/
public class Vaccine {
    private String name;
    private double price;

    public Vaccine(){}

    public Vaccine(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return "Vaccine{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


}
