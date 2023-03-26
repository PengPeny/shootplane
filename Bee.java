import java.util.Random;

public class Bee extends FlyingObject implements Award{
    private int xSpeed = 1;
    private int ySpeed  = 2;
    private int awardType;
    public Bee(){
        this.image = Shootplane.bee;
        width = image.getWidth();
        height = image.getHeight();
        y = -height;
        Random rand = new Random();
        x = rand.nextInt(Shootplane.WIDTH - width);

    }

    public int getType(){
        return awardType;
    }
    public boolean outOfBounds(){
        return y >Shootplane.HEIGHT;
    }

    public void step(){
        x += xSpeed;
        y += ySpeed;
        if (x > Shootplane.WIDTH - width){
            xSpeed = -1;
        }
        if (x<0){
            xSpeed = 1;
        }
    }


}
