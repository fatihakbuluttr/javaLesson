package lesson01_02;

    public class lesson01_02 {
   /* public static void main(String[] args) {
      System.out.print("Hello World");
      System.out.println("Hello World!!!!");
      System.out.print("Hello World!!!!");
        // TODO: 12.02.2021
      } */

        public static void main(String[] args) {

            int a = 1876;
            int b = 9;
            int c = a % b;

            System.out.println("kalan:" + c);
            System.out.println("--------------------------");

            int d = (c * 100) % 15;
            System.out.println("kalan2:" + d);
            System.out.println("--------------------------");

            double e = Math.sqrt(25);
            System.out.println("karekok:" + e);
            System.out.println("--------------------------");

       /* double f = 98.232;

        String str_g = String.valueOf(f);
        int h = Integer.parseInt(str_g);

        System.out.println("--------------------------"); */

            float k=98.23232f;
            int l= (int) k;
            System.out.println(l);


            String aa = "10";
            long cc = Long.parseLong(aa);
            System.out.println(cc);
            System.out.println("--------------------------");

            int aA = 5;
            String bB = String.valueOf(aA);
            System.out.println(bB);


            int z = 10;

            System.out.println(z);
            System.out.println(++z);
            System.out.println(++z);
            System.out.println(++z);
            System.out.println(++z);
            System.out.println(++z);
            System.out.println(++z);
            System.out.println(++z);
            System.out.println(++z);
            System.out.println(++z);
            System.out.println(++z);


        }

    }

