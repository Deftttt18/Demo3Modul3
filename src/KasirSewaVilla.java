import java.util.Scanner;

public class KasirSewaVilla {
    private String namaPenyewa;
    private int lamaSewa;
    private static final double HARGA_HARIAN = 400000;

    // Constructor yang menginisialisasi nama penyewa dan lama sewa
    public KasirSewaVilla(String namaPenyewa, int lamaSewa) {
        this.namaPenyewa = namaPenyewa;
        this.lamaSewa = lamaSewa;
    }

    // Metode untuk menghitung total harga berdasarkan lama sewa
    public double hitungTotalHarga() {
        return lamaSewa * HARGA_HARIAN;
    }

    // Metode untuk menampilkan detail sewa
    public void tampilkanDetail() {
        System.out.println("Nama Penyewa: " + namaPenyewa);
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.printf("Total Harga: Rp %.2f%n", hitungTotalHarga());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Penyewa: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Lama Sewa (dalam hari): ");
        int lama = input.nextInt();

        KasirSewaVilla sewa = new KasirSewaVilla(nama, lama);
        sewa.tampilkanDetail();

    }
}
