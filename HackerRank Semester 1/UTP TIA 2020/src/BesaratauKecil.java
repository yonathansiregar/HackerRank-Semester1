import java.util.Scanner;

public class BesaratauKecil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double panjangBalok1, lebarBalok1, tinggiBalok1, panjangBalok2, lebarBalok2, tinggiBalok2, volumeBalok1, volumeBalok2;
        panjangBalok1 = scan.nextDouble();
        lebarBalok1 = scan.nextDouble();
        tinggiBalok1 = scan.nextDouble();
        panjangBalok2 = scan.nextDouble();
        lebarBalok2 = scan.nextDouble();
        tinggiBalok2 = scan.nextDouble();
        volumeBalok1 = (double) panjangBalok1 * lebarBalok1 * tinggiBalok1;
        volumeBalok2 = (double) panjangBalok2 * lebarBalok2 * tinggiBalok2;
        if(volumeBalok1 > volumeBalok2){
            System.out.println("Balok pertama lebih besar");
        } else if (volumeBalok1 < volumeBalok2){
            System.out.println("Balok kedua lebih besar");   
        } else if (volumeBalok1 == 0 && volumeBalok2 == 0) {
            System.out.println("Tidak Ada Balok");
        } else if (volumeBalok1 == volumeBalok2) {
            System.out.println("Kedua Balok sama Besar");
        }    
    }
}