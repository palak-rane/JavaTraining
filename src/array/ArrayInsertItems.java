package array;

public class ArrayInsertItems {
    public static void main(String[] args) {

        int a[]= new int[10];

        for (int i = 1; i <= 10; i++) {
            a[i-1] = i;
        }
        for (int i = 0; i <a.length ; i++) {
            System.out.println(a[i]);
        }

    }
}
