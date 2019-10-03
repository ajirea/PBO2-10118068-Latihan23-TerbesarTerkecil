/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan23.terbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Program untuk menentukan nilai terbesar dan terkecil
 * mahasiswa, nilai berasal dari masukkan pengguna
 */
public class PBO210118068Latihan23TerbesarTerkecil {

    public static String petugas;
    public static int banyakMhs, terbesar, terkecil;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====Program Nilai Terbesar dan Terkecil "
                + "Nilai Mahasiswa====");
        
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scanner.next(); // input petugas
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        banyakMhs = scanner.nextInt(); // input banyak mahasiswa
        
        int[] nilai = new int[banyakMhs]; // deklarasi array nilai
        
        for(int i = 0; i < banyakMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+(i+1)+" = ");
            nilai[i] = scanner.nextInt(); // input nilai per mahasiswa
        }
        
        terbesar = nilai[0]; // set default value
        terkecil = nilai[0]; // set default value
        
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for(int i = 0; i < banyakMhs; i++) {
            System.out.println("Nilai Mahasiswa Ke-"+(i+1)+" = " + nilai[i]);
            
            // proses perbandingan
            if(terbesar <= nilai[i]) terbesar = nilai[i];
            if(terkecil >= nilai[i]) terkecil = nilai[i];
        }
        
        // output hasil
        System.out.println("\nNilai Terbesar adalah " + terbesar);
        System.out.println("Nilai Terkecil adalah " + terkecil);
        
        System.out.println("\nPetugas : " + petugas);
    }
    
}
