import java.util.Scanner;
public class Test{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i < n; i++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            
            if((double)y1/x1 < (double)y2/x2){
                System.out.println(-1);
            }
            else if((double)y1/x1 > (double)y2/x2){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}