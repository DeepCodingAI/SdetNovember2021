package method.reference;

import java.util.Arrays;
import java.util.List;

public class IterateList {
    public static void main(String[] args) {
        List<String> electronicsList = Arrays.asList("iPhone","SmartTV","Laptop");
        //traditional for each loop
        for(String device:electronicsList){
            System.out.println(device);
        }
        //method reference
        electronicsList.forEach(System.out::println);
        electronicsList.forEach(Electronics::countWordLength);
    }
}
