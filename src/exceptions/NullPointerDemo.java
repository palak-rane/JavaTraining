package exceptions;

public class NullPointerDemo {

    public static void main(String args[])
    {
        try {
            String name = null; //null value
            System.out.println(name.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("Null Pointer Exception. The name is null");
            System.out.println(e);
        }
    }
}