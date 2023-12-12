import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner sınıfında bir değişken üretiyoruz
        Scanner inp = new Scanner(System.in);

        // Değişkenleri oluşturuyoruz
        int a,b,c;
        double alan, u;

        // Kullanıcıdan verileri alırız
        System.out.print("1. Kenarın uzunluğunu giriniz:  ");
        a = inp.nextInt();

        System.out.print("2. Kenarın uzunluğunu giriniz:  ");
        b = inp.nextInt();

        System.out.print("3. Kenarın uzunluğunu giriniz:  ");
        c = inp.nextInt();

        // Alanı hesaplayıp ekrana yazdırıyoruz
        u = (a + b + c ) / 2.0;
        alan = Math.sqrt(u * (u - a)* (u - b) * (u - c));
        System.out.println("Üçgenin Alanı: " + alan);
    }
}