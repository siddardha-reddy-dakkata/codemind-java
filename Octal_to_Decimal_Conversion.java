import java.util.Scanner;
public class Conversion{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(Integer.parseInt(n,8));
    }
}