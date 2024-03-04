public class Kelinci {
    public String nama = "Aqua";
    public int umur = 10;
    public String jeniskelamin = "Perempuan";
    public String makanan = "Wortel";
    public String warna = "Putih";
    public int jmlanak = 10;
    public String kegiatan = "Rebahan";

    void show(){
        System.out.println("Nama Kelinciku : "+nama);
        System.out.println("Umur Kelinciku : "+umur+ " Bulan");
        System.out.println("Jenis Kelamin Kelinciku : "+jeniskelamin);
        System.out.println("Makanan Favorite Kelinciku : "+makanan);
        System.out.println("Warna Kelinciku : "+warna);
        System.out.println("Jumlah anak Kelinciku : "+jmlanak);
    }

    void aktivitas(){
        System.out.println("Setiap hari "+ nama + " memiliki hobby " + kegiatan);
    }
    void cekJenisKelamin(){
        System.out.println("Jenis Kelaminku "+ jeniskelamin);
    }

    void cekMakananFav(){
        System.out.println("Makanan Favoritku "+ makanan );
    }
}
