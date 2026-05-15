public class PengirimanUdara extends LayananPengiriman implements LacakKargo, Asuransi{
    private String nomorPenerbangan;
    public String statusSaatIni;
    public double nilaiBarang;

    public PengirimanUdara (String noResi, double beratBarang, double jarakTempuh, String nomorPenerbangan, double nilaiBarang){
        super(noResi, beratBarang, jarakTempuh);
        this.nomorPenerbangan = nomorPenerbangan;
        this.nilaiBarang = nilaiBarang;
        statusSaatIni = "Menunggu Jadwal Penerbangan";
    }

    @Override
    public double hitungOngkirKirim(){
        double ongkir = (beratBarang * 25000) + (jarakTempuh * 5000);
        return ongkir;
    }

    @Override
    public double hitungPremi (double nilaiBarang){
        double premi = 0.03 * nilaiBarang;
        return premi;
    }

    @Override
    public void updateStatus(String status) {
        this.statusSaatIni = status;
    }

    @Override
    public String cekLokasiTerakhir() {
        return this.statusSaatIni;
    }   
}
