package swingGUI;

import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
import java.awt.Color;

public class Catchme extends MouseAdapter {
    /* MouseAdapter is here because we only want to use specific method as JavaAdapter class
     helps us to implement only the needed method */
    int x;
    int y;
    JButton jb;
    JLabel label;
    JFrame f;
    public Catchme(){
        f = new JFrame("Catch The Button If you Can");

         jb = new JButton("Catch For Prize");


        jb.setBounds(100,100,150,30);


        jb.addMouseListener( this);

        f.add(jb);


        label = new JLabel("Total Count = 0");
        label.setBounds(250,400,150,30);
        f.add(label);



        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
    public static void main(String[] args) {
        new Catchme();
    }

    int counter;
    @Override
    public void mouseClicked(MouseEvent e) {
        counter+= 1;
        label.setText("Total Count :"+ counter );



    }
    // @Override
    // public void mousePressed(MouseEvent e) {

    // }
    // @Override
    // public void mouseReleased(MouseEvent e) {

    int count;
    @Override
    public void mouseEntered(MouseEvent e) {
        Random random = new Random();
        x = random.nextInt(400);
        y = random.nextInt(400);

        jb.setBounds(x,y,150,30);
        count = random.nextInt(5);
        System.out.println(count);
        switch (count) {
            case 0:
            f.getContentPane().setBackground(Color.BLACK);
                break;
            case 1:
            f.getContentPane().setBackground(Color.green);
                break;
            case 2:
                f.getContentPane().setBackground(Color.cyan);
                break;
            case 3:
            f.getContentPane().setBackground(Color.yellow);
                break;
            case 4:
            f.getContentPane().setBackground(Color.red);
                break;
        }


    }
    // @Override
    // public void mouseExited(MouseEvent e) {


    // }


}