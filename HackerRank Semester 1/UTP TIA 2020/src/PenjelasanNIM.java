import java.util.Scanner;

public class PenjelasanNIM {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String NIM;
        NIM = scan.nextLine();
        if (NIM.length() != 15) {
            System.out.println("Bukan sebuah NIM");
            return;
        } else {
            String Angkatan = NIM.substring(0,2);
            String ProgramStudi = NIM.substring(5,7);
            String SeleksiMasuk = NIM.substring(7,12);
            String AngkaUnik = NIM.substring(12);
            if(ProgramStudi.equals("02")){
                ProgramStudi = "TIF";
            } else if (ProgramStudi.equals("03")){
                ProgramStudi = "TEKKOM";
            } else if (ProgramStudi.equals("04")) {
                ProgramStudi = "SI";
            } else if (ProgramStudi.equals("06")) {
                ProgramStudi = "PTI";
            } else if (ProgramStudi.equals("07")) {
                ProgramStudi = "TI";
            }
        
            if (SeleksiMasuk.equals ("00111")){
                SeleksiMasuk = "SBMPTN";
            } else if (SeleksiMasuk.equals ("01111")) {
                SeleksiMasuk = "SNMPTN";
            } else if (SeleksiMasuk.equals ("07111")) {
                SeleksiMasuk = "Mandiri";
            }
            
            System.out.println(NIM + " memiliki arti angkatan " + Angkatan + "," + " seorang mahasiswa FILKOM" + "," + " prodi " + ProgramStudi + "," + " masuk lewat jalur " + SeleksiMasuk + "," + " dan memiliki nilai unik " + AngkaUnik);
        }    
    }
}