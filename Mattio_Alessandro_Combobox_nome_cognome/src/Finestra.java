import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Finestra extends JFrame implements ActionListener, ListSelectionListener
{
    JLabel cognome;
    JLabel nome;
    JTextField tCognome;
    JTextField tNome;
    JButton aggiungi;

    DefaultListModel models;
    JList<String> names;

    JComboBox<String> comboName;
    DefaultComboBoxModel comboModel;

    ArrayList<String> aNomi;

    public Finestra()
    {
        aNomi = new ArrayList<String>();
        setSize(700,170);
        setTitle("Nome e Cognome");

        initComponent();
        setResizable(false);

        setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void initComponent()
    {
        JPanel nomeCognome = new JPanel();
        nomeCognome.setLayout(new FlowLayout());

        cognome = new JLabel("Cognome: ");
        nomeCognome.add(cognome);
        tCognome = new JTextField(20);
        nomeCognome.add(tCognome);

        nome = new JLabel("Nome: ");
        nomeCognome.add(nome);
        tNome = new JTextField(20);
        nomeCognome.add(tNome);

        aggiungi = new JButton("Aggiungi");
        nomeCognome.add(aggiungi);
        aggiungi.addActionListener(this);

        JPanel listCombo = new JPanel();
        listCombo.setLayout(null);

        models = new DefaultListModel();
        names = new JList<String>(models);

        JScrollPane lista = new JScrollPane(names);
        lista.setBounds(100,50,200,30);
        listCombo.add(lista);

        comboModel = new DefaultComboBoxModel();
        comboName = new JComboBox<String>(comboModel);

        JScrollPane box = new JScrollPane(comboName);
        box.setBounds(350,50,200,30);
        listCombo.add(box);

        this.add(BorderLayout.NORTH, nomeCognome);
        this.add(BorderLayout.CENTER, listCombo);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent)
    {
        if(actionEvent.getSource().equals(aggiungi))
        {
            String info = tCognome.getText() + " " + tNome.getText();
            models.addElement(info);
            comboModel.addElement(info);
            tCognome.setText("");
            tNome.setText("");
            aNomi.add(info);
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent listSelectionEvent) { }

    public static void main(String[] args)
    {
        Finestra finestra = new Finestra();
    }
}