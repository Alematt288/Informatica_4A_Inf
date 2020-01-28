import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "Playlist")
public class Playlist extends ArrayList<Brano>
{
    public List<Brano> getLista() { return this; }

    @XmlElement(name = "Brano")
    public void setLista(List<Brano> list)
    {
        this.clear();
        this.addAll(list);
    }
}
