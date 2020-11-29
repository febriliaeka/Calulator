/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor;

/**
 *
 * @author ASUS
 */

//import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame{
    
    private JTextField numtxt;
    private JButton b1,b2,b3,b4,b5,b6,b7,
            b8,b9,b0,bplusmin,beq,bdiv,bmul,
            bmin,bplus,bc,bac;
    
    public Calculator(){
    
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.blue);
        setSize(300, 400);
        setVisible(true);
        
        numtxt=new JTextField(15);
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");
        b0=new JButton("0");
        bplusmin=new JButton("+/-");
        beq=new JButton("=");
        bdiv=new JButton("/");
        bmul=new JButton("*");
        bmin=new JButton("-");
        bplus=new JButton("+");
        bc=new JButton("C");
        bac=new JButton("AC");
        
        JPanel p1=new JPanel(new GridLayout(2,1));
        p1.add(numtxt);
        
        JPanel p2=new JPanel(new GridLayout(1,1,1,1));
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(bplus);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(bmin);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(bmul);
        p2.add(b0);
        p2.add(bplusmin);
        p2.add(beq);
        p2.add(bdiv);
        
        JPanel p3=new JPanel(new FlowLayout(FlowLayout.RIGHT));
        p3.add(bc);
        p3.add(bac);
        
    }
    
    public static void main(String[] args){
        /*
        Calculator cal=new Calculator();
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cal.setBackground(Color.blue);
        cal.setSize(300, 400);
        cal.setVisible(true);*/
        new Calculator();
    }
}
