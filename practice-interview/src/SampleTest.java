import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SampleTest {
    public static void main(String[] args) {


        String str[]= {"blue","black","yellow","blue"};
        List<String> list=  Arrays.asList(str);

        List<String> finalList1 = list;
        list= list.stream().filter(e -> Collections.frequency(finalList1,e) > 1).toList();

       Integer size= finalList1.size();
       System.out.println(list);

        Map<String,Long> map= new HashMap<>();
        map= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

List<Employee> listEmployee= new ArrayList<>();

listEmployee.add(new Employee("Karthick",30));
        listEmployee.add(new Employee("Arun",31));
        listEmployee.add(new Employee("sathish",29));

      listEmployee=  listEmployee.stream().sorted(Comparator.comparing(Employee::getEmpName).reversed().thenComparing(Employee::getEmpNumber))
                .collect(Collectors.toList());

      System.out.println(listEmployee.toString());






    }
}
