import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Kullanıcan veri alabilmek için Scanner sınıfını yazıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        int heat = input.nextInt();

        // Koşulları belirliyoruz ve ekrana yazdırıyoruz
        if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz. ");

        } else if (heat >= 5 && heat < 15) {
            System.out.println("Sinemaya Gidebilirsiniz. ");

        } else if (heat >= 15 && heat <= 25) {
            System.out.println("Piknik Yapabilirsiniz. ");

        }else{
            System.out.println("Yüzebilirsiniz. ");
        }
    }
}
