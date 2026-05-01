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
public class Latihan2 {
    public static void main(String args[]){
        float k,n,validasi;
        String g="",h;
        Scanner simpan = new Scanner(System.in);
        System.out.print("Masukkan Kehadiran: ");
        k= simpan.nextFloat();
        System.out.print("Masukkan Nilai Total: ");
        n = simpan.nextFloat();

        if (n>=80){
            g="A"; 
        }else if (n>=70){
            g="B";
        }else if (n>=60){
            g="C";
        }else if (n>=55){
            g="D";
        }else{
            g="E";
        }

        validasi = k*75/100;
        if(k<validasi){
            h="Tidak Lulus";
        }else {
            h="Lulus";
        }
        
        System.out.println("Dengan predikat: "+g);
        System.out.println("Dinyatakan: "+h);
    
    }
}
