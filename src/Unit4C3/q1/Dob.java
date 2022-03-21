package Unit4C3.q1;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){super(message);}
}
public class Dob {
 public LocalDate Age(String dateofBirth) throws InvalidAgeException{
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     LocalDate age = null;
     LocalDate dob = null;
     LocalDate today = null;
     try{

         age = LocalDate.ofEpochDay(ChronoUnit.YEARS.between(dob,today));
         today = LocalDate.now();
         dob = LocalDate.parse(dateofBirth,dtf);
     }catch (Exception e){
         System.out.println("please pass the date in the proper format");
         System.exit(0);
     }
     if (dob.isAfter(today)){
         InvalidAgeException ef = new InvalidAgeException("Date of birth should not be in future");
         throw ef;
     }
     return age;
 }
}
