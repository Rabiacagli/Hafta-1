import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //kullanıcıdan veri alabilme için scanner sınıfını kullanıyor ve değişkenleri oluşturuyoruz

        Scanner inp = new Scanner(System.in);
        String userName, password;
        int balance = 1000, price;
        int right = 3;
        int select;

        while (right > 0) {                                          // 3 hakkı olma durumu döngüsü
            System.out.print("Lütfen kullanıcı adınızı girin:  ");
            userName = inp.nextLine();
            System.out.print("Lütfen şifrenizi girin: ");
            password = inp.nextLine();


            if (userName.equals("patika") && password.equals("dev123")) {  // kullanıcı adı ve şifre doğruluğu koşulu
                System.out.println("Giriş işlemi başarılı.");                //hatalı olma durumunda döngü başa dönecek
                do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap"); // kullanıcının yapmak istediği işlemler döngüsü
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = inp.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz para miktarını giriniz: ");
                            price = inp.nextInt();
                            balance += price;
                            System.out.println("Güncel Bakiyeniz: " + (balance) + "TL");
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                            price = inp.nextInt();
                            balance -= price;
                            System.out.println("Güncel Bakiyeniz: " + (balance) + "TL");
                            if (balance < price) {
                                System.out.println("Bakiyeniz yetersiz!");
                            }
                            break;
                        case 3:
                            System.out.println("Güncel Bakiyeniz: " + balance + "TL");
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre!");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen bankayla iletişime geçiniz. ");
                }
            }
        }

    }
}