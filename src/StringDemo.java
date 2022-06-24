public class StringDemo {
    public void testMethod(String str1, String str3){
        System.out.println("str1 is equal to str3?--->" +str1.equals(str3));
        System.out.println("str1 and str 3 concatenation---->" +str1.concat(str3) );
        System.out.println("find index value---->" +str3.charAt(2));
        System.out.println("string uppercase--->" +str1.toUpperCase());
        System.out.println("string lowercase--->" +str3.toLowerCase());
        System.out.println("index of 1st i in the str3--->" +str3.indexOf('i'));
        System.out.println("index of 2nd chrachter i---> " +str3.indexOf('i',3));
        System.out.println("index of word language is--->" +str3.indexOf("language"));
        System.out.println("replace a with d-->" +str1.replace('a', 'd'));
        //System.out.println("trimmed str3--->" +str3.trim());
        System.out.println("substring string from w-->" +str3.substring(4));
        System.out.println("substring starting from l to g--->" +str3.substring(1 ,4));

        String[] str = str3.split(" ");
        System.out.println();
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

        StringDemo sd = new StringDemo();
        sd.testMethod(str1,str3);
    }

}

