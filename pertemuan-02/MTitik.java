// File : MTitik.java          28/02/24
// Penulis : Farrel Amirta Irbah
// Deskripsi : Kelas MTitik yang merupakan sebuah class untuk menguji class Titik sebelumnya

public class MTitik {
    public static void main(String[] args) {
        Titik t1;
        Titik t2;
        Titik t3;

        t1 = new Titik();
        t2 = new Titik();
        t3 = new Titik();


        t2.setAbsis(1);
        t2.setOrdinat(2);
        t3.setAbsis(5);
        t3.setOrdinat(6);
        int counterTitik = Titik.getCounterTitik();

        // Menampilkan jumlah objek titik
        System.out.printf("Jumlah objek titik : %d\n", counterTitik);

        // Menampilkan koordinat titik t1
        System.out.printf("Koordinat titik t1: (%.2f, %.2f)\n", t1.getAbsis(), t1.getOrdinat());

        // Menampilkan koordinat titik t2
        System.out.printf("Koordinat titik t2: (%.2f, %.2f)\n", t2.getAbsis(), t2.getOrdinat());

        // Menampilkan koordinat titik t3
        System.out.printf("Koordinat titik t3: (%.2f, %.2f)\n", t3.getAbsis(), t3.getOrdinat());

        // Menguji method getJarakPusat()
        System.out.printf("Jarak titik t2 ke pusat: %.2f\n", t2.getJarakPusat());
        System.out.printf("Jarak titik t3 ke pusat: %.2f\n", t3.getJarakPusat());

        // Menguji method refleksiX() dan refleksiY()
        t2.refleksiX();
        System.out.printf("Koordinat titik t2 setelah direfleksi terhadap sumbu X: (%.2f, %.2f)\n", t2.getAbsis(), t2.getOrdinat());

        t3.refleksiY();
        System.out.printf("Koordinat titik t3 setelah direfleksi terhadap sumbu Y: (%.2f, %.2f)\n", t3.getAbsis(), t3.getOrdinat());

        // Menguji method getRefleksiX() dan getRefleksiY()
        Titik t2RefleksiX = t2.getRefleksiX();
        Titik t3RefleksiY = t3.getRefleksiY();
        System.out.printf("Koordinat titik t2 setelah direfleksi terhadap sumbu X: (%.2f, %.2f)\n", t2RefleksiX.getAbsis(), t2RefleksiX.getOrdinat());
        System.out.printf("Koordinat titik t3 setelah direfleksi terhadap sumbu Y: (%.2f, %.2f)\n", t3RefleksiY.getAbsis(), t3RefleksiY.getOrdinat());

        // Membuat objek garis
        Garis garis1 = new Garis(t2, t3);

        // Menguji method GetPanjang() dan GetGradien()
        System.out.printf("Panjang garis: %.2f\n", garis1.GetPanjang());
        System.out.printf("Gradien garis: %.2f\n", garis1.GetGradien());

        // Menguji method getRefleksiGarisY()
        Garis garisRefleksiY = garis1.getRefleksiGarisY();
        System.out.printf("Koordinat titik awal garis refleksi terhadap sumbu Y: (%.2f, %.2f)\n", garisRefleksiY.getTitikAwal().getAbsis(), garisRefleksiY.getTitikAwal().getOrdinat());
        System.out.printf("Koordinat titik akhir garis refleksi terhadap sumbu Y: (%.2f, %.2f)\n", garisRefleksiY.getTitikAkhir().getAbsis(), garisRefleksiY.getTitikAkhir().getOrdinat());

        // Menguji method isTegakLurus()
        Garis garis2 = new Garis(new Titik(2, 2), new Titik(2, 6));
        System.out.println("Apakah garis1 tegak lurus terhadap garis2? " + garis1.isTegakLurus(garis2));
    }
}
