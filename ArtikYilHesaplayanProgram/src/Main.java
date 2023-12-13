import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Kullanıcıdan veri alabilmek için Scanner Sınıfını yazıyoruz
        Scanner input= new Scanner(System.in);
        System.out.print("Yılı Giriniz: ");
        int year = input.nextInt();

        // Artık yılın koşullarını belirliyoruz ve ekrana yazdırıyoruz
        if (year % 4 == 0 ) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " bir artık yıldır! ");
                } else {
                    System.out.println(year + " bir artık yıl değildir! ");
                }
            } else {
                System.out.println(year + " bir artık yıldır! ");
            }
        } else {
            System.out.println(year + " bir artık yıl değildir! ");
        }
    }
}
