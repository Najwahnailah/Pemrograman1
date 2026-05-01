import java.util.Scanner;

public class Latihan3 {
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        float makan, transport, belanja, total, diskon;
        float b_total;

        System.out.print("Makan: ");
        makan = input.nextFloat();
        System.out.print("Transport: ");
        transport = input.nextFloat();
        System.out.print("Belanja: ");
        belanja = input.nextFloat();

        //HITUNG TOTAL
        total = makan+transport+belanja;

        //HITUNG DISKON
        diskon = total * 10 / 100;

        //TOTAL  PEMBAYARAN
        b_total = total-diskon;

        System.out.println("Total pengeluaran sebelum diskon: "+ total);
        System.out.println("Diskon yang di dapatkan: "+diskon );
        System.out.println("Total pembayaran setelah diskon: "+ b_total);

    }
}