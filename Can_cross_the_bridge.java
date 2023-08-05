import java.util.Scanner;
public class Bridge{
    public static void main(String args[]){
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        
        int space = z - y;
        int ans = (int) (space / x);
        System.out.println(ans);
        
    }
}