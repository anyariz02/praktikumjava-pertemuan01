package Model;

public class MahasiswaTransfer extends Mahasiswa {
    private double IPKSebelumnnya;

    public double getIPKSebelumnnya() {
        return IPKSebelumnnya;
    }

    public void setIPKSebelumnnya(double IPKSebelumnnya){
        this.IPKSebelumnnya = IPKSebelumnnya;
    }
    public void inputKRS() {
        super.inputKRS();
        System.out.println("Ini Input KRS dengan Overidding");
    }

}
