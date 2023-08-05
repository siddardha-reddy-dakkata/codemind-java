import java.util.Scanner;
public class Days{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int years = d / 365;
        int weeks = (d % 365)/7;
        System.out.printf("%d
%d",years,weeks);
    }
}
