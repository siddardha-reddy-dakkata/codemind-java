import java.util.Scanner;
public class Conversion{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n;i++){
            String b = sc.next();
            int d = Integer.parseInt(b,2);
            System.out.println(Integer.toString(d,8));
        }
    }
}