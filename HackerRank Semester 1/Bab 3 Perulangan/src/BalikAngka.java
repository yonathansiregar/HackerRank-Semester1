import java.util.Scanner;

public class BalikAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt(), balik = 0;
        while (angka != 0) {
            balik = balik * 10;
            balik = balik + angka % 10;
            angka = angka/10;
        }
        System.out.println(balik);
    }
}