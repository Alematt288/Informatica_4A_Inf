package it.itis.cuneo;

public class Eccezione
{
    public static int divisione(int Dividendo, int Divisore)
    {
        return Dividendo/Divisore;
    }

    public static void main(String[] args)
    {
        int risultato;
        int x;

        try
        {
            for(x = 1; x != 5; x++)
            {
                risultato = divisione(x, 0);
            }
        }
        catch(ArithmeticException ex)
        {
            System.out.println("ArithmeticException");
            ex.printStackTrace();
        }
        catch(Exception ex)
        {
            System.out.println("Exception");
            ex.printStackTrace();
        }
        finally
        {
            System.out.println("Esecuzione completata");
        }
    }
}