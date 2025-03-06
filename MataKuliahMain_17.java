class MataKuliahMain_17 {
    public static void main(String[] args) {
        Dosen_17 dosen1 = new Dosen_17("123456", "Zeki Setyawan", 2010, "S2", "Teknik Informatika");
        Dosen_17 dosen2 = new Dosen_17("789012", "Machfud JR", 2008, "S3", "Sistem Informasi");
        Dosen_17 dosen3 = new Dosen_17("345678", "Sastra Sembon", 2015, "S2", "Teknik Komputer");

        MataKuliah_17 matkul = new MataKuliah_17("IF101", "Pemrograman Java", 3);

        System.out.println("====================================");
        System.out.println(" INFORMASI MATA KULIAH SEBELUM PENAMBAHAN DOSEN ");
        System.out.println("====================================");
        matkul.tampilkanInfo();

        matkul.tambahDosen(dosen1);
        matkul.tambahDosen(dosen2);
        matkul.tambahDosen(dosen3);

        System.out.println("\n====================================");
        System.out.println(" INFORMASI MATA KULIAH SETELAH PENAMBAHAN DOSEN ");
        System.out.println("====================================");
        matkul.tampilkanInfo();
    }
}
