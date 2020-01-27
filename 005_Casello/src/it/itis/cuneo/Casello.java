package it.itis.cuneo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Casello
{
    private String identifier;
    private Calendar dataEntrata;
    private Calendar dataUscita;        //Calendar ha anche ore, minuti e secondi.


    public void setDataEntrata(Calendar dataEntrata)
    {
        this.dataEntrata = dataEntrata;
    }

    public Calendar getDataEntrata()
    {
        return dataEntrata;
    }

    public void setDataUscita(Calendar dataUscita)
    {
        this.dataUscita = dataUscita;
    }

    public Calendar getDataUscita()
    {
        return dataUscita;
    }

    public Casello(Calendar dataEntrata, Calendar dataUscita)
    {
        this.dataEntrata = dataEntrata;
        this.dataUscita = dataUscita;
    }

    public void setIdentifier(String identifier)
    {
        this.identifier = identifier;
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public Casello(String identifier, Calendar dataEntrata, Calendar dataUscita)
    {
        this.identifier = identifier;
        this.dataEntrata = dataEntrata;
        this.dataUscita = dataUscita;
    }

    public Casello() {}                                                   //La calendar non usa il costruttore.

    public Casello(Casello casello)
    {
        this.identifier = new String(casello.getIdentifier());

        /////////////////////////////////////
                                                                          // 01/01/1970, L'istanza creata ha questa data di default.
        Calendar cDataEntrata = Calendar.getInstance();
        cDataEntrata.setTime(casello.getDataEntrata().getTime());

        this.dataEntrata = cDataEntrata;

        /////////////////////////////////////

        Calendar cDataUscita = Calendar.getInstance();                    // Stiamo chiamando il metodo getInstance.
        cDataUscita.setTime(casello.getDataUscita().getTime());

        this.dataUscita = cDataUscita;
    }

    public static void main(String[] args)
    {
        final String FORMATO_DMY_HMS = "dd/MM/yyyy HH:mm:ss";             //cast Stringa -> Data (SimpleDateFormat)
        String strDataPartenza = "29/08/2002 13:30:40";                   //Es.     23/10/2019   09:25:43
                                                                          //Pattern dd/MM/yyyy   HH:mm:ss
                                                                          //pattern: formato della data input, rappresentato in una stringa.
        Calendar cDataEntrata = Calendar.getInstance();

        SimpleDateFormat sdfHH = new SimpleDateFormat(FORMATO_DMY_HMS);
                                                                          //Parsificare una stringa secondo un formato,
                                                                          //permette di ottenere una variabile di altro tipo.
        Date dataPartenza = null;

        try                                                               //Si usano quando qualcosa va "male", si passa alla catch quando c'è un errore.
        {                                                                 //Sono dei controlli.
            dataPartenza = sdfHH.parse(strDataPartenza);                  //Questa è la throw.
        }

        catch (ParseException e)
        {
            e.printStackTrace();                                          //Errore nel formato della stringa
        }                                                                 //Viene stampato uno stackTrace: una traccia dello stack, è l'elenco delle chiamate ai metodi
                                                                          //L'eccezione è una anomalia software che si verifica quando il codice genera un errore in tempo di esecuzione.
                                                                          //ParseException: la stringa non rispetta il formato atteso.
        cDataEntrata.setTime(dataPartenza);
                                                                          //Calendar mantiene il numero di secondi dal 01/01/1970
        //System.out.println("cDataEntrata: " + cDataEntrata);

                                                                          //Formattare la data in Output, SimpleDateFormat(Date)
        String strData = sdfHH.format(dataPartenza);
        System.out.println("cDataEntrata: " + strData);

        //Casello casello1 = new Casello();


        ////////////////////////////////////////////////////////


        String strDataArrivo = "29/08/2002 19:25:32";

        Calendar cDataUscita = Calendar.getInstance();

        Date dataArrivo = null;

        try
        {
            dataArrivo = sdfHH.parse(strDataArrivo);
        }

        catch (ParseException e)
        {
            e.printStackTrace();
        }

        cDataUscita.setTime(dataArrivo);

        //System.out.println("cDataUscita: " + cDataUscita);

        String strData2 = sdfHH.format(dataArrivo);
        System.out.println("cDataUscita: " + strData2);

        ////////////////////////////////////////////////////////
    }
}
