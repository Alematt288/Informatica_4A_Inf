import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class MP3
{
    public static final String PATH_NAME = ""
    public static void main(String[] args)
    {
        try
        {
            Playlist playlist = new Playlist();

            Brano a = new Brano();

            a.setAutore("Marshmello");
            a.setTitolo("Happier");
            a.setDurata(180);

            Brano b = new Brano();

            a.setAutore("Imagine Dragons");
            a.setTitolo("Believer");
            a.setDurata(200);

            Brano c = new Brano();

            a.setAutore("Maroon 5");
            a.setTitolo("Memories");
            a.setDurata(170);

            playlist.add(a);
            playlist.add(b);
            playlist.add(c);

            ////////////////////////////////////

            File file = new File()
        }
        catch(JAXBException e)
        {
            e.printStackTrace();
        }
    }
}
