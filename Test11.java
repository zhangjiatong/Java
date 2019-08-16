package day02;

public class Test11 {
    public static void main(String[] args) {
        int q=0;
        for(int i=1;i<=100;i++){
            int a=i%10;
            int b=(i/10)%10;

            if (a!=9&&b!=9){
                q++;
                if (q%5==0){
                    System.out.println(i);
                }else {
                    System.out.print(i + "  ");
                }
            }
        }

    }
}
