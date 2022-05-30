import java.util.Comparator;
import java.util.List;

public class Programme {
    public static void main(String[] args) {


        List<Employee> employees = Employee.initEmployees();
        //employees.stream().forEach(System.out::println);
        //employees.stream().filter(e -> e.getSalary() >= 10000).forEach(System.out::println);
        //employees.stream().map(Employee::getSalary).forEach(System.out::println);
        /*System.out.println(employees.stream().map(Employee::getSalary).count());
        var maxSalaryOptional
                = employees.stream().map(Employee::getSalary).max(Comparator.naturalOrder());
        maxSalaryOptional.ifPresent(System.out::println);*/
        var summary =
                employees.stream().mapToDouble(Employee::getSalary).summaryStatistics();
        System.out.println(summary.getSum());
        System.out.println(summary.getAverage());
        System.out.println(summary.getMax());
        System.out.println(summary.getMin());
    }
}
