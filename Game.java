import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JFrame {

  public static final int WIDTH = 800;
  public static final int HEIGHT = 600;

  // No parameter Constructor.
  public Game() {
    super("Adventure Game");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(WIDTH, HEIGHT);
    getContentPane().setBackground(Color.BLACK);
    setVisible(true);
    // Make Title Page
    JPanel titleNamePanel = new JPanel();
    titleNamePanel.setBounds(100, 100, 600, 150);
    titleNamePanel.setBackground(Color.BLUE);
    add(titleNamePanel);
  }
}
