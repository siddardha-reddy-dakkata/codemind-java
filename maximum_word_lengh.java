import java.util.Scanner;
public class MaxWord{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0,max = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                max = Math.max(c,max);
                c = 0;
            }
            else{
                c++;
            }
        }
        max = Math.max(c,max);
        // if(max != 8){
        //     System.out.println(s);
        // }
        System.out.println(max);
    }
}