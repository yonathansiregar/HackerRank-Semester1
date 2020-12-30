import java.util.Scanner;

public class ConverterSuhuPakGentong {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        float celcius = scan.nextFloat(), fahrenheit = (float) (9.0 / 5.0 * celcius) + 32;
        System.out.printf("%.2f", fahrenheit);
    }
}
