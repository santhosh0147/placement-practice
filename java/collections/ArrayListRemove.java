import java.util.*;
public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("sandy");
        arr.add("san");
        arr.add("muruga");
        arr.add("sivan");
        arr.add("sand");
        arr.remove(4);
        for(int i =0;i<arr.size();i++){
            System.out.println(arr.get(i));}
    }
}
