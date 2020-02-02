import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@XmlRootElement
public class Hotel
{
    public static final String PATH_FILE_WRITE = "C:\\Users\\asus\\Desktop\\Hotel\\Hotel.xml";
    public static final String PATH_FILE = "C:\\Users\\asus\\Desktop\\Hotel\\Hotel.xml";
    public static final String SEPARATOR = ";";
    public static final String PATH_CSV = "C:\\Users\\asus\\Desktop\\Hotel\\HotelCSV.csv";

    private String name;
    private List<Camera> lCamera;

    /////////////////////////////////////////////////////

    public Hotel()
    {
        this.name="";
        this.lCamera = new ArrayList<Camera>();
    }

    public String getName()
    {
        return name;
    }

    @XmlAttribute
    public void setName(String name)
    {
        this.name = name;
    }

    public List<Camera> getlCamera()
    {
        return lCamera;
    }

    @XmlElement(name = "allievo")
    public void setlCamera(List<Camera> lCamera)
    {
        this.lCamera = lCamera;
    }

    /////////////////////////////////////////////////////

    public void unMarshallXml()
    {
        try
        {
            File file = new File(PATH_FILE_WRITE);
            JAXBContext jaxbContext = JAXBContext.newInstance(Hotel.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Hotel hotel = (Hotel)jaxbUnmarshaller.unmarshal(file);

            System.out.println(hotel.toString());
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }

    public void marshallXml()
    {
        File file = new File(PATH_FILE);
        try
        {
            JAXBContext jaxbContext = JAXBContext.newInstance(Hotel.class);

            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(this, file);

            jaxbMarshaller.marshal(this, System.out);
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }

    /////////////////////////////////////////////////////

    @Override
    public String toString()
    {
        return "Hotel {" +
                "Nome: " + name + '\'' +
                ", Lista Camere: " + lCamera +
                '}';
    }

    /////////////////////////////////////////////////////

    public void addCamera(Camera allievo){
        this.lCamera.add(allievo);
    }

    /////////////////////////////////////////////////////

    public void simula()
    {
        //public Allievo(String cognome, String nome, String votoInformatica, String votoMatematica, String votoStoria)
        Camera camera1 = new Camera("1", "si", "mare", "2");
        this.addCamera(camera1);
        Camera camera2 = new Camera("2", "si", "citta'", "4");
        this.addCamera(camera2);
        Camera camera3 = new Camera("3", "si", "campagna", "2");
        this.addCamera(camera3);
        Camera camera4 = new Camera("Special", "si", "spazio", "10");
        this.addCamera(camera4);

    }

    /////////////////////////////////////////////////////

    public void salvaCSV()
    {
        String str = "";
        BufferedWriter bw;

        try
        {
            bw = new BufferedWriter(new FileWriter(PATH_CSV));

            for(int cntCamere = 0; cntCamere < this.lCamera.size(); cntCamere++)
            {
                Camera camera = this.lCamera.get(cntCamere);
                bw.write(camera.toRowCSV());
            }

            bw.close();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /////////////////////////////////////////////////////

    public static void main(String[] args)
    {
        Hotel hotel = new Hotel();
        hotel.simula();
        hotel.marshallXml();

        hotel.salvaCSV();
    }
}
