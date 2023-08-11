import java.util.Scanner;
public class Test{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 1;
        if(n % 3 == 0){
            System.out.print("Pling");
            flag = 0;
        }
        if(n % 5 == 0){
            System.out.print("Plang");
            flag = 0;
        }
        if(n % 7 == 0){
            System.out.print("Plong");
            flag = 0;
        }
        if(flag == 1){
            System.out.print(n);
        }
    }
}