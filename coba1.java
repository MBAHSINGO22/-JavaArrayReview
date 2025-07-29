public class coba1 {
    public static void main(String[] args) {
        // Mendeklarasikan array integer tanpa menginisialisasi ukurannya
        int array[];
        // Menginisialisasi array dengan ukuran 10, yang berarti array ini dapat menyimpan 10 elemen integer
        array = new int[10];
        // Menggunakan printf untuk mencetak header tabel. %8s menentukan lebar kolom untuk string,
        // dan %5d dan %8d menentukan lebar kolom untuk integer. Ini akan mencetak "Index" dan "Value"
        // dengan lebar kolom yang ditentukan.
        System.out.printf("%8s\n","Index","Value");
        // Menggunakan loop for untuk mengiterasi setiap elemen dalam array.
        // 'counter' adalah variabel iterasi yang dimulai dari 0 dan berlanjut sampai 'counter' kurang dari panjang array.
        for (int counter = 0; counter < array.length; counter++) {
            // Menggunakan printf untuk mencetak indeks dan nilai dari setiap elemen dalam array.
            // %5d mencetak nilai 'counter' (indeks) dengan lebar kolom 5, dan %8d mencetak nilai elemen array pada indeks 'counter' dengan lebar kolom 8.
            System.out.printf("%5d%8d\n", counter, array[counter]);
        }
    }
}