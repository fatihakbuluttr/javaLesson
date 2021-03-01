import java.util.ArrayList;
import java.util.Scanner;

public class practice {

    public static void main(String[] args) {
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
