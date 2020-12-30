import java.util.Scanner;

public class Perpangkatan1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int a = scan.nextInt(), b = scan.nextInt();
        double hasil = Math.pow(a*3, b);
        System.out.printf("%,.0f\n", hasil);
    }
}
