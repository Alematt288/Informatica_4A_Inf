import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "brano")
public class Brano
{
    private String titolo;
    private String autore;

    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }
    public String getAutore() { return autore; }
    public void setAutore(String autore) { this.autore = autore; }
}