package array_demo;

public class Array3 {

    public static void main(String[] args) {

        String[] names = {"Alam", "Biplob", "Charles", "Donald"};

        int[] num = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int y : num) {
            sum = sum + y;

        }
        System.out.println(sum);
        for (String x : names) {
            System.out.println(x);

        }

    }

}
