package it.itis.cuneo;

public class ContenitorePienoException extends Exception
{
    private String descrizione;

    public ContenitorePienoException(String descrizione)
    {
        this.descrizione = descrizione;
    }

    public String toString()
    {
        return "Contenitore Pieno! { " + descrizione + "}";
    }
}
