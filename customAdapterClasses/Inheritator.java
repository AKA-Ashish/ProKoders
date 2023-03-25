package customAdapterClasses;
import java.awt.event.*;

import javax.swing.*;
public class Inheritator extends Implementor{
    JButton button;

    Inheritator(){
        System.out.println("Inherit Successfull");

        button = new JButton("Button");
        button.setBounds(150,150,150,30);

        // MouseListener implemented by Parent class and we inherited that
        button.addMouseListener(this);
        
        // ActionListerner implemented by Parent class and we inherited that
        button.addActionListener(this);

        // JFrame extended by Parent class and we Inherited that class 
        add(button);
        setTitle("Custom Adapter Class");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    // HERE, we are able to use multiple types of EvenListener's by inheriting just one class instead of implementing multiple listeners. 

    @Override
   public void mouseEntered(MouseEvent e){
    System.out.println("Mouse Entered");
   }

   @Override
   public void actionPerformed(ActionEvent e){
    System.out.println("Button Clicked");
   }
}
