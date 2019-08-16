package day03;
/**
 * 定义一个方法,去打印指定两个年份之间所有的闰年年份
 */

import java.util.Scanner;

public class Example11 {
    public static void year(int a,int b) {
        for(int i=a;i<=b;i++) {
            if((i%4==0&&i%100!=0)||i%400==0) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个年份：");
        int year1 = scanner.nextInt();
        int year2 = scanner.nextInt();
        System.out.println("这段之间所有闰年年份为：");
        year(year1, year2);
    }
    }
