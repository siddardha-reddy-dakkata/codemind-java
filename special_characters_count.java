import java.util.Scanner;
public class SpecialCharacters{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if((int)(c) >= 65 && (int)(c) <= 90){
                continue;
            }
            else if((int)(c) >= 97 && (int)c <= 122){
                continue;
            }
            else if(c ==' '){
                continue;
            }
            else{
                count++;
            }
        }
        System.out.print(count);
    }
}