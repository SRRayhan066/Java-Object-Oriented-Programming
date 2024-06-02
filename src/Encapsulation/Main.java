package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.setVal(10);
        Parent p2 = new Parent();
        p2.setVal(20);
        System.out.println(p1.getVal());
        System.out.println(p2.getVal());
        System.out.println(Parent.getNumberOfClass());
    }
}
