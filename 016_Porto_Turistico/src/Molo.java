public class Molo
{
    private Barca elencoBarche[];
    private static int cntBarche;
    public static final int MAX_BARCHE = 100;
    InputOutputUtility t;

    public Molo(int cntBarche)
    {
        this.cntBarche = cntBarche;

        elencoBarche = new Barca[MAX_BARCHE];
        t = new InputOutputUtility();
    }

    public Molo(Barca[] elencoBarche)
    {
        super();
        this.elencoBarche = elencoBarche;
    }

    public void addBarca() throws MoloPienoException
    {
        if (cntBarche + 1 > MAX_BARCHE)
        {
            throw new MoloPienoException(1, "Porto pieno: nave merci non accettata.");
        }

        Nave.caricaNave(elencoNavi, cntNavi, t);
        this.cntNavi++;
    }
}
