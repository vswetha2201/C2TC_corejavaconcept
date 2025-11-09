package com.tnsif.day5.multilevelinheritance;



import java.time.LocalDate;

public class Person {
    protected String name;
    protected long phone;
    protected LocalDate dob;

    public Person(String name, long phone, LocalDate dob) {
        this.name = name;
        this.phone = phone;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Person [Name=" + name + ", Phone=" + phone + ", DOB=" + dob + "]";
    }
}
