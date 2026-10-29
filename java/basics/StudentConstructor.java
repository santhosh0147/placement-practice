// Define a class called Student. Add relevant data like name, roll
// no, marks in an array. Define marksTotal method. Create different
// student objects, initialize with constructors and invoke the
// method.

class Student {
    String name ;
    int rollNo;
    int [] mark;
    Student(String n,int r,int[] m){
        name = n;
        rollNo = r;
        mark = m;
    }
    int markTotal(){
        int total =0;
        for(int n : mark){
            total+=n;
        }
        return total;

    }
}
public class StudentConstructor {
    public static void main(String[] args) {
        Student santhosh = new Student("Santhosh G",147,new int[]{10,10,10,10,10,10});

        Student murugan = new Student("Murugan S",141,new int[]{100,100,100,100,100,100});

        System.out.println(santhosh.name +" : "+ santhosh.markTotal());
        System.out.println( murugan.name +" : "+ murugan.markTotal());
    }
}
