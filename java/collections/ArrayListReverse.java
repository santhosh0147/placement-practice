import java.util.*;
public class ArrayListReverse {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> ar = new ArrayList<>(arr.size());
        Collections.addAll(arr, 40, 10, 30, 20);
        Collections.sort(arr);
        for(int i =arr.size()-1;i>=0;i--){
            ar.add(arr.get(i));
        }
        System.out.println(ar);
        //Collections.sort(arr,Collections.reverseOrder()); //sortcut using API
        // System.out.println(arr);
    }
}
