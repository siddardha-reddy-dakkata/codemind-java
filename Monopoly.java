import java.util.Scanner;
public class Monopoly{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        for(i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a > b + c || b > a + c || c > a + b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}