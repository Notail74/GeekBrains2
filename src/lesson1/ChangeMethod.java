package lesson1;

import java.util.Arrays;
import java.util.List;

public class ChangeMethod {
    //Написать метод, который меняет два элемента
    // массива местами (массив может быть любого
    // ссылочного типа);
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        listSwap1stAndLast(list1);
        System.out.println(list1);
    }
    public static <T> List<T> listSwap1stAndLast(List<T> list) {
        List<T> tempList = list;
        T firstElement = tempList.get(0);
        T lastElement = tempList.get(list.size() - 1);
        tempList.set(0, lastElement);
        tempList.set(tempList.size() - 1, firstElement);
        return tempList;
    }
}