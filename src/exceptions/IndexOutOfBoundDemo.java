package exceptions;

public class IndexOutOfBoundDemo {
    public static void main(String args[])
    {
        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("String Index Out Of Bounds Exception");
            System.out.println(e);
        }
    }
}