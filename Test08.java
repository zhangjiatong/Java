package day02;

public class Test08 {
    public static void main(String[] args) {
        for (int i = 100; i <1000 ; i++) {
            int a=i%10;
            int b=(i/10)%10;
            int c=(i/100)%10;
            int d=(a*a*a)+(b*b*b)+c*c*c;
            if (d==i && d%2==0){
                System.out.println(i);
            }else if (d==i && d%2==1){
                System.out.print(i+"   ");
            }else{
                continue;
            }

        }
    }
}
