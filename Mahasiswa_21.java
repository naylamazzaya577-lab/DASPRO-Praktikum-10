public class Mahasiswa_21{
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa_21(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    void tampilkanData() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("Kelas : " + kelas);
    }
public class AntrianLayanan_21 {
    Mahasiswa_21[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan_21(int n) {
        max = n;
        data = new Mahasiswa_21[max];
        size = 0;
        front = rear = -1;
    }
}
}