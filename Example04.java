package day03;

import java.util.Scanner;

/**
 * 有定义一个方法,可以接受一个整数,
 * 如果为[90,100]这个范围方法返回’A’
 * 如果为[80,90)这个范围方法返回’B’
 * 如果为[70,80)这个范围方法返回’C’
 * 如果为[60,70)这个范围方法返回’D’
 * 如果为[0,60)这个范围方法返回’E’
 * 整数不在以上范围的返回’F’
 */
public class Example04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入0-100中任意一个数");
        int n = sc.nextInt();
        String x = Check(n);
        System.out.println(x);
    }

    private static String Check(int n) {
        if (n >= 90 && n <= 100)
            return "A";
        else if (n >= 80 && n <90)
            return "B";
        else if (n >= 70 && n <80)
            return "C";
        else if (n >= 60 && n <70)
            return "D";
        else if (n >= 0 && n <60)
            return "E";
        else
            return "F";

    }
}
