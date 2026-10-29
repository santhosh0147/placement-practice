import java.util.*;
public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("sandy");
        arr.add("san");
        arr.add("muruga");
        arr.add("sivan");
        for(int i =0;i<arr.size();i++){
            System.out.println(arr.get(i));}
    }
}
