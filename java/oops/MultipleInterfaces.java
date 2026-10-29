// multi inerface

interface camera{
    void takephoto();
}
interface musicplayer{
    void playsAudio();
}
interface chess{
    void chessGame();
}
class smartphone implements camera,musicplayer,chess{
    public void takephoto(){
        System.out.println("smartphone can take photo");
    }
    public void playsAudio(){
        System.out.println("music can play in smartphone");
    }
    public void chessGame(){
        System.out.println("chess can play in smartphone");
    }
}
public class MultipleInterfaces {
    public static void main(String[] args) {
        chess c1 =new smartphone();
        c1.chessGame();
    }
}
