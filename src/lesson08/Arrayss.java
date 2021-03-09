package lesson08;

public class Arrayss {
    public static void main(String[] args) {
         /*
        String gun;
        Scanner girdi = new Scanner(System.in);
        System.out.print("gun girin:");
        gun = girdi.next();


        switch (gun.toLowerCase()) {
            case "cuma":
                System.out.print("Muslumanlar icin kutsal gun");
                break;
            case "cumartesi":
                System.out.print("Yahudiler icin kutsal gun");
                break;
            case "pazar":
                System.out.print("Hristyanlar icin kutsal gun");
                break;

            default:
                System.out.print("Kutsal gun değildir");
        }



        String harf;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lutfen harf girin:");
        harf = girdi.next();

        if(harf.length()==1){
            switch (harf) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.print("Sesli harf");
                    break;
                case "b":
                case "c":
                case "d":
                case "f":
                    System.out.print("Sessiz harf");
                    break;
                default:
                    System.out.print("Gecersiz karakter");
            }
        }else {
            System.out.println("Lutfen tek harf girin");
        }


        String harf;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Lutfen harf girin:");
        harf = girdi.next();

        if (harf.length() == 1) {
            switch (harf) {
                case "C":
                    System.out.print("Dogru cevap");
                    break;
                case "A":
                case "B":
                case "D":
                System.out.print("Yanlış cevap");
                    break;
                default:
                    System.out.print("Gecersiz şık");
            }
        } else {
            System.out.println("Lutfen tek harf girin");
        }



        int [] array = new int [4];

        array[0]=3;
        array[1]=4;
        array[2]=9;
        array[3]=10;
        System.out.println("1. elemanın degeri:"+array[0]);
        System.out.println("2. elemanın degeri:"+array[1]);
        System.out.println("3. elemanın degeri:"+array[2]);
        System.out.println("4. elemanın degeri:"+array[3]);


        String[] array=new String[4];

        array[0]="birinci eleman";
        array[1]="ikinci eleman";
        array[2]="üçüncü eleman";
        array[3]="dördüncü eleman";

        System.out.println("1. elemanın degeri:"+array[0]);
        System.out.println("2. elemanın degeri:"+array[1]);
        System.out.println("3. elemanın degeri:"+array[2]);
        System.out.println("4. elemanın degeri:"+array[3]);


        String[] array={"bir","iki","üç","dört"};

        String[] array=new String[]{"bir","iki","üç","dört"};

        System.out.println("1. elemanın degeri:"+array[0]);
        System.out.println("2. elemanın degeri:"+array[1]);
        System.out.println("3. elemanın degeri:"+array[2]);
        System.out.println("4. elemanın degeri:"+array[3]);



        int [] array = new int [4];

        array[0]=5;
        array[1]=7;
        array[2]=8;
        array[3]=9;

        for(int i=0;i<array.length;i++){
            System.out.println((i+1)+". inci elemanın degeri:"+array[i]);
        }


        String[] array={"bir","iki","üç","dört"};
        String[] array_2=new String[4];
        array_2=array.clone();
        for(int i=0;i<array_2.length;i++){
            System.out.println((i+1)+". inci elemanın degeri:"+array_2[i]);
        }
        boolean aynimi=array.equals(array_2);

        System.out.println("ayni mı:"+aynimi);



        int[] array={3,5,7,8,9};
        int[] array_2=new int[6];

        for(int i=0;i<array.length;i++) {
            array_2[i] = array[i];}

            array_2[5] = 10;

            for (int i = 0; i < array_2.length; i++) {

                System.out.println((i + 1) + ". inci elemanın degeri:" + array_2[i]);
            }

             int[] array={1,2,3,4,5};


        array[4]=0;
        for (int i=0;i<array.length;i++){

            System.out.println((i+1)+". inci eleman: "+array[i]);
        }


                    */

        int[] array={3,5,7,8,945,56,78};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"--");
        }
        System.out.println();
        java.util.Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"--");
        }



    }
}





