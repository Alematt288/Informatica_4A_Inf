import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Forza4 extends JFrame implements ActionListener
{
    private JButton[][] tabellone = new JButton[4][4];

    JButton start;
    public static final String FILE_PATH = "C:\\Users\\asus\\Desktop\\Forza_4";

    private int y = 0;
    private int cC = 0;
    private int cD = 0;
    private int cR = 0;

    public static final String G = "G";
    public static final String R = "R";

    public Forza4()
    {
        this.setSize(500, 500);
        this.setTitle("Forza 4");
        this.setResizable(false);
        this.initComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(2);
    }

    private void initComponents()
    {
        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(4, 4));
        grid.setBackground(Color.LIGHT_GRAY);

        for(int r = 0; r < 4; r++)
        {
            for(int c = 0; c < 4; c++)
            {
                this.tabellone[r][c] = new JButton();
                this.tabellone[r][c].setText("");
                this.tabellone[r][c].setBackground(Color.WHITE);

                if (r == 3)
                {
                    this.tabellone[r][c].setEnabled(true);
                }
                else
                {
                    this.tabellone[r][c].setEnabled(false);
                }

                grid.add(this.tabellone[r][c]);
                this.tabellone[r][c].addActionListener(this);
            }
        }

        this.add(grid);
        JPanel sPanel = new JPanel();
        this.start = new JButton("Gioca");
        sPanel.add(this.start);

        this.start.addActionListener(this);
        this.add(sPanel, "South");
    }

    public void actionPerformed(ActionEvent actionEvent)
    {
        if (actionEvent.getSource() == this.start)
        {
            this.newGame();
        }

        for(int r = 0; r < 4; r++)
        {
            for(int c = 0; c < 4; c++)
            {
                if (this.y % 2 == 0)
                {
                    if (actionEvent.getSource() == this.tabellone[r][c])
                    {
                        this.toggle(this.tabellone[r][c]);
                        this.tabellone[r][c].setEnabled(false);
                        this.y++;

                        if (r - 1 >= 0)
                        {
                            this.tabellone[r - 1][c].setEnabled(true);
                        }

                        this.ControlloRiga();
                        this.ControlloColonna();
                        this.ControlloDiagonale1();
                        this.ControlloDiagonale2();
                        this.EndGame();
                    }
                }
                else
                {
                    this.computer();
                }
            }
        }
    }

    private void computer()
    {
        boolean g = false;

        while(!g)
        {
            Random rand = new Random();

            int r = rand.nextInt(4);
            int c = rand.nextInt(4);

            if (this.tabellone[r][c].getText().equalsIgnoreCase("") && this.tabellone[r][c].isEnabled())
            {
                this.toggle(this.tabellone[r][c]);

                if (r - 1 >= 0)
                {
                    this.tabellone[r - 1][c].setEnabled(true);
                }

                this.tabellone[r][c].setEnabled(false);
                this.y++;

                this.ControlloRiga();
                this.ControlloColonna();
                this.ControlloDiagonale1();
                this.ControlloDiagonale2();
                this.EndGame();

                g = true;
            }
        }
    }

    public void toggle(JButton jButton)
    {
        String t = "";
        if (this.y % 2 == 0)
        {
            t = "Y";
            jButton.setBackground(Color.YELLOW);
        }
        else
            {
                t = "R";
                jButton.setBackground(Color.RED);
            }
        jButton.setText(t);
    }

    public void EndGame()
    {
        int cnt = 0;

        for(int r = 0; r < 4; r++)
        {
            for(int c = 0; c < 4; c++)
            {
                if (this.tabellone[r][c].getText().equalsIgnoreCase("Y") || this.tabellone[r][c].getText().equalsIgnoreCase("R"))
                {
                    cnt++;
                }
            }
        }
        if (cnt == 16)
        {
            this.Winner("- Pareggio -");
        }
    }

    public void Winner(String winner)
    {
        JOptionPane.showMessageDialog(this, winner);
        this.salva(winner);
        this.newGame();
    }

    public void newGame()
    {
        for(int r = 0; r < 4; r++)
        {
            for(int c = 0; c < 4; c++)
            {
                this.tabellone[r][c].setBackground(Color.WHITE);
                this.tabellone[r][c].setText("");

                if (r == 3)
                {
                    this.tabellone[r][c].setEnabled(true);
                }
                else
                {
                    this.tabellone[r][c].setEnabled(false);
                }
            }
        }
        this.y = 0;
    }

    public void ControlloColonna()
    {
        for(int c = 0; c < 4; c++)
        {
            this.cC = 0;

            for(int r = 0; r < 4; ++r)
            {
                if (this.tabellone[r][c].getText().equalsIgnoreCase("R"))
                {
                    this.cC++;
                }

                if (this.tabellone[r][c].getText().equalsIgnoreCase("G"))
                {
                    this.cC--;
                }
            }

            if (this.cC == 4)
            {
                this.Winner("Vincitore: Giocatore Rosso (colonna" + (c + 1) + ")");
            }

            if (this.cC == -4)
            {
                this.Winner("Vincitore: Giocatore Giallo (colonna " + (c + 1) + ")");
            }
        }
    }

    public void ControlloRiga()
    {
        for(int r = 0; r < 4; r++)
        {
            this.cR = 0;

            for(int c = 0; c < 4; c++)
            {
                if (this.tabellone[r][c].getText().equalsIgnoreCase("R"))
                {
                    this.cR++;
                }

                if (this.tabellone[r][c].getText().equalsIgnoreCase("Y"))
                {
                    this.cR--;
                }
            }

            if (this.cR == 4)
            {
                this.Winner("Vincitore: Giocatore Rosso (riga" + (3 - r + 1) + ")");
            }

            if (this.cR == -4)
            {
                this.Winner("Vincitore: Giocatore Giallo (riga " + (3 - r + 1) + ")");
            }
        }
    }

    public void ControlloDiagonale1()
    {
        this.cD = 0;

        for(int r = 0; r < 4; r++)
        {
            for(int c = 0; c < 4; c++)
            {
                if (this.tabellone[r][c].getText().equalsIgnoreCase("R") && r == c)
                {
                    this.cD++;
                }

                if (this.tabellone[r][c].getText().equalsIgnoreCase("Y") && r == c)
                {
                    this.cD--;
                }
            }

            if (this.cD == 4)
            {
                this.Winner("Vincitore: Giocatore Rosso(diagonale)");
            }

            if (this.cD == -4)
            {
                this.Winner("Vincitore: Giocatore Giallo(diagonale)");
            }
        }

    }

    private void ControlloDiagonale2()
    {
        this.cD = 0;

        for(int r = 0; r < 4; r++)
        {
            for(int c = 0; c < 4; c++)
            {
                if (this.tabellone[r][c].getText().equalsIgnoreCase("R") && r + c == 3)
                {
                    this.cD++;
                }

                if (this.tabellone[r][c].getText().equalsIgnoreCase("G") && r + c == 3) {
                    this.cD--;
                }
            }

            if (this.cD == 4)
            {
                this.Winner("Vincitore: Giocatore Rosso(diagonale)");
            }

            if (this.cD == -4)
            {
                this.Winner("Vincitore: Giocatore Rosso(diagonale)");
            }
        }

    }

    public void salva(String x)
    {
        String str = "";

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

        str = str + sdf.format(calendar.getTime()) + "\n";
        str = str + x.toUpperCase() + "\n";

        try
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\asus\\Desktop\\Forza_4\\game.txt", true));

            for(int r = 0; r < 4; r++)
            {
                for(int c = 0; c < 4; c++)
                {
                    String btnText = this.tabellone[r][c].getText();
                    if (btnText.equals(""))
                    {
                        btnText = "-";
                    }
                    str = str + btnText + " ";
                }
                str = str + "\n";
            }

            str = str + "\n";
            bw.write(str);
            bw.close();
        }
        catch (IOException v)
        {
            v.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        new Forza4();
    }
}