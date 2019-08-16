package day03;

/**
 *主方法中给定数组int[] arr= {10,20,30,40,50,60};这个数组没有重复元素.定义一个方法可以接受这个给定的数组并返回这个数组中最大元素值的索引值
 */
public class Example08 {
    public static int getIndex(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int index = getIndex(arr);
        System.out.println("这个数组最大元素的索引值为"+index);

    }
}
