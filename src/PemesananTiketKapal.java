class PemesananTiketKapal {
    private String namaPenumpang;
    private String pelabuhanAsal;
    private String pelabuhanTujuan;
    private double hargaTiket;
    private double persentaseDiskon;

    public PemesananTiketKapal(String namaPenumpang, String pelabuhanAsal, String pelabuhanTujuan, double hargaTiket, double persentaseDiskon) {
        this.namaPenumpang = namaPenumpang;
        this.pelabuhanAsal = pelabuhanAsal;
        this.pelabuhanTujuan = pelabuhanTujuan;
        this.hargaTiket = hargaTiket;
        this.persentaseDiskon = persentaseDiskon;
    }

    public double hitungHargaSetelahDiskon() {
        return hargaTiket - (hargaTiket * persentaseDiskon / 100);
    }

    public double hitungJumlahDiskon() {
        return hargaTiket * (persentaseDiskon / 100);
    }

    public void tampilkanDetailTiket() {
        System.out.println("Nama Penumpang: " + namaPenumpang);
        System.out.println("Pelabuhan Asal: " + pelabuhanAsal);
        System.out.println("Pelabuhan Tujuan: " + pelabuhanTujuan);
        System.out.println("Harga Tiket: " + hargaTiket);
        System.out.println("Diskon: " + persentaseDiskon + "%");
        System.out.println("Harga Setelah Diskon: " + hitungHargaSetelahDiskon());
        System.out.println("Jumlah Diskon: " + hitungJumlahDiskon());
    }

}
