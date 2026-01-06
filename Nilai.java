
public class Nilai implements Penilaian{
    private double tgs, uts, uas;

    public Nilai(double tgs, double uts, double uas) {
        this.tgs = tgs;
        this.uts = uts;
        this.uas = uas;
    }

    @Override
    public double hitungNilaiAkhir() {
        // Rumus perhitungan nilai
        return (tgs * 0.3) + (uts * 0.3) + (uas * 0.4);
    }
}
