package Interface;

public class Main implements Combined{

    @Override
    public void combined() {
        System.out.println("Combined");
    }

    @Override
    public void first() {
        System.out.println("First");
    }

    @Override
    public void second() {
        System.out.println("Second");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.combined();
        m.first();
        m.second();
    }
}
