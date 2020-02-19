import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Esempio extends JFrame implements ActionListener
{
    public Esempio()
    {
        this.setTitle("Finestra");
        this.setSize(200, 200);
        this.initComponets();
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
    }

    private void initComponets()
    {
        Container container = this.getContentPane();
        JPanel centerPanel = new JPanel();

        BoxLayout centerPanelLayout = new BoxLayout(centerPanel, 1);
        centerPanel.setLayout(centerPanelLayout);

        JButton button = new JButton("button");
        button.setAlignmentX(0.5F);

        JButton shortButton = new JButton("short");
        shortButton.setAlignmentX(0.5F);

        JButton longButton = new JButton("long-long-long button");
        longButton.setAlignmentX(0.5F);

        centerPanel.add(button);
        centerPanel.add(shortButton);
        centerPanel.add(longButton);

        JPanel sPanel = new JPanel();

        JButton okButton = new JButton("Ok");
        JButton deleteButton = new JButton("Delete");

        sPanel.add(okButton);
        sPanel.add(deleteButton);

        container.add(sPanel, "South");
        container.add(centerPanel);
    }

    public void actionPerformed(ActionEvent e) { }

    public static void main(String[] args) {
        new Esempio();
    }
}