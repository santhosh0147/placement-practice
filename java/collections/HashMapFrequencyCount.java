import java.util.*;
public class HashMapFrequencyCount {
    public static void main(String[] args) {
        int arr[] = {10,20,10,30,20,10};
        HashMap<Integer,Integer> san = new HashMap<>();
        for(int x : arr){
            if(san.containsKey(x)){
                san.put(x,san.get(x)+1);
            }
            else {
                san.put(x,1);
            }
        }
        System.out.println(san);
        for(Map.Entry<Integer,Integer> entry : san.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
