package swingGUI;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class CatchmeRandomizeColor {

  public static void main(String[] args) {
    new FrameRandomizeColor();
    // Purpose of the Project ?
    // -> Making a Dynamic Color Randomizer
  }
}

class FrameRandomizeColor extends MouseAdapter {

  JFrame frame;
  JButton button;
  Random random;

  FrameRandomizeColor() {
    random = new Random();

    frame = new JFrame("Randomize Color");

    button = new JButton("Click");
    button.setBounds(150, 150, 100, 30);
    button.addMouseListener(this);
    frame.add(button);

    frame.setLocationRelativeTo(null);

    frame.setSize(500, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setVisible(true);
  }

  //   X_axis and Y_axis for Button
  private int x_axis;
  private int y_axis;

  //   We will use random to generate random values of Red Green and Blue and we use that in Color Object to generate a random RGB value.

  //   private float red;
  //   private float green;
  //   private float blue;

  private int red;
  private int green;
  private int blue;

  public void mouseEntered(MouseEvent e) {
    x_axis = random.nextInt(100, 400);
    y_axis = random.nextInt(30, 450);

    button.setBounds(x_axis, y_axis, 100, 30);

    // Generating random values for RGB;
    //   If FLOAT 0-0.999 ,If Integer 0-255;

    // When we use FLOAT values 0-0.999 on Color object,it converts float values into Int .  i.e 0.5f = 128int value
    // red = random.nextFloat();
    // green = random.nextFloat();
    // blue = random.nextFloat();

    red = random.nextInt(0, 255);
    green = random.nextInt(0, 255);
    blue = random.nextInt(0, 255);

    // System.out.printf("\nRed : %f, Green : %f, Blue : %f", red, green, blue);

    // Here, RGB ko value combine vayera aauta COLOR banxa.

    Color mycolor = new Color(red, green, blue);
    // Color mycolor = new Color(0, 0, 0);

    frame.getContentPane().setBackground(mycolor);
  }
}
