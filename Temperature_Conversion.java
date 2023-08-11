import java.util.Scanner;
public class Test{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        double f = (c * 9.0 / 5) + 32;
        System.out.printf("%.2f",f);
    }
}