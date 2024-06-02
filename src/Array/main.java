package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Arrays in Java");

        String[] names = {"Rayhan","Sakil","Fahad"};

        ArrayMethod arrayMethod = new ArrayMethod();

        List<String> list = new ArrayList<>(arrayMethod.toList(names));

        list.add("Hudai");

        for(String name : list) System.out.println(name);
    }
}
