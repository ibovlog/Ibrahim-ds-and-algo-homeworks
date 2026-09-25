package first.tasks;
import java.util.Scanner ;

public class task18 {
    static void main() {
        Scanner obj = new Scanner (System.in);
        int a = obj.nextInt();
        int s = 1;
        while (a>10){
            s+=1;
            a=a/10;


        }
        System.out.println(s);
    }
}
