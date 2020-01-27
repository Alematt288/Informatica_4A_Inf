package it.itis.cuneo;

public class Appartamento extends Abitazione
{
    private int piano;
    private int terrazzi;
    private int ascensore;

    public Appartamento()
    { }

    public Appartamento(int nStanze, float superficie, String indirizzo, String città, int posizioneElenco, int tipoAbitazione, int piano, int terrazzi, int ascensore)
    {
        super(nStanze, superficie, indirizzo, città, posizioneElenco, tipoAbitazione);
        this.piano = piano;
        this.terrazzi = terrazzi;
        this.ascensore = ascensore;
    }

    public int getPiano() { return piano; }
    public void setPiano(int piano) { this.piano = piano; }
    public int getTerrazzi() { return terrazzi; }
    public void setTerrazzi(int terrazzi) { this.terrazzi = terrazzi; }
    public int getAscensore() { return ascensore; }
    public void setAscensore(int ascensore) { this.ascensore = ascensore; }

    public static void creaAbitazione(Abitazione ElencoAbitazioni[], int cnt, InputOutputUtility read)
    {
        System.out.println("\nNumero piano: ");
        ((Appartamento)ElencoAbitazioni[cnt]).setPiano(read.leggiNumero());

        System.out.println("Numero terrazzi: ");
        ((Appartamento)ElencoAbitazioni[cnt]).setTerrazzi(read.leggiNumero());

        System.out.println("Ascensore: 0. NO / 1. SI ");
        ((Appartamento)ElencoAbitazioni[cnt]).setAscensore(read.leggiNumero());
    }

    public String toString()
    {
        String s = new String(super.toString() + " Numero piano: " + piano + ", Numero terrazzi: " + terrazzi + ", Ascensore: 1. SI , 0. NO: " + ascensore);

        return s;
    }
}
