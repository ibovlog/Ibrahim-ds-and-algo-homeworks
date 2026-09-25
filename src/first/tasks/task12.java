package first.tasks;
import java.util.Scanner;

public class task12 {
    static void main() {
        Scanner obj = new Scanner(System.in) ;
        int a = obj.nextInt() ;
        switch (a) {
            case 1 :
                System.out.print("TOPLAMA");
                break ;
            case 2 :
                System.out.print("CIXMA");
                break ;
            case 3 :
                System.out.print("VURMA");
                break ;
            case 4 :
                System.out.print("BOLME");
                break ;
        }
    }

}
