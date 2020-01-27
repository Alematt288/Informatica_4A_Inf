package it.itis.cuneo;

import java.util.Calendar;

public class Libro
{
    private String titolo;
    private String autore;
    private String isbn;
    private Calendar dataPubblicazione;

    public Libro(String titolo, String autore, String isbn, Calendar dataPubblicazione)
    {
        this.titolo = titolo;
        this.autore = autore;
        this.isbn = isbn;
        this.dataPubblicazione = dataPubblicazione;
    }

    public Libro(Libro libro)
    {
        this.titolo = libro.getTitolo();
        this.autore = libro.getAutore();
        this.isbn = libro.getIsbn();
        this.dataPubblicazione = libro.getDataPubblicazione();
    }

    public String getTitolo()
    {
        return titolo;
    }

    public void setTitolo(String titolo)
    {
        this.titolo = titolo;
    }

    public Calendar getDataPubblicazione()
    {
        return dataPubblicazione;
    }

    public void setDataPubblicazione(Calendar dataPubblicazione)
    {
        this.dataPubblicazione = dataPubblicazione;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getAutore()
    {
        return autore;
    }

    public void setAutore(String autore)
    {
        this.autore = autore;
    }

    public boolean equals(Libro libro)
    {
        boolean bEquals = true;

        if(titolo != null && titolo.equals(libro.getTitolo())
                && autore != null && autore.equals(libro.getAutore())
                && isbn != null && isbn.equals(libro.getIsbn())
                && dataPubblicazione != null && dataPubblicazione.equals(libro.getDataPubblicazione()))
        {
            bEquals = true;
        }
        return bEquals;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", isbn='" + isbn + '\'' +
                ", dataPubblicazione=" + InputOutputUtility.convertDataOra(dataPubblicazione.getTime(),InputOutputUtility.dfDay) +
                '}';
    }
}
