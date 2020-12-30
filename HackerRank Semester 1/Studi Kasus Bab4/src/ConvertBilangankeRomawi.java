import java.util.Scanner;

public class ConvertBilangankeRomawi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        if (angka < 1 || angka > 4999) {
            System.out.println ("Error");
        } else{
            while (angka >= 1000) {
                System.out.print ("M");
                angka -= 1000;
            }    
            if (angka >= 500) {
                if(angka >= 900){
                    System.out.print ("CM");
                    angka -= 900;
                } else {
                    System.out.print ("D");
                    angka -= 500;
                }
            }    
            while(angka >= 100) {
                if (angka >= 400) {
                    System.out.print ("CD");
                    angka -= 400;
                } else{
                    System.out.print ("C");
                    angka -= 100;
                }
            }    
            if (angka >= 50) {
                if (angka >= 90) {
                    System.out.print ("XC");
                    angka -= 90;
                } else{
                    System.out.print ("L");
                    angka -= 50;
                }
            }
            while(angka >= 10) {
                if (angka >= 40) {
                    System.out.print("XL");
                    angka -= 40;
                } else {
                    System.out.print ("X");
                    angka -= 10;
                }
            }
            if (angka >= 5) {
                if (angka == 9){
                    System.out.print ("IX");
                    angka -= 9;
                } else {
                    System.out.print("V");
                    angka -= 5;
                }
            }
            while(angka >= 1) {
                if (angka == 4) {
                    System.out.print ("IV");
                    angka = angka - 4;
                } else {
                    System.out.print ("I");
                    angka -= 1;
                }
            }
        }
    }
}