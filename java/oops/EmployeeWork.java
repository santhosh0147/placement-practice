class employee{
    void work(){
        System.out.println(" ");
    }
}
class manager extends employee{
    void work(){
        System.out.println("manger manges the team");
    }
}
class developer extends employee{
    void work(){
        System.out.println("developer can write code ");
    }
}

public class EmployeeWork {
    public static void main(String[] args) {
        employee e1 = new manager();
        e1.work();
        employee e2 = new developer();
        e2.work();
    }
}
