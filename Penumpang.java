public class Penumpang {

    private String nama;
    private int usia;
    private boolean kondisiHamil;
    private int saldoKartu;

public Penumpang(String nama, int usia, boolean kondisiHamil) {
        this.nama = nama;
        this.usia = usia;
        this.kondisiHamil = kondisiHamil;
        this.saldoKartu = 10000; // saldo awal default
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }

    public boolean isHamil() {
        return kondisiHamil;
    }

    public int getSaldo() {
        return saldoKartu;
    }

    public void tambahSaldo(int jumlah) {
        saldoKartu += jumlah;
    }

    public void bayarOngkos(int ongkos) {
        saldoKartu -= ongkos;
    }

    public boolean termasukPrioritas() {
        return usia > 60 || usia < 10 || kondisiHamil;
    }

    
    @Override
    public String toString() {
        return nama + " | usia: " + usia + " | saldo: " + saldoKartu;
    }
}
