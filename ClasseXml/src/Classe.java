import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class Classe
{
    public static final String PATH = "G:\\ClasseXml\\classe.xml";
    private List<Studente> lStudenti;

    public Classe()
    {
        super();
        lStudenti = new ArrayList<Studente>();
    }

    public void unmarshallingXml()
    {
        try
        {
            File file = new File(Classe.PATH);
            JAXBContext jaxbContext = JAXBContext.newInstance(Classe.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Classe classe = (Classe) jaxbUnmarshaller.unmarshal(file);

            System.out.println(classe);

        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        Classe classe = new Classe();

        classe.unmarshallingXml();
    }
}
