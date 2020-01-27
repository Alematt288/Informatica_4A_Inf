package it.itis.cuneo;

public class Patrimonio
{
    public static final int MAX_ABITAZIONI = 10;
    private Abitazione elencoAbitazioni[];
    private static int cntAbitazioni;
    InputOutputUtility read;


    public Patrimonio() { }

    public Patrimonio(int cntAbitazioni)
    {
        super();
        this.cntAbitazioni = cntAbitazioni;

        elencoAbitazioni = new Abitazione[MAX_ABITAZIONI];
        read = new InputOutputUtility();
    }

    public void addAbitazione() throws PatrimonioPienoException
    {
        if(cntAbitazioni > MAX_ABITAZIONI)
        {
            throw new PatrimonioPienoException(1, "\nTroppe abitazioni!");
        }
        Abitazione.caricaAbitazione(elencoAbitazioni, cntAbitazioni, read);
        this.cntAbitazioni++;
    }

    public String toString()
    {
        String s = "";
        int cnt;

        for(cnt = 0; cnt < this.cntAbitazioni; cnt++)
        {
            Abitazione abitazione = elencoAbitazioni[cnt];

            if (abitazione.getTipoAbitazione() == Abitazione.APPARTAMENTO)
            {
                s = s + "Numero abitazione: " + cnt + ", " + ((Appartamento)abitazione).toString() + "\n";
            }
            else
            {
                s = s + "NumeroAbitazione: " + cnt + ", " + ((Villa)abitazione).toString() + "\n";
            }
        }
        return s;
    }
}
