class MataKuliah_17 {
    String kodeMK;
    String namaMK;
    int sks;
    Dosen_17[] dosenPengampu;
    int jumlahDosen = 0;

    public MataKuliah_17(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        if (sks >= 2) {
            this.sks = sks;
        } else {
            System.out.println("SKS tidak valid! Minimal 2 SKS.");
            this.sks = 2;
        }
        this.dosenPengampu = new Dosen_17[3]; 
    }

    public void tampilkanInfo() {
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nama MK     : " + namaMK);
        System.out.println("SKS         : " + sks);
        System.out.println("Dosen Pengampu:");
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("- " + dosenPengampu[i].nama);
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
        if (jumlahDosen < 3) {
            dosenPengampu[jumlahDosen] = dosen;
            jumlahDosen++;
        } else {
            System.out.println("Dosen pengampu penuh, tidak bisa menambahkan dosen lagi.");
        }
    }
}
