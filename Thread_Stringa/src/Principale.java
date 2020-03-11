public class Principale
{
    public static void main(String[] args)
    {
        System.out.println("Inserisci una stringa: ");
        String string = InputOutputUtility.leggiNome();

        Stringa stringa = new Stringa(string);
        stringa.start();

        try
        {
            stringa.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}
