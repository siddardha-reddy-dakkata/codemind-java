import java.util.Scanner;
public class Operations{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.printf("Sum:%d
Difference:%d
Product:%d
Quotient:%d
Remainder:%d
",x+y,x-y,x*y,x/y,x%y);
    }
}
