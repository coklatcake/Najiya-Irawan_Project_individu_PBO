import java.util.Scanner;

public class TestBus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bus bus = new Bus();

        boolean jalan = true;

        while (jalan) {
            System.out.println("\n===== SISTEM BUS KOTA =====");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Kondisi Bus");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            int pilih = sc.nextInt();
            sc.nextLine();

        switch (pilih) {
                case 1:
                    System.out.print("Nama penumpang: ");
                    String nm = sc.nextLine();

                    System.out.print("Usia: ");
                    int u = sc.nextInt();
                    sc.nextLine();
