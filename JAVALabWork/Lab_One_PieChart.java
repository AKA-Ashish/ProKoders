import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Lab_One_PieChart extends JFrame {

  public static void main(String[] args) {
    new Lab_One_PieChart();
  }

  public Lab_One_PieChart() {
    super("Pie Chart");

    // Set the size of the JFrame
    setSize(400, 400);

    // Create the dataset for the pie chart
    double[] data = { 20, 30, 10, 40 };

    // Create the labels for the pie chart
    String[] labels = { "Label 1", "Label 2", "Label 3", "Label 4" };

    // Create a JPanel to display the pie chart
    JPanel panel = new JPanel() {
      public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Set the center of the pie chart and the radius
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int radius = 100;

        // Draw the pie chart
        double total = 0;
        double startAngle = 0;
        for (double value : data) {
          total += value;
        }
        for (int i = 0; i < data.length; i++) {
          double arcAngle = 360 * (data[i] / total);
          g2d.setColor(getColor(i));
          g2d.fill(
              new Arc2D.Double(centerX - radius, centerY - radius, radius * 2, radius * 2, startAngle, arcAngle,
                  Arc2D.PIE));
          startAngle += arcAngle;
        }

        // Draw the legend
        int x = 20;
        int y = 20;
        for (int i = 0; i < data.length; i++) {
          g2d.setColor(getColor(i));
          g2d.fillRect(x, y, 10, 10);
          g2d.setColor(Color.BLACK);
          g2d.drawRect(x, y, 10, 10);
          g2d.drawString(labels[i], x + 15, y + 10);
          y += 20;
        }
      }
    };

    // Add the JPanel to the JFrame
    add(panel);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Set the JFrame to be visible
    setVisible(true);
  }

  // Helper method to get a color for each slice of the pie chart
  private Color getColor(int index) {
    Color[] colors = { Color.RED, Color.BLUE, Color.GREEN, Color.ORANGE };
    return colors[index % colors.length];
  }

}
