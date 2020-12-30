import java.util.Scanner;

public class LuasTanahBuGentong {
    public static  void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sisi = scan.nextDouble(), luas = 3.0 * (Math.sqrt(3) / 2.0) * Math.pow(sisi, 2);
        System.out.printf("%.2f", luas);
    }
}