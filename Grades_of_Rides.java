import java.util.Scanner;
public class Test{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int s = sc.nextInt();
        int S = sc.nextInt();
        if( h > 50 && s > 60 && S > 100){
            System.out.print(10);
        }
        else if( h > 50 && s > 60){
            System.out.print(9);
        }
        else if( s > 60 && S > 100){
            System.out.print(8);
        }
        else if( h > 50  && S > 100){
            System.out.print(7);
        }
        else if( h > 50 || s > 60 || S > 100){
            System.out.print(6);
        }
        else{
            System.out.print(5);
        }
    }
}