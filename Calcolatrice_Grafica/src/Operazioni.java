import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Operazioni extends JFrame implements ActionListener
{
    JLabel fattoreA;
    JLabel fattoreB;

    JTextField fFattoreA;
    JTextField fFattoreB;

    JButton bSomma;
    JButton bDifferenza;
    JButton bProdotto;
    JButton bQuoziente;

    JLabel ris;
    JLabel r;

    public Operazioni()
    {
        setSize(1000,2000);
        setLocation(200, 200);
        setTitle("Calcolatrice");
        initComponets();
        pack();

        Container container = this.getContentPane();

        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponets()
    {
        this.setLayout(new FlowLayout());

        fattoreA = new JLabel("Fattore A: ");
        this.add(fattoreA);
        fFattoreA = new JTextField(10);
        this.add(fFattoreA);

        fattoreB = new JLabel("Fattore B: ");
        this.add(fattoreB);
        fFattoreB = new JTextField(10);
        this.add(fFattoreB);

        bSomma = new JButton("Somma");
        this.add(bSomma);

        bDifferenza = new JButton("Differenza");
        this.add(bDifferenza);

        bProdotto = new JButton("Prodotto");
        this.add(bProdotto);

        bQuoziente = new JButton("Quoziente");
        this.add(bQuoziente);

        ris = new JLabel("- Risultato -");
        this.add(ris);
        bSomma.addActionListener(this);
        bDifferenza.addActionListener(this);
        bProdotto.addActionListener(this);
        bQuoziente.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == bSomma)
        {
            int n1 = Integer.parseInt(fFattoreA.getText());
            int n2 = Integer.parseInt(fFattoreB.getText());
            int res = n1 + n2;
            ris.setText(" = " + res);
        }
        else if(e.getSource() == bDifferenza)
        {
            int n1 = Integer.parseInt(fFattoreA.getText());
            int n2 = Integer.parseInt(fFattoreB.getText());
            int res = n1 - n2;
            ris.setText(" = " + res);
        }
        else if(e.getSource() == bProdotto)
        {
            int n1 = Integer.parseInt(fFattoreA.getText());
            int n2 = Integer.parseInt(fFattoreB.getText());
            int res = n1 * n2;
            ris.setText(" = " + res);
        }
        else if(e.getSource() == bQuoziente)
        {
            int n1 = Integer.parseInt(fFattoreA.getText());
            int n2 = Integer.parseInt(fFattoreB.getText());
            int res = n1 / n2;
            int resto = n1 % n2;

            ris.setText(" = " + res + ", R: " + resto);
        }
    }

    public static void main(String[] args)
    {
        Operazioni calcolatrice = new Operazioni();
    }
}
