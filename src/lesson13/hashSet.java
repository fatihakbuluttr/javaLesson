package lesson13;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {

       /* HashSet<String> isimler=new HashSet<>();
        isimler.add("Ali");
        isimler.add("Mehmet");
        isimler.add("Bilal");
        isimler.add("Büşra");
        System.out.println(isimler);
        int a="ali".hashCode();
        System.out.println(a);
        System.out.println("-----------------------------");

       boolean ali_varmı=isimler.contains("Ali");
       boolean veli_varmı=isimler.contains("veli");
        System.out.println("isimlerde ali varmı: "+ali_varmı);
        System.out.println("isimlerde veli varmı: "+veli_varmı);
        System.out.println("-----------------------------");
        isimler.remove("Mehmet");
        System.out.println(isimler);
        System.out.println("-----------------------------");
        Iterator<String> iterator=isimler.iterator();
        while (iterator.hasNext()){
            System.out.println("iterator ile yazılımı: "+iterator.next());
        }
        System.out.println("-----------------------------");

        isimler.forEach(item-> System.out.println(item));
        System.out.println("-----------------------------");

        isimler.clear();
        System.out.println(isimler);
        System.out.println("-----------------------------");

        int sum=0;

        HashSet<Integer> sayi=new HashSet<>();
        sayi.add(2);
        sayi.add(3);
        sayi.add(4);
        sayi.add(6);
        sayi.add(8);

        for(Integer item:sayi){
            sum+=item;
        }
        System.out.println(sum);

                }

        HashSet<String> sehirler=new HashSet<>();
        sehirler.add("kayseri");
        sehirler.add("van");
        sehirler.add("muş");
        sehirler.add("ankar");
        System.out.println(sehirler.size());
        System.out.println("=======================");

        HashSet<String> group1=new HashSet<>();
        group1.add("Olivia");
        group1.add("Mia");
        group1.add("Alexandra");
        group1.add("Mason");
        group1.add("James");

        HashSet<String> group2=new HashSet<>();
        group2.add("Joseph");
        group2.add("Mia");
        group2.add("Mila");
        group2.add("Olivia");
        group2.add("Charlotte");

        HashSet<String> allNames=new HashSet<>();
        for(String item:group1){
            allNames.add(item);
        }
        for(String item:group2){
            allNames.add(item);
        }
        System.out.println(allNames);


        HashSet<Object> mySet=new HashSet<>(4);
        mySet.add(2);
        mySet.add(5);
        mySet.add("ali");
        mySet.add("veli");
        System.out.println(mySet);

        */

        int baslangic=1;
        HashSet<Integer> sayi=new HashSet<>();
         while (baslangic<=50) {
             sayi.add(baslangic);
             baslangic++;
        }
        System.out.println(sayi);









    }
}
