public class Book {
    private String kodeBuku;
    private String judul;
    private String penulis;
    public Book next; // Pointer ke node selanjutnya 

    public Book(String kodeBuku, String judul, String penulis) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.next = null;
    }

    // Getter dan Setter sesuai instruksi 
    public String getKodeBuku() { return kodeBuku; }
    public String getJudul() { return judul; }
    public String getPenulis() { return penulis; }
}