import java.util.Scanner;
public class Sort{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int c = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                c++;
            }
        }
        for(int i = 0; i < n; i++){
            if(c > 0){
                arr[i] = 0;
                c--;
            }
            else{
                arr[i] = 1;
            }
            System.out.print(arr[i] + " ");
        }
        
    }
}