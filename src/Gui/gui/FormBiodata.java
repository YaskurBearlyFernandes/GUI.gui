package Gui.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNim;
    private JButton ButtonSave;
    private JTextField LabelNama;
    private JTextField LabelNim;
    private JTextField LabelJenjangPendidikan;
    private JTextField LabelTahunMasuk;
    private JTextField LabelFakultas;
    private JTextField LabelJurusan;
    private JTextField LabelJenisKelamin;
    private JTextField LabelNomorUrut;
    private JPanel rootPanel;

    public FormBiodata() {
        ButtonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String Nama = textNama.getText();
                String Nim = textNim.getText();
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(Nama);
                mhs.setNim(Nim);
                LabelNama.setText("Nama : " + mhs.getNama());
                LabelNim.setText("NIM : " + mhs.getNim());
                LabelJenjangPendidikan.setText("Jenjang Pendidikan : " + mhs.getJenjangPendidikan());
                LabelTahunMasuk.setText("Tahun Masuk : " + mhs.getTahunMasuk());
                LabelFakultas.setText("Fakultas : " + mhs.getFakultas());
                LabelJurusan.setText("Jurusan : " + mhs.getJurusan());
                LabelJenisKelamin.setText("Jenis Kelamin : " + mhs.getJenisKelamin());
                LabelNomorUrut.setText(mhs.getNomorUrut());

            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
