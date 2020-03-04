public class Prenotazione
{
    private String cognome;
    private String nome;
    private String telefono;
    private String cittaP;
    private String cittaD;
    private String data;

    public Prenotazione(String cognome, String nome, String telefono, String cittaP, String cittaD, String data)
    {
        this.cognome = cognome;
        this.nome = nome;
        this.telefono = telefono;
        this.cittaP = cittaP;
        this.cittaD = cittaD;
        this.data = data;
    }

    public String getCognome() { return cognome; }
    public void setCognome(String cognome) { this.cognome = cognome; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getCittaP() { return cittaP; }
    public void setCittaP(String cittaP) { this.cittaP = cittaP; }

    public String getCittaD() { return cittaD; }
    public void setCittaD(String cittaD) { this.cittaD = cittaD; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    @Override
    public String toString() {
        return "{" +
                "cognome: " + cognome + '\'' +
                ", nome: " + nome + '\'' +
                ", telefono: " + telefono + '\'' +
                ", citta' di partenza: " + cittaP + '\'' +
                ", citta' di destinazione: " + cittaD + '\'' +
                ", data: " + data + '\'' +
                '}';
    }
}
