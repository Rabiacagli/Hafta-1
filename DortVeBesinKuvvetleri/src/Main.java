import java.util.Scanner;
//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan veri almak için Scanner sınıfını yazıyoruz ve değişkenleri belirliyoruz
        Scanner inp = new Scanner(System.in);

        int n ;

        System.out.print("Sınır Sayısını Giriniz: ");
        n = inp.nextInt();

        //Koşulları belirliyoruz ve ekrana yazdırıyoruz
        System.out.print("4'ün Kuvvetleri: " );

        for (int i = 1; i <= n; i *= 4 ){
            System.out.print(i + ",");
        }
        System.out.println(" ");

        System.out.print("5'in Kuvvetleri: ");
        for (int i = 1; i <= n; i *= 5 ){
            System.out.print(i + ",");
        }
    }
}