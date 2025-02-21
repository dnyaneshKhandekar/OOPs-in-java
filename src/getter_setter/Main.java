package getter_setter;

// Employee class with encapsulated fields
class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        setSalary(salary); // Using setter to apply validation
    }

    // Getter methods (to retrieve values)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods (to update values)
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary > 0) { // Validation: Salary must be positive
            this.salary = salary;
        } else {
            System.out.println("Error: Salary must be positive!");
        }
    }

    // Method to display employee details
    public void displayEmployee() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

// Main class to test Employee class
public class Main {
    public static void main(String[] args) {
        // Creating Employee object using constructor
        Employee emp = new Employee(101, "Amar", 35000);

        // Displaying employee details
        emp.displayEmployee();

        // Using getters
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        // Using setters to update values
        emp.setName("Rohan");
        emp.setSalary(45000); // Valid salary update
        emp.setSalary(-5000); // Invalid salary update (Validation check)

        // Display updated details
        emp.displayEmployee();
    }
}
