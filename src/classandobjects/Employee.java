package classandobjects;

public class Employee {
    String empName;
    int empId;
    float empSalary;
    String empAddress;

    public Employee(String empName, int empId, float empSalary, String empAddress ){
      this.empName = empName;
      this.empId= empId;
      this.empSalary =empSalary;
      this.empAddress= empAddress;
    }

    public static void main(String[] args) {
        Employee palak =new Employee("Palak", 1, 10000, "Harrow");
        Employee vinod =new Employee("Vinod", 2, 200000, "Wembley");
        Employee janhavi =new Employee("Janhavi", 3, 3000, "London");
        Employee anvi =new Employee("Anvi", 4, 10000, "Harrow");

        System.out.println(palak.empAddress + " " + palak.empSalary + " " + palak.empId +" " + palak.empName);

    }

}
