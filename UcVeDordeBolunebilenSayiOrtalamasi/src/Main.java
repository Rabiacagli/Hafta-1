import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // değişkenleri tanımlyoruz
        int sayac = 0, n;
        int total = 0;

        // kullanıcıdan veri almak için Scanner sınıfını kullanıyoruz
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        n = inp.nextInt();

        //Koşulları oluşturup sonucu ekrana yazdırıyoruz
        for (int i = 0; i <= n; i++){
            if (i % 3 == 0 && i % 4 ==0){
                total += i;
                sayac++;
            }
        }
        System.out.println("3 ve 4'e Bölünebilen Sayıların Ortalaması: " + total/sayac);
    }
}