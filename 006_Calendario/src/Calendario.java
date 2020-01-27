import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Calendario
{
    public Calendario() { }

    public static void main(String[] args)
    {
        System.out.println("Oggi 1: " + new Date());

        Date dOggi = new Date();
        System.out.println("oggi 2: " + dOggi);

        String strData = InputOutputUtility.leggiNome("Inserisci la data (dd/mm/yyyy): ");
        System.out.println("Data inserita: " + strData);

        Date dataTastiera = null;

        try
        {
            dataTastiera = InputOutputUtility.dfDay.parse(strData);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

        Calendar cData = Calendar.getInstance();
        cData.setTime(dataTastiera);

        //Calendar cData2 = InputOutputUtility.convertiDataOraToCalendar(strData, InputOutputUtility.dfDay);
    }
}
