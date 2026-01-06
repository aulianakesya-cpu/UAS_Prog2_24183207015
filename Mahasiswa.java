
public class Mahasiswa extends User {
    private String prodi;
    private static int counterMhs = 0; 

    public Mahasiswa(String id, String nama, String prodi) {
        super(id, nama);
        this.prodi = prodi;
        counterMhs++;
    }

    public static int getCounterMhs() {
        return counterMhs;
    }

    @Override
    public void tampilInfo() {
        System.out.println("[MAHASISWA] ID: " + id + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}
