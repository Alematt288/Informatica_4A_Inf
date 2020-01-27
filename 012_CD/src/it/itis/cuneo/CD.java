package it.itis.cuneo;

import java.util.Objects;

public class CD
{
    private String Titolo;
    private String Autore;
    private int NumeroBrani;
    private float Durata;

    public CD(String Titolo, String Autore, int NumeroBrani, float Durata)
    {
        this.Titolo = Titolo;
        this.Autore = Autore;
        this.NumeroBrani = NumeroBrani;
        this.Durata = Durata;
    }

    public CD(CD cd)
    {
        this.Titolo = cd.getTitolo();
        this.Autore = cd.getAutore();
        this.NumeroBrani = cd.getNumeroBrani();
        this.Durata = cd.getDurata();
    }

    public CD()
    { }

    public String getTitolo()
    {
        return Titolo;
    }

    public void setTitolo(String titolo)
    {
        Titolo = titolo;
    }

    public String getAutore()
    {
        return Autore;
    }

    public void setAutore(String autore)
    {
        Autore = autore;
    }

    public int getNumeroBrani()
    {
        return NumeroBrani;
    }

    public void setNumeroBrani(int numeroBrani)
    {
        NumeroBrani = numeroBrani;
    }

    public float getDurata()
    {
        return Durata;
    }

    public void setDurata(float durata)
    {
        Durata = durata;
    }

    public String toString()
    {
        return "{ Titolo: " + Titolo + ", Autore: " + Autore + ", Numero brani: " + NumeroBrani + ", Durata: " + Durata + " }";
    }
}
