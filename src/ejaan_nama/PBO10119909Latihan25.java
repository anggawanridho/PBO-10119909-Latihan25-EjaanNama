package ejaan_nama;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class PBO10119909Latihan25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String nama = scanner.next();
        System.out.println();
        System.out.printf("Ejaan untuk \"%s\" adalah : %n", nama);
        for (int i = 0; i < nama.length(); i++) {
            System.out.printf("Huruf ke-%d : %c%n", i+1, nama.charAt(i));
        }
    }
}
