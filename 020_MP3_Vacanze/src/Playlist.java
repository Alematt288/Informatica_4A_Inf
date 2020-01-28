import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.util.Random;

public class Playlist
{
    private TextFile file = null;
    private String nome;
    public ArrayList<Brano> list = new ArrayList<Brano>();
    private int cnt;

    int tot = 0;

    InputOutputUtility t = new InputOutputUtility();

    public Playlist() { }

    public Playlist(String nome, ArrayList<Brano> list, int cnt)
    {
        this.nome = nome;
        this.list = list;
        this.cnt = cnt;
    }

    public String RimuoviCanzone() throws IOException
    {
        String nome;

        System.out.println("Inserisci il nome del brano da eliminare: ");
        nome = t.leggiNome();

        list.remove(list.indexOf(nome));
        cnt--;

        return ("\nLa canzone: " + nome + ", e' stata rimossa.");
    }

    public void addCanzone() throws PlaylistPienaException
    {
        String ti;
        int d;

        System.out.println("Inserisci il titolo della canzone: ");
        ti = t.leggiNome();

        System.out.println("Inserisci la durata della canzone: ");
        d = t.leggiNumero();

        Brano brano = new Brano(ti, d);

        list.add(brano);
        cnt++;

        tot = tot + d;
    }

    public int getTempo()
    {
        return tot;
    }

    @Override
    public String toString()
    {
        String lista = "Playlist:";
        for(int i = 0; i < list.size(); i++)
        {
            lista = lista + "\nTitolo: "+ list.get(i).getTitolo() + "\tDurata: " + list.get(i).getDurata();
        }
        return lista;
    }

    public void shuffle()
    {
        Random r = new Random();
        int i;
        Brano temp;

        System.out.println(" Prima dello shuffle " + toString());
        for (i = list.size()-1; i > 0; i--)
        {
            int j;
            j = r.nextInt(i);

            temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
        }
        System.out.println(" Dopo lo shuffle " + toString());
    }

    public void listaToFile(String nomeFile)
    {
        try
        {
            file = new TextFile(nomeFile, 'w');
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        for(int i = 0; i < list.size(); i++)
        {
            try
            {
                file.toFile(list.get(i).toString());
            }
            catch (FileException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        try
        {
            file.closeFile();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public void fileToLista(String nomeFile)
    {
        String titolo;
        int durata;

        try
        {
            file = new TextFile(nomeFile,'r');
        }
        catch (IOException e)
        {
            e.printStackTrace();        //generare un eccezione ed uscire
        }
        list.clear();

        while (true)
        {
            StringTokenizer st;
            try
            {
                String[] s = new String[2];
                st = new StringTokenizer(file.fromFile());

                int i = 0;

                while(st.hasMoreTokens())
                {
                    s[i]=st.nextToken();
                    i++;
                }
                titolo = s[0];
                durata = Integer.parseInt(s[1]);
                list.add(new Brano(titolo,durata));
            }
            catch (FileException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}



