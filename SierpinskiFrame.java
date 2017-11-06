import javax.swing.*;
import java.awt.*;

public class SierpinskiFrame extends JFrame{

  public SierpinskiFrame(){
    setTitle("Sierpinski's Triangle");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //getContentPane().setBackground(Color.GREEN);
    SierpinskiPanel panel = new SierpinskiPanel();
    add(panel);
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setBounds(0,0,screenSize.width, screenSize.height);
    setVisible(true);

  }
  public static void main(String[] args) {
    new SierpinskiFrame();
  }
}
