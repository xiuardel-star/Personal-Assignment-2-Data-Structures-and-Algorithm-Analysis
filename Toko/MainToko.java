import java.util.Scanner;

public class MainToko {
    public static void main(String[] args) {
        CashierQueue queue = new CashierQueue();
        TransactionStack stack = new TransactionStack();
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n=== SISTEM KASIR TOKO ===");
            System.out.println("1. Tambah Antrian (Enqueue)");
            System.out.println("2. Layani Pelanggan (Dequeue + Push)");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Riwayat Transaksi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine(); // clear buffer

            long start = System.nanoTime(); // Analisis waktu (LO2)

            switch (menu) {
                case 1:
                    // Validasi jumlah data <= 5 sesuai panduan pengerjaan
                    if (queue.getSize() >= 5) {
                        System.out.println("Maaf, antrean penuh (maksimal 5).");
                    } else {
                        System.out.print("Masukkan Nomor Antrian: ");
                        String no = input.nextLine();
                        System.out.print("Masukkan Nama Pelanggan: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan Total Belanja: ");
                        double total = input.nextDouble();
                        queue.enqueue(no, nama, total);
                    }
                    break;
                case 2:
                    Node served = queue.dequeue();
                    if (served != null) {
                        System.out.println("Melayani pelanggan " + served.nomorAntrian + " (" + served.namaPelanggan + ")");
                        stack.push(served); // Simpan ke stack riwayat
                        System.out.println("Transaksi disimpan ke riwayat.");
                    } else {
                        System.out.println("Antrean kosong, tidak ada yang dilayani.");
                    }
                    break;
                case 3:
                    queue.displayQueue();
                    break;
                case 4:
                    stack.displayHistory();
                    break;
                case 5:
                    System.out.println("Keluar program...");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }

            long end = System.nanoTime();
            if (menu >= 1 && menu <= 4) {
                System.out.println("[Analisis] Waktu eksekusi: " + (end - start) + " ns");
            }
        } while (menu != 5);
        input.close();
    }
}