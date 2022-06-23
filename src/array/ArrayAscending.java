package array;

public class ArrayAscending {
    public static void main(String[] args) {
        int a[]= new int[10];
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; i>=j; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
