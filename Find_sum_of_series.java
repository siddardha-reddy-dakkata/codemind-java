import java.util.Scanner;
public class Test{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for(int i = 1; i <= n;i++){
            sum += 1.0/i;
        }
        System.out.printf("%.2f",sum);
    }
}