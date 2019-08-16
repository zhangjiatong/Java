package day02;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=1;
        while (a==1){
            System.out.println("请输入1-5数字");
            int num =sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("新建");
                    break;
                case 2:
                    System.out.println("打开文件");
                    break;
                case 3:
                    System.out.println("保存");
                    break;
                case 4:
                    System.out.println("刷新");
                    break;
                case 5:
                    System.out.println("退出");
                    System.exit(0);
                    break;
                default:
                    System.out.println("数据输入有误");
        }
        }
    }
}
