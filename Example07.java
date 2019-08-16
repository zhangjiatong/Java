package day03;

import java.util.Scanner;

/**
 * 定义一个方法,实现同时求出两个整数的加、减、乘、除的结果,并同时把这个四个结果返回(把四个数放入到一个数组中并返回)
 */
public class Example07 {
    public static int[] math(int a,int b) {
        int plus = a+b;
        int subtract = a-b;
        int multiply = a*b;
        int divide = a/b;
        int[] result = {plus,subtract,multiply,divide};
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] result = math(a, b);
        System.out.println("加减乘除的结果分别为：");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
