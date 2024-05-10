package abstractpackage;

public class Cat extends Animal{
    public Cat(){
        System.out.println("This is a cat");
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow!!");
    }
}
