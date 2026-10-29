import java.util.*;
public class ArrayListSearch {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("sandy");
        arr.add("san");
        arr.add("muruga");
        arr.add("sivan");
        arr.add("sand");
        arr.remove(4);
        for(int i =0;i<arr.size();i++){
            if(arr.get(i)=="san"){
                System.out.println("found at :" +"index "+i);
            }

        }
    }
}
