import java.util.Scanner;
public class LayananSiakad_21{
   public static void menu() {
    System.out.println("\n=== Menu Antrian Layanan Akademik ===");
    System.out.println("1. Tambah Mahasiswa ke Antrian");
    System.out.println("2. Layani Mahasiswa");
    System.out.println("3. Lihat Mahasiswa Terdepan");
    System.out.println("4. Lihat Semua Antrian");
    System.out.println("5. Jumlah Mahasiswa dalam Antrian");
    System.out.println("6. Cek Antrian paling belakang");
    System.out.println("0. Keluar");
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas antrian: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        AntrianLayanan_21 antri = new AntrianLayanan_21(jumlah);
        int pilih;
        do {
            menu();
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
    switch (pilih) {
    case 1:
        System.out.print("NIM   : ");
        String nim = sc.nextLine();

        System.out.print("Nama  : ");
        String nama = sc.nextLine();

        System.out.print("Prodi : ");
        String prodi = sc.nextLine();

        System.out.print("Kelas : ");
        String kelas = sc.nextLine();

        Mahasiswa_21 mhs = new Mahasiswa_21(nim, nama, prodi, kelas);

        antri.enqueue(mhs);
        break;
    case 2:
    Mahasiswa_21 keluar = antri.dequeue();

    System.out.println("Mahasiswa yang dilayani:");
    System.out.println("NIM | Nama | Prodi | Kelas");

    System.out.println(
        keluar.nim + " | " +
        keluar.nama + " | " +
        keluar.prodi + " | " +
        keluar.kelas
    );
    break;
    case 3:
        antri.peek();
        break;

    case 4:
        antri.print();
        break;

    case 5:
        System.out.println("Jumlah mahasiswa dalam antrian: " + antri.size);
        break;
    case 6:
    antri.lihatAkhir();
        break;
    case 0:
        System.out.println("Program selesai, Terimakasih ");
        break;
    default:
        System.out.println("Menu tidak valid");
}
        }  while (pilih != 0);
    }
}
