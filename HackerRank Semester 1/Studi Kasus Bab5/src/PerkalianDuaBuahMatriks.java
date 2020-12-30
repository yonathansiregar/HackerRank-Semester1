import java.util.Scanner;

public class PerkalianDuaBuahMatriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt(), p = sc.nextInt(), q = sc.nextInt();
        int[][] matriks1 = new int[m][n];
        int[][] matriks2 = new int[p][q];
        int[][] matrikshasil = new int[m][q];
        if (n != p) {
            System.out.println("Matriks tidak dapat dikalikan satu sama lain.");
            return;
        } else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matriks1[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    matriks2[i][j] = sc.nextInt();
                }
            }
        }    
        matrikshasil = kalimatriks(matriks1, matriks2);
        cetakmatriks (matrikshasil);
    }
  
    public static int[][] kalimatriks(int[][] matriks1, int[][] matriks2) {
        // matriks1.length = m, matriks2[0].length = q, matriks2.length = p
      int[][]matrikshasil = new int[matriks1.length][matriks2[0].length];
      int sum = 0;
      for (int i = 0; i < matriks1.length; i++) {
            for (int j = 0; j < matriks2[0].length; j++) {
                for (int k = 0; k < matriks2.length; k++) {
                    sum += matriks1[i][k] * matriks2[k][j];
                }
                matrikshasil[i][j] = sum;
                sum = 0;
            }
        }
        return matrikshasil;
    }
  
  	public static void cetakmatriks(int[][] matrikshasil){
      for (int i = 0; i < matrikshasil.length; i++) {
            for (int j = 0; j < matrikshasil[0].length; j++) {
                System.out.print(matrikshasil[i][j] + " ");
            }
            System.out.println("");
      }
    }
}