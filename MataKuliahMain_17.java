class MataKuliahMain_17 {
    public static void main(String[] args) {
        Dosen_17 dosen1 = new Dosen_17("123456", "Dr. Budi Santoso", 2010, "S3", "Teknik Informatika");
        Dosen_17 dosen2 = new Dosen_17("789012", "Prof. Ani Rahmawati", 2008, "S3", "Sistem Informasi");

        MataKuliah_17 matkul1 = new MataKuliah_17("IF101", "Pemrograman Dasar", 3, 2);
        MataKuliah_17 matkul2 = new MataKuliah_17("IF102", "Struktur Data", 4, 2);

        matkul1.tambahDosen(dosen1);
        matkul2.tambahDosen(dosen1);
        matkul2.tambahDosen(dosen2);

        System.out.println("====================================");
        System.out.println(" INFORMASI MATA KULIAH SEBELUM PERUBAHAN ");
        System.out.println("====================================");
        matkul1.tampilkanInfo();
        System.out.println("------------------------------");
        matkul2.tampilkanInfo();

        matkul1.ubahNamaMK("Algoritma dan Pemrograman");
        matkul2.ubahSKS(5);

        System.out.println("\n====================================");
        System.out.println(" INFORMASI MATA KULIAH SETELAH PERUBAHAN ");
        System.out.println("====================================");
        matkul1.tampilkanInfo();
        System.out.println("------------------------------");
        matkul2.tampilkanInfo();
    }
}
