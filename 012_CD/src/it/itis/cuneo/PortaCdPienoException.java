package it.itis.cuneo;

public class PortaCdPienoException extends Exception
{
    private String descrizione;

    public PortaCdPienoException(String descrizione)
    {
        this.descrizione = descrizione;
    }

    public String toString()
    {
        return "Porta CD Pieno! { " + descrizione + "}";
    }
}
