package it.itis.cuneo;

public class Libreria
{
    public static final int MAX_LIBRI = 3;
    private Libro[] vLibri;
    private int cntLibro;   //cntLibro <= MAX_LIBRI.

    public Libreria()
    {
        vLibri = new Libro[MAX_LIBRI];
        cntLibro = 0;
    }

    public void addLibro(Libro libro) throws LibreriaPienaException
    {
        if(cntLibro + 1 > MAX_LIBRI)
        {
            throw new LibreriaPienaException(1, "Troppi libri!");
        }
            vLibri[cntLibro] = libro;
            cntLibro++;
    }

    public static void main(String[] args)
    {
        Libro libro1 = new Libro("Alice nel paese delle meraviglie", "Lewis Carroll", "123456789", InputOutputUtility.convertiDataOraToCalendar("12/10/2019", InputOutputUtility.dfDay));
        Libro libro2 = new Libro("Pinocchio", "Carlo Collodi", "123456799", InputOutputUtility.convertiDataOraToCalendar("10/10/2019", InputOutputUtility.dfDay));

        Libreria libreria = new Libreria();

        try
        {
            libreria.addLibro(libro1);
        }
        catch(LibreriaPienaException e)
        {
            e.printStackTrace();
        }

        System.out.println(libro1.toString());
    }
}
