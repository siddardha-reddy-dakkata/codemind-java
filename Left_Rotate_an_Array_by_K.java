import java.util.*;
public class Rotate{
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> Arr = new ArrayList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp;
        for(int i = 0; i < n; i++){
            Arr.add(sc.nextInt());
        }
        for(int i = 0; i < k; i++){
            temp = Arr.remove(0);
            Arr.add(temp);
        }
        for(int i = 0; i < n; i++){
            System.out.print(Arr.get(i) + " ");
        }
    }
}