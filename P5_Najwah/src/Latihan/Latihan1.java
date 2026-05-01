/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Latihan1 {
    
    public static void main (String args[]) {
        Scanner Simpan = new Scanner (System.in);
        int pilihan; String makanan = null;
        
        System.out.print("input pilihan: ");
        pilihan = Simpan.nextInt();
        
        if(pilihan == 1){
            makanan = "Ayam Goreng";
        } else if (pilihan == 2){
            makanan = "Mie Goreng"; 
        }
        System.out.println("menu yang dipilih: "+ makanan);
    }
    
}
