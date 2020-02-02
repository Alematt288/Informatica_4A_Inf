import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class Camera
{
    private String bagno;
    private String nome;
    private String letto;
    private String vista;

    public Camera() {}

    /////////////////////////////////////////////////////

    public String getBagno() {
        return bagno;
    }

    @XmlAttribute
    public void setBagno(String bagno) {
        this.bagno = bagno;
    }

    public String getNome() {
        return nome;
    }

    @XmlAttribute
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLetto() {
        return letto;
    }

    @XmlElement
    public void setLetto(String letto) {
        this.letto = letto;
    }

    public String getVista() {
        return vista;
    }

    @XmlElement
    public void setVista(String vista) {
        this.vista = vista;
    }

    /////////////////////////////////////////////////////

    public Camera(String nome, String bagno, String vista, String letto)
    {
        this.bagno = bagno;
        this.nome = nome;
        this.letto = letto;
        this.vista = vista;
    }

    @Override
    public String toString()
    {
        return "Camera {" +
                "Nome: " + nome + '\'' +
                ", Bagno: " + bagno + '\'' +
                ", Vista: " + vista + '\'' +
                ", Letto:  " + letto + '\'' +
                '\'';
    }

    public String toRowCSV()
    {
        return "Camera" +
                Hotel.SEPARATOR + nome +
                Hotel.SEPARATOR + bagno +
                Hotel.SEPARATOR + vista +
                Hotel.SEPARATOR + letto + "\n";
    }

}
