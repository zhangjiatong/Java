package day01;

import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("请输入一个三位数：");
        int i = sc.nextInt();
        int a=i%10;
        int b=i/10%10;
        int c=i/100;
        System.out.println("个位是："+a);
        System.out.println("十位是："+b);
        System.out.println("百位是："+c);
    }
}
