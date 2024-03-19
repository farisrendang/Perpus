/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perpus;

import java.util.ArrayList;

/**
 *
 * @author Arya
 */
public class Petugas implements Key{
    private ArrayList<String> NamaPetugas = new ArrayList<String>();
    private ArrayList<String> Alamat = new ArrayList<String>();
    private ArrayList<String> Telepon = new ArrayList<String>();
    
    public Petugas(){
    this.NamaPetugas.add("Hai");
    this.Alamat.add("Heloo");
    this.Telepon.add("0832153132");
    
    this.NamaPetugas.add("Frace");
    this.Alamat.add("Sawor");
    this.Telepon.add("0844568490");

    }
    @Override
    public void setNama(String NamaP) {
        this.NamaPetugas.add(NamaP);
    }

    @Override
    public void setAlamat(String alamat) {
        this.Alamat.add(alamat);
    }

    @Override
    public void setTelepone(String telepone) {
        this.Telepon.add(telepone);
    }

    @Override
    public String getNama(int idpetugas) {
        return this.NamaPetugas.get(idpetugas);
    }

    @Override
    public String getAlamat(int idpetugas) {
        return this.Alamat.get(idpetugas);
    }

    @Override
    public String getTelepon(int idpetugas) {
        return this.Telepon.get(idpetugas);
    }   
}
