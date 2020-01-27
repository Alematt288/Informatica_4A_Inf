package it.itis.cuneo;

public class GestionePatrimonio
{
    static InputOutputUtility read = new InputOutputUtility();

    public static void main(String[] args)
    {
        Patrimonio patrimonio = new Patrimonio(0);
        int cntAbitazioni = 0;
        int scelta = 0;

        do
        {
            scelta = GestionePatrimonio.Scelte();

            switch (scelta)
            {
                case 1:
                    try
                    {
                        patrimonio.addAbitazione();
                    }
                    catch(PatrimonioPienoException ex)
                    {
                        ex.printStackTrace();
                        System.out.println(ex.getDescrizione());
                    }
                    cntAbitazioni++;
                    break;

                case 2:
                    System.out.println("Ecco le abitazioni del tuo Patrimonio: ");
                    System.out.println(patrimonio.toString());
                    break;

                default:
                    System.out.println("\nValore non valido.");
                    break;
            }
        }while(scelta != 0);

    }

    public static int Scelte()
    {
        int scelta;

        System.out.println("0. Esci");
        System.out.println("1. Aggiungi una abitazione al tuo patrimonio ");
        System.out.println("2. Visualizza le informazioni sulle tue abitazioni ");

        scelta = read.leggiNumero();
        return scelta;
    }
}
