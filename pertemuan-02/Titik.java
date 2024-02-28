// File : Titik.java          28/02/24
// Penulis : Farrel Amirta Irbah
// Deskripsi : Kelas Titik yang merupakan sebuah titik dengan absis dan ordinat

public class Titik {
    private double absis;
    private double ordinat;
    private static int counterTitik;

    public Titik(double a, double o){
        this.absis = a;
        this.ordinat = o;
    }

    Titik(){
        counterTitik++;
        absis = 0;
        ordinat = 0;
    }

    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double o){
        ordinat = o;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    public double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    public void refleksiX() {
        ordinat = -ordinat;
    }

    public void refleksiY() {
        absis = -absis;
    }

    public Titik getRefleksiX() {
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getRefleksiY() {
        return new Titik(-this.absis, this.ordinat);
    }
}
