/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 * @author lenovo
 */
public class tugas1 extends JFrame {

    private final JMenuBar menuBar = new JMenuBar();

    private final JMenu menuFile = new JMenu("File");
    private final JMenuItem menuInput = new JMenuItem("Input Mahasiswa");
    private final JMenuItem menuExit = new JMenuItem("Exit");

    private final JPanel panel = new JPanel();

    private final JLabel lblNim = new JLabel("NIM");
    private final JTextField txtNim = new JTextField();

    private final JLabel lblNama = new JLabel("Nama");
    private final JTextField txtNama = new JTextField();

    private final JLabel lblKelas = new JLabel("Kelas");
    private final JTextField txtKelas = new JTextField();

    private final JButton btnSimpan = new JButton("Simpan");
    private final JButton btnBersih = new JButton("Bersih");

    private final Dimension dimensi = Toolkit.getDefaultToolkit().getScreenSize();

    public tugas1() {
        super("Tugas 1 - Form Mahasiswa");

        setSize(400, 280);
        setLocation(
                dimensi.width / 2 - getWidth() / 2,
                dimensi.height / 2 - getHeight() / 2
        );
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        menuFile.add(menuInput);
        menuFile.addSeparator();
        menuFile.add(menuExit);
        menuBar.add(menuFile);
        setJMenuBar(menuBar);

        panel.setLayout(null);

        lblNim.setBounds(40, 30, 100, 25);
        panel.add(lblNim);

        txtNim.setBounds(130, 30, 180, 25);
        panel.add(txtNim);

        lblNama.setBounds(40, 70, 100, 25);
        panel.add(lblNama);

        txtNama.setBounds(130, 70, 180, 25);
        panel.add(txtNama);

        lblKelas.setBounds(40, 110, 100, 25);
        panel.add(lblKelas);

        txtKelas.setBounds(130, 110, 180, 25);
        panel.add(txtKelas);

        btnSimpan.setBounds(90, 160, 100, 30);
        panel.add(btnSimpan);

        btnBersih.setBounds(200, 160, 100, 30);
        panel.add(btnBersih);

        add(panel);

        menuInput.addActionListener(e -> JOptionPane.showMessageDialog(
                null,
                "Silakan isi data mahasiswa"
        ));

        menuExit.addActionListener(e -> System.exit(0));

        btnSimpan.addActionListener(e -> {
            String nim = txtNim.getText();
            String nama = txtNama.getText();
            String kelas = txtKelas.getText();

            JOptionPane.showMessageDialog(
                    null,
                    "Data Mahasiswa\n"
                    + "NIM   : " + nim + "\n"
                    + "Nama  : " + nama + "\n"
                    + "Kelas : " + kelas
            );
        });

        btnBersih.addActionListener(e -> {
            txtNim.setText("");
            txtNama.setText("");
            txtKelas.setText("");
            txtNim.requestFocus();
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new tugas1();
    }
}