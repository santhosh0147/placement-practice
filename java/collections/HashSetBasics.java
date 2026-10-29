import java.util.*;
public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<String> hi = new HashSet<>();
        Collections.addAll(hi,"java","sql","dsa","sql","spring");
        System.out.println(hi);
        //remove,contains
        HashSet<Integer> in = new HashSet<>();
        Collections.addAll(in, 10, 20, 30, 40, 50);
        System.out.println(in.remove(20));
        System.out.println(in.add(90));
        System.out.println(in.contains(50));
        System.out.println(in);
    }
}
