package it.itis.cuneo;

public class Scatola
{
    public static final int MAX_BOTTIGLIE = 5;
    private Bottiglia[] vBottiglie;
    private int cntBottiglia;

    public Scatola()
    {
        vBottiglie = new Bottiglia[MAX_BOTTIGLIE];
        cntBottiglia = 0;
    }

    public void addBottiglia(Bottiglia bottiglia) throws ScatolaPienaException
    {
        if(cntBottiglia + 1 > MAX_BOTTIGLIE)
        {
            throw new ScatolaPienaException(1, "Troppe bottiglie!");
        }
        vBottiglie[cntBottiglia] = bottiglia;
        cntBottiglia++;
    }

    public String toString(Scatola scatola)
    {
        for(cntBottiglia = 0; cntBottiglia < MAX_BOTTIGLIE; cntBottiglia++)
        {
            System.out.println(scatola.vBottiglie[cntBottiglia]);
        }
        return "Ecco le bottiglie nella scatola.";
    }

    public static void main(String[] args)
    {
        Bottiglia bottiglia1 = new Bottiglia("Coca-Cola", "The Coca-Cola Company", "1", InputOutputUtility.convertiDataOraToCalendar("13/11/2019", InputOutputUtility.dfDay));
        Bottiglia bottiglia2 = new Bottiglia("Fanta", "The Coca-Cola Company", "2", InputOutputUtility.convertiDataOraToCalendar("15/12/2019", InputOutputUtility.dfDay));
        Bottiglia bottiglia3 = new Bottiglia("Sprite", "The Coca-Cola Company", "3", InputOutputUtility.convertiDataOraToCalendar("15/11/2019", InputOutputUtility.dfDay));
        Bottiglia bottiglia4 = new Bottiglia("Aranciata San Pellegrino", "SanPellegrino", "4", InputOutputUtility.convertiDataOraToCalendar("13/09/2020", InputOutputUtility.dfDay));
        Bottiglia bottiglia5 = new Bottiglia("Limonata", "SanPellegrino", "5", InputOutputUtility.convertiDataOraToCalendar("10/11/2019", InputOutputUtility.dfDay));

        Scatola scatola = new Scatola();

        try
        {
            scatola.addBottiglia(bottiglia1);
            scatola.addBottiglia(bottiglia2);
            scatola.addBottiglia(bottiglia3);
            scatola.addBottiglia(bottiglia4);
            scatola.addBottiglia(bottiglia5);
        }
        catch(ScatolaPienaException e)
        {
            e.printStackTrace();
        }

        System.out.println(scatola.toString(scatola));
    }
}
