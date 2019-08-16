package day02;

import java.util.Random;

public class Test13 {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[]=new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(10);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
