package Praktikum_ASD.Jobsheet12.Percobaan;

public class DoubleLinkedList21 {

    Node21 head;
    Node21 tail;
    int size;

    public DoubleLinkedList21() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa21 data) {
        Node21 newNode = new Node21(data, null, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa21 data) {
        Node21 newNode = new Node21(data, null, null);
        if(isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa21 data) {
        Node21 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        Node21 newNode = new Node21(data, null, null);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else  {
                newNode.next = current.next;
                newNode.prev = current;
                current.next.prev = newNode;
                current.next = newNode;
        }
        size++;
        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim );
    }

    public void print() {
        if(isEmpty()) {
            System.out.println("Data masih kosong");
            return;
        }
        Node21 current = head;
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Data masih kosong");
        } else if (head == null) {
            System.out.println("Data sudah berhasil dihapus, data yang terhapus adalah: " 
            + head.data.nim + " " + head.data.nama + " " + head.data.kelas + " " + head.data.ipk);
            head = tail = null;
        } else {
            System.out.println("Data sudah berhasil dihapus, data yang terhapus adalah: " 
            + head.data.nim + " " + head.data.nama + " " + head.data.kelas + " " + head.data.ipk);
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Data masih kosong");
        } else if (head == tail) {
            System.out.println("Data sudah berhasil dihapus, data yang terhapus adalah: " 
            + tail.data.nim + " " + tail.data.nama + " " + tail.data.kelas + " " + tail.data.ipk);
            head = tail = null;
        } else {
            System.out.println("Data sudah berhasil dihapus, data yang terhapus adalah: " 
            + tail.data.nim + " " + tail.data.nama + " " + tail.data.kelas + " " + tail.data.ipk);
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public Node21 search(String nim) {
        Node21 current = head;
        while(current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }

            current = current.next;
        }
        return null;
    }

    public void add(int index, Mahasiswa21 input) {
        if (index < 0) {
            System.out.println("Index salah");
        } 

        if (index == 0) {
            addFirst(input);
            return;
        }

        Node21 current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if(current == null) {
            addLast(input);
        } else {
            Node21 newNode = new Node21(input, current.prev, current);

            if (current.prev != null) {
                current.prev.next = newNode;
            }
            current.prev = newNode;

             if (newNode.prev == null) {
                 head = newNode;
             }
        }
        size++;
    }

    public void removeAfter(String keyNim) {
        Node21 current = head;

        while(current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }

        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim + " yang bisa dihapus");
            return;
        }

        Node21 nodeToRemove = current.next;

        current.next = nodeToRemove.next;

        if (nodeToRemove.next != null) {
            nodeToRemove.next.prev = current;
        } else {
            tail = current;
        }

        size--;
        System.out.println("Node setelah NIM " + keyNim + " berhasil dihapus. data yang dihapus: " 
        + nodeToRemove.data.nim + " - " + nodeToRemove.data.nama);
    }

    public void remove(int index) {
        if(isEmpty()) {
            System.out.println("Data masih kosong");
        }

        if (index < 0) {
            System.out.println("index yang dimasukkan salah");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        Node21 current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        if(current == null) {
            System.out.println("Index melebihi jumlah node");
            return;     
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }

        if(current.prev != null) {
            current.prev.next = current.next;
        }
        size--;
        System.out.println("Node pada index " + index + " berhasil dihapus. Data: " 
        + current.data.nim + " - " + current.data.nama);
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Data masih kosong");
        } else {
            System.out.println("Data Pertama: " + head.data.nim + " - " + head.data.nama);
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Data masih kodong"); 
        } else {
            System.out.println("Data Terakhir: " + tail.data.nim + " - " + tail.data.nama);
        }
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Data masih kosong");
            return;
        } 

        if (index < 0) {
            System.out.println("Index tidak valid");
            return;
        }

        Node21 current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        if(current == null) {
            System.out.println("Index melebihi panjang list");
        } else {
            System.out.println("Data pada index " + index + ": " + 
            current.data.nim + " - " + current.data.nama);
        }

    }

    public void getSize() {
        if (size == 0) {
            System.out.println("Data masih kosong");
        } else {
            System.out.println("Jumlah data sekarang adalah: " + size);
        }

    }
}
