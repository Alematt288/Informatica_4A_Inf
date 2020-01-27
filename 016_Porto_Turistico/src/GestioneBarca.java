public class GestioneBarca
{
    static InputOutputUtility t = new InputOutputUtility();

    public static void main(String[] args)
    {
        Molo molo = new Molo(0);
        int cntBarche = 0;

        int scelta = 0;

        do
        {
            scelta = GestioneBarca.Menu();

            switch (scelta)
            {
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Errore.");
            }
        }
        while (scelta != 0);
    }

    public static int Menu()
    {
        int scelta;

        System.out.println("0. Esci");
        System.out.println("Menu'\n");
        System.out.println("1. Assegna posto");
        System.out.println("2. Libera un posto");
        System.out.println("3. Ricerca informazioni barca");
        System.out.println("4. Salva su file lo stato del porto");
        System.out.println("5. Mostra barche con una certa nazionalita'");

        System.out.println("\nScegli il numero dell'operazione da effettuare: ");
        scelta = t.leggiNumero();

        return scelta;
    }
}