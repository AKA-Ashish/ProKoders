package customAdapterClasses;
import java.awt.event.*;

import javax.swing.JFrame;
public class Implementor extends JFrame implements MouseListener {

    Implementor(){
        System.out.println("Implement Success");
    }

    // MouseListener interface ko Method lai (empty) Define gareko
    public void mousePressed(MouseEvent e) {};
    public void mouseReleased(MouseEvent e) {};
    public void mouseEntered(MouseEvent e) {};
    public void mouseExited(MouseEvent e) {};
    public void mouseClicked(MouseEvent e) {};

    // Simple way to remember MouseListener interface Methods --> PREEC (Pressed,Released,Entered,Exited,Clicked)
}
