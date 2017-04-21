package link;

class Link2 {

    public int data;
    public Link2 next;

    public Link2(int d) {
        data = d;
    }

    public void displayLink() {
        System.out.print(data);
    }
}

class LinkList {

    private Link2 awal;

    public LinkList() {
        awal = null;
    }

    public boolean kosong() {
        return (awal == null);
    }

    public void tambahAwal(int d) {
        Link2 n = new Link2(d);
        n.next = awal;
        awal = n;
    }

    public Link2 hapusAwal() {
        Link2 hapus = awal;
        awal = awal.next;
        return hapus;
    }

    public void displayList() {
        System.out.println("isi List : ");

        Link2 lihat = awal;
        while (lihat != null) {
            lihat.displayLink();
            System.out.print(" ");
            lihat = lihat.next;
        }
        System.out.println("");
    }
}

class AplLinkList2 {

    public static void main(String[] args) {
        LinkList l = new LinkList();
        l.tambahAwal(50);
        l.tambahAwal(100);
        l.tambahAwal(30);
        System.out.println("Data Yg dimasukan");
        l.displayList();
        l.tambahAwal(10);
        System.out.println("setelah ditambahkan");
        l.displayList();
        l.hapusAwal();
        System.out.println("Setelah dihapus");
        l.displayList();



    }
}