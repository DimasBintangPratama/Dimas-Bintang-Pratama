package Model;

public class Barang {
    private String fotobarang;
    private String deskripsi;
    private int hargabarang;
    private String asalbarang;
    private int status;

    public Barang(String FotoBarang, String Deskripsi, int HargaBarang, String AsalBarang, int Status){
        this.fotobarang=FotoBarang;
        this.deskripsi=Deskripsi;
        this.hargabarang=HargaBarang;
        this.asalbarang=AsalBarang;
        this.status=Status;
    }

    public void PrintBarangMenu(){
        System.out.println(fotobarang+" "+deskripsi+" "+hargabarang+" "+asalbarang+" "+status+" ");
    }
}