import java.util.Scanner;
public class Point{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int s = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            s += arr[i];
        }
        int t = 0;
        for(int i = 0; i < n; i++){
            if(t == s - t - arr[i]){
                System.out.println(i + 1);
                break;
            }
            t += arr[i];
        }
    }
}