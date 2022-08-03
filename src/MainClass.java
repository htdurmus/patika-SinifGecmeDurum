import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("*** Sınıf Geçme Durumunu Gösteren Program ***\n");

        int sayi=0;

        System.out.print("Matematik dersi notunu giriniz > ");
        int mat=s.nextInt();
        if(mat<0 || mat>100) mat=0;
        else sayi++;

        System.out.print("Fizik dersi notunu giriniz > ");
        int fizik=s.nextInt();
        if(fizik<0 || fizik>100) fizik=0;
        else sayi++;

        System.out.print("Türkçe dersi notunu giriniz > ");
        int turkce=s.nextInt();
        if(turkce<0 || turkce>100) turkce=0;
        else sayi++;

        System.out.print("Kimya dersi notunu giriniz > ");
        int kimya=s.nextInt();
        if(kimya<0 || kimya>100) kimya=0;
        else sayi++;

        System.out.print("Müzik dersi notunu giriniz > ");
        int muzik=s.nextInt();
        if(muzik<0 || muzik>100) muzik=0;
        else sayi++;

        double ort = (mat+fizik+turkce+kimya+muzik)/sayi;
        if(ort>=55) System.out.println("Ortalamanız: "+ort+"\nTebrikler! Sınıfı geçtiniz...");
        else System.out.println("Ortalamanız: "+ort+"\nSınıfta kaldınız...");
    }
}
