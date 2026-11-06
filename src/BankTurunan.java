public class BankTurunan {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan("101", "Ani", 1000000, 2.5);
        Giro giro = new Giro("201", "Budi", 200000, 500000);

        System.out.println("========== REKENING AWAL ==========");
        tabungan.cetakInfo();
        giro.cetakInfo();

        System.out.println("\n========== TRANSAKSI ==========");
        System.out.println("Tabungan tarik 1.500.000 : " + (tabungan.tarik(1500000) ? "Berhasil" : "Ditolak"));
        System.out.println("Giro tarik 500.000       : " + (giro.tarik(500000) ? "Berhasil" : "Ditolak"));
        System.out.println("Giro tarik 300.000       : " + (giro.tarik(300000) ? "Berhasil" : "Ditolak"));

        giro.setor(100000);
        System.out.println("Giro setor 100.000       : Berhasil");

        int bunga = tabungan.tambahBunga();
        System.out.println("Bunga tabungan           : " + Rekening.formatRupiah(bunga));

        System.out.println("\n========== REKENING AKHIR ==========");
        tabungan.cetakInfo();
        giro.cetakInfo();
    }
}