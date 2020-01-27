import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "Brano")

public class Writer
{
    ArrayList listaBrani;

    public void setListaBrani(ArrayList brani)
    {
        this.listaBrani = brani;
    }

    @XmlElement(name = "brano")
    public ArrayList getListaBrani()
    {
        return listaBrani;
    }
}
