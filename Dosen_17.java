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
        System.out.println("====================================");
        System.out.println("            INFORMASI DOSEN         ");
        System.out.println("====================================");
        System.out.println("NIDN               : " + nidn);
        System.out.println("Nama               : " + nama);
        System.out.println("Tahun Masuk        : " + tahunMasuk);
        System.out.println("Jenjang Pendidikan : " + jenjangPendidikan);
        System.out.println("Program Studi      : " + prodi);
        System.out.println("------------------------------------");
    }

    public void ubahProdi(String prodiBaru) {
        this.prodi = prodiBaru;
        System.out.println("Program Studi telah diperbarui menjadi: " + prodi);
    }

    public void ubahPendidikan(String jenjangBaru) {
        this.jenjangPendidikan = jenjangBaru;
        System.out.println("Jenjang Pendidikan telah diperbarui menjadi: " + jenjangPendidikan);
    }
}
