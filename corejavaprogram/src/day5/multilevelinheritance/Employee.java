package day5.multilevelinheritance;

import java.time.LocalDate;

public class Employee extends Person {
    protected String department;
    protected double salary;

    public Employee(String name, long phone, LocalDate dob, String department, double salary) {
        super(name, phone, dob);
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [Name=" + name + ", Phone=" + phone + ", DOB=" + dob +
                ", Department=" + department + ", Salary=" + salary + "]";
    }
}
