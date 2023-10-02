import java.util.Scanner;

public class Ganjil {
    public static void main(string[] args) throws Exception {
        /*menghitung bilangan ganjil/genap */
        Scanner inputan = new Scanner(System.in);
        System.out.print(s: "Masukan angka: ");
        int angka = inputan.nextInt();

        if (angka % 2 == 0) {
            System.out.println(x: "Bilangan Genap");
        } else {
            System.out.println(x: "Bilangan Ganjil");
        }
    }
}