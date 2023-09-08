import java.util.Scanner;
public class Palindrome{
    private static boolean isPal(String s){
        boolean ans = true;
        for(int i = 0; i < (int)s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                ans = false;
                break;
            }
        }
        return ans;
    }
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        if(isPal(s)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}