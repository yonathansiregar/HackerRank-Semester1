import java.util.Scanner;

public class VolumeBola1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diameter = sc.nextDouble();
        float phi = (float) 3.14, volume = (float) (1.0/6.0 * phi* diameter* diameter* diameter);
        System.out.printf("%,.2f", volume);
    }
}