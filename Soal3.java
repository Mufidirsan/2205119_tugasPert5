package tugas.method;
import java.util.Scanner;

public class Soal3 {
     
  public static String JenisSegitiga(int a, int b, int c) {
    if (a * a + b * b == c * c) {
      return "siku-siku";
    } else if (a * a + b * b < c * c) {
      return "lancip";
    } else {
      return "tumpul";
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a, b, c;
    do {
      System.out.println("Masukkan panjang tiga sisi segitiga (a <= b <= c):");
      a = scanner.nextInt();
      b = scanner.nextInt();
      c = scanner.nextInt();

      if (a > b || b > c) {
        System.out.println("Panjang sisi tidak valid, masukkan kembali.");
      }
    } while (a > b || b > c);

    String Segitiga = JenisSegitiga(a, b, c);
    System.out.println("Segitiga " + Segitiga);
  }

}

    

