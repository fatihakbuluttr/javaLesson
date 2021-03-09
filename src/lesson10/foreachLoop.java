package lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class foreachLoop {
    public static void main(String[] args) {
        /*
        ArrayList<Integer> int_list1 = new ArrayList<>();
        ArrayList<Integer> int_list2 = new ArrayList<>();
        int_list1.add(1);
        int_list1.add(2);
        int_list2.add(1);
        int_list2.add(3);
        for (int i = 0; i < int_list1.size(); i++) {
            boolean esit_mi = int_list1.get(i).equals(int_list2.get(i));
            System.out.println("esit_mi: " + esit_mi);
        }


        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("bird");

        for(String str:list){
            System.out.println(str);
        }

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
            int sum=0;
        for (Integer sayi:list2){
             sum+= sayi;

        } System.out.println(sum);




        ArrayList<String> list = new ArrayList<>();
        list.add("Ptesi");
        list.add("Salı");
        list.add("Çarşamba");
        list.add("pERŞEMBE");
        list.add("CUMA");
        list.add("CUMARTESI");
        list.add("PAZAR");

        for(String str:list){
            System.out.println(str.toLowerCase(Locale.ROOT));
        }



        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("bird");
        list.add("lion");
        list.add("elephant");

        list.removeIf(isim->list.length<4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        List<Integer> sayilar = ciftSayilar(111);
        for (int i = 0; i < sayilar.size(); i++) {
            System.out.println(sayilar.get(i));
        }
    }

    public static List<Integer> ciftSayilar(int ust_sinir) {
        List<Integer> ikiye_bolunenler = new ArrayList<>();
        for (int i = 1; i < ust_sinir; i++) {
            if (i % 2 == 0) {
                ikiye_bolunenler.add(i);
            }
        }
        return ikiye_bolunenler;

         */

        String[] array = {"bir", "iki", "üç", "dört"};

        for (String str : array) {

            System.out.println(str);
        }

        System.out.println("---------------------------");


        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("bird");
        list.add("lion");
        list.add("elephant");
        ArrayList<String> list2 = new ArrayList<>();

        list2.addAll(list);
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        System.out.println("---------------------------");
        for (String str:list){
            if(str.length()>3){
                System.out.println(str);
            }

        }


    }
}
