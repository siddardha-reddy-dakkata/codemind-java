import java.util.Scanner;
public class Miss{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int s = 0;
        for(int i = 0; i < n - 1; i++){
            arr[i] = sc.nextInt();
            s += arr[i];
        }
        System.out.print(( n * (n + 1)) / 2 - s);
    }
}