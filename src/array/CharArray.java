package array;

public class CharArray {
    public char[] testMethod(char[] ca){
        for (int i = 0; i < ca.length ; i++) {
            System.out.print(ca[i]);
        }
return  ca;
    }
    public static void main(String[] args) {
        int n1=10;
        int n2=20;
        String str1 = "palak";
        String str2 = "rane";
        String str3 = "Java is Wonderful Language.";

        // String Array
        String arr[] = new String[5];
        arr[0]= "Palak";
        arr[1]= "Vinod";
        arr[2]= "Janhavi";

        //Integer array
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;

        char ch[] = new char[3];
        ch[0] = 'a';
        ch[1] = 'b';
        ch[2] = 'c';

      //  gettingstarted.Template t=new gettingstarted.Template();

        CharArray ca = new CharArray();
        ca.testMethod(ch);
    }

}

