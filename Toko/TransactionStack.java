public class TransactionStack {
    private Node top;

    // Simpan ke riwayat (Push)
    public void push(Node finishedTransaction) {
        finishedTransaction.next = top;
        top = finishedTransaction;
    }

    // Lihat riwayat
    public void displayHistory() {
        if (top == null) {
            System.out.println("Belum ada riwayat transaksi.");
            return;
        }
        System.out.println("--- Riwayat Transaksi (Terbaru ke Lama) ---");
        Node curr = top;
        while (curr != null) {
            System.out.println("Nomor: " + curr.nomorAntrian + " | Nama: " + curr.namaPelanggan + " | Total: Rp" + curr.totalBelanja);
            curr = curr.next;
        }
    }
}