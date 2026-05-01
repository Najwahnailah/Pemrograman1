/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author lenovo
 */
public class latihan3 extends JFrame {

    private JDesktopPane frmMDI;
    private JInternalFrame frmBarang;
    private JInternalFrame frmCustomer;
    private JInternalFrame frmUserAccount;
    private JPanel pnlBarang;

    private final JMenuBar menuBar = new JMenuBar();

    private final JMenu menuMaster = new JMenu("Master Data");
    private final JMenuItem menuBarang = new JMenuItem("Barang");
    private final JMenuItem menuCustomer = new JMenuItem("Customer");
    private final JMenuItem menuUserAccount = new JMenuItem("User Account");

    private final JMenu menuTransaksi = new JMenu("Transaksi");
    private final JMenuItem menuPenjualan = new JMenuItem("Penjualan");
    private final JMenuItem menuPembelian = new JMenuItem("Pembelian");

    private final JMenuItem menuExit = new JMenuItem("Exit");

    private final JLabel lblKodeBarang = new JLabel("Kode Barang");
    private final JTextField txtKodeBarang = new JTextField();

    private final JLabel lblNamaBarang = new JLabel("Nama Barang");
    private final JTextField txtNamaBarang = new JTextField();

    private final JLabel lblHargaBarang = new JLabel("Harga Barang");
    private final JTextField txtHargaBarang = new JTextField();

    private final JButton tblBarangSave = new JButton("Save");
    private final JButton tblBarangCancel = new JButton("Cancel");

    private final Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();

    public latihan3() {
        super("Aplikasi Toko");

        setSize(650, 500);
        setLocation(
                dimensi.width / 2 - getWidth() / 2,
                dimensi.height / 2 - getHeight() / 2
        );
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        frmMDI = new JDesktopPane();
        frmMDI.setLayout(null);
        setContentPane(frmMDI);

        // Menu Master
        menuMaster.add(menuBarang);
        menuMaster.add(menuCustomer);
        menuMaster.addSeparator();
        menuMaster.add(menuUserAccount);

        // Menu Transaksi
        menuTransaksi.add(menuPenjualan);
        menuTransaksi.add(menuPembelian);

        // Menu Bar
        menuBar.add(menuMaster);
        menuBar.add(menuTransaksi);
        menuBar.add(menuExit);

        setJMenuBar(menuBar);

        // Action Menu
        menuBarang.addActionListener(new MenuHandler());
        menuCustomer.addActionListener(new MenuHandler());
        menuUserAccount.addActionListener(new MenuHandler());
        menuExit.addActionListener(new MenuHandler());

        // Action Tombol
        tblBarangSave.addActionListener(new TombolHandler());
        tblBarangCancel.addActionListener(new TombolHandler());

        // Internal Frame
        frmBarang = new JInternalFrame("Master Data Barang", true, true, true, true);
        frmCustomer = new JInternalFrame("Master Data Customer", true, true, true, true);
        frmUserAccount = new JInternalFrame("Master Data User Account", true, true, true, true);

        pnlBarang = new JPanel();
        pnlBarang.setLayout(null);

        lblKodeBarang.setBounds(30, 20, 160, 25);
        pnlBarang.add(lblKodeBarang);

        txtKodeBarang.setBounds(120, 20, 100, 25);
        pnlBarang.add(txtKodeBarang);

        lblNamaBarang.setBounds(30, 50, 160, 25);
        pnlBarang.add(lblNamaBarang);

        txtNamaBarang.setBounds(120, 50, 200, 25);
        pnlBarang.add(txtNamaBarang);

        lblHargaBarang.setBounds(30, 80, 160, 25);
        pnlBarang.add(lblHargaBarang);

        txtHargaBarang.setBounds(120, 80, 100, 25);
        pnlBarang.add(txtHargaBarang);

        tblBarangSave.setBounds(80, 160, 80, 25);
        pnlBarang.add(tblBarangSave);

        tblBarangCancel.setBounds(170, 160, 80, 25);
        pnlBarang.add(tblBarangCancel);

        frmBarang.add(pnlBarang);

        frmBarang.setBounds(10, 10, 367, 250);
        frmCustomer.setBounds(30, 30, 367, 250);
        frmUserAccount.setBounds(50, 50, 367, 250);

        frmMDI.add(frmBarang);
        frmMDI.add(frmCustomer);
        frmMDI.add(frmUserAccount);

        setVisible(true);
    }

    private class MenuHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JMenuItem menuPilih = (JMenuItem) e.getSource();

            if (menuPilih.getText().equals("Barang")) {
                frmBarang.setVisible(true);
            } else if (menuPilih.getText().equals("Customer")) {
                frmCustomer.setVisible(true);
            } else if (menuPilih.getText().equals("User Account")) {
                frmUserAccount.setVisible(true);
            } else if (menuPilih.getText().equals("Exit")) {
                dispose();
            }
        }
    }

    private class TombolHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton tombolPilih = (JButton) e.getSource();

            if (tombolPilih.getText().equals("Save")) {
                JOptionPane.showMessageDialog(null, "Dipilih Save");
                frmBarang.setVisible(false);
            } else if (tombolPilih.getText().equals("Cancel")) {
                JOptionPane.showMessageDialog(null, "Dipilih Cancel");
                frmBarang.setVisible(false);
            }
        }
    }

    public static void main(String[] args) {
        new latihan3();
    }
}
