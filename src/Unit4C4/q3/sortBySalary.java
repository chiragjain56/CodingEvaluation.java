package Unit4C4.q3;
//import java.util.Comparator;
import java.util.Map;
public class sortBySalary implements java.util.Comparator<Map.Entry<String, Employee>> {
    @Override
    public int compare(Map.Entry<String, Employee> o1, Map.Entry<String, Employee> o2) {
        return o1.getValue().getSalary()>o2.getValue().getSalary() ? 1 : -1;
    }
}
