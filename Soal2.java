package tugas.method;

import java.util.Scanner;

public class Soal2 {
    
  public static int inputPanjangSisi(Scanner scanner, int index) {
    int panjangSisi;
    do {
      System.out.print("Masukkan panjang sisi ke-" + index + ": ");
      while (!scanner.hasNextInt()) {
        scanner.next();
        System.out.print("Input harus bilangan bulat. Masukkan kembali: ");
      }
      panjangSisi = scanner.nextInt();
      if (panjangSisi <= 0) {
        System.out.println("Panjang sisi harus positif. Masukkan kembali:");
      }
    } while (panjangSisi <= 0);
    return panjangSisi;
  }

  public static boolean cekKubus(int sisi1, int sisi2, int sisi3) {
    return sisi1 == sisi2 && sisi2 == sisi3;
  }
    
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sisi1, sisi2, sisi3;

    sisi1 = inputPanjangSisi(scanner, 1);
    sisi2 = inputPanjangSisi(scanner, 2);
    sisi3 = inputPanjangSisi(scanner, 3);

    boolean isKubus = cekKubus(sisi1, sisi2, sisi3);

    System.out.println(isKubus ? "Termasuk Kubus" : "Bukan Kubus");
  }

}

