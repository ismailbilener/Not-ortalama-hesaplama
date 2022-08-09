import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        // değişken isimlerini tanımladık.
    int fizik, kimya, mat, tr, tarih, muzik;

    Scanner input = new Scanner(System.in);

        System.out.println("fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.println("kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.println("matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.println("türkçe notunuzu giriniz: ");
        tr = input.nextInt();

        System.out.println("tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.println("müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        double ort = (fizik+kimya+mat+tr+tarih+muzik)/6;
        System.out.println(ort);

        System.out.println(ort>=60 ? "Geçtiniz" : "Kaldınız");
    }
}
