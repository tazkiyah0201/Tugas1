/* pemakaian beberapa operator terhadap RELATIONAL DAN bit */
package oper2;

/**Nama :Tazkiyah Ridha Walla
 *Nim :13020210201
 *Hari/Tanggal : senin, 06 Maret 2023
 * Jam : 14:20PM
 */
public class Oper2 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
// TODO Auto-generated method stub
/* KAMUS */
char i, j;
/* ALGORITMA */
i = 3; /* 00000011 dalam biner */
j = 4; /* 00000100 dalam biner */
System.out.println("i = "+ (int) i);
System.out.println("j = "+ j);
System.out.println("i & j = "+ (i & j));
/* 0: 00000000 dalam biner */
System.out.println("i | j = "+ (i | j));
/* 7: 00000111 biner */
 System.out.println("i ^ j = "+ (i ^ j));
 /* 7: 00000111 biner Ingat!!! operator "^" pada bahasa
java bukan sebagai pangkat*/
System.out.println(Math.pow(i, j));
/* Class Math memiliki method pow(a,b) untuk
pemangkatan*/
System.out.println("~i = "+ ~i);
/* -4: 11111100 biner */
    }
    
}
