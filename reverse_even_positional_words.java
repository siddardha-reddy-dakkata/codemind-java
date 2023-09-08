import java.util.Scanner;
public class reverseEven{
    public static String reverse(String s){
        String res = "";
        for(int i = s.length() - 1; i >= 0; i--){
            res = res + s.charAt(i);
        }
        return res;
    }
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                arr[i] = reverse(arr[i]);
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}