/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author lenovo
 */
public class latihan1 extends JFrame {

    private final JMenuBar menuBar = new JMenuBar();

    // Menu Master
    private final JMenu menuMaster = new JMenu("Master Data");
    private final JMenuItem menuBarang = new JMenuItem("Barang");
    private final JMenuItem menuCustomer = new JMenuItem("Customer");
    private final JMenuItem menuUserAccount = new JMenuItem("User Account");

    // Menu Transaksi
    private final JMenu menuTransaksi = new JMenu("Transaksi");
    private final JMenuItem menuPenjualan = new JMenuItem("Penjualan");
    private final JMenuItem menuPembelian = new JMenuItem("Pembelian");

    // Menu Exit
    private final JMenuItem menuExit = new JMenuItem("Exit");

    private final Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();

    public latihan1() {
        super("Membuat Menu");

        setSize(350, 300);
        setLocation(
                dimensi.width / 2 - getWidth() / 2,
                dimensi.height / 2 - getHeight() / 2
        );

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Isi Menu Master
        menuMaster.add(menuBarang);
        menuMaster.add(menuCustomer);
        menuMaster.addSeparator();
        menuMaster.add(menuUserAccount);

        // Isi Menu Transaksi
        menuTransaksi.add(menuPenjualan);
        menuTransaksi.add(menuPembelian);

        // Tambahkan ke MenuBar
        menuBar.add(menuMaster);
        menuBar.add(menuTransaksi);
        menuBar.add(menuExit);

        setJMenuBar(menuBar);

        // Fungsi tombol Exit
        menuExit.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    public static void main(String[] args) {
        new latihan1();
    }
}