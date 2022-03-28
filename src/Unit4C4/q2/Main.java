package Unit4C4.q2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee("chi56","Chirag","Udaipur","chirag@56");

        //Serializing except Password
        FileOutputStream fileOutputStream = new FileOutputStream("emp.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(employee);
        System.out.println("Done");

        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("emp.txt"));
        Employee employee1 = (Employee)objectInputStream1.readObject();
        System.out.println(employee1.toString());

    }
}
