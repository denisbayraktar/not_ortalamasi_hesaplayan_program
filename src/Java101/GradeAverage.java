package Java101;
import java.util.Scanner;
public class GradeAverage {
    public static void main (String[] args) {
    Scanner input1 = new Scanner(System.in);
    System.out.println("Matematik Notunu giriniz:");
    int mat;
    mat = input1.nextInt();
    Scanner input2 = new Scanner(System.in);
    System.out.println("Fizik Notunu giriniz:");
    int fizik;
    fizik = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Kimya Notunu giriniz:");
        int kimya;
        kimya = input3.nextInt();
        Scanner input4 = new Scanner(System.in);
        System.out.println("Türkçe Notunu giriniz:");
        int turkce;
        turkce = input4.nextInt();
        Scanner input5 = new Scanner(System.in);
        System.out.println("Tarih Notunu giriniz:");
        int tarih;
        tarih = input5.nextInt();
        Scanner input6 = new Scanner(System.in);
        System.out.println("Müzik Notunu giriniz:");
        int muzik;
        muzik = input6.nextInt();
        double notOrtalamasi = (mat + fizik + kimya + turkce + tarih + muzik) / 6.0;
        double yuvarlanmisNot = Math.round(notOrtalamasi * 100.0) / 100.0;
        System.out.println("Not Ortalamanız = " + yuvarlanmisNot);
        boolean kosul1 = notOrtalamasi > 60;
        boolean kosul2 = notOrtalamasi < 60;
        boolean sonuc = kosul1 || kosul2;
        String str = sonuc ? "Sınıfı geçtiniz." : "Sınıfta Kaldınız.";
        System.out.println(str);
    }
}
