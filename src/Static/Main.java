package Static;

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
        p.display();
    }
}
class Parent {
    static void show(){
        System.out.println("Showing Parent Class");
    }

    public void display(){
        System.out.println("Displaying Parent Class");
    }
}
class Child extends Parent{
    static void show(){
        System.out.println("Showing Child Class");
    }

    public void display(){
        System.out.println("Displaying Child Class");
    }
}

