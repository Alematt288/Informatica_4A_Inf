package it.itis.cuneo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class PortaCD
{
    public static final int MAX_CD = 5;
    private CD[] vCD;
    private int N;

    BufferedReader Input;

    public PortaCD()
    {
        vCD = new CD[MAX_CD];
        N = 0;

        Input = new BufferedReader(new InputStreamReader(System.in));
    }

    public void setCD(CD cd) throws PortaCdPienoException
    {
        if(N + 1 > MAX_CD)
        {
            throw new PortaCdPienoException("Troppi CD nel portaCD, il massimo e' di 5!");
        }

        vCD[N] = cd;
        N++;
    }

    public void getCD()
    {
        for(N = 0; N != 5; N++)
        {
            System.out.println("Nella posizione " + N + " c'e' il CD: " + vCD[N]);
        }
    }

    public int readInt() throws IOException
    {
        System.out.println("\nVuoi togliere un CD dal portaCD? 0 = NO, 1 = SI");
        return Integer.parseInt(Input.readLine());
    }

    public void killCD() throws IOException
    {
        int Ris;
        do {

            System.out.println("Quale CD vuoi togliere? Digita un numero da 0 a 4");

            Ris = Integer.parseInt(Input.readLine());

            if (Ris < 0 || Ris > 4)
            {
                System.out.println("Hai inserito un valore non accettabile.");
            }
            else
            {
                vCD[Ris] = new CD();
            }

        }while(Ris < 0 || Ris > 4);
    }

    public void getTitolo()
    {
        System.out.println("\nTitoli CD: ");

        for(N = 0; N != 5; N++)
        {
            System.out.println(vCD[N].getTitolo());
        }
    }

    public int getN()
    {
        return N;
    }

    public static void main(String[] args) throws IOException
    {
        CD cd1 = new CD("Sanremo 2018", "Ronald White", 28, 85); //Durata espressa in minuti
        CD cd2 = new CD("Help!", "The Beatles", 13, 45);
        CD cd3 = new CD("The Wall", "Pink Floyd", 23, 70);
        CD cd4 = new CD("Greatest Hits", "Queen", 13, 45);
        CD cd5 = new CD("Origins", "Imagine Dragons", 13, 45);

        PortaCD portaCD1 = new PortaCD();

        try
        {
            portaCD1.setCD(cd1);
            portaCD1.setCD(cd2);
            portaCD1.setCD(cd3);
            portaCD1.setCD(cd4);
            portaCD1.setCD(cd5);
        }
        catch (PortaCdPienoException ex)
        {
            ex.printStackTrace();
        }

        portaCD1.getCD();

        int Ris;

        Ris = portaCD1.readInt();

        if(Ris == 1)
        {
            portaCD1.killCD();
            System.out.println("CD eliminato, ecco il PortaCD 1 aggiornato:");
            portaCD1.getCD();
        }
        else
        {
            System.out.println("\nNessun CD eliminato.");
        }

        System.out.println("In totale ci sono " + portaCD1.getN() + " CD");
        System.out.println("\nEcco i titoli dei CD presenti nel portaCD: ");
        portaCD1.getTitolo();

        /////////////////////////////////

        System.out.println("\n-------------------------------");

        CD cd6 = new CD("Sanremo 2018", "Ronald White", 28, 85); //Durata espressa in minuti
        CD cd7 = new CD("Help!", "The Beatles", 13, 45);
        CD cd8 = new CD("The Wall", "Pink Floyd", 23, 70);
        CD cd9 = new CD("Greatest Hits", "Queen", 13, 45);
        CD cd10 = new CD("Origins", "Imagine Dragons", 13, 45);

        PortaCD portaCD2 = new PortaCD();

        try
        {
            portaCD2.setCD(cd6);
            portaCD2.setCD(cd7);
            portaCD2.setCD(cd8);
            portaCD2.setCD(cd9);
            portaCD2.setCD(cd10);
        }
        catch (PortaCdPienoException ex)
        {
            ex.printStackTrace();
        }

        portaCD2.getCD();

        Ris = portaCD2.readInt();

        if(Ris == 1)
        {
            portaCD2.killCD();
            System.out.println("CD eliminato, ecco il PortaCD 2 aggiornato:");
            portaCD2.getCD();
        }
        else
        {
            System.out.println("\nNessun CD eliminato.");
        }

        System.out.println("In totale ci sono " + portaCD2.getN() + " CD");
        System.out.println("\nEcco i titoli dei CD presenti nel portaCD 2: ");
        portaCD2.getTitolo();



        System.out.println("\nRisultato confronto: " + portaCD1.equals(portaCD2));
    }
}
