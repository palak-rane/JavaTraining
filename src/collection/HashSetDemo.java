package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> list= new HashSet<>();
        HashSet<String> names= new HashSet<>();
        HashSet<Employee> emp= new HashSet<>();
        Employee e1 = new Employee(1, "Pratik");
        Employee e2 = new Employee(2,"Vaishnavi");
        list.add(4);
        list.add(3);
        list.add(8);
        list.add(5);
        list.add(5);
        list.add(3);
        System.out.println(list);
        list.add(2);
        System.out.println(list);

        names.add("Vinod");
        names.add("Palak");
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
