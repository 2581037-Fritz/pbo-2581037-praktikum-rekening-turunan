public class BankTurunan {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan("101", "Ani", 1000000, 2.5);

        System.out.println("========== REKENING AWAL ==========");
        tabungan.cetakInfo();

        System.out.println("\n========== TRANSAKSI ==========");
        System.out.println("Tabungan tarik 1.500.000 : " + (tabungan.tarik(1500000) ? "Berhasil" : "Ditolak"));
    }
}