package swingGUI;

import javax.swing.*;
import java.awt.*;

class SimpleBarGraph {
 public static void main(String[] args) {
  JFrame frame = new JFrame("PIE CHART");
  frame.add(new DrawBarGraph());
  frame.setBounds(300, 200, 500, 500);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
 }
}

class DrawBarGraph extends Canvas {

 @Override
 public void paint(Graphics g) {

  // Drawing BAR Graph using RECT

  g.setColor(Color.black);

  // BAR GRAPH BASE LINE
  g.drawLine(0, 400, 500, 400);

  g.setColor(Color.MAGENTA);
  g.fillRect(50, 200, 50, 200);

  g.setColor(Color.green);
  g.fillRect(150, 100, 50, 300);

  g.setColor(Color.gray);
  g.fillRect(250, 250, 50, 150);

 }

}
