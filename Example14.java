package day03;

/**
 * 定义一个方法传入一个int类型数组，输出这个数组中每一个数字及其出现的个数
 */
public class Example14 {
    public static int appearNum(int key,int[] arr) {
        int num = 0;
        for(int i=0;i<arr.length;i++) {
            if(key==arr[i]) {
                num++;
            }
        }
        return num;
    }
    public static void main(String[] args) {
        int key = 3;
        int[] arr = {3,4,3,4,3,3,5,7,9};
        int appearNum = appearNum(key, arr);
        System.out.println("数字"+key+"在数组中出现的次数为"+appearNum);
    }
}
