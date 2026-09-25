package first.tasks;
import java.util.Scanner ;

public class task20 {
    static void main() {
        Scanner obj = new Scanner(System.in) ;
        int a = obj.nextInt();
        int s = 0 ;
        while (a!=0){
            s = s + a%10 ;
            a= a/10 ;
        }
        System.out.print(s);
    }


}
