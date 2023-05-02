package swingGUI;

import javax.swing.*;
import java.awt.*;

class SimplePieChart {
 public static void main(String[] args) {
  JFrame frame = new JFrame("PIE CHART");
  frame.add(new DrawPieChart());
  frame.setBounds(300, 200, 500, 500);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
 }
}

class DrawPieChart extends Canvas {

 @Override
 public void paint(Graphics g) {

  // Drawing PIE CHART USING ARC

  g.setColor(Color.red);
  g.fillArc(100, 100, 200, 200, 0, 120);
  g.setColor(Color.blue);
  g.fillArc(100, 100, 200, 200, 120, 80);
  g.setColor(Color.green);
  g.fillArc(100, 100, 200, 200, 200, 160);

 }

}
