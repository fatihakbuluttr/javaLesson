package lesson12;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {

        /* HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "pazartesi");
        myMap.put(2, "salı");
        myMap.put(3, "çarşamba");
        myMap.put(4, "perşembe");
        myMap.put(5, "cuma");
        myMap.put(6, "cumartesi");
        myMap.put(7, "pazar");
        boolean iki_varmi = myMap.containsKey(2);
        System.out.println("iki var mı: " + iki_varmi);

        boolean sekiz_varmi = myMap.containsKey(8);
        System.out.println("sekiz var mı: " + sekiz_varmi);

        boolean salı_varmi = myMap.containsValue("salı");
        System.out.println("salı var mı: " + salı_varmi);

        myMap.remove(4);
        System.out.println(myMap);

        myMap.remove(2, "salı");
        System.out.println(myMap);

        System.out.println("----------------------------");

        myMap.replace(3, "ÇARŞAMBA");
        myMap.replace(5, "cuma", "CUMA");
        System.out.println(myMap);

        System.out.println("----------------------------");
        for (Integer key : myMap.keySet()) {
            System.out.println(key);
        }
        System.out.println("----------------------------");
        for (String str : myMap.values()) {
            System.out.print(str + ", ");
        }

        System.out.println("----------------------------");

        for (Map.Entry mapElement : myMap.entrySet()){

            System.out.print(mapElement.getKey()+":" );
            System.out.println(mapElement.getValue()+",");
        }

         */
        HashMap<String, String> newMap = new HashMap<>();
        newMap.put("tr", "Turkish");
        newMap.put("en", "English");
        newMap.put("de", "German");
        newMap.put("ar", "Arabic");

        boolean tr_varmi = newMap.containsKey("tr");
        boolean es_varmi = newMap.containsKey("es");
        System.out.println("tr var mı: " + tr_varmi);
        System.out.println("es var mı: " + es_varmi );

        for (Map.Entry mapElement : newMap.entrySet()){

            System.out.print(mapElement.getKey()+":" );
            System.out.println(mapElement.getValue()+",");
        }

        System.out.println(newMap.get("tr"));


        newMap.remove("ar");
        System.out.println(newMap);






    }
}
