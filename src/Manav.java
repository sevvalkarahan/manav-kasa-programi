import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5.00;
        Scanner klavye=new Scanner(System.in);
        System.out.println("Kaç kilo armut istiyorsunuz ?");
        double a=klavye.nextDouble();
        System.out.println("Kaç kilo elma istiyorsunuz ?");
        double e=klavye.nextDouble();
        System.out.println("Kaç kilo domates istiyorsunuz ?");
        double d=klavye.nextDouble();
        System.out.println("Kaç kilo muz istiyorsunuz ?");
        double m=klavye.nextDouble();
        System.out.println("Kaç kilo patlıcan istiyorsunuz ?");
        double p=klavye.nextDouble();
        double tutar=(armut*a)+(elma*e)+(domates*d)+(muz*m)+(patlıcan*p);
        System.out.println("Toplam borcunuz "+tutar+" TL'dir.");


    }
}
