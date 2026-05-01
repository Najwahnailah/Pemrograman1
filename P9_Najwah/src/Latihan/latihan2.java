/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 * @author lenovo
 */
public class latihan2 extends JFrame {

    private static final String[] JudulKolom = {
        "No.", "NIM", "Nama", "Angkatan", "Kelas"
    };

    private static final DefaultTableModel ModelTabel =
            new DefaultTableModel(null, JudulKolom);

    private static final JTable Tabel = new JTable();

    private final JScrollPane ScrollBar = new JScrollPane();
    private final JPanel panelku = new JPanel();

    public latihan2() {
        super("Menampilkan Tabel");

        setSize(400, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelku.setLayout(null);

        Tabel.setModel(ModelTabel);
        ScrollBar.getViewport().add(Tabel);

        Tabel.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        TableColumn col = Tabel.getColumnModel().getColumn(0);
        col.setPreferredWidth(30);

        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(JLabel.RIGHT);
        Tabel.getColumnModel().getColumn(0).setCellRenderer(rightRenderer);

        ScrollBar.setBounds(20, 20, 350, 160);
        panelku.add(ScrollBar);

        add(panelku);
        setVisible(true);
    }

    public static void main(String[] args) {
        new latihan2();

        for (int i = 0; i <= 15; i++) {
            ModelTabel.insertRow(i, new Object[]{
                i + 1,
                "NIM ke-" + i,
                "Nama ke-" + i,
                "Angkatan ke-" + i,
                "Kelas ke-" + i
            });
        }

        Tabel.setValueAt("Nama 1", 0, 2);
    }
}