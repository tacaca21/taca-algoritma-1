import java.util.Scanner;

public class KategoriNilai {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        double nilai = inputan.nextDouble();

        if (nilai >= 80 && nilai <= 100) {
            System.out.println("Kategori nilai A");
        } else if (nilai >= 70) {
            System.out.println("Kategori nilai B");
        } else if (nilai >= 60) {
            System.out.println("Kategori nilai C");
        } else if (nilai >= 50) {
            System.out.println("Kategori nilai D");
        } else if (nilai >= 0) {
            System.out.println("Kategori nilai E");
        } else {
            System.out.println("Nilai tidak valid");
        }
    }
}
