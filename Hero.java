import java.awt.*;
import java.awt.image.BufferedImage;

public class Hero extends FlyingObject {
    private BufferedImage[] images = {};
    private int index;
    private int doubleFire;
    private int life;

    public Hero() {
        width = image.getWidth();
        height = image.getHeight();
        images = new BufferedImage[]{Shootplane.hero0, Shootplane.hero1};
        image = Shootplane.hero0;
        x = 150;
        y = 400;
        life = 3;
        doubleFire = 0;
    }

    public int getDoubleFire() {
        return doubleFire;
    }

    public void setDoubleFire(int doubleFire) {
        this.doubleFire = doubleFire;
    }

    public void addDoubleFire() {
        doubleFire = 30;
    }

    public void addLife() {
        life++;
    }

    public void subractLife() {
        life--;
    }

    public int getLife() {
        return life;
    }

    public void moveTo(int x, int y) {
        this.x = x - width / 2;
        this.y = y - height / 2;
    }

    @Override
    public boolean outOfBounds() {
        return false;
    }

    public Bullet[] shoot() {
        int xStep = width / 4;
        int yStep = 20;
        Bullet[] bullets;
        if (doubleFire > 0) {
            bullets = new Bullet[2];
            bullets[0] = new Bullet(x + xStep, y - yStep);
            bullets[1] = new Bullet(x + 3 * xStep, y - yStep);
        } else {
            bullets = new Bullet[1];
            bullets[0] = new Bullet(x + 2 * xStep, y - yStep);
        }
        return bullets;
    }
    @Override
    public void step(){
        if(images.length>0){
            image = images[index++/10%images.length];
        }
    }
    public boolean collision(FlyingObject other){
        int x1 = other.x -this.width/2;
        int x2 = other.x + this.width/2 +other.width;
        int y1 = other.y - this.height/2;
        int y2 = other.y + this.height/2 + other.height;

        int herox = this.x + this.width/2;
        int heroy = this.y + this.height/2;

        return herox>x1 && herox<x2 && heroy>y1 && heroy<y2;
    }


}
