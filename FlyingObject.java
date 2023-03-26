import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class FlyingObject {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected BufferedImage image;
    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getWidth(){
        return width;
    }

    public void setWith(int width){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public BufferedImage getImage() {
        return image;
    }
    public void setImage(BufferedImage image){
        this.image = image;
    }
    public abstract boolean outOfBounds();
    public abstract void step();
    public boolean shootBy (Bullet bullet){
        int x = bullet.x;
        int y = bullet.y;
        return this.x<x && this.x+width>x && this.y <y && this.y +height >y;
    }

}
