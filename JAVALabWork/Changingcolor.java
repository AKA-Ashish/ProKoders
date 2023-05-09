import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
// import javax.swing.JPanel;
import javax.swing.JPanel;

public class Changingcolor extends JFrame implements ActionListener {

  JButton colorButton;

  public Changingcolor() {
    super("Color Button UI");
    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    colorButton = new JButton("Click to Change Color");
    colorButton.addActionListener(this);
    panel.add(colorButton);

    add(panel);
    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getSource() == colorButton) { // which button is clicked.
      Color currentColor = colorButton.getBackground();
      if (currentColor == Color.GRAY) {
        colorButton.setBackground(Color.GREEN);
      } else {
        colorButton.setBackground(Color.gray);
      }
    }
  }

  public static void main(String[] args) {
    new Changingcolor();
  }
}
