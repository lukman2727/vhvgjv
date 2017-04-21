package link;
class Link {

    public int data;
    public Link next;

    public Link(int d) {
        data = d;
    }

    public void displayLink() {
        System.out.print(data);
    }
}

class AwalAkhirlist {

    private Link awal;
    private Link akhir;

    public AwalAkhirlist() {
        awal = null;
        akhir = null;
    }

    public boolean kosong() {
        return (awal == null);
    }
        public void tambahAwal(int d) {
        Link n = new Link(d);
        n.next = awal;
        awal = n;
        
        }

    public void tambahAkhir(int d) {
        Link n = new Link(d);
        if(kosong())
            awal = n;
        else akhir.next = n;
        akhir = n;
    }

    public Link hapusAwal() {
        Link temp = awal;
        if (awal.next==null)
            akhir = null;
        awal = awal.next;
        return temp;
    }

    
    public void displayList() {
        System.out.println("isi List : ");

        Link lihat = awal;
        while (lihat != null) {
            lihat.displayLink();
            System.out.print(" ");
            lihat = lihat.next;
        }
        System.out.println("");
    }
}

class AplLinkList {

    public static void main(String[] args) {
        AwalAkhirlist l = new AwalAkhirlist();
        //l.tambahAkhir(50);
        l.tambahAkhir(100);
        l.tambahAkhir(30);
        System.out.println("Data Yg dimasukan");
        l.displayList();
        l.tambahAkhir(10);
        System.out.println("setelah ditambahkan");
        l.displayList();
        l.hapusAwal();
        System.out.println("Setelah dihapus");
        l.displayList();



    }
}