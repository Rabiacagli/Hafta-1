import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değişkenleri tanımlıyoruz
        int r, merkezAci;
        double pi = 3.14 ;

        //Kullanıcıdan verileri almak için Scanner sınıfını tanımlıyoruz
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = inp.nextInt();

        System.out.print("Dairenin Merkez Açısının Ölçüsünü Giriniz: ");
        merkezAci = inp.nextInt();

        //Formülü oluşturup ekrana yazdırıyoruz
        double dilimAlani = (pi * (r*r) * merkezAci) / 360;
        System.out.println("Daire Diliminin Alanı: " + dilimAlani);
    }
}