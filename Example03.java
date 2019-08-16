package day03;

/**
 * 主方法中给定数组int[] arr= {10,20,30,40,50,60};定义一个方法可以接受这个给定的数组
 * 并返回这个数组中元素的最小值
 */
public class Example03 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int c = min(arr);
        System.out.println(c);
    }

    private static int min(int[] arr) {
        int c = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (c > arr[i]) {
                c = arr[i];

            }
        }
        return c;
    }
}
