package day02;

import java.util.Random;

public class Test17 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
            //System.out.println(arr[i]);
        }
        int[] news=new int[3];
        Random random = new Random();

        int sum=0;

        for (int i = 0; i < news.length; i++) {
            news[i]=arr[random.nextInt(10)];
            System.out.println(news[i]);
            sum+=news[i];
        }
        System.out.println("数组所有元素的和为："+sum);
    }
}
