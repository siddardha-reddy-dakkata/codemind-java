import java.util.Scanner;
public class Test{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c == 'a' || c == 'A' || c == 'e' || c =='E' || c == 'i' || c == 'I' || c == 'o' || c == 'O'|| c == 'u' || c =='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }
    }
}