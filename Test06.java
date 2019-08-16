package day02;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("请输入一位大于100的三位数：");
        int a = sc.nextInt();
        int sum=0;

        for (int i=100;i<a;i++){
            int d=i%10;
            int b=i/10%10;
            int c=i/100;
            if(d!=5 && b!=7 && c!=3){
                sum+=i;
            }
        }
        System.out.println(sum);

    }

}
