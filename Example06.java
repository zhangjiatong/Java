package day03;

import java.util.Scanner;

/**
 * 定义一个方法，查找指定数字在数组中出现的位置(若出现多次，多次打印)
 * 如: 数组[1232]要查找的数是2 则方法内部会打印索引值 1 , 3
 * 数组[1232] 要查找的数是5 则方法每部会打印 “数组中没有这个数字”
 */
public class Example06 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,1,4,2,3,2,1,2,3,2};
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查找的数字：");
        int n=sc.nextInt();
        count(arr,n);
    }

    private static void count(int[] arr, int n) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.print(i + " ");
                s++;
            }
        }
        if (s == 0) {
            System.out.println("数组中没有这个数");

        }
       }
    }
