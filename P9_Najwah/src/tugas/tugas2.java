/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author lenovo
 */
public class tugas2 extends JFrame {

    private final String[] judulKolom = {
        "No", "NIM", "Nama", "Kelas"
    };

    private final DefaultTableModel modelTabel =
            new DefaultTableModel(null, judulKolom);

    private final JTable tabel = new JTable(modelTabel);
    private final JScrollPane scrollPane = new JScrollPane(tabel);

    private final JPanel panel = new JPanel();

    private final JLabel lblNim = new JLabel("NIM");
    private final JTextField txtNim = new JTextField();

    private final JLabel lblNama = new JLabel("Nama");
    private final JTextField txtNama = new JTextField();

    private final JLabel lblKelas = new JLabel("Kelas");
    private final JTextField txtKelas = new JTextField();

    private final JButton btnTambah = new JButton("Tambah");
    private final JButton btnHapus = new JButton("Hapus");

    private final Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();

    private int nomor = 1;

    public tugas2() {
        super("Tugas 2 - Tabel Mahasiswa");

        setSize(520, 370);
        setLocation(
                dimensi.width / 2 - getWidth() / 2,
                dimensi.height / 2 - getHeight() / 2
        );
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel.setLayout(null);

        lblNim.setBounds(30, 20, 80, 25);
        panel.add(lblNim);

        txtNim.setBounds(100, 20, 150, 25);
        panel.add(txtNim);

        lblNama.setBounds(30, 55, 80, 25);
        panel.add(lblNama);

        txtNama.setBounds(100, 55, 150, 25);
        panel.add(txtNama);

        lblKelas.setBounds(30, 90, 80, 25);
        panel.add(lblKelas);

        txtKelas.setBounds(100, 90, 150, 25);
        panel.add(txtKelas);

        btnTambah.setBounds(280, 35, 100, 30);
        panel.add(btnTambah);

        btnHapus.setBounds(280, 75, 100, 30);
        panel.add(btnHapus);

        scrollPane.setBounds(30, 140, 450, 160);
        panel.add(scrollPane);

        btnTambah.addActionListener(e -> tambahData());
        btnHapus.addActionListener(e -> hapusData());

        add(panel);
        setVisible(true);
    }

    private void tambahData() {
        modelTabel.addRow(new Object[]{
            nomor,
            txtNim.getText(),
            txtNama.getText(),
            txtKelas.getText()
        });

        nomor++;

        txtNim.setText("");
        txtNama.setText("");
        txtKelas.setText("");
        txtNim.requestFocus();
    }

    private void hapusData() {
        int baris = tabel.getSelectedRow();

        if (baris >= 0) {
            modelTabel.removeRow(baris);
        }
    }

    public static void main(String[] args) {
        new tugas2();
    }
}