package array;

public class StringArray {
    public void stringArrayDemo (String[] arr){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        String arr[] = new String[5];
        arr[0]= "Palak";
        arr[1]= "Vinod";
        arr[2]= "Janhavi";
        arr[3]= "Anvi";
        arr[4]="Rane";
        StringArray s= new StringArray();
        s.stringArrayDemo(arr);


    }




}
