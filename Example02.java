package day03;

import java.util.Random;

/**
 * 随机产生两个整数,随机数的范围均是[1,100],定义方法求这两个整数的和并打印和值
 * */
public class Example02 {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(100) + 1;
        Random s = new Random();
        int b = s.nextInt(100) + 1;
        int c = sum(a, b);
        System.out.println(c);
    }

    private static int sum(int a, int b) {
        System.out.println(a + "," + b);
        int c = a + b;
        return c;
    }
}

