/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan60.akatsuki;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Progam : program ini berisi program untuk menampilkan
 * akatsuki
 */
public class Obito extends AkatsukiDariKonoha{
    private String tujuan;

    public Obito(String jurusUtama, String klan, String status) {
        super(jurusUtama, klan, status);
        System.out.println("Obito dikenal sebagai Tobi/Madara");
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
}
