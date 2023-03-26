import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Shootplane extends JPanel {

    public static BufferedImage background;
    public static BufferedImage start;
    public static BufferedImage airplane;
    public static BufferedImage bee;
    public static BufferedImage bullet;
    public static BufferedImage hero0;
    public static BufferedImage hero1;
    public static BufferedImage pause;
    public static BufferedImage gameover;
    static {
        try{
            background = ImageIO.read(Shootplane.class.getResource("background.png"));
            start = ImageIO.read(Shootplane.class.getResource("start.png"));
            airplane = ImageIO.read(Shootplane.class.getResource("airplane.png"));
            bee = ImageIO.read(Shootplane.class.getResource("bee.png"));
            bullet = ImageIO.read(Shootplane.class.getResource("bullet.png"));
            hero0 = ImageIO.read(Shootplane.class.getResource("hero0.png"));
            hero1 = ImageIO.read(Shootplane.class.getResource("hero1.png"));
            pause = ImageIO.read(Shootplane.class.getResource("pause.png"));
            gameover = ImageIO.read(Shootplane.class.getResource("gameover.png"));

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
