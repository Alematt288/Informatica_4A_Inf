public class Brano
{
    private String Titolo;
    private int Durata;

    public Brano(String titolo, int durata)
    {
        Titolo = titolo;
        Durata = durata;
    }

    public String getTitolo() { return Titolo; }
    public void setTitolo(String titolo) { Titolo = titolo; }
    public int getDurata() { return Durata; }
    public void setDurata(int durata) { Durata = durata; }

    @Override
    public String toString()
    {
        return this.Titolo + ' ' + this.Durata;
    }
}
