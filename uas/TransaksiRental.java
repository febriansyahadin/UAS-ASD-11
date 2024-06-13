package uas;

public class TransaksiRental {
    BarangRental[] br;
    int kodeTransaksi;
    int namaPeminjam;
    int lamaPinjam;
    Double TotalBiaya;

    public TransaksiRental(BarangRental[] br, int kodeTransaksi, int namaPeminjam, int lamaPinjam, Double TotalBiaya) {
        this.br = br;
        this.kodeTransaksi = kodeTransaksi;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.TotalBiaya = TotalBiaya;
    }
}
