public class Main {
    public static void main(String[] args) {

        // 1 ve 100 arasındaki asal sayıları bulmak için koşul oluşturuyoruz

        // counter = sayac, i sayısı k sayısına bölünebiliyorsa asal değildir ve ekrana yazdırmayacak

        for (int i = 2; i <= 100; i++) {
            int counter = 0;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.print(i + " - ");

            }
        }
    }
}