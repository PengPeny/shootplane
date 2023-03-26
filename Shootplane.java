import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Shootplane extends JPanel {
    public static final int WIDTH = 400; // 面板宽
    public static final int HEIGHT = 654; // 面板高
    /** 游戏的当前状态: START RUNNING PAUSE GAME_OVER */
    private int state;
    private static final int START = 0;
    private static final int RUNNING = 1;
    private static final int PAUSE = 2;
    private static final int GAME_OVER = 3;

    private int score = 0; // 得分
    private Timer timer; // 定时器
    private int intervel = 1000 / 100; // 时间间隔(毫秒)

    public static BufferedImage background;
    public static BufferedImage start;
    public static BufferedImage airplane;
    public static BufferedImage bee;
    public static BufferedImage bullet;
    public static BufferedImage hero0;
    public static BufferedImage hero1;
    public static BufferedImage pause;
    public static BufferedImage gameover;

    public Hero hero = new Hero();
    public Bullet[] bullets = {};
    public FlyingObject[] flyings = {};
    static {
        try{
            background = ImageIO.read(Objects.requireNonNull(Shootplane.class.getResource("background.png")));
            start = ImageIO.read(Objects.requireNonNull(Shootplane.class.getResource("start.png")));
            airplane = ImageIO.read(Objects.requireNonNull(Shootplane.class.getResource("airplane.png")));
            bee = ImageIO.read(Objects.requireNonNull(Shootplane.class.getResource("bee.png")));
            bullet = ImageIO.read(Objects.requireNonNull(Shootplane.class.getResource("bullet.png")));
            hero0 = ImageIO.read(Objects.requireNonNull(Shootplane.class.getResource("hero0.png")));
            hero1 = ImageIO.read(Objects.requireNonNull(Shootplane.class.getResource("hero1.png")));
            pause = ImageIO.read(Objects.requireNonNull(Shootplane.class.getResource("pause.png")));
            gameover = ImageIO.read(Objects.requireNonNull(Shootplane.class.getResource("gameover.png")));

        } catch (Exception e){
            e.printStackTrace();
        }
    }
    @Override
    public void paint(Graphics g){
        g.drawImage(background, 0, 0,null);
        paintHero(g);
    }
    public void paintHero(Graphics g){
        g.drawImage(hero.getImage(), hero.getX(), hero.getY(), null);
    }

}
