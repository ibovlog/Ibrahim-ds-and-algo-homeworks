package first.tasks;
import java.util.Scanner;

public class task19 {
    static void main() {
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int x = 0 ;
        while (a!=0){
            x = x*10+(a%10) ;
            a = a/10;

        }
        System.out.print(x);
    }
}
