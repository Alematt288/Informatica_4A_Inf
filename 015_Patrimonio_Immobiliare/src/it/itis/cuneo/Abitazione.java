package it.itis.cuneo;

public class Abitazione
{
    public static final int VILLA = 0;
    public static final int APPARTAMENTO = 1;

    private int tipoAbitazione;
    private int nStanze;
    private float superficie;
    private String indirizzo;
    private String città;

    public Abitazione() { }

    public Abitazione(int nStanze, float superficie, String indirizzo, String città, int posizioneElenco, int tipoAbitazione)
    {
        this.nStanze = nStanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.città = città;
        this.tipoAbitazione = tipoAbitazione;
    }

    public int getTipoAbitazione() { return tipoAbitazione; }
    public void setTipoAbitazione(int tipoAbitazione) { this.tipoAbitazione = tipoAbitazione; }
    public int getnStanze() { return nStanze; }
    public void setnStanze(int nStanze) { this.nStanze = nStanze; }
    public float getSuperficie() { return superficie; }
    public void setSuperficie(float superficie) { this.superficie = superficie; }
    public String getIndirizzo() { return indirizzo; }
    public void setIndirizzo(String indirizzo) { this.indirizzo = indirizzo; }
    public String getCittà() { return città; }
    public void setCittà(String città) { this.città = città; }

    public static void caricaAbitazione(Abitazione ElencoAbitazioni[], int cnt, InputOutputUtility read)
    {
        int abitazione;

        System.out.println("Inserisci i dati riguardanti l'abitazione: \n");

        do {
            System.out.println("Inserisci il tipo di Abitazione: 1. Appartamento / 0. Villa");

            abitazione = read.leggiNumero();

        }while(abitazione < 0 || abitazione > 1);

        if(abitazione == Abitazione.APPARTAMENTO)
        {
            System.out.println("\nInformazioni aggiuntive sull'appartamento: ");
            ElencoAbitazioni[cnt] = new Appartamento();

            Appartamento.creaAbitazione(ElencoAbitazioni, cnt, read);
        }

        else
        {
            ElencoAbitazioni[cnt] = new Villa();
            System.out.println("\nInformazioni aggiuntive sulla villa: ");

            Villa.creaAbitazione(ElencoAbitazioni, cnt, read);

        }

        ElencoAbitazioni[cnt].setTipoAbitazione(abitazione);

        System.out.println("Numero stanze: ");
        ElencoAbitazioni[cnt].setnStanze(read.leggiNumero());

        System.out.println("Superficie: ");
        ElencoAbitazioni[cnt].setSuperficie(read.leggiNumeroFloat());

        System.out.println("Indirizzo: ");
        ElencoAbitazioni[cnt].setIndirizzo(read.leggiNome());

        System.out.println("Citta':");
        ElencoAbitazioni[cnt].setCittà(read.leggiNome());
    }

    @Override
    public String toString()
    {
        return "{ " +
                "tipoAbitazione: " + tipoAbitazione +
                ", nStanze: " + nStanze +
                ", Superficie: " + superficie +
                ", Indirizzo: '" + indirizzo + '\'' +
                ", Citta':'" + città + '\'' +
                '}';
    }
}
