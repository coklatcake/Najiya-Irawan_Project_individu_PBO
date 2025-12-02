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

     public boolean bolehMasuk(Penumpang p) {
        return totalPenumpang() < 40 && p.getSaldo() >= TARIF;
    }

    public boolean naik(Penumpang p) {

        if (!bolehMasuk(p)) {
            return false;
        }

         boolean prioritas = p.termasukPrioritas();

        // Aturan kursi
        if (prioritas) {
            if (kursiPrioritas.size() < 4) {
                kursiPrioritas.add(p);
            } else if (kursiReguler.size() < 16) {
                kursiReguler.add(p);
            } else {
                areaBerdiri.add(p);
            }
        } else { 
            if (kursiReguler.size() < 16) {
                kursiReguler.add(p);
            } else {
                areaBerdiri.add(p);
            }
        }

        p.bayarOngkos(TARIF);
        totalUangMasuk += TARIF;

        return true;
    }

    public boolean turun(String nama) {
        // prioritas
        for (Penumpang p : kursiPrioritas) {
            if (p.getNama().equalsIgnoreCase(nama)) {
                kursiPrioritas.remove(p);
                return true;
            }
        }

         // reguler
        for (Penumpang p : kursiReguler) {
            if (p.getNama().equalsIgnoreCase(nama)) {
                kursiReguler.remove(p);
                return true;
            }
        }

