package day03;

import java.util.Scanner;

/**
 * 分析以下需求，并用代码实现
 * 	1.键盘录入长方形的长和宽
 * 		定义方法计算该长方形的周长,并在main方法中打印周长
 * 	2.键盘录入长方形的长和宽
 * 		定义方法计算该长方形的面积,并在main方法中打印面积
 * 	3.键盘录入圆的半径
 * 		定义方法计算该圆的周长,并在main方法中打印周长
 * 	4.键盘录入圆的半径
 * 		定义方法计算该圆的面积,并在main方法中打印面积
 * Math.PI
 */
public class Example09 {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        System.out.println("请输入长方形的长");
        int chang=c.nextInt();
        Scanner k=new Scanner(System.in);
        System.out.println("请输入长方形的宽");
        int kuan=k.nextInt();
        Scanner b=new Scanner(System.in);
        System.out.println("请输入圆的半径");
        int banjing=b.nextInt();
        int zhouchang=Zc(chang,kuan);
        int mianji=Mj(chang,kuan);
        double yzc=Yzc(banjing);
        double ymj=Ymj(banjing);
        System.out.println("长方形的周长为："+zhouchang);
        System.out.println("长方形的面积为："+mianji);
        System.out.println("圆的周长为："+yzc);
        System.out.println("圆的面积为："+ymj);
    }
    private static double Ymj(int banjing) {

        double q=3.14*banjing*banjing;
        return q;
    }


    private static double Yzc(int banjing) {

        double w=2*3.14*banjing;
        return w;
    }


    private static int Mj(int chang, int kuan) {

        int s=chang*kuan;
        return s;
    }

    private static int Zc(int chang, int kuan) {

        int z=2*(chang+kuan);
        return z;
    }
}
