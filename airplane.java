import java.util.Random;

public class airplane extends FlyingObject implements Enemy{
    private int speed = 3;
    public airplane(){
        this.image = Shootplane.airplane;
        with = image.getWidth();
    }
}
