package polymorphismruntime;

public class ChildClass extends ParentClass{
    public void display(){
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
        ParentClass p=new ParentClass();
        ChildClass c= new ChildClass();
        ParentClass p1= new ChildClass();
        p.display();
        c.display();
        p1.display();
    }
}
