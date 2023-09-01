import java.util.Scanner;
public class BinaryArray{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int c = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(arr[i] != 0 && arr[i] != 1){
                c = 1;
                break;
            }
        }
        if(c == 1){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
     }
}