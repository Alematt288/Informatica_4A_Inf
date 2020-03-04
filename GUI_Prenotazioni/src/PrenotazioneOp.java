import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrenotazioneOp extends JFrame implements ActionListener
{
    private Prenotazione[] arrayPrenotazioni;
    public static final String SEPARATOR = ",";

    JButton conferma;
    JButton annulla;
    JButton salva;

    int i;

    JLabel lCognome;
    JTextField tCognome;

    JLabel lNome;
    JTextField tNome;

    JLabel lTelefono;
    JTextField tTelefono;

    JLabel lCittaP;
    JTextField tCittaP;

    JLabel lCittaD;
    JTextField tCittaD;

    JLabel lData;
    JTextField tData;

    public PrenotazioneOp()
    {
        setLocation(100, 50);
        setTitle("Prenota il Biglietto");

        initComponets();
        pack();

        Container container = this.getContentPane();
        setSize(1200, 150);

        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponets()
    {
        arrayPrenotazioni = new Prenotazione[10];
        i = 0;

        this.setLayout(new FlowLayout());

        JPanel label = new JPanel();
        this.add(label);

        lCognome = new JLabel("Cognome: ");
        tCognome = new JTextField(10);

        lNome = new JLabel("Nome: ");
        tNome = new JTextField(10);

        lTelefono = new JLabel("Telefono: ");
        tTelefono = new JTextField(10);

        lCittaP = new JLabel("Citta' Partenza: ");
        tCittaP = new JTextField(10);

        lCittaD = new JLabel("Citta' Destinazione: ");
        tCittaD = new JTextField(10);

        lData = new JLabel("Data: ");
        tData = new JTextField(10);

        conferma = new JButton("Conferma");
        conferma.addActionListener(this);

        annulla = new JButton("Annulla");
        annulla.addActionListener(this);

        salva = new JButton("Salva");
        salva.addActionListener(this);

        label.add(lCognome);
        label.add(tCognome);
        label.add(lNome);
        label.add(tNome);
        label.add(lTelefono);
        label.add(tTelefono);
        label.add(lCittaP);
        label.add(tCittaP);
        label.add(lCittaD);
        label.add(tCittaD);
        label.add(lData);
        label.add(tData);

        JPanel buttons = new JPanel();
        JPanel s = new JPanel();

        buttons.add(conferma);
        buttons.add(annulla);
        s.add(salva);

        this.add(label);
        this.add(buttons);
        this.add(s);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == conferma)
        {
            String cognome = tCognome.getText();
            String nome = tNome.getText();
            String telefono = tTelefono.getText();
            String cittap = tCittaP.getText();
            String cittad = tCittaD.getText();
            String data = tData.getText();

            Prenotazione pre = new Prenotazione(cognome, nome, telefono, cittap, cittad, data);
            arrayPrenotazioni[i] = pre;

            JOptionPane.showMessageDialog(null, "- Prenotazione registrata -");
            System.out.println("Prenotazione: \n" + pre.toString());

            tCognome.setText("");
            tNome.setText("");
            tTelefono.setText("");
            tCittaP.setText("");
            tCittaD.setText("");
            tData.setText("");

            i++;
        }
        else
        {
            if(e.getSource() == annulla)
            {
                tCognome.setText("");
                tNome.setText("");
                tTelefono.setText("");
                tCittaP.setText("");
                tCittaD.setText("");
                tData.setText("");

                if(i != 0)
                {
                    i = i - 1;
                    arrayPrenotazioni[i] = null;
                }
            }
            else
            {
                if(e.getSource() == salva)
                {
                    String str = "";

                    try
                    {
                        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\asus\\Desktop\\GUI_Prenotazioni", true));

                        for(int y = 0; y < i; y++)
                        {
                            str = arrayPrenotazioni[i].toString();
                        }

                        str = str + "\n";
                        bw.write(str);
                        bw.close();
                    }
                    catch (IOException ex)
                    {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }

    public void salvaCsv()
    {
        File file = new File("C:\\Users\\asus\\Desktop\\GUI_Prenotazioni\\foglio.csv");
        BufferedWriter bw = null;

        try
        {
            bw = new BufferedWriter(new FileWriter(file));

            for(int y = 0; y < i; y++)
            {
                bw.write(arrayPrenotazioni[i].rowCsv());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                bw.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {
        PrenotazioneOp pr = new PrenotazioneOp();
    }
}

