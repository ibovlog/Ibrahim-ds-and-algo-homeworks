package first.tasks;
import java.util.Scanner ;

public class task15 {
    static void main() {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int f = 1 ;
        for (int i = 1 ; i<= n ; i++){
            f = f*i ;
        }
        System.out.print(f);

    }
}
