package first.tasks;
import java.util.Scanner;

public class task17 {
    static void main() {
        int s = 0 ;

        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        while (a!=0 ){
        s+=1;  a = obj.nextInt();}
    System.out.println(s);
    }
}
