import java.io.IOException;

public class MP3
{
    static InputOutputUtility t = new InputOutputUtility();

    public static void main(String[] args)
    {
        int scelta;
        Playlist playlist = new Playlist();

        do
        {
            scelta = 0;

            scelta = MP3.choose();

            switch(scelta)
            {
                case 1:
                    try
                    {
                        playlist.addCanzone();
                    }
                    catch(PlaylistPienaException e)
                    {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    try
                    {
                        playlist.RimuoviCanzone();
                    }
                    catch(IOException ex)
                    {
                        ex.printStackTrace();
                    }
                    break;

                case 3:
                    int tot;

                    tot = playlist.getTempo();

                    System.out.println("Ecco la durata totale delle canzoni: " + tot + ".\n");
                    break;

                case 4:
                    playlist.shuffle();
                    break;

                case 5:
                    break;

                case 6:
                    break;

                case 7:
                    int n;

                    System.out.println("\nQuanti brani vuoi spostare?");
                    n = t.leggiNumero();
                    break;

                case 8:
                    break;

                case 9:
                    String brani = "brani";

                    playlist.listaToFile(brani);
                    break;
            }

        }while(scelta != 0);
    }

    public static int choose()
    {
        int s;

        System.out.println("Cosa vuoi fare?\n");

        System.out.println("0. Esci");
        System.out.println("1. Aggiungi una canzone alla playlist");
        System.out.println("2. Elimina una canzone dalla playlist");
        System.out.println("3. Mostra la durata totale dei brani nella playlist");
        System.out.println("4. Shuffle");
        System.out.println("5. Sposta un brano nella posizione precedente");
        System.out.println("6. Sposta un brano nella posizione successiva");
        System.out.println("7. Sposta un tot di brani in un vettore");
        System.out.println("8. Sposta un tot di brani in un vettore basandoti sulla loro durata\n");
        System.out.println("9. Salva le informazioni su un file");

        s = t.leggiNumero();

        return s;
    }
}
