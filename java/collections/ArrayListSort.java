import java.util.*;
public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 40, 10, 30, 20);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
