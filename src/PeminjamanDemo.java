public class PeminjamanDemo {
    public static void main(String[] args) {
        Peminjaman pjm = new Peminjaman();
        pjm.id = 231;
        pjm.namaMember = "Bangkit";
        pjm.namaGame = "God Of War";
        pjm.harga = 2000;
        pjm.lamasewa = 2;
        pjm.hitungHarga();
        pjm.tampilData();
    }
}
