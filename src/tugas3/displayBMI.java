package tugas3;

public interface displayBMI {
    static void tampilkanHasil(BMI bmi) {
        double nilaiBMI = bmi.hitungBMI();
        System.out.printf("BMI Anda adalah: %.2f%n", nilaiBMI);
        System.out.println("Kategori: " + bmi.kategoriBMI());
    }
}
