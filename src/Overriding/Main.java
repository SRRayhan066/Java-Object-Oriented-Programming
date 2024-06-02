package Overriding;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        System.out.println(parent.x);
        parent.print();
    }
}
