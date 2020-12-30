import java.util.Scanner;

public class JumlahSampaiDapatAngka {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String nilai;
        int data1 = 0, min, min1, tem, tem1, ind = 0;
        int[] data = new int[100];
        for (int i = 0; i <= 100; i++) {
            nilai = scan.nextLine();
            if (nilai.contains(" ")) {
                nilai = nilai.substring(0, nilai.length() - 1);
                int a = Integer.parseInt(nilai);
                data[i] = a;
                data1++;
            } else {
                int a = Integer.parseInt(nilai);
                data[i] = a;
                data1++;
                break;
            }
        }
        int[] dataasli = new int[data1];
        int[] jumint = new int[data1];

        for (int i = 0; i < data1; i++) {
            dataasli[i] = data[i];
        }
        for (int temp : dataasli) {
            int jum = 0;
            while (temp != 0) {
                jum = jum + temp % 10;
                temp = temp / 10;
            }
            jumint[ind] = jum;
            ind++;
        }
        for (int i = 0; i < jumint.length; i++) {
            min = jumint[i];
            min1 = dataasli[i];
            for (int j = i + 1; j < jumint.length; j++) {
                if (min > jumint[j]) {
                    tem = min;
                    tem1 = min1;
                    min = jumint[j];
                    min1 = dataasli[j];
                    jumint[j] = tem;
                    dataasli[j] = tem1;
                }
            }
            jumint[i] = min;
            dataasli[i] = min1;
        }
        for (int i = 0; i < dataasli.length - 2; i++) {
            int j = i + 1;
            if (jumint[i] == jumint[j]) {
                if (dataasli[i] >= dataasli[j]) {
                    int test = dataasli[i];
                    dataasli[i] = dataasli[j];
                    dataasli[j] = test;
                }
            }
            if (jumint[i] == jumint[j + 1]) {
                if (dataasli[i] >= dataasli[j + 1]) {
                    int test = dataasli[i];
                    dataasli[i] = dataasli[j + 1];
                    dataasli[j + 1] = test;
                }
            }

        }
        for (int a : dataasli) {
            System.out.println(a);
        }
    }
}