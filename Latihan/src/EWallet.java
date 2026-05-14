public class EWallet extends Pembayaran implements Keamanan{
    private String nomorHp;

    public EWallet (String nama, double nominal, String nomorHp){
        super(nama, nominal);
        this.nomorHp = nomorHp;
    }

    @Override
    public void prosesPembayaran(){
        System.out.println("Nominal yang harus dibayar adalah Rp" + nominal);
    }

    @Override
    public boolean autentikasi (){
        System.out.println("Sistem autentikasi telah Berhasil!");
        return true;
    }

}
