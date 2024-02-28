// File : Garis.java          28/02/24
// Penulis : Farrel Amirta Irbah
// Deskripsi : Kelas Garis yang merupakan sebuah Garis dengan (x1, y1) dan (x2, y2)

public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    public Titik getTitikAwal() {
        return titikAwal;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public double GetPanjang(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double GetGradien(){
        double dx = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double dy = titikAkhir.getOrdinat() - titikAwal.getOrdinat();

        if (dx == 0){
            return 0;
        }
        else {
            return (dy / dx);
        }
    }

    public Garis getRefleksiGarisY(){
        Titik T1 = titikAwal.getRefleksiY();
        Titik T2 = titikAkhir.getRefleksiY();
        return new Garis(T1,T2);
    }

    public boolean isTegakLurus(Garis G) {
        double m1 = this.GetGradien();
        double m2 = G.GetGradien();
        
        if (Double.isInfinite(m1)) {
            return m2 == 0;
        } else if (Double.isInfinite(m2)) {
            return m1 == 0;
        }

        return m1 * m2 == -1;
    }

}
