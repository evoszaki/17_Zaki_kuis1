class DosenMain_17 {
    public static void main(String[] args) {
        Dosen_17 dosen1 = new Dosen_17("123456", "Budi Santoso", 2010, "S3", "Teknik Informatika");
        Dosen_17 dosen2 = new Dosen_17("789012", "Ani Rahmawati", 2008, "S2", "Sistem Informasi");

        System.out.println("===================================");
        System.out.println(" INFORMASI DOSEN SEBELUM PERUBAHAN ");
        System.out.println("===================================");
        dosen1.tampilkanInfo();
        System.out.println("------------------------------");
        dosen2.tampilkanInfo();
        
        dosen1.ubahProdi("Sistem Informasi");
        dosen1.ubahPendidikan("Profesor");
        dosen1.tambahGelar("Prof. Dr.");

        dosen2.ubahProdi("Teknik Komputer");
        dosen2.ubahPendidikan("S3");
        dosen2.tambahGelar("Dr.");

        System.out.println("\n===================================");
        System.out.println(" INFORMASI DOSEN SETELAH PERUBAHAN ");
        System.out.println("===================================");
        dosen1.tampilkanInfo();
        System.out.println("------------------------------");
        dosen2.tampilkanInfo();
    }
}
