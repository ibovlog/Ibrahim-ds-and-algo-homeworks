package first.tasks;
import java.util.Scanner;
public class task03 {
    static void main() {


        Scanner obj = new Scanner(System.in);
        int Mebleg = obj.nextInt();
        int Faiz = obj.nextInt();
        int Cavab = (Mebleg * Faiz) / 100;
        System.out.println(Cavab);
    }
}
