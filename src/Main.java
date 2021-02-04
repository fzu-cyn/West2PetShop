import java.util.ArrayList;
import java.util.Scanner;
/*
    ***测试样例***
    1000
    1          //情景1：进货
    8          //进货数量
    Bird female 2 1.1 001 50 100
    Cat male 1 1.3 002 100 200
    Dog female 1 2.3 003 200 300
    Fox female 2 2.5 004 300 400
    Rabbit male 2 1.9 005 350 500
    Bird female 2 1.1 001 50 100//钱不够
    2        //情景2：寄养
    10       //寄养天数
    Rabbit male 2 1.9 005 350 500
    3         //情景3：出售
    001       //宠物编号
    1        //疫苗名称
    4        //情景4：注射疫苗
    1        //疫苗名称
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 创建Scanner对象
        System.out.println("请输入宠物店初始金额：");
        double money = scanner.nextDouble();
        PetShop West2Online = new PetShop(money);
        while (true)
        {
            System.out.println("请选择情景：");
            int task = scanner.nextInt();
            if(task==1) West2Online.getPurchase();//进货
            else if(task==2) West2Online.getFoster();//寄养
            else if(task==3) West2Online.SaleMeal();//出售
            else if(task==4) West2Online.getInjection();//疫苗
            else break;
        }
        System.out.println("End");
    }
}
