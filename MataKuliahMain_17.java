import java.util.Scanner;

class MataKuliahMain_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Kode Mata Kuliah: ");
        String kodeMK = scanner.nextLine();
        
        System.out.print("Masukkan Nama Mata Kuliah: ");
        String namaMK = scanner.nextLine();
        
        System.out.print("Masukkan jumlah SKS: ");
        int sks = scanner.nextInt();
        scanner.nextLine();
        
        MataKuliah_17 mataKuliah = new MataKuliah_17(kodeMK, namaMK, sks);
        
        System.out.println("Informasi Mata Kuliah sebelum perubahan:");
        mataKuliah.tampilkanInfo();
        
        System.out.print("Masukkan Nama Mata Kuliah baru: ");
        String namaMKBaru = scanner.nextLine();
        mataKuliah.ubahNamaMK(namaMKBaru);
        
        System.out.print("Masukkan jumlah SKS baru: ");
        int sksBaru = scanner.nextInt();
        mataKuliah.ubahSKS(sksBaru);
        
        System.out.println("Informasi Mata Kuliah setelah perubahan:");
        mataKuliah.tampilkanInfo();
        
        scanner.close();
    }
}
