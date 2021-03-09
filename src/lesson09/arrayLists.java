package lesson09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayLists {
    public static void main(String[] args) {

       /* int[] my_array = {1789,2035,1899,1456,2013,1458,2458,1254,1472,
                2365,1456,2165,1457,2456};
        int sum = 0;
        int average=0;


        for (int i = 0; i < my_array.length; i++) {

            sum+=my_array[i];
        }
        average=sum/14;

        System.out.println("sayıların toplamı: "+sum);
        System.out.println("sayıların ortalaması: "+average);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);

        int uzunluk = list.size();
        System.out.println("uzunluk: " + uzunluk);

        int birinci_eleman = list.get(0);
        int ikinci_eleman = list.get(1);
        int üçünci_eleman = list.get(2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". nci eleman: " + list.get(i));

        }


       ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Londra");
        stringArrayList.add("New york");
        stringArrayList.add("Tokyo");
        stringArrayList.add("Sydney");

        stringArrayList.add(2,"Roma");
        stringArrayList.set(1,"MadriD");
        stringArrayList.remove(4);
        stringArrayList.remove("Londra");

        int uzunluk = stringArrayList.size();
        System.out.println("uzunluk: " + uzunluk);

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println((i + 1) + ". nci eleman: " +
                    stringArrayList.get(i).toUpperCase());
        }



        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list_1 = new ArrayList<>();

        list.add(4);
        list.add(45);
        list.add(300);

        list_1.add(234);
        list_1.add(5642);
        list_1.add(1);

        list.remove(Integer.valueOf(45));

        list_1.addAll(list);

        for (int i = 0; i < list.size(); i++){

            if (list.get(i)>100){
                list.remove(i);
                i=i-1;
            }

        }
        for (int i = 0; i <list_1.size(); i++) {
            System.out.println((i + 1) + ". nci eleman: " +
                    list_1.get(i));
        }


        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list_1 = new ArrayList<>();

        list.add(4);
        list.add(45);
        list.add(300);

        list_1.add(234);
        list_1.add(5642);
        list_1.add(1);

        list_1.clear();

        System.out.println("eleman sayısı : " + list_1.size());

        boolean var_mi = list.contains(4);
        boolean bos_mu=list_1.isEmpty();
        System.out.println("list 4 içeriyor mu: "+var_mi);
        System.out.println("liste_1 boş mu: "+bos_mu);



        ArrayList<Integer> list_1 = new ArrayList<>();
        list_1.add(234);
        list_1.add(5642);
        list_1.add(1);
        Object[] array1=list_1.toArray();
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Array " +
                    array1[i]);
        }

        System.out.println("---------------------------");

        List<Object> yeni_List= Arrays.asList(array1);
        for (int i = 0; i < yeni_List.size(); i++) {
            System.out.println("Yeni list " +
                    yeni_List.get(i));
        }

        */

        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("Pazartesi");
        stringArrayList.add("Salı");
        stringArrayList.add("Çarşamba");
        stringArrayList.add("Perşembe");
        stringArrayList.add("Cuma");
        stringArrayList.add("Cumartesi");
        stringArrayList.add("Pazar");

        for (int i = 0; i < stringArrayList.size(); i++) {
            System.out.println("Haftanın"+(i+1) +". inci günü: " +
                    stringArrayList.get(i));
        }
        System.out.println("uzunluk: "+stringArrayList.size());

    }
}
