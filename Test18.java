package day02;

import java.util.Random;
import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组长度");
        int[] arr=new int[scanner.nextInt()];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(101);

        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<60){
                count++;

            }
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int avg=sum/count;
        System.out.println("不及格人数为："+count);
        System.out.println("班级平均分为："+avg);
    }
}
