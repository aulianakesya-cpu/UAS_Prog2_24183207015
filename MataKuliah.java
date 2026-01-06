
public class MataKuliah {
    private String kodeMK;
    private String namaMK;

    public MataKuliah(String kodeMK, String namaMK) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
    }

    public void infoMK() {
        System.out.println("[MK]        " + kodeMK + " - " + namaMK);
    }
}
