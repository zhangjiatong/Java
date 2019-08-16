package day02;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        int[] arr=new int[6];
        Scanner sc=new Scanner((System.in));
        for(int x=0;x<arr.length;x++){
            System.out.println("请输入第"+(x+1)+"评委给出的分数:");
            int score=sc.nextInt();
            arr[x]=score;
        }
        int max=arr[0];
        for(int x=1;x<arr.length;x++){
            if(arr[x]>max){
                max=arr[x];
            }
        }
        int min=arr[0];
        for(int x=1;x<arr.length;x++) {
            if (arr[x] > min) {
                min = arr[x];
            }
        }
        int sum=0;
        for(int x=0;x<arr.length;x++){
            sum+=arr[x];
        }
        int avg=(sum - max -min)/(arr.length-2);
        System.out.println("该选手的最终分数为："+avg);


    }
}
