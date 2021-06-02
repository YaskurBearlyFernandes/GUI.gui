package Gui.gui;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class Mahasiswa {
    private String Nama;
    private String nim;
    private String Jenjangpendidikan;
    private String Tahunmasuk;
    private String Fakultas;
    private String Jurusan;
    private String Jeniskelamin;
    private String Nomorurut;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama,
                     String nim,
                     String jenjangpendidikan,
                     String tahunmasuk,
                     String fakultas,
                     String jurusan,
                     String jeniskelamin,
                     String nomorurut) {
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenjangPendidikan() {
        char kodeJp = nim.charAt(0);
        if (kodeJp == '1') {
            return "S1(Sarjana)";
        } else if (kodeJp == '2') {
            return "S2(Margister)";
        } else if (kodeJp == '3') {
            return "S3(Doktor)";
        }
        return "Unknown";
    }

    public void setJenjangpendidikan(String jenjangpendidikan) {
        this.Jenjangpendidikan = jenjangpendidikan;
    }

    public String getTahunMasuk() {
        char kodeTM = nim.charAt(1);
        char kodeTM1 = nim.charAt(2);
        return "20" + kodeTM + kodeTM1;
    }

    public void setTahunmasuk(String tahunmasuk) {
        this.Tahunmasuk = tahunmasuk;
    }

    public String getFakultas() {
        char kodeFK = nim.charAt(3);
        if (kodeFK == '1') {
            return "Tarbiyah dan Keguruan";
        } else if (kodeFK == '2') {
            return "Syari’ah dan Hukum";
        } else if (kodeFK == '3') {
            return "Ushuluddin";
        } else if (kodeFK == '4') {
            return "Dakwah dan Komunikasi";
        } else if (kodeFK == '5') {
            return "Sains dan Teknologi";
        } else if (kodeFK == '6') {
            return "Psikologi";
        } else if (kodeFK == '7') {
            return "Ekonomi dan Ilmu Sosial";
        } else if (kodeFK == '8') {
            return "Pertanian dan Peternakan";
        }
        return "Unknown";
    }

    public void setFakultas(String fakultas) {
        this.Fakultas = fakultas;
    }

    public String getJurusan() {
        char kodeJN = nim.charAt(5);
        if (kodeJN == '1') {
            return "Teknik Informatika";
        } else if (kodeJN == '2') {
            return "Teknik Industri";
        } else if (kodeJN == '3') {
            return "Sistem Informasi";
        } else if (kodeJN == '4') {
            return "Matematika";
        } else if (kodeJN == '5') {
            return "Teknik Elektro";
        }
        return "Unknown";
    }

    public void setJurusan(String jurusan) {
        this.Jurusan = jurusan;
    }

    public String getJenisKelamin() {
        char kodeJK = nim.charAt(6);
        if (kodeJK == '1') {
            return "LAKI-LAKI";
        } else if (kodeJK == '2') {
            return "PEREMPUAN";
        }
        return "UNKNOWN";
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.Jeniskelamin = jeniskelamin;
    }

    public String getNomorUrut() {
        char kodeU = nim.charAt(7);
        char kodeUr = nim.charAt(8);
        char kodeUru = nim.charAt(9);
        char kodeurut = nim.charAt(10);
        return "Nomor Urut:" + kodeU + kodeUr + kodeUru + kodeurut;
    }

    public void setNomorurut(String nomorurut) {
        this.Nomorurut = nomorurut;
    }

}
