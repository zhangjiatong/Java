package day01;

import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("请输入分数：");
        int i = sc.nextInt();
        if (i<60){
            System.out.println("不及格");
        }else if(60<=i&&i<70){
            System.out.println("及格");
        }else if(70<=i&&i<80){
            System.out.println("良");
        }else if(80<=i&&i<90){
            System.out.println("好");
        }else{
            System.out.println("优秀");
        }

        }
    }
