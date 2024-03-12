package tugas.method;

import java.util.Scanner;

public class Soal1 {

    static void cetakPerulangan(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Inputan harus lebih besar dari 0");
        } else {
            cetakPerulangan(n);         }
    }
}