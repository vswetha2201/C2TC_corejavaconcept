package day5.multilevelinheritance;

import java.util.Date;

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {

        Person p1 = new Person("Atharv", 7878767676L, new Date(100, 11, 2)); // 2000-12-02
        System.out.println(p1);

        p1 = new Employee("Pranav", 8080807070L, new Date(95, 4, 7), "Sales", 45000); // 1995-05-07
        System.out.println(p1);

        p1 = new LevelOneEmployee("Madhur", 9880807227L, new Date(88, 0, 2), "Account", 85000, 200,
                "Signing Authority"); // 1988-01-02
        System.out.println(p1);
    }
}
