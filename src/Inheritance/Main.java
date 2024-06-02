package Inheritance;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Programmer();
        System.out.println(employee.salary); // Don't override value
        employee.show(); // But override method
    }
}
