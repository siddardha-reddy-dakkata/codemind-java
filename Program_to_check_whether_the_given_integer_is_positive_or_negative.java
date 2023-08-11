import java.util.Scanner;
public class Test{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a >= 0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative Number");
        }
    }
}