import java.util.Scanner;
public class Area{
   public static void main(String[]Args){
       Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(),b = sc.nextDouble(),c = sc.nextDouble();
        double s = (a + b+ c)/2;
        System.out.printf("%.2f",Math.sqrt(s * (s - a) * (s - b) * (s - c)));
   } 
}