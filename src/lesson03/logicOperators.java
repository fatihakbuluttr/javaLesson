package lesson03;

import java.util.Scanner;

public class logicOperators {
    public static void main(String[] args) {


            /*  int not;
        String isim;
        String memleket;
        int yas;

        Scanner scanner= new Scanner(System.in);
        System.out.print("isminizi girin:");
        isim=scanner.next();
        System.out.print("isminiz:"+isim);

        System.out.println("memleketinizi girin:");
        memleket=scanner.next();
        System.out.print("memleketiniz:"+memleket);


     System.out.print("Aldıgınız notu girin:");
        Scanner scanner= new Scanner(System.in);
        not= scanner.nextInt();
        System.out.print("Aldıgınız not:"+not);


      int a = 12;
        int b = 10;
        System.out.println("anın degeri:" +a);
        a %= b;

        System.out.println("yeni a degeri:" +a);
        System.out.println("--------------------------");

        int c=5;
        int d=6;
        int e=6;

        boolean a_b=c!=d;
        System.out.println(a_b);

        boolean c_d=d==e;
        System.out.println(c_d);
        System.out.println("--------------------------");

        boolean z=c>d;
        System.out.println(z);
        System.out.println("--------------------------");

        boolean v=e>=d;
        System.out.println(v);
        System.out.println("--------------------------");

        boolean g=!v;
        System.out.println("g:"+g);
        System.out.println("--------------------------");

        boolean galeride_kayıtlı=false;
        boolean buyuk_resim=true;
        boolean kucuk_resim=!buyuk_resim;
        boolean sonuc= galeride_kayıtlı&&buyuk_resim;
        System.out.println("sonuc:"+sonuc);
        System.out.println("--------------------------");

        boolean sonuc2= galeride_kayıtlı||buyuk_resim;
        System.out.println("sonuc2:"+sonuc2);

        int a=5;
        int b=3;
        int c=6;
        int d=9;

        boolean sonuc=(a>=b)||(c>d);
        System.out.println("sonuc:"+sonuc);

        System.out.println("--------------------------");

        int z=(a==1)? 5:9;
        System.out.println("z:"+z);

    }

    public static int toplam(int x, int y){

        int toplam =x+y;
        return  toplam;



         int urun_fiyat;
        Scanner scanner=new Scanner(System.in);

        System.out.print("eski fiyati yaziniz:");

        int kullanicinin_yazdigi_fiat=scanner.nextInt();

        urun_fiyat= (int) (kullanicinin_yazdigi_fiat*0.7);
        System.out.println("yeni fiyat:"+urun_fiyat);



        int cepte;
        Scanner scanner=new Scanner(System.in);

        System.out.print("cepte ne var :");

        int yazılan_deger=scanner.nextInt();

      cepte = (int) (yazılan_deger/9);

      System.out.println("Euro :"+cepte);
      boolean a=cepte>500;
        System.out.println("500 den fazla mı:"+a);


        int sayi1;
        int sayi2;
        int sayi3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("birinci sayiyi gir :");

        sayi1 = scanner.nextInt();

        System.out.print("ikininci sayiyi gir :");

        sayi2 = scanner.nextInt();

        System.out.print("ucunci sayiyi gir :");

        sayi3 = scanner.nextInt();

        int d = sayi1 + sayi2 + sayi3;


        System.out.println("Sayilar Toplami:" + d);



        Scanner scanner= new Scanner(System.in);
        System.out.print("Maasinizi girin:");
        double eski_maas=scanner.nextInt();
        double yeni_maas=eski_maas*1.2;

        System.out.print("Yeni maasiniz:"+(yeni_maas));

             */



        Scanner scanner= new Scanner(System.in);
        System.out.print("Yasinizi girin:");
        int yas=scanner.nextInt();
        System.out.print("Maasinizi girin:");
        double maas=scanner.nextInt();

        double yenimaas=(yas>40)? (maas*1.15):(maas*1.3);

        System.out.println("yenimaas:"+yenimaas);

    }
}

