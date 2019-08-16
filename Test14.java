package day02;

public class Test14 {
    public static void main(String[] args) {
        int[] nums = {5,10,15};
        int[] arr=new int[nums.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=nums[i]*2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
