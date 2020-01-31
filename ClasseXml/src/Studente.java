import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Studente
{
    private String nome;
    private String cognome;
    private int votoStoria;
    private int votoInformatica;
    private int votoMatematica;

    public Studente() {}

    public Studente(String nome, String cognome, int votoStoria, int votoInformatica, int votoMatematica)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.votoStoria = votoStoria;
        this.votoInformatica = votoInformatica;
        this.votoMatematica = votoMatematica;
    }

    public String getNome() { return nome; }
    @XmlElement
    public void setNome(String nome) { this.nome = nome; }

    public String getCognome() { return cognome; }
    @XmlElement
    public void setCognome(String cognome) { this.cognome = cognome; }

    public int getVotoStoria() { return votoStoria; }
    @XmlAttribute
    public void setVotoStoria(int votoStoria) { this.votoStoria = votoStoria; }

    public int getVotoInformatica() { return votoInformatica; }
    @XmlAttribute
    public void setVotoInformatica(int votoInformatica) { this.votoInformatica = votoInformatica; }

    public int getVotoMatematica() { return votoMatematica; }
    @XmlAttribute
    public void setVotoMatematica(int votoMatematica) { this.votoMatematica = votoMatematica; }

}
