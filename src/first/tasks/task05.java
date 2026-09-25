package first.tasks;
import java.util.Scanner ;
public class task05 {
    static void main() {
        Scanner obj = new Scanner (System.in) ;
        int a   = obj.nextInt();
        if (a%2 == 0 ){
            System.out.print("CUT");
        }
        else {
            System.out.print("TEK");
        }
    }
}
