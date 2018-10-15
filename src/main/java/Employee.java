public class Employee {
    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public String getName() {
        return name;
    }

    public void raiseSalary(double salary) {
        this.salary += salary;
    }

    public double payBonus() {
        return salary * 0.01;
    }
}
