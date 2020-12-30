import java.util.Scanner;
public class KalimatSama {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Original, reverse = "";
        Original = in.nextLine();
        int length = Original.length();
        for(int i = length -1; i >=0; i--) {
            if (Original.charAt(i) == '-') {
                reverse = "-" + reverse;
                break;
            }
            reverse = reverse + Original.charAt(i);
        }

        if(Original.equals(reverse)) {
            System.out.println("sama");
        } else {
            System.out.println("tidak sama");
            in.close();
        }
    }
}
