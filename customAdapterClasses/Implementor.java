package customAdapterClasses;
import java.awt.event.*;

import javax.swing.JFrame;
public class Implementor extends JFrame implements MouseListener,KeyListener,ActionListener,WindowListener,MouseMotionListener {

    Implementor(){
        System.out.println("Implement Success");
    }

    // MouseListener interface ko Method lai (empty) Define gareko
    public void mousePressed(MouseEvent e) {};
    public void mouseReleased(MouseEvent e) {};
    public void mouseEntered(MouseEvent e) {};
    public void mouseExited(MouseEvent e) {};
    public void mouseClicked(MouseEvent e) {};
    // --> PREEC (Pressed,Released,Entered,Exited,Clicked)
    
    
    // KeyListener interface ko Method lai (empty) Define gareko
    public void keyTyped(KeyEvent e){};
    public void keyPressed(KeyEvent e){};
    public void keyReleased(KeyEvent e){};
    //  --> TPR (Types,Pressed,Released)
    
    // ActionListener interface ko Method lai (empty) Define gareko
    public void actionPerformed(ActionEvent e){};
    
    // WindowListener interface ko Method lai (empty) Define gareko
    public void windowOpened(WindowEvent e){};
    public void windowClosing(WindowEvent e){};
    public void windowClosed(WindowEvent e){};
    public void windowIconified(WindowEvent e){};
    public void windowDeiconified(WindowEvent e){};
    public void windowActivated(WindowEvent e){};
    public void windowDeactivated(WindowEvent e){};
    //  --> COCIDAD (Closing,Opened,Closed,Iconified,DeIconified,Activated,DeActivated)
    
    // MouseMotionListener interface ko Method lai (empty) Define gareko
    public void mouseDragged(MouseEvent e){};
    public void mouseMoved(MouseEvent e){};
//  --> DM (Dragged,Moved)



}
