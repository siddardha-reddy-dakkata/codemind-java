import java.util.Scanner;
public class Mat{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int mat[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        
        for(int i = 0; i < n; i++){
            int temp = 0;
            for(int j = 0; j < m; j++){
                temp += mat[i][j];
            }
            if(max < temp){
                max = temp;
            }
        }
        
        System.out.println(max);
        
    }
}