import java.util.*;
public class Zero{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t;
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            t = sc.nextInt();
            if(t == 0){
                aList.add(0);
            }
            aList.add(t);
        }
        for(int i = 0; i < n; i++){
            System.out.print(aList.get(i) + " ");
        }
    }
}