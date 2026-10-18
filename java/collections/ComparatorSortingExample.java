import java.util.ArrayList;
import java.util.Comparator;

// Comparator defines custom ordering for objects.
class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class ComparatorSortingExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Santhosh", 66));
        students.add(new Student("Muruga", 96));

        // Sort marks in descending order.
        Comparator<Student> cmp =
                (a, b) -> Integer.compare(b.marks, a.marks);

        students.sort(cmp);

        for (Student x : students) {
            System.out.println(x.name + " " + x.marks);
        }
    }
}