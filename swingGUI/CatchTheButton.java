package swingGUI;

import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class CatchTheButton {
    public static void main(String[] args) {
        new FrameSample();
    }
}

class FrameSample extends JFrame {
    JButton button;

    FrameSample() {
        button = new JButton("Catch Me");

        button.setBounds(250, 250, 100, 30);
        button.addMouseListener(new ActionHandlerClass(this));
        add(button);

        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
}

class ActionHandlerClass implements MouseListener {
    FrameSample y;
    private int x_axis;
    private int y_axis;
    Random random = new Random();

    ActionHandlerClass(FrameSample x) {
        y = x;
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        x_axis = random.nextInt(300);
        y_axis = random.nextInt(300);
        y.button.setBounds(x_axis, y_axis, 100, 30);
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
    }

    @Override
    public void mouseExited(MouseEvent arg0) {

    }

    @Override
    public void mousePressed(MouseEvent arg0) {

    }

    @Override
    public void mouseReleased(MouseEvent arg0) {

    }
}