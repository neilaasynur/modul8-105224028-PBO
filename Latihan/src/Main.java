import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Pembayaran kartu = new KartuKredit("Neila Asynur", 100000, "1234567890");
        Pembayaran ewallet = new EWallet("Neila Asynur", 50000, "082299035254");

        ArrayList <Pembayaran> listPembayaran = new ArrayList<>();
        listPembayaran.add(kartu);
        listPembayaran.add(ewallet);

        for (Pembayaran list : listPembayaran) {
            list.tampilkanDetail();
            if (list instanceof KartuKredit){
                ((KartuKredit)list).autentikasi();
                if (true){
                    list.prosesPembayaran();
                }
            } else {
                ((EWallet)list).autentikasi();
                if (true){
                    list.prosesPembayaran();
                }
            }
        }
    }
}
