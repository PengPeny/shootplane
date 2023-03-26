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

    public void setImage(BufferedImage image){
        this.image = image;
    }

}
