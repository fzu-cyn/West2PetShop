public class SetMeal {
    public double sale(Animal animal,Vaccine vaccine){
        return animal.getSale()+vaccine.getPrice();
    }
    public String toString(Animal animal,Vaccine vaccine){
        return "动物： "+animal.toString()+" 疫苗： "+vaccine.toString();
    }
}
