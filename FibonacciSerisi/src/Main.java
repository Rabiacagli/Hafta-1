import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // kullanıcıdan veri almak için Scanner sınıfını yazıyoruz
        Scanner inp = new Scanner(System.in);

        System.out.print("Fibonacci eleman sayısını giriniz: ");
        int n = inp.nextInt();

        // değişkenleri tanımlıyoruz
        int a = 0, b = 1, c = 0;
        System.out.print(n + " Elemanlı Fibonacci Serisi : " + a + " " + b);

        // for döngüsüyle Fibonacci koşulunu oluşturuyoruz
        for (int i = 2; i < n; i++) {
            c = a + b;                                  // ilk iki elemanı toplayıp c'ye atıyoruz
            System.out.print(" " + c);
            a = b;                                      // a'yı b'ye, b'yi de c'ye atıyoruz
            b = c;                                      // bu işlemi n kadar tekrar ediyoruz
        }
    }
}