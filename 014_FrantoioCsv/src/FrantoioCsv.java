import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FrantoioCsv
{

    public static final String FILE_PATH = "C:\\Users\\d.claudio.borgogno\\IdeaProjects\\13FrantoioCsv\\db\\";
    public static final String FILE_NAME = "frantoio.csv";
    public static final String SEPARATOR = ",";

    private String linea;
    private BufferedWriter bufferedWriter;
    private BufferedReader bufferedReader;

    public ArrayList<Oliva> leggiFile(){
        //List<Oliva> lOliva = new LinkedList<Oliva>();
        //List<Oliva> lOliva = new ArrayList<Oliva>();
        ArrayList<Oliva> lOliva = new ArrayList<Oliva>();

        try
        {
            //OpenFile
            //Buffer: area di MC, che contiene una piccola porzione del grande file
            bufferedReader = new BufferedReader(new FileReader(new File(FrantoioCsv.FILE_PATH + FrantoioCsv.FILE_NAME)));

            //bufferedReader.readLine() se null -> sono arrivato a eof
            while((linea=bufferedReader.readLine())!= null)
            {
                //linea contiene un formato riga csv, così definito:
                // codiceOliva, coloreOliva, maturazioneOliva, dataRaccolta
                Oliva oliva = new Oliva();
                oliva.caricaDaCsv(linea);

                lOliva.add(oliva);
            }


        }
        catch (FileNotFoundException e)
        {
            //Rilanciata in fase di apertura se non trova il nome file
            e.printStackTrace();
        }
        catch (IOException e)
        {
            //Rilanciata in fase di lettura, se il file è bloccato
            e.printStackTrace();
        }
        finally
        {
            //CloseFile
            if(bufferedReader!=null)
            {
                //FileReader e File vengono distrutti dal garbage collector
                // perchè dipendenze da bufferedReader
                bufferedReader=null;
            }
        }

        return lOliva;
    }

    public int scriveFile(ArrayList<Oliva> aOliva)
    {
        try
        {
            bufferedWriter = new BufferedWriter(new FileWriter(new File(FrantoioCsv.FILE_PATH + FrantoioCsv.FILE_NAME)));

            for(Oliva oliva: aOliva)
            {
                linea = oliva.generaRigaCsv();
                bufferedWriter.write(linea);
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            if(bufferedWriter != null)
            {
                bufferedWriter = null;
            }
        }


        return 0;
    }
}
