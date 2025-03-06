import java.util.Scanner;

class DosenMain_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan NIDN: ");
        String nidn = scanner.nextLine();
        
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Tahun Masuk: ");
        int tahunMasuk = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Masukkan Jenjang Pendidikan: ");
        String jenjangPendidikan = scanner.nextLine();
        
        System.out.print("Masukkan Program Studi: ");
        String prodi = scanner.nextLine();
        
        Dosen_17 dosen1 = new Dosen_17(nidn, nama, tahunMasuk, jenjangPendidikan, prodi);
        dosen1.tampilkanInfo();
        
        System.out.print("Masukkan Program Studi baru: ");
        String prodiBaru = scanner.nextLine();
        dosen1.ubahProdi(prodiBaru);
        
        System.out.print("Masukkan Jenjang Pendidikan baru: ");
        String jenjangBaru = scanner.nextLine();
        dosen1.ubahPendidikan(jenjangBaru);
        
        System.out.println("Setelah perubahan:");
        dosen1.tampilkanInfo();
        
        scanner.close();
    }
}
