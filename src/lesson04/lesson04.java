package lesson04;

import java.util.Locale;

public class lesson04 {
    public static void main(String[] args) {
        String name = "Fatih ";
        String last_name = "Akbulut";
        String yeni = "fatiH ";

        int uzunluk = name.length();
        String hepsi_buyuk_harf = name.toUpperCase();
        String hepsi_kucuk_harf = name.toLowerCase(Locale.ROOT);
        String bosluk = name.trim();
        int index_h = name.indexOf("h");
        int index_f = name.toLowerCase().indexOf("f");
        String birlestir = name.concat("Akbulut.!!!");
        boolean varmi = yeni.contains("w");
        boolean esitmi=yeni.equals(name);
        boolean esitmi2=yeni.equalsIgnoreCase(name);
        char a=name.charAt(4);
        String b=name.replace("Fa","fe");




        String full_name = name + last_name;

        System.out.println("full name:" + full_name);
        System.out.println(uzunluk);
        System.out.println(hepsi_buyuk_harf);
        System.out.println(hepsi_kucuk_harf);
        System.out.println(bosluk);
        System.out.println(index_h);
        System.out.println(index_f);
        System.out.println(birlestir);
        System.out.println(varmi);
        System.out.println(esitmi);
        System.out.println(esitmi2);
        System.out.println(a);
        System.out.println(b);





    }
}
