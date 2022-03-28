package Unit4C4.q3;
import java.util.*;

public class Main {
    public  Map<String,Employee> getSortedMapWithValue(Map<String,Employee> originalMap)
    {
Set <Map.Entry<String , Employee>> set = originalMap.entrySet();
List <Map.Entry<String,Employee>> list = new ArrayList<>();
list.sort(new sortBySalary());

Map<String,Employee> link = new LinkedHashMap<>();
for (Map.Entry<String , Employee> sort : list){
    link.put(sort.getKey(),sort.getValue());
    }
      return link;
    }

    public static void main(String[] args) {
Map<String ,Employee> map = new HashMap<>();
     map.put("Hr" ,new Employee("chi16","Chirag",10000));
        map.put("Sales" ,new Employee("jay23","jay",12000));
        map.put("Marketing" ,new Employee("pay43","payal",15000));
        map.put("Accounts" ,new Employee("arti43","arti",8000));

        Main main = new Main();
        LinkedHashMap <String,Employee> sorting = (LinkedHashMap<String, Employee>) main.getSortedMapWithValue(map);
        Set<Map.Entry<String,Employee>> SetValue = sorting.entrySet();

        for(Map.Entry<String,Employee> val : SetValue){
            System.out.println(val.getKey() + "-" + val.getValue());
        }
    }

}
