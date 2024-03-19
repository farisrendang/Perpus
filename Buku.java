package Perpus;

import java.util.ArrayList;

public class Buku {

    private ArrayList<String> NamaBuku = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public Buku() {
        this.NamaBuku.add("Bumi");
        this.harga.add(75000);
        this.stok.add(5);

        this.NamaBuku.add("Bulan");
        this.harga.add(80000);
        this.stok.add(11);

        this.NamaBuku.add("Comet");
        this.harga.add(90000);
        this.stok.add(12);
    }

    public int getJmlBuku() {
        return this.NamaBuku.size();
    }

    public void setNamaBuku(String namaBarang) {
        this.NamaBuku.add(namaBarang);
    }

    public String getNamaBuku(int idBuku) {
        return this.NamaBuku.get(idBuku);
    }

    public void setStok(int stok) {
        this.stok.add(stok);
    }

    public int getStok(int idBuku) {
        return this.stok.get(idBuku);
    }

    public void editStok(int idBarang, int stok) {
        this.stok.set(idBarang, stok);;
    }

    public void setHarga(int harga) {
        this.harga.add(harga);
    }

    public int getHarga(int idBuku) {
        return this.harga.get(idBuku);
    }

}
