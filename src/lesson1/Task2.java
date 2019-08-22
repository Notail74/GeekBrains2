package lesson1;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    //Написать метод,
    // который преобразует массив в ArrayList;
    public static void main(String[] args) {
        List<Integer> numlist = Arrays.asList(1, 2, 5, 9, 11);
        System.out.println (numlist.get(2) + "");
    }
}
