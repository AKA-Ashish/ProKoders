import javax.swing.*;
import java.awt.*;

public class Lab_One_PieChart_Simple {
 public static void main(String[] args) {

  JFrame frame = new JFrame("PIE CHART");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(500, 500);

  // Frame ma paint method call gareko
  frame.add(new Simple_PieChart());

  frame.setVisible(true);

 }
}

class Simple_PieChart extends Canvas {

 @Override
 public void paint(Graphics g) {

  g.setColor(Color.lightGray);
  g.fillArc(100, 100, 200, 200, 0, 120);

  g.setColor(Color.green);
  g.fillArc(100, 100, 200, 200, 120, 90);

  g.setColor(Color.blue);
  g.fillArc(100, 100, 200, 200, 210, 120);

  g.setColor(Color.red);
  g.fillArc(100, 100, 200, 200, 330, 30);

 }
}
