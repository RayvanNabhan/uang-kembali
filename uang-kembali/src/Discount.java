import java.util.Scanner;
public class Discount {
    public static void main(string[]args) throws Exception {
        Double totalbelanja, discount;

        Scanner inputan = new Scanner(System.in);
        System.out.print(s:"Masukan total belanja: ");
        totalBelanja = inputan.nextDouble();

        if (totalBelanja > = 1000000) {
            discount = 5/100 * totalBelanja;
            totalBelanja = totalBelanja - discount;
        }

        System.out.println("Total yang harus dibayar: " + totalBelanja);
    }

}