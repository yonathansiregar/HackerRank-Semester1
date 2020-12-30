import java.util.*;

public class KurangiDuaAngkaTerkecil {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int banyakMainan = sc.nextInt();
        int[] number = new int[banyak_mainan];
        for (int i = 0; i < banyak_mainan; i++) {
            number[i] = sc.nextInt();
        }
        Arrays.sort(number);
        System.out.println(number[1] - number[0]);
    }
}