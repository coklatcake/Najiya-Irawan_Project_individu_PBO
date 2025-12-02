import java.util.ArrayList;

public class Bus {

    private ArrayList<Penumpang> kursiReguler;
    private ArrayList<Penumpang> kursiPrioritas;
    private ArrayList<Penumpang> areaBerdiri;

    private final int TARIF = 2000;
    private int totalUangMasuk = 0;

     public Bus() {
        kursiReguler = new ArrayList<>();
        kursiPrioritas = new ArrayList<>();
        areaBerdiri = new ArrayList<>();
    }

    public int totalPenumpang() {
        return kursiReguler.size() + kursiPrioritas.size() + areaBerdiri.size();
    }
