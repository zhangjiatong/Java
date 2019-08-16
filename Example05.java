package day03;

/**
 * 定义一个方法,求出给定的数字在给定int型数组中出现的次数,如果一次没有出现则返回0。
 */
public class Example05 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 8, 9, 4, 3, 5, 4, 2, 1, 6};
        int key = 2;
        count(arr, key);

    }

    private static void count(int[] arr, int key) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                s++;
        }
        System.out.println(key + "一共出现了：" + s + "次");
    }

}
