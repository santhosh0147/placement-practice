import java.util.*;
public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String,Integer> san = new HashMap<>();
        san.put("java",90);
        san.put("sql",80);
        san.put("dsa",85);
        System.out.println(san);
        System.out.println(san.get("dsa"));
        System.out.println(san.containsKey("python"));
    }
}
