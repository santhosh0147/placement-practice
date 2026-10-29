// Employee-Manager Inheritance Program

class Employee{
    String name = "santhosh";
    int salary = 6000;
    void display(){
        System.out.println("name : "+name);
        System.out.println("salary : "+salary);
    } }
class Manager extends Employee{
    String department = "ECE";
    void show(){
        display();
        System.out.println("department : "+department);
    }
}
public class EmployeeManager{
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.show();
    }
}
