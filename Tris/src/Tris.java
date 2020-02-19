import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tris extends JFrame implements ActionListener
{
    JButton B1;
    JButton B2;
    JButton B3;
    JButton B4;
    JButton B5;
    JButton B6;
    JButton B7;
    JButton B8;
    JButton B9;

    JButton clear;
    JLabel message;
    JLabel v;

    public Tris()
    {
        setLocation(200, 200);
        setTitle("Tris");
        initComponets();
        pack();

        Container container = this.getContentPane();
        container.setBackground(Color.WHITE);
        setSize(229, 199);

        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponets()
    {
        this.setLayout(new GridLayout(4,3));

        B1 = new JButton("");
        B1.addActionListener(this);
        this.add(B1);

        B2 = new JButton("");
        B2.addActionListener(this);
        this.add(B2);

        B3 = new JButton("");
        B3.addActionListener(this);
        this.add(B3);

        B4 = new JButton("");
        B4.addActionListener(this);
        this.add(B4);

        B5 = new JButton("");
        B5.addActionListener(this);
        this.add(B5);

        B6 = new JButton("");
        B6.addActionListener(this);
        this.add(B6);

        B7 = new JButton("");
        B7.addActionListener(this);
        this.add(B7);

        B8 = new JButton("");
        B8.addActionListener(this);
        this.add(B8);

        B9 = new JButton("");
        B9.addActionListener(this);
        this.add(B9);

        clear = new JButton("Clear");
        clear.setBackground(Color.LIGHT_GRAY);
        clear.addActionListener(this);
        this.add(clear);

        v = new JLabel(" ", SwingConstants.RIGHT);

        this.add(v);

        message = new JLabel(" ");
        this.add(message);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == B1 && B1.getText().equals(""))
        { B1.setText("X"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B1 && B1.getText().equals("X"))
        { B1.setText("O"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B1 && B1.getText().equals("O"))
        { B1.setText("X"); message.setText(""); v.setText(""); }

        if(e.getSource() == B2 && B2.getText().equals(""))
        { B2.setText("X"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B2 && B2.getText().equals("X"))
        { B2.setText("O"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B2 && B2.getText().equals("O"))
        { B2.setText("X"); message.setText(""); v.setText(""); }

        if(e.getSource() == B3 && B3.getText().equals(""))
        { B3.setText("X"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B3 && B3.getText().equals("X"))
        { B3.setText("O"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B3 && B3.getText().equals("O"))
        { B3.setText("X"); message.setText(""); v.setText(""); }

        if(e.getSource() == B4 && B4.getText().equals(""))
        { B4.setText("X"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B4 && B4.getText().equals("X"))
        { B4.setText("O"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B4 && B4.getText().equals("O"))
        { B4.setText("X"); message.setText(""); v.setText(""); }

        if(e.getSource() == B5 && B5.getText().equals(""))
        { B5.setText("X"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B5 && B5.getText().equals("X"))
        { B5.setText("O"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B5 && B5.getText().equals("O"))
        { B5.setText("X"); message.setText(""); v.setText(""); }

        if(e.getSource() == B6 && B6.getText().equals(""))
        { B6.setText("X"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B6 && B6.getText().equals("X"))
        { B6.setText("O"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B6 && B6.getText().equals("O"))
        { B6.setText("X"); message.setText(""); v.setText(""); }

        if(e.getSource() == B7 && B7.getText().equals(""))
        { B7.setText("X"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B7 && B7.getText().equals("X"))
        { B7.setText("O"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B7 && B7.getText().equals("O"))
        { B7.setText("X"); message.setText(""); v.setText("");}

        if(e.getSource() == B8 && B8.getText().equals(""))
        { B8.setText("X"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B8 && B8.getText().equals("X"))
        { B8.setText("O"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B8 && B8.getText().equals("O"))
        { B8.setText("X"); message.setText(""); v.setText(""); }

        if(e.getSource() == B9 && B9.getText().equals(""))
        { B9.setText("X"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B9 && B9.getText().equals("X"))
        { B9.setText("O"); message.setText(""); v.setText(""); }
        else if(e.getSource() == B9 && B9.getText().equals("O"))
        { B9.setText("X"); message.setText(""); v.setText(""); }

        if(e.getSource() == clear)
        {
            B1.setText("");
            B2.setText("");
            B3.setText("");
            B4.setText("");
            B5.setText("");
            B6.setText("");
            B7.setText("");
            B8.setText("");
            B9.setText("");

            v.setText("~ Griglia");
            message.setText(" Pulita ~");
        }
    }

    public static void main(String[] args)
    {
        Tris tris = new Tris();
    }
}
