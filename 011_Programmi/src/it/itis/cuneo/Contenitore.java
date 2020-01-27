package it.itis.cuneo;

import java.util.Scanner;

public class Contenitore
{
    public static final int MAX_PROGRAMS = 3;
    private Programma[] vProgrammi;
    private int N;

    public Contenitore()
    {
        vProgrammi = new Programma[MAX_PROGRAMS];
        N = 0;
    }

    public void setProgramma(Programma programma) throws ContenitorePienoException
    {
        if(N + 1 > MAX_PROGRAMS)
        {
            throw new ContenitorePienoException("Troppi programmi, il massimo e' di 3");
        }
        vProgrammi[N] = programma;
        N++;
    }

    public void getProgramma()
    {
        for(N = 0; N != 3; N++)
        {
            System.out.println("Nella posizione " + N + " c'e' il programma: " + vProgrammi[N]);
        }
    }

    public void killProgramma()
    {
        int Num;
        Scanner Input = new Scanner(System.in);

        do {
            System.out.println("Quale programma vuoi eliminare? Scegli la posizione da 0 a 2: ");
            Num = Input.nextInt();

            if (Num < 0 || Num > 2)
            {
                System.out.println("Hai inserito un valore non accettabile.");
            }
            else
            {
                vProgrammi[Num] = new Programma();
            }

        }while(Num < 0 || Num > 2);
    }

    public void getDenominazione()
    {
        System.out.println("\nDenominazione programmi: ");

        for(N = 0; N != 3; N++)
        {
            System.out.println(vProgrammi[N].getDenominazione());
        }
    }

    public int getN()
    {
        return N;
    }

    public static void main(String[] args)
    {
        Programma programma1 = new Programma("Word", "Microsoft", "5.0", "Windows", 2018);
        Programma programma2 = new Programma("Excel", "Microsoft", "6.0", "Windows", 2017);
        Programma programma3 = new Programma("Power-Point", "Microsoft", "4.0", "Windows", 2019);

        Contenitore contenitore1 = new Contenitore();

        try
        {
            contenitore1.setProgramma(programma1);
            contenitore1.setProgramma(programma2);
            contenitore1.setProgramma(programma3);
        }
        catch(ContenitorePienoException ex)
        {
            ex.printStackTrace();
        }

        contenitore1.getProgramma();
        System.out.println("\nNel contenitore ci sono: " + contenitore1.getN() + " Programmi");

        /////////////////////////////// In questa parte di programma l'utente può decidere di cancellare un programma nel contenitore.

        Scanner Input = new Scanner(System.in);

        int Scelta;

        System.out.println("\nVuoi eliminare un programma dal contenitore 1? 0 = NO, 1 = SI.");
        Scelta = Input.nextInt();

        switch (Scelta)
        {
            case 1:
                contenitore1.killProgramma();
                System.out.println("Programma eliminato, ecco il contenitore 1 aggiornato:");
                contenitore1.getProgramma();
                break;

            case 0:
                System.out.println("Nessun programma eliminato.");
                break;

            default:
                System.out.println("Valore non valido.");
                break;
        }

        contenitore1.getDenominazione();

        //////////////////////////// In questa parte di programma viene creato il secondo contenitore e viene effettuato il confronto.

        System.out.println("\n------------------------------------\n");

        Programma programma4 = new Programma("Bridge", "Adobe", "4.0", "Windows", 2018);
        Programma programma5 = new Programma("Photoshop", "Adobe", "6.0", "Windows", 2017);
        Programma programma6 = new Programma("Illustrator", "Adobe", "4.0", "Windows", 2019);

        Contenitore contenitore2 = new Contenitore();

        try
        {
            contenitore2.setProgramma(programma4);
            contenitore2.setProgramma(programma5);
            contenitore2.setProgramma(programma6);
        }
        catch(ContenitorePienoException ex)
        {
            ex.printStackTrace();
        }

        contenitore2.getProgramma();
        System.out.println("\n\nNel contenitore ci sono: " + contenitore2.getN() + " Programmi");

        System.out.println("\nVuoi eliminare un programma dal contenitore 2? 0 = NO, 1 = SI.");
        Scelta = Input.nextInt();

        switch (Scelta)
        {
            case 1:
                contenitore1.killProgramma();
                System.out.println("Programma eliminato, ecco il contenitore 2 aggiornato:");
                contenitore1.getProgramma();
                break;

            case 0:
                System.out.println("Nessun programma eliminato.");
                break;

            default:
                System.out.println("Valore non valido.");
                break;
        }

        contenitore2.getDenominazione();

        boolean ris;

        ris = contenitore2.equals(contenitore1);

        System.out.println("\nConfronto: " + ris);
    }
}
