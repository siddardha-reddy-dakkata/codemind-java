import java.util.Scanner;
public class Test{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0,b = 1,c = 0;
        System.out.printf("0 1 ");
        while(n-2!=0){
            c = a + b;
            System.out.printf("%d ",c);
            a = b;
            b = c;
            n -= 1;
        }
    }
}