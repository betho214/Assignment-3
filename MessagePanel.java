import javax.swing.*;
import java.awt.*;

public class MessagePanel extends JPanel{

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawString("Hello, World!", 50, 50);
  }

}
