import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListAndLinkedListExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("ArrayList:");
        for (Integer num : arrayList) {
            System.out.println(num);
        }

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");

        System.out.println("LinkedList:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        String[] fruitsArray = {"Grapes", "Lemon", "Orange"};
        List<String> fruitsList = new ArrayList<>();
        for (String fruit : fruitsArray) {
            fruitsList.add(fruit);
        }

        System.out.println("Fruits ArrayList:");
        for (String fruit : fruitsList) {
            System.out.println(fruit);
        }
    }
}
