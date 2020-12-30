import java.util.Scanner;

public class JumlahSampaiDapatSatuAngka {
    public static void main(String args[] ) throws Exception {
        Scanner input = new Scanner (System.in);
        long angka = input.nextLong();
        System.out.println(hasil(angka));
    }
    static long hasil (long number) {
        long sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number /= 10;
        }
        if (sum <= 9) {
            return sum;
        } else {
            return hasil(sum);
        }
    }
}
