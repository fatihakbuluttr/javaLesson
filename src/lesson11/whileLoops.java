package lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {

        /*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(20);
        list.add(21);
        list.add(22);

        for(Integer sayi:list){
            int birler_basamagi=sayi%10;
            int onlar_basamagi=(sayi-birler_basamagi)/10;
            System.out.println("sayı: "+(birler_basamagi+onlar_basamagi));

            System.out.println("-------------------------------");

        int[] dizi1 = {4, 9, 6, 5, 12, 54};
//        int sira1 = 4;
//        int sonuc1 = donenSayi(dizi1, sira1);
//        System.out.println(sonuc1);
        int[] dizi4 = {4, 9, 6, 5, 22, 54, 12, 432, 42, 13};
        int sira4 = 1;
        int sonuc4 = donenSayi(dizi4, sira4);
        System.out.println(sonuc4);
    }
    public static int donenSayi(int[] dizi2, int sira2) {
        int sonuc2;
        if (sira2 >= 0 && sira2 <= dizi2.length) {
            Arrays.sort(dizi2);
            sonuc2 = dizi2[sira2 - 1];
            System.out.println(sira2 + " .nci kucuk eleman: " + sonuc2);
        } else {
            sonuc2 = -1;
//            System.out.println("sonuc" + sonuc2);
        }
        return sonuc2;

System.out.println("-----------------------");

        int i=1;
        while (i<6){
            System.out.println("Hello");
            i++;
        }
System.out.println("-----------------------");

        int i=10;
        while (i>=1){
            System.out.println(i);
            i--;
        }



        for (int j = 10; j >=1 ; j--) {
            System.out.println(j);
        }
        int i=1;
        int sum=0;
        while (i<=10){
            sum+=i;
            System.out.println(sum);
            i++;
        }

System.out.println("-----------------------");

        int arr[]={2,11,45,9};
        int i=0;

        while (i< arr.length){
            System.out.println(arr[i]);
            i++;
        }

System.out.println("-----------------------");

        int i=1;

        do {
            System.out.println(i);
            i++;

        }while (i<11);


System.out.println("-----------------------");

        int i=10;

        do {
            System.out.println(i);
            i=i-2;

        }while (i>0);

System.out.println("-----------------------");

        int i = 4;
        int cift = 0;
        int tek = 0;

        do {
            if (i % 2 == 0) {
                cift += i;
            } else {
                tek += i;
            }
            i++;
        } while (i <21);

        System.out.println("çiftler: "+cift);
        System.out.println("tekler: "+tek);

System.out.println("-----------------------");

         *

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int[] dizi=new int[3];
        int atanacaksayininindexi=0;

        do {
            dizi[atanacaksayininindexi]=lis

        }while (atanacaksayininindexi< dizi.length);

        System.out.println("-----------------------");

         */
        int toplam=0,ortalama=0,toplam_girilrn_sayi=0,sayi;

        Scanner girdi=new Scanner(System.in);
        System.out.println("Bir sayı giriniz, 0 girerseniz işlem sonlanır: ");

        sayi= girdi.nextInt();
        while (sayi!=0){
            toplam+=sayi;
            ortalama=toplam/toplam_girilrn_sayi;

            System.out.println("Bir sayı giriniz, 0 girerseniz işlem sonlanır: ");
            sayi= girdi.nextInt();
        }
        System.out.println("son toplam"+toplam);
    }
}
