package bacadata;
/**Nama :Tazkiyah Ridha Walla
 *Nim :13020210201
 *Hari/Tanggal : senin, 06 Maret 2023
 * Jam : 11.38 AM
 */
 import java.util.Scanner;
/* contoh membaca integer menggunakan Class Scanner*/
public class BacaData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO Auto-generated method stub
/* Kamus */
int a;
Scanner masukan;
/* Program */
System.out.print ("Contoh membaca dan menulis, ketik nilai integer: \n");
masukan = new Scanner(System.in);
a = masukan.nextInt(); /* coba ketik :
masukan.nextInt();
Apa akibatnya ?*/
System.out.print ("Nilai yang dibaca : "+ a);
    }
 }
