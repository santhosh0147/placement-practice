// Define a class called Student. Add relevant data like name, roll
// no, marks in an array. Define marksTotal method. Create different
// student objects, assign values and invoke the method.

class Student {
    String Name ;
    int rollNo;
    int [] mark;

    int markTotal(){
        int total =0;
        for(int n : mark){
            total+=n;
        }
        return total;
    }
}
public class StudentMarksTotal {
    public static void main(String[] args) {
        Student santhosh = new Student();
        santhosh.Name = "Santhosh G";
        santhosh.rollNo = 147;
        santhosh.mark = new int[]{10,10,10,10,10,10};

        Student murugan = new Student();
        murugan.Name = "Murugan S";
        murugan.rollNo = 141;
        murugan.mark = new int[]{100,100,100,100,100,100};

        System.out.println(santhosh.markTotal());
        System.out.println(murugan.markTotal());




    }
}
