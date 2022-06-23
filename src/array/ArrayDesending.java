package array;

public class ArrayDesending {
    public static void main(String[] args) {
        int a[]= new int[5];
        for (int i = 5; i > 0 ; i--) {
            for (int j = 0; j<i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
