// 3. Employee Salary Program ⏭️

public class EmployeeSalary {
    public static void main(String[] args) {
        Employee E1 = new Manager();
        System.out.println(E1.salary(1));
        Employee E2 = new Proffesor();
        System.out.println(E2.salary(8) );
    }
}
class Employee{
    int salary(int a){
        return 5000;
    }
}
class Manager extends Employee{
    int salary(int a){
        return 6000;
    }
}
class Proffesor extends Employee{
    int salary(int a){
        return 9000;
}}
