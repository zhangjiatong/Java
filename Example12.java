package day03;
/**
 * 1.键盘录入一个整数(正数或者负数都可以,但是符号位不算有效的数字位)
 * 	2.定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
 * 	3.在main方法中打印该数字是几位数
 */

import java.util.Scanner;

public class Example12 {
    public static void getNum(int a) {
        int num = 1;
        if (a >= 0) {
            while (a / 10 >= 1) {
                num++;
                a = a / 10;
            }
        } else {
            while (a / 10 < 0) {
                num++;
                a = a / 10;
            }
        }
        System.out.println("这个数是：" + num + "位数");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = scanner.nextInt();
        getNum(a);
    }
}

