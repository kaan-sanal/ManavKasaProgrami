import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        // Meyveler ve KG Fiyatları:
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg, toplamtutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Alınan Armut Sayısı : ");
        armutKg = input.nextDouble();
        System.out.print("Alınan Elma Sayısı : ");
        elmaKg = input.nextDouble();
        System.out.print("Alınan Domates Sayısı : ");
        domatesKg = input.nextDouble();
        System.out.print("Alınan Muz Sayısı : ");
        muzKg = input.nextDouble();
        System.out.print("Alınan Patlıcan Sayısı : ");
        patlicanKg = input.nextDouble();

        toplamtutar = (armutFiyat * armutKg) + (elmaFiyat * elmaKg) + (domatesFiyat * domatesKg) + (muzFiyat * muzKg) + (patlicanFiyat * patlicanKg);
        System.out.println("Toplam Tutar : " + toplamtutar);
    }
}