public class Giro extends Rekening {
    private int batasOverdraft;

    public Giro(String nomor, String pemilik, int saldo, int batasOverdraft) {
        super(nomor, pemilik, saldo);
        this.batasOverdraft = batasOverdraft;
    }

    @Override
    public boolean tarik(int jumlah) {
        /*
         * TUGAS KETENTUAN NO. 7:
         * Jika baris System.out.println(nomor); dijalankan, program akan error.
         * Pesan error: "nomor has private access in Rekening"[cite: 3]
         */

        if (jumlah <= 0 || (saldo - jumlah) < -batasOverdraft) {
            return false;
        }
        saldo -= jumlah;
        return true;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("    Giro, batas overdraft " + formatRupiah(batasOverdraft));
    }
}