/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package link;

/**
 *
 * @author USER
 */
class Link5{
    public int data;
    public Link5 kiri;
    public Link5 kanan;
    
    public Link5 (int d){
        data = d;
    }
    public void displayLink(){
        System.out.print(data+"");
    }
}
class DoubleList1{
    private Link5 awal;
    private Link5 akhir;
    
        public DoubleList1(){
            awal = null;
            akhir = null;
        }
        public boolean kosong(){
            return awal == null;
        }
        public void tambahAwal(int dd){
            Link5 baru = new Link5(dd);
            if (kosong()) akhir = baru;
            else awal.kiri = baru;
            baru.kanan = awal;
            awal = baru;
        }
        public void tambahAkhir(int dd){
            Link5 baru = new Link5(dd);
            if(kosong())awal = baru;
        else {
                akhir.kanan = baru;
                baru.kiri = akhir;
        }
            akhir = baru;
    }
        public boolean tambahTengah(int kunci, int dd){
            Link5 bantu = awal;
            while(bantu.data != kunci){
                bantu = bantu.kanan;
                if (bantu == null)
                    return false;
            }
            Link5 baru = new Link5(dd);
            if (bantu == akhir){
                baru.kanan = null;
                akhir=baru;
            }else{
                baru.kanan = bantu.kanan;
                bantu.kanan.kiri = baru;
            }
            baru.kiri = bantu;
            bantu.kanan = baru;
            return true;
        }
        public void displayListMaju(){
            System.out.print("Isi List ")
        }
}