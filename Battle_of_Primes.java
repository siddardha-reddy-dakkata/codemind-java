import java.util.Scanner;
public class Battle{
    static boolean is_prime(int n){
        int c = 0;
        for(int i = 1;i <= n;i++){
            if(n % i == 0){
                c++;
            }
        }
        return c == 2;
    }
    public static void main(String[]Args){
        Scanner sc = new Scaanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        while(!is_prime(sum)){
            sum++;
        }
        System.out.println(sum - n1 - n1);
    }
}