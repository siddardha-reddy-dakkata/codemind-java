import java.util.Scanner;
public class Test{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= 3 && n <= 6){
            System.out.println("Summer");
        }
        else if(n >= 7 && n <=10){
            System.out.println("Rainy");
        }
        else if(n==2 || n==3){
            System.out.println("Spring");
        }
        else if(n == 11 || n == 12 || n ==1){
            System.out.println("Winter");
        }
        else{
            System.out.println(-1);
        }
        
    }
}