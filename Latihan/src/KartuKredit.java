public class KartuKredit extends Pembayaran implements Keamanan{
    private String nomorKartu;

    public KartuKredit(String namaPembayar, double nominal, String nomorKartu){
        super(namaPembayar, nominal);
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran(){
        double admin = 0.02 * nominal;
        double total = nominal + admin;
        System.out.println("Tagihan yang harus dibayar adalah Rp" + total);
    }

    @Override
    public boolean autentikasi (){
        System.out.println("Proses autentikasi telah Berhasil!");
        return true;
    }

    
}
