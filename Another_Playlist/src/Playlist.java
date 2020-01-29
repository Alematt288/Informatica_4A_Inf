import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Playlist
{
    public static final String PATH = "G:\\Another_Playlist\\play.xml";
    private List<Brano> playlist;

    public Playlist()
    {
        super();
        playlist = new ArrayList<Brano>();
    }

    public void addSong(Brano brano)
    {
        playlist.add(brano);
    }

    public List<Brano> getPlaylist()
    {
        return playlist;
    }

    @XmlElement
    public void setPlaylist(List<Brano> playlist)
    {
        this.playlist = playlist;
    }

    @Override
    public String toString()
    {
        return "Playlist [ " + playlist + "]";
    }

    public String toXml()
    {
        String xml = "";
        for(Brano brano : this.playlist)
        {
            xml += brano.toXml();
        }
        xml = "<percorso>\n" + xml + "</percorso>";
        return xml;
    }

    public void scriviXml()
    {
        BufferedWriter bw = null;
        try
        {
            bw = new BufferedWriter(new FileWriter(PATH));
            bw.write(this.toXml());
            System.out.println(this.toXml());

            bw.flush();
            bw.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void marshallingXml()
    {
        try
        {
            File file = new File(Playlist.PATH);
            JAXBContext jc = JAXBContext.newInstance(Playlist.class);
            Marshaller jaxbMarshaller = jc.createMarshaller();

            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(this, file);
            jaxbMarshaller.marshal(this, System.out);
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }

    private void simulazione()
    {
        Brano a = new Brano("Memories", "Maroon 5", 180);
        this.addSong(a);
        Brano b = new Brano("Happier", "Marshmello", 200);
        this.addSong(b);
        Brano c = new Brano("Goodbye", "Post Malone", 150);
        this.addSong(c);
    }

    public static void main(String[] args)
    {
        Playlist playlist = new Playlist();

        playlist.simulazione();
        //percorso.scriviXml();
        playlist.marshallingXml();
        //percorso.unmarshallingXml();
    }

    public void caricaTabella(DefaultTableModel tableModelBrani)
    {
        for (Brano brano : this.playlist)
        {
            tableModelBrani.addRow(new Object[]{brano.getTitolo(), brano.getAutore(), brano.getDurata()});
        }
    }
}
