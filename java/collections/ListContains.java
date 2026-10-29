import java.util.*;
public class ListContains {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        Collections.addAll(str,"Java", "SQL", "DSA","Spring");
        System.out.println(str.contains("DSA"));
        System.out.println(str.contains("pythan"));
    }
}
