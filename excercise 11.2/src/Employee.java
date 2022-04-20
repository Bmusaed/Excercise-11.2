import java.util.Date;

public class Employee extends Person {

    private String office;
    private double salary;
    private Date dateHired;


    public Employee(String office, double salary, Date dateHired) {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public Employee setOffice(String office) {
        this.office = office;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public Employee setDateHired(Date dateHired) {
        this.dateHired = dateHired;
        return this;
    }

    @Override
    public String toString() {
        return "Employee.class: { " +
                "Name= " + this.getName() +
                '}';
    }
}
