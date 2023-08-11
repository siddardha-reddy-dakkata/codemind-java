import java.util.Scanner;
public class Test{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%.4f",(double)(a + b)/2);
    }
}