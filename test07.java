package day01;

import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入小明左手中的纸牌：");
        int left=sc.nextInt();
        System.out.println("请输入小明右手中的纸牌：");
        int right=sc.nextInt();
        int temp=left;
        left=right;
        right=temp;
        System.out.println("小明左手中的纸牌："+left);
        System.out.println("小明右手中的纸牌："+right);
    }

}
