package Encapsulation;

public class Parent {
    private int val;
    private static int numberOfClass;

    public static int getNumberOfClass(){
        return numberOfClass;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
