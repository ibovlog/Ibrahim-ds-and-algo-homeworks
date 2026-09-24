package first.tasks;
import java.util.Scanner ;
public class task7 {
    static void main() {
        Scanner obj = new Scanner (System.in) ;
        int a = obj.nextInt() ;
        if (a> 0) {
            System.out.print("Musbet") ;

        }
        else {
            if ( a == 0 ){
                System.out.print("Sifir");

            }
            else {
                System.out.print("Menfi");
            }
        }
    }
}
