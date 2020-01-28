import javax.xml.bind.annotation.XmlAttribute;

public class Brano
{
    private String Titolo;
    private String Autore;
    private int durata;

    @XmlAttribute
    public String getTitolo() { return Titolo; }
    public void setTitolo(String titolo) { Titolo = titolo; }

    @XmlAttribute
    public String getAutore() { return Autore; }
    public void setAutore(String autore) { Autore = autore; }

    @XmlAttribute
    public int getDurata() { return durata; }
    public void setDurata(int durata) { this.durata = durata; }
}
