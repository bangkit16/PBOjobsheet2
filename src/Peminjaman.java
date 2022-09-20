public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamasewa;
    public int hargaBayar;

    public void hitungHarga(){
        hargaBayar = lamasewa * harga;
    }
    public void tampilData(){
        System.out.println("id              : "+ id);
        System.out.println("Nama Member     : "+ namaMember);
        System.out.println("Nama Game       : "+ namaGame);
        System.out.println("Harga           : "+ harga);
        System.out.println("Lama Sewa       : "+ lamasewa);
        System.out.println("Harga Bayar     : "+ hargaBayar);
    }

}
