package tugas3;

class BMI extends AbstractBMI implements displayBMI {

    private double tinggi;

    public BMI(double berat, double tinggi) {
        super(berat);
        this.setTinggi(tinggi);
    }

    public double hitungBMI() {
        return calculationBMI();
    }

    private double calculationBMI() {
        return berat / (getTinggi() * getTinggi());
    }

    @Override
    public String kategoriBMI() {
        double bmi = hitungBMI();
        if (bmi < 18.5) return "Berat badan kurang";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Kelebihan berat badan";
        else return "Obesitas";
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
