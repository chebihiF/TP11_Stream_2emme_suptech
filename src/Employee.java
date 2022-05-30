import java.util.List;

public class Employee {
    private String name ;
    private String email ;
    private double salary;

    public static List<Employee> initEmployees(){
        return List.of(
                new Employee("ahmed","ahmed@gmail.com",3000),
                new Employee("mouna","mouna@gmail.com",4000),
                new Employee("ali","ali@gmail.com",10000),
                new Employee("amal","amal@gmail.com",30000),
                new Employee("mohamed","mohamed@gmail.com",2000),
                new Employee("achraf","achraf@gmail.com",8000)
        );
    }

    public Employee(String name, String email, double salary) {
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
