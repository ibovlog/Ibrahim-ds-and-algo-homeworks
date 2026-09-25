package first.tasks;
import java.util.Scanner;
public class task13 {
    static void main() {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int s = 0 ;
        for (int i = 0 ; i<n; i++) {
            s = s+ i;


        }
        System.out.print(s);
    }
}
