package classandobjects;

public class Employee {
    String empName;
    int empId;
    float empSalary;
    String empAddress;
    static String companyName= "Devsoft";

    public Employee(String empName, int empId, float empSalary, String empAddress ){
      this.empName = empName;
      this.empId= empId;
      this.empSalary =empSalary;
      this.empAddress= empAddress;
    }

    public float getSalary(){
        return empSalary;
    }

    public String getEmpName() {
        return empName;
    }

    public void setSalary(float empSalary){
        this.empSalary= empSalary;
    }

    public static void main(String[] args) {
        Employee e1 =new Employee("Palak", 1, 10000, "Harrow");
        Employee e2 =new Employee("Vinod", 2, 200000, "Wembley");
        Employee e3 =new Employee("Janhavi", 3, 3000, "London");
        Employee e4 =new Employee("Anvi", 4, 10000, "Harrow");

        System.out.println(e1.empAddress + " " + e1.empSalary + " " + e1.empId +" " + e1.empName);

    }

}
