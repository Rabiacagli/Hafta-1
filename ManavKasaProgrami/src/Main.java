import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Değişkenleri belirliyoruz
        double armut, elma, domates, muz, patlican;

        //Kullanıcıdan veri alabilmek için Scanner sınıfını yazıyoruz
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        armut = inp.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        elma = inp.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        domates = inp.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        muz = inp.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        patlican = inp.nextDouble();

        //Formülü belirleyip ekrana yazdırıyoruz
        double total = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.00);
        System.out.println("Toplam Tutar: " + total + " TL");
    }
}