package Praktikum_ASD.Jobsheet9;

public class StackSurat21 {
    Surat21[] stack;
    int size, top;

    public StackSurat21(int size) {
        this.size = size;
        stack = new Surat21[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat21 surat) {
        if (!isFull()) {
            stack[++top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat21 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat21 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat terakhir.");
            return null;
        }
    }

    public boolean cariSurat(String namaMahasiswa) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return true;
            }
        }
        return false;
    }

    public void printAll() {
        for (int i = top; i >= 0; i--) {
            Surat21 s = stack[i];
            System.out.printf("%s - %s - %s - %c - %d hari\n", 
                s.idSurat, s.namaMahasiswa, s.kelas, s.jenisIzin, s.durasi);
        }
    }
}
