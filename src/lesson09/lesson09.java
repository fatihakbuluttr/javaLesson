package lesson09;

public class lesson09 {
    public static void main(String[] args) {
        int[] my_array = {1789,2035,1899,1456,2013,1458,2458,1254,1472,
                2365,1456,2165,1457,2456};
        int sum = 0;
        int average=0;


        for (int i = 0; i < my_array.length; i++) {

            sum+=my_array[i];
        }
        average=sum/14;

        System.out.println("sayıların toplamı: "+sum);
        System.out.println("sayıların ortalaması: "+average);
    }
}
