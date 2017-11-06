import javax.swing.*;
import java.awt.*;

public class SierpinskiPanel extends JPanel{

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    Color linkGreen = new Color(14,81,53);
    setBackground(linkGreen);
    //System.out.println(getWidth() +" "+ getHeight());
    if (getWidth() > getHeight()){
    divide(g,0,0,getHeight());
    }
    else if(getHeight() > getWidth()){
      divide(g,0,0,getWidth());
    }
    else{}
  }
  public void divide(Graphics g, int x, int y, int side){
      if(side <= 1){

        g.setColor(Color.YELLOW);
        g.drawRect(x,y,1,1);

      }
      else {

      divide(g,x + (side/4),y,side/2);
      divide(g,x,y +(side/2),side/2);
      divide(g,x + (side/2),y + (side/2),side/2);
      }
  }
}
