/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enkapulasi;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

class MainKinetic {
    private double massa;
    private double kecepatan;

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    public double hitungEnergiKinetik() {
        return 0.5 * massa * Math.pow(kecepatan, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MainKinetic sepedaAndika = new MainKinetic();
        char ulangi;

System.out.println("Program Menghitung Energi Kinetik");
System.out.println("jovan)");
System.out.println("=============================");



        do {
            System.out.println(" ");
            System.out.print("Masukkan massa sepeda Andika (kg): ");
            double massa = scanner.nextDouble();
            sepedaAndika.setMassa(massa);

            System.out.print("Masukkan kecepatan sepeda Andika (m/s): ");
            double kecepatan = scanner.nextDouble();
            sepedaAndika.setKecepatan(kecepatan);

            double energiKinetik = sepedaAndika.hitungEnergiKinetik();
            System.out.println("Energi kinetik sepeda Andika adalah: " + energiKinetik + " joule");

            // Menampilkan perhitungan
            System.out.println(" ");
            System.out.println("Perhitungan:");
            System.out.println("Ek = 1/2 * m * v^2");
            System.out.println("   = 1/2 * " + massa + " * " + kecepatan + "^2");
            System.out.println("   = " + energiKinetik + " joule");
            System.out.println("");
            System.out.println("Hasilnya adalah " + energiKinetik);

            System.out.print("Apakah Anda ingin mengulangi perhitungan? (y/n): ");
            ulangi = scanner.next().charAt(0);
        } while (ulangi == 'y' || ulangi == 'Y');
        
        scanner.close();
    }
}
