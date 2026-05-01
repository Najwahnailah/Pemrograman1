/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import java.util.Scanner;

/**
 * @author lenovo
 */
public class tugas2 {

    public static void main(String[] args) {
        Scanner simpan = new Scanner(System.in);

        int totalBelanja;
        int diskon;
        int potonganHarga;
        int totalBayar;

        System.out.print("Masukkan total belanja: ");
        totalBelanja = simpan.nextInt();

        if (totalBelanja >= 500000) {
            diskon = 20;
        } else if (totalBelanja >= 300000) {
            diskon = 15;
        } else if (totalBelanja >= 100000) {
            diskon = 10;
        } else {
            diskon = 0;
        }

        potonganHarga = totalBelanja * diskon / 100;
        totalBayar = totalBelanja - potonganHarga;

        System.out.println("Total Belanja  : Rp " + totalBelanja);
        System.out.println("Diskon         : " + diskon + "%");
        System.out.println("Potongan Harga : Rp " + potonganHarga);
        System.out.println("Total Bayar    : Rp " + totalBayar);
    }
}