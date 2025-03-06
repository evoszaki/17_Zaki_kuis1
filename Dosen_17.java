class Dosen_17 {
    String nidn;
    String nama;
    int tahunMasuk;
    String jenjangPendidikan;
    String prodi;
    
    public Dosen_17(String nidn, String nama, int tahunMasuk, String jenjangPendidikan, String prodi) {
        this.nidn = nidn;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.jenjangPendidikan = jenjangPendidikan;
        this.prodi = prodi;
    }
    
    public void tampilkanInfo() {
        System.out.println("NIDN: " + nidn);
        System.out.println("Nama: " + nama);
        System.out.println("Tahun Masuk: " + tahunMasuk);
        System.out.println("Jenjang Pendidikan: " + jenjangPendidikan);
        System.out.println("Program Studi: " + prodi);
    }
    
    public void ubahProdi(String prodiBaru) {
        this.prodi = prodiBaru;
    }
    
    public void ubahPendidikan(String jenjangBaru) {
        this.jenjangPendidikan = jenjangBaru;
    }

    public void tambahGelar(String gelarBaru) {
        this.nama = gelarBaru + " " + this.nama;
    }
}
