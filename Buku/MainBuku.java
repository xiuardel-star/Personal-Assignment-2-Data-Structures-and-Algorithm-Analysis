import java.util.Scanner;

public class MainBuku {
    public static void main(String[] args) {
        BookLinkedList library = new BookLinkedList();
        Scanner input = new Scanner(System.in); // Menggunakan Scanner [5]
        int pilihan;

        do {
            System.out.println("\n===== SISTEM DATA BUKU =====");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Semua Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // Clear buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Buku: ");
                    String kode = input.nextLine();
                    System.out.print("Masukkan Judul: ");
                    String judul = input.nextLine();
                    System.out.print("Masukkan Penulis: ");
                    String penulis = input.nextLine();
                    library.addBook(kode, judul, penulis);
                    break;
                case 2:
                    library.removeLastBook();
                    break;
                case 3:
                    System.out.print("Masukkan Kode Buku yang dicari: ");
                    String cariKode = input.nextLine();
                    library.searchBook(cariKode);
                    break;
                case 4:
                    library.displayAll();
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
        } while (pilihan != 5);
        input.close();
    }
}