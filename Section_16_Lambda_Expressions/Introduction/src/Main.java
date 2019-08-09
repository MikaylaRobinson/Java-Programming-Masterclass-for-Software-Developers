import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printing from the Runnable");
                System.out.println("Line 2");
                System.out.println("This is line 3");
            }
        }).start();

        Employee john = new Employee("John Doe", 30);
        Employee jane = new Employee("Jane Doe", 21);
        Employee joe = new Employee("Joe Smith", 40);
        Employee jack = new Employee("Jack Smith", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(joe);
        employees.add(jane);
        employees.add(john);
        employees.add(jack);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        Collections.sort(employees, (employee1, employee2) ->
                employee1.getName().compareTo(employee2.getName()));

        for (Employee employee : employees) {
            System.out.println(employee.getName());
        }
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

