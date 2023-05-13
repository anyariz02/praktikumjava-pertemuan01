package Model;

public class Sosmed {
    private String namaSosmed;
    private String namaFounder;
    private int tahun;

    public Sosmed() {
    }

    public Sosmed(String namaSosmed, String namaFounder, int tahun) {
        this.namaSosmed = namaSosmed;
        this.namaFounder = namaFounder;
        this.tahun = tahun;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getNamaSosmed() {
        return namaSosmed;
    }

    public void setNamaSosmed(String namaSosmed) {
        this.namaSosmed = namaSosmed;
    }

    public String getNamaFounder() {
        return namaFounder;
    }

    public void setNamaFounder(String namaFounder) {
        this.namaFounder = namaFounder;
    }

    public void latihan1(){
        System.out.println("================= Latihan 1.1 ====================");
        System.out.println("Nama Sosmed\t: "+namaSosmed);
        System.out.println("Founder \t: "+namaFounder);
        System.out.println("Tahun  \t\t: "+tahun);
        System.out.println("================= Latihan 1.1 ====================");
        System.out.println("");
    }
}
