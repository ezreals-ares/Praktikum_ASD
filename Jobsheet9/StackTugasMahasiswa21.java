package Praktikum_ASD.Jobsheet9;

public class StackTugasMahasiswa21 {

    Mahasiswa21[] stack;
    int size, top;

    StackTugasMahasiswa21(int size) {
        this.size = size;
        stack = new Mahasiswa21[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa21 mhs) {
        if(!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack Penuh!, Tidak bisa menambahkan tugas lagi");
        }
    }

    public Mahasiswa21 pop() {
        if(!isEmpty()) {
            Mahasiswa21 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack Kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa21 peek() {
        if(!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!, Tidak ada tugas yang dikumpukan");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            
        }
    }




}