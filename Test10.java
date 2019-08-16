package day02;

public class Test10 {
    public static void main(String[] args) {
        double a=0.0001;
        int b=0;
        while(a<8848.0){
            a=a+a;
            b++;
        }
        System.out.println("我折叠"+b+"次，可以折成珠穆朗玛峰的高度。");
    }
}
