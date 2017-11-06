import javax.swing.*;
import java.awt.*;

public class MessagePanel extends JPanel{



  public void paintComponent(Graphics g){
    super.paintComponent(g);

    g.drawString("IT'S DANGEROUS TO GO ALONE!",159,200);
    g.drawString("TAKE THIS.",220,390);
    g.drawOval(150,400,200,35); //OutsideBase
    g.drawOval(163,405,175,25); //InsideBase
    g.drawLine(150,417,150,200); //LeftSide
    g.drawLine(350,417,350,200); //RightSide
    g.drawArc(250,149,100,100,0,90); //LeftCurve
    g.drawArc(150,149,100,100,90,90); //RightCurve
    g.drawLine(200,151,200,125); //LeftNeck
    g.drawLine(299,151,299,125); //RightNeck
    g.drawOval(200,140,99,21); // BottomNeck
  //  g.drawOval(200,115,99,21);
    g.drawRoundRect(175,100,148,25,15,15); // Opening
    g.setColor(Color.PINK);
    g.fillOval(200,250,100,100); //FairyBody
    g.drawOval(260,330,40,40); //FairyBottomRightWing
    g.drawOval(250,330,40,40);//FairyBottomLeftWing
    g.drawOval(250,220,80,100);//FairyTopRightWing
    g.drawOval(225,220,80,100); //FairyTopLeftWing


  }

}
