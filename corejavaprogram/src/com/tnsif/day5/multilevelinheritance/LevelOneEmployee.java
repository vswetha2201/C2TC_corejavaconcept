package com.tnsif.day5.multilevelinheritance;

import java.time.LocalDate;

public class LevelOneEmployee extends Employee {
    private int level;
    private String authority;

    public LevelOneEmployee(String name, long phone, LocalDate dob, String department, double salary, int level, String authority) {
        super(name, phone, dob, department, salary);
        this.level = level;
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "LevelOneEmployee [Name=" + name + ", Phone=" + phone + ", DOB=" + dob +
                ", Department=" + department + ", Salary=" + salary +
                ", Level=" + level + ", Authority=" + authority + "]";
    }
}
