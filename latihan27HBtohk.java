
package pertemuan6;

import java.util.Scanner;

public class latihan27HBtohk {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input kalimat
        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();
        
        // Menampilkan kalimat dalam huruf besar dan kecil
        System.out.println("Huruf Besar : " + kalimat.toUpperCase());
        System.out.println("Huruf Kecil : " + kalimat.toLowerCase());
        
        scanner.close();
    }

}
