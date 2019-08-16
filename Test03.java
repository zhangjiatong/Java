package day02;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);
         System.out.println("请输入第一个值：");
         int a=scanner.nextInt();
         System.out.println("请输入第二个值：");
         int b=scanner.nextInt();
        System.out.println("请输入第三个值：");
        int c=scanner.nextInt();

        sum(a,b,c);
        // System.out.println("C的值为："+c);

    }


     public static int sum(int a,int b,int c) {
        int d=a+b+c;

         System.out.println(d);
         return d;

    }
    public static int sum(int a,int b) {
        int f = a + b;
        return f;
    }
}
