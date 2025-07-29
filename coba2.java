public class coba2 {
    public static void main(String[] args) {
        // Mendeklarasikan dan menginisialisasi array integer dengan nilai awal
        int array[] = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};

        // Mencetak header tabel dengan format spesifik untuk menampilkan "Index" dan "Value"
        // %8s menentukan lebar kolom untuk string, dan %5d dan %8d menentukan lebar kolom untuk integer
        System.out.printf("%8s\n","Index","Value");

        // Menggunakan loop for untuk mengiterasi setiap elemen dalam array
        // 'counter' adalah variabel iterasi yang dimulai dari 0 dan berlanjut sampai 'counter' kurang dari panjang array
        for (int counter = 0; counter < array.length; counter++) {
            // Menggunakan printf untuk mencetak indeks dan nilai dari setiap elemen dalam array
            // %5d mencetak nilai 'counter' (indeks) dengan lebar kolom 5, dan %8d mencetak nilai elemen array pada indeks 'counter' dengan lebar kolom 8
            System.out.printf("%5d%8d\n", counter, array[counter]);
        }
    }
}

