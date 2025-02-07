package Practice_Daily;

public class _43_Encapluation {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.set_id(78);
        e.set_name("John");
        e.set_id(98);

        System.out.println("Employee id: " + e.get_id());
        System.out.println("Employee Name: " + e.get_name());
    }
}



// Encapsulation using private modifier

// Employee class contains private data
// called employee id and employee name
class Employee {

    private int empid;
    private String ename;

    // Setter methods
    public void set_id(int empid) {
        this.empid = empid;
    }

    public void set_name(String ename)
    {
        this.ename = ename;
    }

    // Getter methods
    public int get_id() {
        return empid;
    }

    public String get_name() {
        return ename;
    }
}
