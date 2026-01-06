
public class Dosen extends User {
    private String spesialisasi;

    public Dosen(String id, String nama, String spesialisasi) {
        super(id, nama);
        this.spesialisasi = spesialisasi;
    }

    @Override
    public void tampilInfo() {
        System.out.println("[DOSEN]ID:"+id+"|Nama:"+nama+"|Ahli:"+spesialisasi);
    }
}
