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
