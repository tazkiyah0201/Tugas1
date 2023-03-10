package kasuskonversiwaktu;
/**Nama : Tazkiyah Ridha Walla
 *Nim : 13020210201
 * Hari/Tanggal: Senin, 06 Maret 2023
 * Jam : 16:30 PM
 */
import java.util.Scanner;
public class KasusKonversiWaktu {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // Meminta masukan detik dari pengguna
        System.out.print("Masukkan jumlah detik: ");
        long totalDetik = input.nextLong();

        // Menghitung detik saat ini
        long detikSaatIni = totalDetik % 60;

        // Menghitung total menit
        long totalMenit = totalDetik / 60;

        // Menghitung menit saat ini
        long menitSaatIni = totalMenit % 60;

        // Menghitung total jam
        long totalJam = totalMenit / 60;

        // Menghitung jam saat ini
        long jamSaatIni = totalJam % 24;
        
        // Menampilkan hasil konversi waktu dalam format jam:menit:detik
        System.out.println("Waktu dalam format jam:menit:detik adalah "
                + jamSaatIni + ":" + menitSaatIni + ":" + detikSaatIni);
    }
    
}
