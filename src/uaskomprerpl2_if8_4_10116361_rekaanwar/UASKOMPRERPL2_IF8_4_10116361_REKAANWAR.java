/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaskomprerpl2_if8_4_10116361_rekaanwar;
import java.util.Scanner;
/**
 *
 * @author RSA
 * HARI/TANGGAL : Kamis, 7 Februari 2019

NO SOAL : 4

KELAS : IF8

NIM : 10110269

NAMA : RIZKI ADAM KURNIAWAN

 */
public class UASKOMPRERPL2_IF8_4_10116361_REKAANWAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama, negara,tujuan;
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("APLIKASI PENDATAAN WISATAWAN");
        System.out.print("Nama : ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.next();
        // Tampilkan outpu lagi
        System.out.print("Kewarganegaraan : ");
        // menggunakan scanner lagi
        negara = keyboard.next();

        System.out.print("Tujuan Wisata: ");
        tujuan = keyboard.next();

        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("=============================");
        System.out.println("HASIL DATA APLIKASI PENDATAAN WISATAWAN");
        System.out.println("Nama : " + nama);
        System.out.println("Kewarganegaraan: " + negara);
        System.out.println("Tujuan Wisata: " + tujuan); 
    }
}

