package first.tasks;
import java.util.Scanner;

public class task14 {
    static void main() {
        Scanner obj = new Scanner(System.in);
        int n  = obj.nextInt();
        int s = 0 ;
        for ( int i=1 ; i<n ; i++){
            if (i%2==0) {
                s+=1;
            }
        }
        System.out.print(s);
    }
}
