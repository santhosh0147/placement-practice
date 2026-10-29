// Define a class called Student. Add relevant data like name, roll
// no, marks in an array. Define marksTotal method. Create different
// student objects, initialize with overloaded constructors and
// invoke the method.

class Student{
    String name;
    int rollno;
    int []marks;

    int markTotal(){
        int sum=0;
        for(int Total : marks){
            sum+=Total;
        }
        return sum;
    }
    Student(String name,int rollno, int[] marks){
        this.name=name;
        this.rollno= rollno;
        this.marks=marks;
    }
    Student(String name){
        this.name = name;
    }
}
public class StudentOverloadedConstructors {
    public static void main(String[] args) {
        Student santhosh = new Student("murugan");
        Student santhosh1 = new Student( "santhosh",147,new int[]{50,60,70,80,90});
        System.out.println(santhosh.name);
        System.out.println(santhosh1.rollno);
        System.out.println(santhosh1.markTotal());
        System.out.println(santhosh1.name);
    }
}
