package  it.itis.cuneo;

import java.util.Objects;

public class Programma
{
    private String denominazione;
    private String produttore;
    private String versione;
    private String sistemaOperativo;
    private int anno;

    public Programma(String denominazione, String produttore, String versione, String sistemaOperativo, int anno) {
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.versione = versione;
        this.sistemaOperativo = sistemaOperativo;
        this.anno = anno;
    }

    public Programma(Programma programma) {
        this.denominazione = programma.getDenominazione();
        this.produttore = programma.getProduttore();
        this.versione = programma.getVersione();
        this.sistemaOperativo = programma.getSistemaOperativo();
        this.anno = programma.getAnno();
    }

    public Programma() {
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getDenominazione() {
        return this.denominazione;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getProduttore() {
        return this.produttore;
    }

    public void setVersione(String versione) {
        this.versione = versione;
    }

    public String getVersione() {
        return this.versione;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getSistemaOperativo() {
        return this.sistemaOperativo;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getAnno() {
        return this.anno;
    }

    public String toString()
    {
        return "{ Programma: " + denominazione + ", Anno: " + anno + ", Versione: " + versione + ", Produttore: " + produttore + ", Sistema operativo: " + sistemaOperativo + " }";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Programma)) return false;
        Programma programma = (Programma) o;

        return anno == programma.anno &&
                denominazione.equals(programma.denominazione) &&
                produttore.equals(programma.produttore) &&
                versione.equals(programma.versione) &&
                sistemaOperativo.equals(programma.sistemaOperativo);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(denominazione, produttore, versione, sistemaOperativo, anno);
    }
}