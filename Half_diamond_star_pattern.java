import java.util.Scanner;
public class Demo{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= 3 && n <= 100){
        for(int i = 1;i <= n; i++){
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n - 1;i >= 1; i--){
            for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }}
        
        else{
            System.out.println("The pattern is not possible");
        }
    }
}