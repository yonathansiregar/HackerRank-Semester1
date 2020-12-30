import java.util.Scanner;

public class PolaBilanganV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), hasil = (a - b) * 3;
        System.out.println(hasil);
    }
}