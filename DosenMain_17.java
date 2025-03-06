class DosenMain_17 {
    public static void main(String[] args) {
        Dosen_17 dosen1 = new Dosen_17("123456", "Zeki Setyawan", 2010, "S2", "Teknik Informatika");
        Dosen_17 dosen2 = new Dosen_17("789012", "Machfud JR", 2008, "S3", "Sistem Informasi");
        Dosen_17 dosen3 = new Dosen_17("345678", "Sastra Sembon", 2015, "S2", "Teknik Komputer");

        dosen1.tampilkanInfo();
        dosen2.tampilkanInfo();
        dosen3.tampilkanInfo();

        System.out.println("\n=== Perubahan Data Dosen ===");
        dosen1.ubahProdi("Sistem Informasi");
        dosen2.ubahPendidikan("Profesor");
        dosen1.tampilkanInfo();
        dosen2.tampilkanInfo();
    }
}
