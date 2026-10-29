// volume of box using method

class box{
    int length;
    int breath;
    int heaight;

    int volume(){
        return length*breath*heaight;
    }
}
public class BoxVolume {
    public static void main(String[] args) {
        box greenBox = new box();
        greenBox.heaight=6;
        greenBox.breath =7;
        greenBox.length=8;
        System.out.println(greenBox.volume());
    }
}
