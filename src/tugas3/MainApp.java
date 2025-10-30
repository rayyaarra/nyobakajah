package tugas3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Sistem Menghitung BMI ===");

        double berat = mintaInput(sc, "Masukkan berat badan (kg): ");
        double tinggi = mintaInput(sc, "Masukkan tinggi badan (m): ");

        BMI bmi = new BMI(berat, tinggi);

        displayBMI.tampilkanHasil(bmi);

        sc.close();
    }

    private static double mintaInput(Scanner input, String pesan) {
        System.out.print(pesan);
        double nilai = input.nextDouble();
        if (nilai <= 0) {
            System.out.println("Input tidak valid, nilai harus lebih besar dari 0!");
            System.exit(0);
        }
        return nilai;
    }

}

