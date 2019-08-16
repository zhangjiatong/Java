package day02;

import java.util.Random;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        while(true){
            Random random = new Random();
            int number = random.nextInt(100)+1;
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入您要猜的数：");
            int x=sc.nextInt();
            if (x>number){
                System.out.println("你猜的数据大了");
            }else if (x==number){
                System.out.println("恭喜你，猜中了");
            }else{
                System.out.println("你猜的数据小了");
            }
        }
    }
}
