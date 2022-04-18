import Model.Barang;

public class Layar {
    public static void main(String[] args) {
        Barang[] myMenu = new Barang[3];

        myMenu[0] = new Barang("Foto Barang : foto barang.jpg", "Deskripsi : dibuat dengan bahan pilihan", 100000, "Asal Barang : China", 1000);
        myMenu[1] = new Barang("Foto Barang : foto barang.png", "Deskripsi : dibuat dengan bahan tebal", 80000, "Asal Barang : Jepang", 1000);
        myMenu[2] = new Barang("Foto Barang : foto barang.jpeg", "Deskripsi : dibuat dengan bahan halus", 50000, "Asal Barang : Indonesia", 500);
        for(int indexArrayMenu=0;indexArrayMenu<myMenu.length;indexArrayMenu++){
            myMenu[indexArrayMenu].PrintBarangMenu();
        }
    }
}
