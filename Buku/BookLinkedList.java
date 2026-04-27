public class BookLinkedList {
    private Book head;
    private int size = 0;

    // 1. Tambah Buku (Push ke Akhir) 
    public void addBook(String kode, String judul, String penulis) {
        // Validasi kodeBuku maksimal 5 karakter 
        if (kode.length() > 5) {
            System.out.println("Gagal: Kode buku maksimal 5 karakter!");
            return;
        }

        Book newBook = new Book(kode, judul, penulis);
        if (head == null) {
            head = newBook;
        } else {
            Book temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newBook; // Data baru dimasukkan di akhir daftar 
        }
        size++;
        System.out.println("Data berhasil ditambahkan!");
    }

    // 2. Hapus Buku (Pop Data Terakhir) 
    public void removeLastBook() {
        if (head == null) {
            System.out.println("Tidak ada data untuk dihapus."); // Pesan validasi 
            return;
        }

        if (head.next == null) {
            head = null;
        } else {
            Book temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        size--;
        System.out.println("Buku terakhir berhasil dihapus.");
    }

    // 3. Cari Buku berdasarkan Kode 
    public void searchBook(String kode) {
        Book temp = head;
        while (temp != null) {
            if (temp.getKodeBuku().equalsIgnoreCase(kode)) {
                System.out.println("Detail Buku Found:");
                System.out.println("Kode: " + temp.getKodeBuku() + " | Judul: " + temp.getJudul() + " | Penulis: " + temp.getPenulis());
                return;
            }
            temp = temp.next;
        }
        System.out.println("Buku tidak ditemukan."); // Pesan validasi 
    }

    // 4. Tampilkan Semua Buku 
    public void displayAll() {
        if (head == null) {
            System.out.println("Daftar buku kosong.");
            return;
        }
        System.out.println("Daftar Buku:");
        Book temp = head;
        while (temp != null) {
            System.out.println("Kode: " + temp.getKodeBuku() + " | Judul: " + temp.getJudul() + " | Penulis: " + temp.getPenulis());
            temp = temp.next;
        }
        System.out.println("Total Buku: " + size); // Menampilkan total jumlah buku 
    }
}