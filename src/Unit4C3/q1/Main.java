package Unit4C3.q1;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        Dob dob = new Dob();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter today date");
         String todayDate = sc.next();
         LocalDate getAge = null;
         try{
             getAge = dob.Age(todayDate);
         }catch (InvalidAgeException ef){
             System.out.println(ef.getMessage());
         }
        System.out.println(getAge);
    }
}
