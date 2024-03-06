class Lingkaran {
    private double JariJari;
    public Lingkaran(double JariJari) {
        this.JariJari = JariJari;
    }

    public double hitungKeliling() {
        double Keliling = 2 * Math.PI * JariJari;
        return Keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double JariJari = 0;
        assert(JariJari > 0): "Jari-jari tidak boleh nol!";
        Lingkaran i = new Lingkaran(JariJari);
        double kelilingLingkaran = i.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}
