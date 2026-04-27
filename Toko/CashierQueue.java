public class CashierQueue {
    private Node front, rear;
    private int size = 0;

    // Tambah antrean (Enqueue)
    public void enqueue(String nomor, String nama, double total) {
        Node newNode = new Node(nomor, nama, total);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Data pelanggan " + nama + " ditambahkan ke antrean!");
    }

    // Layani pelanggan (Dequeue)
    public Node dequeue() {
        if (front == null) return null;
        Node temp = front;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return temp;
    }

    public void displayQueue() {
        if (front == null) {
            System.out.println("Antrean saat ini kosong.");
            return;
        }
        System.out.println("--- Daftar Antrean Saat Ini ---");
        Node curr = front;
        while (curr != null) {
            System.out.println("[" + curr.nomorAntrian + "] " + curr.namaPelanggan);
            curr = curr.next;
        }
    }

    public int getSize() { return size; }
}