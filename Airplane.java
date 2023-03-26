import java.util.Random;

public class Airplane extends FlyingObject implements Enemy{
    private int speed = 3;
    public Airplane(){
        this.image = Shootplane.airplane;
        width = image.getWidth();
        height = image.getHeight();
        y = -height;
        Random rand = new Random();
        x = rand.nextInt(Shootplane.WIDTH - width);

    }
    @Override
    public int getScore(){
        return 5;
    }

    public boolean outOfBounds(){
        return y>Shootplane.HEIGHT;
    }
    public void step(){
        y += speed;
    }
}
