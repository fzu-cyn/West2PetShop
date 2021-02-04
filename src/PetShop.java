import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class PetShop {
    private double money;

    public PetShop(){}
    public PetShop(double money) { this.money = money; }

    ArrayList<Animal> AnimalList = new ArrayList<Animal>();
    static ArrayList<Vaccine> VaccineList = new ArrayList<Vaccine>();
    static {
        VaccineList.add(new Vaccine("疫苗一：",100));
        VaccineList.add(new Vaccine("疫苗二：",200));
        VaccineList.add(new Vaccine("疫苗三：",300));
        VaccineList.add(new Vaccine("疫苗四：",400));
        VaccineList.add(new Vaccine("疫苗五：",500));
    }
    public void getPurchase(){
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        LocalDate PurchaseTime = LocalDate.now();
        System.out.println("请输入进货数：");
        int sum = scanner.nextInt();
        int i=0;
        for(i=0;i<sum;i++){
            System.out.println("请输入宠物信息：");
            String name = scanner.next();
            String sex = scanner.next();
            int age = scanner.nextInt();
            double weight = scanner.nextDouble();
            String ID = scanner.next();
            double purchase = scanner.nextDouble();
            double sale = scanner.nextDouble();
            String state = "未售出";
            try{
                if(money<purchase) throw new PoorException();
                else {
                    money-=purchase;
                    if(name.equals("Bird")){
                        Bird bird = new Bird(name, sex, age, weight, ID, purchase, sale, state);
                        AnimalList.add(bird);
                        System.out.println(bird.toString());
                    }
                    else if(name.equals("Cat")){
                        Cat cat = new Cat(name, sex, age, weight, ID, purchase, sale, state);
                        AnimalList.add(cat);
                        System.out.println(cat.toString());
                    }
                    else if(name.equals("Dog")){
                        Dog dog = new Dog(name, sex, age, weight, ID, purchase, sale, state);
                        AnimalList.add(dog);
                        System.out.println(dog.toString());
                    }
                    else if(name.equals("Fox")){
                        Fox fox = new Fox(name, sex, age, weight, ID, purchase, sale, state);
                        AnimalList.add(fox);
                        System.out.println(fox.toString());
                    }
                    else if(name.equals("Rabbit")){
                        Rabbit rabbit = new Rabbit(name, sex, age, weight, ID, purchase, sale, state);
                        AnimalList.add(rabbit);
                        System.out.println(rabbit.toString());
                    }
                }
            }catch (PoorException e){
                e.printStackTrace();
                System.out.println("资金不足");
                break;
            }finally {
                 PurchaseTime = LocalDate.now();
            }
        }
        System.out.println(PurchaseTime+"本次进货"+i+"只宠物，剩余资金："+money);
    }

    //寄养
    public void getFoster(){
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        LocalDate FosterTime = LocalDate.now();
        System.out.println("请输入宠物寄养天数：");
        int day = scanner.nextInt();
        System.out.println("请输入寄养宠物信息：");
        String name = scanner.next();
        String sex = scanner.next();
        int age = scanner.nextInt();
        double weight = scanner.nextDouble();
        String ID = scanner.next();
        String state = "寄养";
        money+=day*50;//寄养一天50元
        if(name.equals("Bird")){
            Bird bird = new Bird(name, sex, age, weight, ID, state);
            AnimalList.add(bird);
            System.out.println(bird.toString());
        }
        else if(name.equals("Cat")){
            Cat cat = new Cat(name, sex, age, weight, ID, state);
            AnimalList.add(cat);
            System.out.println(cat.toString());
        }
        else if(name.equals("Dog")){
            Dog dog = new Dog(name, sex, age, weight, ID, state);
            AnimalList.add(dog);
            System.out.println(dog.toString());
        }
        else if(name.equals("Fox")){
            Fox fox = new Fox(name, sex, age, weight, ID, state);
            AnimalList.add(fox);
            System.out.println(fox.toString());
        }
        else if(name.equals("Rabbit")){
            Rabbit rabbit = new Rabbit(name, sex, age, weight, ID, state);
            AnimalList.add(rabbit);
            System.out.println(rabbit.toString());
        }
        System.out.println(FosterTime+"本次寄养宠物，剩余资金："+money);
    }

    //出售套餐
    public void SaleMeal(){
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        LocalDate SaleMealTime = LocalDate.now();
        System.out.println("请输入购买宠物编号：");
        String ID = scanner.next();
        Optional<Animal> AnimalOptional = AnimalList.stream().filter(it -> it.getID().equals(ID)).findFirst();
        try{
            if(AnimalOptional.isPresent()){
                System.out.println("请输入疫苗编号：");
                int id = scanner.nextInt();
                SetMeal setMeal = new SetMeal();
                Vaccine vaccine = new Vaccine(VaccineList.get(id).getName(),VaccineList.get(id).getPrice());
                Animal animal = AnimalOptional.get();
                money+=setMeal.sale(animal,vaccine);
                animal.setState("已售出");
                System.out.println("交易成功");
                System.out.println("本次售出宠物基本信息："+animal.toString()+" 疫苗："+vaccine.toString());
            }
            else{
                System.out.println("该宠物已售罄");
                throw new NullException();
            }
        }catch (NullException e){
            e.printStackTrace();
            System.out.println("该宠物不存在");
        }finally {
            SaleMealTime = LocalDate.now();
        }
        System.out.println(SaleMealTime+"本次出售宠物，剩余资金："+money);
    }

    //注射疫苗
    public void getInjection(){
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.println("请输入疫苗编号：");
        int id = scanner.nextInt();
        Vaccine vaccine = new Vaccine(VaccineList.get(id).getName(),VaccineList.get(id).getPrice());
        money+=vaccine.getPrice();
        LocalDate InjectionTime = LocalDate.now();
        System.out.println(InjectionTime+"本次交易成功，剩余资金："+money);
    }
}
