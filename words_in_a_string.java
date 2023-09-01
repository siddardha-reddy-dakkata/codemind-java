import java.util.Scanner;
public class Str{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        int words = 1;
        for(char i : c){
            if (i == ' '){
                words++;
            }
        }
        System.out.println(words);
    }
}