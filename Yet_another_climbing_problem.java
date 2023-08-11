import java.util.Scanner;
public class Climb{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println( (int) x / y + x % y);
        }
    }
}