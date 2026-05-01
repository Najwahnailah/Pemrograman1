/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.util.Scanner;

/**
 * @author lenovo
 */
public class tugas1 {

    public static void main(String[] args) {
        Scanner simpan = new Scanner(System.in);

        int pilihan;
        String jurusan;

        System.out.println("=== PILIHAN JURUSAN ===");
        System.out.println("1. Teknik Informatika");
        System.out.println("2. Sistem Informasi");
        System.out.println("3. Manajemen Informatika");
        System.out.println("4. Komputerisasi Akuntansi");

        System.out.print("Input pilihan: ");
        pilihan = simpan.nextInt();

        if (pilihan == 1) {
            jurusan = "Teknik Informatika";
        } else if (pilihan == 2) {
            jurusan = "Sistem Informasi";
        } else if (pilihan == 3) {
            jurusan = "Manajemen Informatika";
        } else if (pilihan == 4) {
            jurusan = "Komputerisasi Akuntansi";
        } else {
            jurusan = "Pilihan tidak tersedia";
        }

        System.out.println("Jurusan yang dipilih: " + jurusan);
    }
}
