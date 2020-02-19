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

    public Operazioni()
    {
        setLocation(200, 200);
        setTitle("Java_CG");
        initComponets();
        pack();

        Container container = this.getContentPane();
        container.setBackground(Color.LIGHT_GRAY);
        setSize(230, 200);

        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponets()
    {
        this.setLayout(new FlowLayout());

        fattoreA = new JLabel("Numero A: ");
        this.add(fattoreA);
        fFattoreA = new JTextField(10);
        this.add(fFattoreA);

        fattoreB = new JLabel("Numero B: ");
        this.add(fattoreB);
        fFattoreB = new JTextField(10);
        this.add(fFattoreB);

        bSomma = new JButton("Somma");
        bSomma.setBackground(Color.YELLOW);
        this.add(bSomma);

        bDifferenza = new JButton("Differenza");
        bDifferenza.setBackground(Color.YELLOW);
        this.add(bDifferenza);

        bProdotto = new JButton("Prodotto");
        bProdotto.setBackground(Color.YELLOW);
        this.add(bProdotto);

        bQuoziente = new JButton("Quoziente");
        bQuoziente.setBackground(Color.YELLOW);
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
            ris.setText(" ~ " + res + " ~ ");
        }
        else if(e.getSource() == bDifferenza)
        {
            int n1 = Integer.parseInt(fFattoreA.getText());
            int n2 = Integer.parseInt(fFattoreB.getText());
            int res = n1 - n2;
            ris.setText(" ~ " + res + " ~ ");
        }
        else if(e.getSource() == bProdotto)
        {
            int n1 = Integer.parseInt(fFattoreA.getText());
            int n2 = Integer.parseInt(fFattoreB.getText());
            int res = n1 * n2;
            ris.setText(" ~ " + res + " ~ ");
        }
        else if(e.getSource() == bQuoziente)
        {
            int n1 = Integer.parseInt(fFattoreA.getText());
            int n2 = Integer.parseInt(fFattoreB.getText());
            int res = n1 / n2;
            int resto = n1 % n2;

            ris.setText(" ~ " + res + ", R: " + resto + " ~ ");
        }
    }

    public static void main(String[] args)
    {
        Operazioni calcolatrice = new Operazioni();
    }
}
