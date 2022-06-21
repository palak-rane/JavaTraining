package encapsulation;

public class Employee {
    private int EmpId;
    private String EmpName;
    private float EmpSalary;
Employee(int EmpId , String EmpName, float EmpSalary)
{
    this.EmpId= EmpId;
    this.EmpName= EmpName;
    this.EmpSalary= EmpSalary;
}
    public int getEmpId() {
        return EmpId;
    }

    public String getEmpName() {
        return EmpName;
    }

    public float getEmpSalary() {
        return EmpSalary;
    }

   /* public void setEmpId(int newId) {
        EmpId= newId;

    }*/

   /* public void setEmpSalary(float newSalary) {
        EmpSalary=newSalary;
    }*/

    public void setEmpName(String EmpName) {
        this.EmpName=EmpName;
    }
}



