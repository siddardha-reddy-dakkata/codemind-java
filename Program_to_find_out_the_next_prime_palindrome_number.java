import java.util.Scanner;
public class PrimePal{
    static boolean is_prime(int n){
        int c = 0;
        for(int i = 1; i <= n;i++){
            if(n % i == 0){
                c++;
            }
        }
        return c == 2;
    }
    static boolean is_pal(int n){
        int temp = n,rev = 0;
        while(n > 0){
            int t = n % 10;
            rev = rev * 10 + t;
            n = (int)n / 10; 
        }
        return rev == temp; 
    }
    static int fun(int i){
        if(is_pal(i) && is_prime(i)){
            return i;
        }
        else{
            return fun(i + 1);
        }
    }
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() + 1;
        System.out.print(fun(n));
    }
}