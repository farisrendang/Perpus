package Perpus;

import java.util.Scanner;

public class Laporan {

    Scanner scanner = new Scanner(System.in);
    private int pilih;

    public void laporan(Buku buku) {
        int a = buku.getJmlBuku();
        int b = 1;

        System.out.println();
        System.out.println("List Buku");
        System.out.println();
        System.out.println("Nama Buku \tStok \tHarga");
        for (int i = 0; i < a; i++) {
            System.out.println(b + "." + buku.getNamaBuku(i) + "\t\t"
                    + buku.getStok(i) + "\t" + buku.getHarga(i));
            b++;
        }
    }

    public void laporan(Siswa siswa) {
        int a = siswa.getJmlSiswa();
        int b = 1;
        System.out.println();
        System.out.println("List Siswa");
        System.out.println();
        System.out.println("Nama Siswa \tAlamat \t\tTelp \t\tStatus");
        for (int i = 0; i < a; i++) {
            System.out.println(b + "." + siswa.getNama(i) + "\t\t"
                    + siswa.getAlamat(i) + "\t" + siswa.getTelepon(i) + "\t" + siswa.getStatusTeks(i));
            b++;
        }
    }

    public void Apa(Siswa siswa, Buku buku) {

        int a = siswa.getJmlSiswa();
        int d = buku.getJmlBuku();
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("                  Selamat Datang di perpustakaan");
        System.out.println("-----------------------------------------------------------------------");
        do {
            System.out.print("Masukan Id :");
            pilih = scanner.nextInt();
            if (a < pilih) {
                System.out.println("Id salah(Masukan Id yang benar)");
            }
        } while (a < pilih);
        System.out.println("-----------------------------------------------------------------------");

        System.out.println("Nama Siswa :" + siswa.getNama(pilih - 1));
        System.out.println("Status     :" + siswa.getStatusTeks(pilih - 1));
        if (siswa.getStatus(pilih-1) == false) {
            int c = 0;
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Apakah anda akan mengembalikan buku");
            System.out.println("1. Iya");
            System.out.println("2. Tidak");
            do {
                System.out.print("Pilih : ");
                c = scanner.nextInt();
                if (2 < c) {
                    System.out.println("salah(Masukan Pilihan yang benar)");
                }
            } while (2 < c);
            if (c == 2) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Terima Kasih telah mengunjungi Perpustakaan");
            }
            if (c == 1) {
                c = 1;
                System.out.println("-----------------------------------------------------------------------");
                for (int i = 0; i < d; i++) {
                    System.out.println(c + "." + buku.getNamaBuku(i));
                    c++;
                }
                do {
                    System.out.print("Pilih Buku yang akan anda kembalikan :");
                    c = scanner.nextInt();
                    if (3 < c) {
                        System.out.println("salah(Masukan Pilihan yang benar)");
                    }
                } while (3 < c);
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Terima Kasih Telah Mengembalikan Buku");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Berikut Data terbaru Perpustakaan");
                System.out.println("");
                int e = c - 1;
                c = 1;
                buku.editStok(e, buku.getStok(e) + 1);
                System.out.println("Nama Buku \tStok \tHarga");
                for (int i = 0; i < a; i++) {
                    System.out.println(c + "." + buku.getNamaBuku(i) + "\t\t"
                            + buku.getStok(i) + "\t" + buku.getHarga(i));
                    c++;
                }
                System.out.println("-----------------------------------------------------------------------");
                c = 1;
                siswa.setStatus(e, true);
                System.out.println("Nama Siswa \tAlamat \t\tTelp \t\tStatus");
                for (int i = 0; i < a; i++) {
                    System.out.println(c + "." + siswa.getNama(i) + "\t\t"
                            + siswa.getAlamat(i) + "\t" + siswa.getTelepon(i) + "\t" + siswa.getStatusTeks(i));
                    c++;
                }

            }
        }
            if (siswa.getStatus(pilih-1) == true) {
            int c = 0;
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Apakah anda akan meminjam buku");
            System.out.println("1. Iya");
            System.out.println("2. Tidak");
            do {
                System.out.print("Pilih : ");
                c = scanner.nextInt();
                if (2 < c) {
                    System.out.println("salah(Masukan Pilihan yang benar)");
                }
            } while (2 < c);
            if (c == 2) {
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Terima Kasih telah mengunjungi Perpustakaan");
            }
            if (c == 1) {
                c = 1;
                System.out.println("-----------------------------------------------------------------------");
                for (int i = 0; i < d; i++) {
                    System.out.println(c + "." + buku.getNamaBuku(i));
                    c++;
                }
                do {
                    System.out.print("Pilih Buku yang akan anda dipinjam :");
                    c = scanner.nextInt();
                    if (3 < c) {
                        System.out.println("salah(Masukan Pilihan yang benar)");
                    }
                } while (3 < c);
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Terima Kasih Telah meminjam Buku");
                System.out.println("-----------------------------------------------------------------------");
                System.out.println("Berikut Data terbaru Perpustakaan");
                System.out.println("");
                int e = c - 1;
                c = 1;
                buku.editStok(e, buku.getStok(e) - 1);
                System.out.println("Nama Buku \tStok \tHarga");
                for (int i = 0; i < a; i++) {
                    System.out.println(c + "." + buku.getNamaBuku(i) + "\t\t"
                            + buku.getStok(i) + "\t" + buku.getHarga(i));
                    c++;
                }
                System.out.println("-----------------------------------------------------------------------");
                c = 1;
                siswa.setStatus(e, false);
                System.out.println("Nama Siswa \tAlamat \t\tTelp \t\tStatus");
                for (int i = 0; i < a; i++) {
                    System.out.println(c + "." + siswa.getNama(i) + "\t\t"
                            + siswa.getAlamat(i) + "\t" + siswa.getTelepon(i) + "\t" + siswa.getStatusTeks(i));
                    c++;
                }

            }
        }
    

}
}
