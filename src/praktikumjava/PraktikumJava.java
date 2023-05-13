package praktikumjava;
import Model.Mahasiswa;
import Model.Sosmed;
import Model.MahasiswaTransfer;

public class PraktikumJava {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();

        mahasiswa.setId(1);
        mahasiswa.setNPM("2110010129");
        mahasiswa.setNama("Rizwan Fauzie Maulana");
        mahasiswa.setIPK(4.0);

        mahasiswa.viewData();
        mahasiswa.inputKRS();

        Mahasiswa m1 = new Mahasiswa(
                2,
                "2110002022",
                "Anya Nishikino",
                3.9);
        m1.viewData();
        mahasiswa.inputKRS();


        Sosmed sosmed = new Sosmed();

        sosmed.setNamaSosmed("Instagram");
        sosmed.setNamaFounder("Kevin Systrom");
        sosmed.setTahun(2010);
        sosmed.latihan1();

        Sosmed sosmed1 = new Sosmed(
                "Facebook",
                "Mark Zuckerberg",
                2004);
        sosmed1.latihan1();

        MahasiswaTransfer mt = new MahasiswaTransfer();
        mt.setId(3);
        mt.setNPM("2110002098");
        mt.setNama("Dahlia");
        mt.setIPK(4.0);
        mt.viewData();
        mt.inputKRS();
    }
}
