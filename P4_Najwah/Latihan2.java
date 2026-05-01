import java.util.Scanner;

public class Latihan2 {
   public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    float makan, transport, belanja, total;
    float b_makan, b_transport, b_belanja;

    //S1 Statment Perintah
    System.out.print("Masukkan makan: ");
    makan = input.nextFloat();
    System.out.print("Masukkan transport: ");
    transport = input.nextFloat();
    System.out.print("Masukkan belanja: ");
    belanja = input.nextFloat();

    //P1 Proses 1
    total = makan + transport + belanja;

    b_makan = (makan/total) * 100;
    b_transport = (transport/total) * 100;
    b_belanja = (belanja/total) * 100;

    System.out.println("Makan: "+ b_makan);
    System.out.println("Transport: "+ b_transport);
    System.out.println("Belanja: "+ b_belanja);
   } 
}
