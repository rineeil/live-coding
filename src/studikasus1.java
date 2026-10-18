import java.util.Scanner;
public class studikasus1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int maks = sc.nextInt();
        int mins = maks;

        for (int i = 1 ; i < n ; i++) {
            int angka = sc.nextInt();
            if( angka > maks ) {
                maks = angka;
            }
            if ( angka < mins ) {
                mins = angka;
            }
        }
        
        System.out.println("Nilai Terbesar: " + maks);
        System.out.println("Nilai Terkecil: " + mins);
    }
}