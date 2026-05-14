public abstract class Pembayaran {
    protected String namaPembayaran;
    protected double nominal;

    public Pembayaran (String namaPembayaran, double nominal){
        this.namaPembayaran = namaPembayaran;
        this.nominal = nominal;
    }

    public void tampilkanDetail(){
        System.out.println("Nama: " + namaPembayaran);
        System.out.println("Nominal: " + nominal);
    }
    
    abstract void prosesPembayaran();
}
