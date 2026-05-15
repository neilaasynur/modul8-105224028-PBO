public class PengirimanDarat extends LayananPengiriman implements LacakKargo {
    private String jenisTruk;
    public String statusSaatIni;

    public PengirimanDarat(String noResi, double beratBarang, double jarakTempuh, String jenisTruk){
        super(noResi, beratBarang, jarakTempuh);
        this.jenisTruk = jenisTruk;
        statusSaatIni = "Menunggu Kurir";
    }

    @Override
    public double hitungOngkirKirim(){
        double ongkir = (beratBarang * 5000) + (jarakTempuh * 2000);
        if (this.jenisTruk.equalsIgnoreCase("tronton")){
            double biayaTambahan = 150000;
            return ongkir + biayaTambahan;
        }
        return ongkir;
    }

    // 2. Implementasi Method dari Interface LacakKargo
    @Override
    public void updateStatus(String status) {
        this.statusSaatIni = status;
    }

    @Override
    public String cekLokasiTerakhir() {
        return this.statusSaatIni;
    }
}
