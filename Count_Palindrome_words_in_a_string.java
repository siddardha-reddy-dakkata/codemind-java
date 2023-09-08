import java.util.Scanner;
public class PalindromeWords{
    public static boolean isPal(String s){
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
        String s = sc.nextLine();
        s = s.toLowerCase();
        String[] arr = s.split(" ");
        int count = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(isPal(arr[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}