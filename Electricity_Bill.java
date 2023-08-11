import java.util.Scanner;
public class Test{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        String Id = sc.nextLine();
        String Name = sc.nextLine();
        int u = sc.nextInt();
        double bill;
        
        if( u <= 199){
            bill = u*1.20;
        }
        else if(u >= 200 && u <= 400){
            bill = u * 1.50;
        }
        else if( u >= 400 && u <= 600){
            bill = u * 1.80;
        }
        else{
            bill = u * 2.00;
        }
        
        if( bill > 400){
            bill += bill * 0.15;
        }
        else{
            bill += 100;
        }
        
        System.out.printf("%.2f",bill);
    }
}