package stream;

import java.util.Arrays;
import java.util.List;

public class UseStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mango","Banana","Berries","Watermelon");
        System.out.println("Iterating by for each loop");
        for(String fruit:list){
            if(fruit.startsWith("B")) {
                System.out.println(fruit);
            }
        }
        System.out.println("Iterating by Stream");
        list.stream()
        .filter((fruit -> fruit.startsWith("B")))
        .forEach(System.out::println);
    }
}
