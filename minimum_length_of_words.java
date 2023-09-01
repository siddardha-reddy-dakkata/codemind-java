import java.util.Scanner;
public class MinLength{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int min = 10000, c = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ' ){
                min = Math.min(c,min);
            }
            else if( i == s.length() - 1){
                c++;
                min = Math.min(c,min);
            }
            else{
                c++;
            }
        }
        System.out.println(min);
    }
}