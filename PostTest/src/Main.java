public class Main {
    public static void main(String[] args) throws Exception {
        PengirimanDarat paket1 = new PengirimanDarat("DRT-001", 50, 100, "Tronton");
        PengirimanUdara paket2 = new PengirimanUdara("UDR-999", 10, 800, "GA-123", 5000000);
        
        paket1.updateStatus("Sedang di jalan tol Cipali");
        paket2.updateStatus("Transit di Bandara Soekarno-Hatta");

        LayananPengiriman[] listPaket = new LayananPengiriman[2];

        listPaket[0] = paket1;
        listPaket[1] = paket2;

        for (LayananPengiriman list : listPaket) {
            System.out.println("=== TAGIHAN PENGIRIMAN ===");
            list.cetakResi();
            if (list instanceof LacakKargo){
                System.out.println("Lokasi Terakhir:  " + ((LacakKargo)list).cekLokasiTerakhir());
            }

            double ongkirAwal = list.hitungOngkirKirim();
            double totalTagihan = ongkirAwal;

            if (list instanceof Asuransi){
                ((Asuransi)list).cetakPolis();
                double premi = ((Asuransi)list).hitungPremi(5000000);
                System.out.println("Premi Asuransi: Rp" + premi);
                totalTagihan += premi;
            }

            System.out.println("Biaya Ongkir: Rp" + ongkirAwal);
            System.out.println("Total Tagihan: Rp " + totalTagihan);
            System.out.println("========================\n");
        }
    }
}
