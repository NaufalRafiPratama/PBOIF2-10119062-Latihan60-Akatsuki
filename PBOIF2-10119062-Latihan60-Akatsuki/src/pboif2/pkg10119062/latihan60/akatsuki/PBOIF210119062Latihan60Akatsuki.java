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
public class PBOIF210119062Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("=================================Akatsuki yang berasal dari Desa Konoha===================================");
        System.out.print("Nama                                        : ");Obito objObito = new Obito("Kamui", "Uchiha", "Mati");
        objObito.setTujuan("Menciptakan dunia genjutsu Mugen Tsukoyomi dengan kendalinya");
        objObito.tampilData();
        System.out.println("Tujuan                                      : "+objObito.getTujuan());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        System.out.print("Nama                                        : ");Itachi objItachi = new Itachi("Tsukoyomi", "Uchiha", "Mati");
        objItachi.setTujuan("Melindungi Desa Konoha dan adiknya Sasuke");
        objItachi.tampilData();
        System.out.println("Tujuan                                      : "+objItachi.getTujuan());
        System.out.println("----------------------------------------------------------------------------------------------------------");
        
        System.out.print("Nama                                        : ");Orochimaru objOrochimaru = new Orochimaru("Ular", "Tidak diketahui", "Hidup");
        objOrochimaru.setTujuan("Meneliti untuk menguasai semua jutsu yang ada");
        objOrochimaru.tampilData();
        System.out.println("Tujuan                                      : "+objOrochimaru.getTujuan());        
    }
    
}
