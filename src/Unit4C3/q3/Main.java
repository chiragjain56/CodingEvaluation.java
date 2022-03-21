package Unit4C3.q3;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        while(count<= 4){
            System.out.println("Enter the details of Employee" + count++);

            System.out.println("Enter Employee Id");
            int empId = scanner.nextInt();

            System.out.println("ENter Employee name");
            String empName = scanner.next();

            System.out.println("Eneter Employee adress");
            String empAdress = scanner.next();

            System.out.println("Enter employee salary");
            int empSalary = scanner.nextInt();

            Employee employee = new Employee(empId,empName,empAdress,empSalary);
        employees.add(employee);

        }
        System.out.println(employees);
    }
}
