package Perpus;

import java.util.ArrayList;
public class Siswa implements Key{
    private ArrayList<String> NamaSiswa = new ArrayList<String>();
    private ArrayList<String> Alamat = new ArrayList<String>();
    private ArrayList<String> Telepon = new ArrayList<String>();
    private ArrayList<Boolean> Status = new ArrayList<Boolean>();
    
    public Siswa(){
    this.NamaSiswa.add("Rezky");
    this.Alamat.add("Sawojajar");
    this.Telepon.add("083123132");
    this.Status.add(Boolean.FALSE);
    
    this.NamaSiswa.add("Paris");
    this.Alamat.add("Sawoasdsq");
    this.Telepon.add("0841412123");
    this.Status.add(Boolean.TRUE);
    
    this.NamaSiswa.add("Choki");
    this.Alamat.add("Gtwsdadsq");
    this.Telepon.add("0863452312");
    this.Status.add(Boolean.TRUE);

    }
    
     public  boolean getStatus(int idSiswa){
     return this.Status.get(idSiswa);
     }
     public void setStatus(int idSiswa, boolean status){
      this.Status.set(idSiswa, status);
}
             
    public String getStatusTeks(int idSiswa) {
    if (this.Status.get(idSiswa)) {
        return  "Bisa Meminjam";
    } else {
        return "Tidak Bisa Meminjam";
    }
}
    public int getJmlSiswa(){
        return this.NamaSiswa.size();            
    }

    @Override
    public void setNama(String NamaS) {
        this.NamaSiswa.add(NamaS);
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
    public String getNama(int idSiswa) {
        return this.NamaSiswa.get(idSiswa);
    }

    @Override
    public String getAlamat(int idSiswa) {
        return this.Alamat.get(idSiswa);
        
    }

    @Override
    public String getTelepon(int idSiswa) {
        return this.Telepon.get(idSiswa);
    }
    
}
