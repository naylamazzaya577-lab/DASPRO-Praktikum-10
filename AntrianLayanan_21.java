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

        public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
//  ENQUEUE
public void enqueue(Mahasiswa_21 mhs) {
    if (isFull()) {
        System.out.println("Antrian sudah penuh");
    } else {
        if (isEmpty()) {
            front = rear = 0;
        } else {
            if (rear == max - 1) {
                rear = 0;
            } else {
                rear++;
            }
        }
        data[rear] = mhs;
        size++;
    System.out.println("Mahasiswa berhasil ditambahkan ke antrian");
    }
}
// DEQUEUE
public Mahasiswa_21 dequeue() {
    Mahasiswa_21 mhs = new Mahasiswa_21("", "", "", "");

    if (isEmpty()) {
        System.out.println("Antrian masih kosong");
    } else {
        mhs = data[front];
        size--;

        if (size == 0) {
            front = rear = -1;
        } else {
            if (front == max - 1) {
                front = 0;
            } else {
                front++;
            }
        }
    }
    return mhs;
}
// PEEK 
public void peek() {
    if (!isEmpty()) {
        System.out.println("Mahasiswa terdepan:");
        data[front].tampilkanData();
    } else {
        System.out.println("Antrian kosong");
    }
}
// PRINT 
public void print() {
    if (isEmpty()) {
        System.out.println("Antrian kosong");
    } else {
        int i = front;

        System.out.println("NIM | Nama | Prodi | Kelas");

        while (i != rear) {
            System.out.println(
                data[i].nim + " | " +
                data[i].nama + " | " +
                data[i].prodi + " | " +
                data[i].kelas
            );

            i = (i + 1) % max;
        }
        System.out.println(
            data[i].nim + " | " +
            data[i].nama + " | " +
            data[i].prodi + " | " +
            data[i].kelas
        );
        System.out.println("Jumlah antrian: " + size);
    }
}
public void lihatAkhir() {
    if (isEmpty()) {
        System.out.println("Antrian kosong");
    } else {
        System.out.println("Mahasiswa paling belakang:");
        System.out.println("NIM | Nama | Prodi | Kelas");

        System.out.println(
            data[rear].nim + " | " +
            data[rear].nama + " | " +
            data[rear].prodi + " | " +
            data[rear].kelas
        );
    }
}
}
