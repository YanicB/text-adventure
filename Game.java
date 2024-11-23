import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;

public class Game extends JFrame {

  public static final int WIDTH = 800;
  public static final int HEIGHT = 600;
  Container content;

  public Game() {
    super("My Adventure Game");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    getContentPane().setBackground(Color.BLACK);
    setSize(WIDTH, HEIGHT);
    setVisible(true);
    content = getContentPane();
  }
}
