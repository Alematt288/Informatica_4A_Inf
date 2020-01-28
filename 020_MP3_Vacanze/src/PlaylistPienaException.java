public class PlaylistPienaException extends Exception
{
    private int codice;
    private String descrizione;

    public PlaylistPienaException(int codice, String descrizione)
    {
        this.setCodice(codice);
        this.setDescrizione(descrizione);
    }

    public int getCodice() {
        return codice;
    }
    public void setCodice(int codice) {
        this.codice = codice;
    }
    public String getDescrizione() {
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
