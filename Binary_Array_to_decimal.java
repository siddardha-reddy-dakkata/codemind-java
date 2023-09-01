import java.util.Scanner;
public class BinaryArray{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String S = "";
        for(int i = 0; i < n; i++){
            S += sc.next().charAt(0);
        }
        
        
        
        System.out.print(Integer.parseInt(S,2));
    }
}