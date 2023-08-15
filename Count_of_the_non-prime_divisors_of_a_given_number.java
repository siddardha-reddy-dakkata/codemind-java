import java.util.Scanner;
public class Code{
    static int is_prime(int n){
        int c = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                c++;
            }
        }
        if(c == 2){
            return 1;
        }
        return 0;
    }
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i = 1;i <= n; i++){
            if(n % i == 0 && is_prime(i) == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}