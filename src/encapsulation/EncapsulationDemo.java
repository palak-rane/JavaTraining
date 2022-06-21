package encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee e1=new Employee(1,"Palak",20000);
        e1.setEmpName("Palak Rane");
        System.out.println(e1.getEmpName());
    }
}
