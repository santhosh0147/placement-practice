import java.util.*;
public class ListIndexOf {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        Collections.addAll(str,"Java", "SQL", "DSA","Spring","Java","Java");
        System.out.println(str.indexOf("DSA"));
        System.out.println(str.indexOf("pythan"));
        System.out.println(str.lastIndexOf("Java"));
        ;
}}
