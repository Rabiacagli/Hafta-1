import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değişkenleri belirliyoruz
        String userName, password, change, newPassword;

        // Kullanıcıdan veri almak için Scanner sınıfını yazıyoruz
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        password = inp.nextLine();


        // Koşulları belirliyoruz ve ekrana yazdırıyoruz
        if(userName.equals("patika") && password.equals("cohort123")) {
            System.out.println("Giriş İşlemi Başarılı.");

        } else if (userName.equals("patika") && !password.equals("cohort123")) {
            System.out.println("Hatalı Şifre! Yeni şifre oluşturmak için 1'i tuşlayınız. Yeni şifre eskisiyle aynı olmamalı.");
            change = inp.nextLine();

            switch (change){
                case "1":
                System.out.println("Yeni Şifrenizi Giriniz.");
                newPassword = inp.nextLine();

                if(newPassword.equals("cohort123")){
                    System.out.print("Şifre Oluşturulamadı! Lütfen Başka Şifre Giriniz: ");
                } else if (!newPassword.equals("cohort123")) {
                    System.out.println("Şifre Oluşturuldu.");
                }
                break;

                default:
                    System.out.println("Tekrar Deneyiniz");
            }
        } else {
            System.out.println("Hatalı Kullanıcı Adı ve Şifre. Lütfen Tekrar Deneyiniz. ");
        }
    }
}