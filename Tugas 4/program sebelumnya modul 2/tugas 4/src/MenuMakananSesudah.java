import java.util.Scanner;

/**
 * Kelas <code>MenuMakananSesudah</code> untuk memilih menu makanan.
 * Kelas ini menampilkan beberapa pilihan makanan.
 */
public class MenuMakananSesudah {

    /**
     * Konstanta untuk nama menu Mie Ayam.
     */
    public static final String MIE_AYAM = "Mie Ayam";

    /**
     * Metode utama untuk menjalankan program.
     * Menampilkan pilihan menu kepada pengguna, dan meminta input pilihan.
     */
    public static void main(String[] args) {
        System.out.println("Pilih Menu Makanan:");

        // Menginisialisasi variabel menu Nasi Goreng
        String s = "Nasi Goreng";
        System.out.println("1. " + s);

        // Menampilkan konstanta MIE_AYAM sebagai pilihan kedua
        System.out.println("2. " + MIE_AYAM);
        System.out.println("3. Soto Ayam");

        // Membaca input pilihan dari pengguna
        int pilihan = new Scanner(System.in).nextInt();

        // Memanggil metode untuk menampilkan pilihan berdasarkan input
        tampilkanpilihan(pilihan);
    }

    /**
     * Menampilkan hasil pilihan berdasarkan input.
     * Memeriksa apakah pilihan adalah Nasi Goreng, Mie Ayam, atau Soto Ayam,
     * dan menampilkan hasil sesuai pilihan. Menampilkan pesan "Pilihan tidak valid" jika input tidak sesuai.
     *
     * @param pilihan angka yang dipilih oleh pengguna
     */
    private static void tampilkanpilihan(int pilihan) {
        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng");
        } else if (pilihan == 2) {
            System.out.println("Anda memilih " + MIE_AYAM);
        } else if (pilihan == 3) {
            System.out.println("Anda memilih Soto Ayam");
        } else {
            System.out.println("Pilihan tidak valid");
        }
    }
}
