package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        ArrayList<String> names= new ArrayList<>();
        ArrayList<Employee> emp= new ArrayList<>();
        List<Integer> lst = new ArrayList<>();
        lst = new LinkedList<>();
        Employee e1 = new Employee(1, "Pratik");
        Employee e2 = new Employee(2,"Vaishnavi");
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(5);
        list.add(6);
        list.add(3);
        System.out.println(list);
        list.add(2,7);
        System.out.println(list);

        names.add("Vinod");
        names.add(0,"Palak");
        names.add("Rane");
        System.out.println(names);

        emp.add(e1);
        emp.add(e2);

        for (int i: list) {
            System.out.println(i);
        }

        for (Employee e :emp) {
            System.out.println(e.EmpId + " " + e.EmpName );
        }

    }
}