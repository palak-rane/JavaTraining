package poymorphism;

public class Addition {

    public int sum(int a,int b){
        return a+b;
    }
    public int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
    public double sum(double a, double b, double c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Addition a1= new Addition();
      // int result = a1.sum(10,20);
        System.out.println(a1.sum(10,20));
        System.out.println(a1.sum(2.5, 3.5,4.5));
        System.out.println(a1.sum(10,20,30,40));
    }
}
