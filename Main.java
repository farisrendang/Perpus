package Perpus;

public class Main {

    public static void main(String[] args) {
        Buku buku = new Buku();
        Siswa siswa = new Siswa();
        Peminjaman peminjaman = new Peminjaman();
        Laporan laporan = new Laporan();
        
        System.out.print("-----------------------------------------------------------------------");
        laporan.laporan(buku);
        System.out.print("-----------------------------------------------------------------------");
        laporan.laporan(siswa);
        laporan.Apa(siswa, buku);
    }

}
