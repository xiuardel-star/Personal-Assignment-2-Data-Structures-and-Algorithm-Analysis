public class Node {
    String nomorAntrian;
    String namaPelanggan;
    double totalBelanja;
    Node next;

    public Node(String nomor, String nama, double total) {
        this.nomorAntrian = nomor;
        this.namaPelanggan = nama;
        this.totalBelanja = total;
        this.next = null;
    }
}