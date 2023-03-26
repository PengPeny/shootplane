public class Bullet extends FlyingObject{
    private int speed = 3;
    public Bullet(int x, int y){
        this.x = x;
        this.y = y;
        this.image = Shootplane.bullet;
    }

    public void step(){
        y -=speed;
    }
    public boolean outOfBounds(){
        return y < -height;
    }
}
