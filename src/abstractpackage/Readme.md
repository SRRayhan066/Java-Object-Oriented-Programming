## Abstract Class
If a class is declared as abstract, then it is impossible to create an instance of this abstract class. But it is possible to extend this class.

```
package abstractpackage;

public abstract class Animal {
    String name;
    int age;
}
```

Extending `Animal` class by `Cat` class      

```
package abstractpackage;

public class Cat extends Animal{
    public Cat(){
        System.out.println("This is a cat");
    }
}

```

<b>Question : Why it is necessary to use abstract class?</b>      


If creating an instance doesn't provide proper information about this class, then it is pointless to create an instance.

```
Animal animal = new Animal();
```
For example, here the animal instance can't provide the proper information such as what type of animal it is. It's pointless and that's why by using an abstract class it can be prohibited to create an instance.


## Abstract Method

If a method of a class is defined as abstract, then it is compulsory to implement this method by the child class.       

The demonstration is given below,   

```
package abstractpackage;

public abstract class Animal {
    String name;
    int age;

    public abstract void makeNoise();
}
```

Child Class
```
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
```

<b>Question : What are the differences between `Interface` and `Abstract`?</b>     

There are mainly two differences between `Interface` and `Abstract`.     

| Interface                                                         | Abstract                                                                              |
|-------------------------------------------------------------------|---------------------------------------------------------------------------------------|
| A class can implement multiple interfaces at a time.              | A class can only extend one class at a time.                                          |
| It is compulsory to implement all methods that lie in the interface. | If a method is not defined as abstract, then it is not necessary to implement this. |
