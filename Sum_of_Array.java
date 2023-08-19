import java.util.Scanner;
public class Problem{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for( int each: arr){
            sum += each;
        }
        System.out.print(sum);
    }
}