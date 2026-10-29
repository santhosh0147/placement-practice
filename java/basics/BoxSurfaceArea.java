// Add surfaceArea Method to Box class.

class Box{
    int length;
    int breadth;
    int height;

    int surfaceArea(){
        return 2*((length*breadth)+(height*breadth)+(height*length));
    }
}
public class BoxSurfaceArea {
    public static void main(String[] args) {
        Box greenBox = new Box();
        greenBox.height=6;
        greenBox.breadth =7;
        greenBox.length=8;
        System.out.println(greenBox.surfaceArea());
    }
}
