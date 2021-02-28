package lesson07;

import java.util.Scanner;

public class lesson07 {
    public static void main(String[] args) {

/* int kart_no;
        Scanner girdi = new Scanner(System.in);
        System.out.println("kart no girin:");
        kart_no = girdi.nextInt();

        String str=Integer.valueOf(kart_no).toString();
        if (str.length()>=5){
            System.out.println("Birinci sayi"+ str.charAt(0));
            System.out.println("Birinci sayi");
            System.out.println("Birinci sayi");



        }else{
            System.out.println("hatalı kart no");
        }



        int sayi=2;
        switch (sayi) {
            case 1:
                System.out.println("sayi:"+1*2);
                break;
             case 2:
                System.out.println("sayi:"+2*2);
                break;
            case 3:
                System.out.println("sayi:"+3*2);
                break;
            default:
                System.out.println("sayi:"+4*2);
        }


        int not = 0;

        Scanner girdi = new Scanner(System.in);
        System.out.println("Notu girin:");
        not = girdi.nextInt();

        if (not<=100&&not>84){
            System.out.println("Pekiyi");
        }else if (not<=85&&not>69) {
            System.out.println("Iyi");
        }else if (not<=70&&not>59) {
            System.out.println("orta");
        }else if (not<=60&&not>44) {
            System.out.println("Geçer");
        }else if (not<=43&&not>0) {
            System.out.println("kaldı");
        }else{
            System.out.println("geçersiz not");
        }



        int no = 0;
        int not = 0;

        Scanner girdi = new Scanner(System.in);
        System.out.println("Notu girin:");
        no = girdi.nextInt();

        switch (no) {
            case 321:
                not = 98;
                break;
            case 213:
                not = 87;
                break;
            case 354:
                not = 99;
                break;
            case 124:
                not = 100;
                break;
            case 150:
                not = 92;
                System.out.print("notunuz:"+not);
                break;


            default:
                System.out.print("Not bulunamadı");

        }





        String sehir;


        Scanner girdi = new Scanner(System.in);
        System.out.println("şehir girin:");
        sehir = girdi.next();

        switch (sehir) {
            case "istanbul":
                System.out.println("plaka:" + 34);
                break;
            case "Ankara":
                System.out.println("plaka:" + 06);
                break;
            case "Antalya":
                System.out.println("plaka:" + 07);
                break;
            case "Kayseri":
                System.out.println("plaka:" + 38);
                break;
            case "Bursa":
                System.out.println("plaka:" + 16);
                break;


            default:
                System.out.print("Sehir bulunamadı");

        }

 */


        String animal="DOG";
        String result = null;


        Scanner girdi = new Scanner(System.in);
        System.out.println("hayvan girin:");
        animal = girdi.next();

        switch (animal) {
            case ("DOG"):
            case ("CAT"):
                System.out.println("Domastic");
                break;
            case ("TIGER"):
                System.out.println("vahsi hayvan");
                break;
            default:
                System.out.println("tanimsiz");
        }



    }
}
