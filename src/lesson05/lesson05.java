package lesson05;

import java.util.Scanner;

public class lesson05 {

    public static void main(String[] args) {

         /*  String str="Amerika";
        boolean a=str.contains("i");

        if (a) {
            System.out.println("str i harfi içerir");

        }else{
            System.out.println("str i harfi içermez");
        }



        int num1=10;
        if (num1>1){
            System.out.println("1den büyük");
        }
        if(num1<100){
            System.out.println("100den küçük");
        }



        int num1,num2;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        num1=scanner.nextInt();
        System.out.print("ikinci sayıyı giriniz:");
        num2=scanner.nextInt();

        int sonuc=num1*num2;
        if(sonuc>0){
            System.out.println("pozitiftirr"+sonuc);
        }else {
            System.out.println("negatiftir"+sonuc);
        }



        String str;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir isim giriniz:");
        str=scanner.next();
        int uzunluk=str.length();

        if(uzunluk>5){
            System.out.println("besden buyuk ");
        }else {
            System.out.println("besden kucuk ");
        }



        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        sayi = scanner.nextInt();

        if (sayi < 0) {
            sayi = -sayi;

        }
        System.out.println("sayi:"+sayi);



        int sayi=786;
        if(sayi<100){
            System.out.println("sayı 100den kücük");
        }else if(sayi<500){
            System.out.println("sayı 500den kücük");

        }else if(sayi<1000){
            System.out.println("sayı 1000den kücük");
        }else {
            System.out.println("sonuç bulunamadı");
        }



        int pir=2;
        double toplam;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç kilo pirinç alacaksınız:");
        int pir1 = scanner.nextInt();

        if(pir1>5){
            toplam=pir*pir1*0.9;

        }else {toplam=pir*pir1;

        }
        System.out.println("toplam fiyat:"+toplam);



        int not;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Notu giriniz:");
        not = scanner.nextInt();
        if(not<50){
            System.out.println("Zayıf");
        }else if(not>=50&&not<=80){
            System.out.println("orta");
        }else if(not>=80&&not<=100){
            System.out.println("pekiyi");
        }else{
            System.out.println("Not bulunamadı");
        }

       */


        int sayi;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1-7 arasında bir sayı giriniz:");
        sayi = scanner.nextInt();

        if(sayi==1){
            System.out.println("Pazartesi");
        }else if(sayi==2){
            System.out.println("salı");
        }
        else if(sayi==3){
            System.out.println("çarsamba");
        }else if(sayi==4){
            System.out.println("persembe");
        }else if(sayi==5){
            System.out.println("cuma");
        }else if(sayi==6){
            System.out.println("cumartesi");
        }else if(sayi==7){
            System.out.println("pazar");
        }else {
            System.out.println("sonuç bulunamadı");
        }






    }
}
