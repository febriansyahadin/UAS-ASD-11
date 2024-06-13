package uas;

public class BarangRental {

    String noTNKB;
    String namaKendaraan;
    String jenisKendaraan;
    int tahun;
    int biayaSewa;
    int prev, next;
    
    public void BarangRental(int pre , String noTNKB, String namaKendaraan, String jenisKendaraan, int tahun, int biayaSewa, int next) {
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
    }
}
