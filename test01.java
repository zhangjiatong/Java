package day01;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        System.out.println("请输入一个数");
        int i=sc.nextInt();
        String check=(i%2==0)?"偶数":"奇数";
        System.out.println(check);
    }
}
