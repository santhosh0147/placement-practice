class Shape{
    void area(){
        System.out.println("Area");
    }
}

class Circle extends Shape{
    void area(){
        System.out.println("Circle Area");
    }
}

class Rectangle extends Shape{
    void  area(){
        System.out.println("Rectangle Area");
    }
}
public class ShapeOverriding{
    public static void main(String[] args) {
        Shape Circle = new Circle();
        Circle.area();
        Shape Rectangle = new Rectangle();
        Rectangle.area();
    }
}
