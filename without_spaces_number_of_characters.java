import java.util.Scanner;
public class LengthWithoutWhite{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                c++;
            }
        }
        System.out.print(c);
        
    }
}