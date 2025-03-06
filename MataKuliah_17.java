import java.util.ArrayList;

class MataKuliah_17 {
    String kodeMK;
    String namaMK;
    int sks;
    ArrayList<Dosen_17> dosenPengampu;
    
    public MataKuliah_17(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
        this.dosenPengampu = new ArrayList<>();
    }
    
    public void tampilkanInfo() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS: " + sks);
        System.out.println("Dosen Pengampu:");
        for (Dosen_17 dosen : dosenPengampu) {
            System.out.println("- " + dosen.nama);
        }
    }
    
    public void ubahNamaMK(String namaMKBaru) {
        this.namaMK = namaMKBaru;
    }
    
    public void ubahSKS(int sksBaru) {
        if (sksBaru >= 2) {
            this.sks = sksBaru;
        } else {
            System.out.println("SKS tidak valid! Minimal 2 SKS.");
        }
    }
    
    public void tambahDosen(Dosen_17 dosen) {
        dosenPengampu.add(dosen);
    }
}
