import java.util.Scanner;

public class Capacity{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        System.out.println(a*b*c + " KB");
    }
}