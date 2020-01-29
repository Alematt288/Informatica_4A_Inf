import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Brano
{
    private String titolo;
    private String autore;
    private int durata;

    public Brano(String titolo, String autore, int durata)
    {
        super();
        this.titolo = titolo;
        autore = autore;
        this.durata = durata;
    }

    @XmlElement
    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }

    @XmlAttribute
    public String getAutore() { return autore; }
    public void setAutore(String autore) { autore = autore; }

    @XmlAttribute
    public int getDurata() { return durata; }
    public void setDurata(int durata) { this.durata = durata; }

    @Override
    public String toString()
    {
        return "Brano { " +
                "Titolo: " + titolo + '\'' +
                ", Autore: '" + autore + '\'' +
                ", Durata: " + durata +
                '}';
    }

    public String toXml()
    {
        return  "\t<brano: \""+ titolo + "\">\n" +
                "\t\t<autore>" + autore + "</autore>\n" +
                "\t\t<durata>" + durata + "</durata>\n"+
                "\t</brano>\n";
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        Brano other = (Brano) obj;

        if (autore != other.autore)
        {
            return false;
        }
        if (durata != other.durata)
        {
            return false;
        }
        if (titolo == null)
        {
            if (other.titolo != null)
            {
                return false;
            }
        }
        else if (!titolo.equals(other.titolo))
        {
            return false;
        }
        return true;
    }
}
