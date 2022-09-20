package Nomor4;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar; 
    public float diskon; 

    Barang(String kode, String namaBarang, int hargaDasar, float diskon){
        this.kode = kode;
        this.namaBarang = namaBarang;
        this.hargaDasar = hargaDasar;
        this.diskon = diskon;
    }

    public int hitungHargaJual(){
        int hargaJual = hargaDasar - (int)(diskon * hargaDasar);
        return hargaJual;
    }

    public void tampilData(){
        System.out.println("Kode        : " +kode);
        System.out.println("Nama        : " + namaBarang);
        System.out.println("Harga Dasar : " + hargaDasar);
        System.out.println("Diskon      : " + diskon);
        System.out.println("Total Harga : " + hitungHargaJual());
    }
}
