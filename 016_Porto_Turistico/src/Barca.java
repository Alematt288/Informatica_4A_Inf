public class Barca
{
    String nome;
    String nazionalità;
    float lunghezza;
    float stazza;
    public static int VELA;
    public static int MOTORE;

    public Barca() { }

    public Barca(String nome, String nazionalità, float lunghezza, float stazza)
    {
        this.nome = nome;
        this.nazionalità = nazionalità;
        this.lunghezza = lunghezza;
        this.stazza = stazza;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getNazionalità() { return nazionalità; }
    public void setNazionalità(String nazionalità) { this.nazionalità = nazionalità; }
    public float getLunghezza() { return lunghezza; }
    public void setLunghezza(float lunghezza) { this.lunghezza = lunghezza; }
    public float getStazza() { return stazza; }
    public void setStazza(float stazza) { this.stazza = stazza; }

    @Override
    public String toString()
    {
        return "Barca {" +
                "nome ='" + nome + '\'' +
                ", nazionalità ='" + nazionalità + '\'' +
                ", lunghezza =" + lunghezza +
                ", stazza =" + stazza +
                '}';
    }
}
