package classandobjects;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1= new Employee("Namrata", 6, 10000, "Pune");
        System.out.println(e1.empName);
        System.out.println(e1.getSalary());
        System.out.println(e1.getEmpName());

        e1.setSalary(20000);
        System.out.println(e1.getSalary());
    }
}
