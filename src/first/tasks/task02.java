package first.tasks;
import java.util.Scanner ;
public class task02 {
    public static void main() {
        Scanner myobj  = new Scanner (System.in) ;
        int a = myobj.nextInt();
        int b = myobj.nextInt();
        int Cem = a+b ;
        int Ferq = a-b ;
        int Hasil = a*b ;
        int Bolme  = a/b ;
        int Qaliq = a%b ;
        System.out.println((Cem) + " "+ (Ferq)+ " " + (Hasil)+ " " +  (Bolme) +" " +  (Qaliq));



    }

        
}
