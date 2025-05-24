package Praktikum_ASD.Jobsheet11.Tugas;

public class QueueAntrian21 {

    NodeMahasiswa21 front;
    NodeMahasiswa21 rear;
    int size = 0;
    int max = 10;

    public boolean isEmpty() {   
        return front == null;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa21 mhs) {
        if(isFull()) {
            System.out.println("Antrian sudah penuh");
        } else {
            NodeMahasiswa21 data = new NodeMahasiswa21(mhs, null);
            if (front == null) {
                front = rear = data;
            } else {
                rear.next = data;
                rear = data;
            }
            size++;
            System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
        }
    }

    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Memanggil Mahasiswa: ");
            front.data.tampilInformasi();
            front = front.next;
            size--;
            if(front == null) {
                rear = null;
            }
        }
    }

    public void peekFront() {
        if(isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Antrian Terdepan: ");
            front.data.tampilInformasi();
        }
    }

    public void peekrear() {
        if(isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Antrian Paling Akhir: ");
            rear.data.tampilInformasi();
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian Dikosongkan");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong");
        } else {
            System.out.println("Daftar Mahasiswa Dalam Antrian: ");
            NodeMahasiswa21 temp = front;
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
        }
    }

    public int getSize() {
        return size;
    }
}
