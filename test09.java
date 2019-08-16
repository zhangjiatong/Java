package day01;

import java.util.Scanner;

public class test09 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入四位数会员卡号");
        int i=sc.nextInt();
        int a=i%10;
        int b=(i/10)%10;
        int c=(i/100)%10;
        int d=(i/1000)%10;
        int x=a+b+c+d;
        if (x>20){
            System.out.println("会员卡号"+i+"是幸运客户");
        }else{
            System.out.println("会员卡号"+i+"不是幸运客户");
        }
    }
}
