public class Rekening {
    private String nomor;
    private String pemilik;
    protected int saldo; // Diubah ke protected

    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }
        saldo -= jumlah;
        return true;
    }

    public void setor(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
        }
    }

    public void cetakInfo() {
        System.out.println(nomor + " | " + pemilik + " | " + formatRupiah(saldo));
    }

    // Diubah ke protected static
    protected static String formatRupiah(int nominal) {
        return "Rp" + String.format("%,d", nominal).replace(',', '.');
    }
}