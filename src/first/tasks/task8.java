package first.tasks;
import java.util.Scanner ;
public class task8 {
    static void main() {
        Scanner obj = new Scanner(System.in) ;
        int Yas = obj.nextInt();
        if (Yas>0 && Yas<12) {
            System.out.print("usag") ;
        }
        else{
            if (Yas>13 && Yas < 17) {
                System.out.print("yeniyetme");
            }
            else {
                System.out.print("yetkin");
            }
        }

    }
}
