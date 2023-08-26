import java.util.Scanner;
public class Square{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int limit = (int) n / 2;
        String ans = "False";
        for(int i = 0; i <= limit; i++){
            for(int j = 0; j <= limit; j++){
                if(i == j){
                    continue;
                }
                if(i * i + j * j == n){
                    ans = "True";
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}