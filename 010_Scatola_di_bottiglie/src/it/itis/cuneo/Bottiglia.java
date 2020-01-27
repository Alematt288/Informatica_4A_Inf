package it.itis.cuneo;

import java.util.Calendar;

public class Bottiglia
{
    private String nome;
    private String Produttore;
    private String isbn;
    private Calendar Scadenza;

    public Bottiglia(String nome, String produttore, String isbn, Calendar Scadenza)
    {
        this.nome = nome;
        this.Produttore = produttore;
        this.isbn = isbn;
        this.Scadenza = Scadenza;
    }

    public Bottiglia(Bottiglia bottiglia)
    {
        this.nome = bottiglia.getNome();
        this.Produttore = bottiglia.getProduttore();
        this.isbn = bottiglia.getIsbn();
        this.Scadenza = bottiglia.getScadenza();
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getProduttore()
    {
        return Produttore;
    }

    public void setProduttore(String produttore)
    {
        Produttore = produttore;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public Calendar getScadenza()
    {
        return Scadenza;
    }

    public void setScadenza(Calendar scadenza)
    {
        Scadenza = scadenza;
    }

    public String toString()
    {
        return "{ Nome: " + nome + ", Produttore: " + Produttore + ", Isbn: " + isbn + ", Data di scadenza: " + Scadenza + " }";
    }
}
