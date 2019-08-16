package day01;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("请输入分数：");
        int i = sc.nextInt();
        if (i >= 60) {
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
    }
}