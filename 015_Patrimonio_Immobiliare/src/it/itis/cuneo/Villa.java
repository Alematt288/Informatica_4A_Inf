package it.itis.cuneo;

public class Villa extends Abitazione
{
    private int nPiani;
    private float superficieGiardino;
    private int piscina;

    public Villa()
    { }

    public Villa(int nStanze, float superficie, String indirizzo, String città, int posizioneElenco, int tipoAbitazione, int nPiani, float superficieGiardino, int piscina)
    {
        super(nStanze, superficie, indirizzo, città, posizioneElenco, tipoAbitazione);
        this.nPiani = nPiani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
    }

    public int getnPiani() { return nPiani; }
    public void setnPiani(int nPiani) { this.nPiani = nPiani; }
    public float getSuperficieGiardino() { return superficieGiardino; }
    public void setSuperficieGiardino(float superficieGiardino) { this.superficieGiardino = superficieGiardino; }
    public int getPiscina() { return piscina; }
    public void setPiscina(int piscina) { this.piscina = piscina; }

    public static void creaAbitazione(Abitazione ElencoAbitazioni[], int cnt, InputOutputUtility read)
    {
        System.out.println("Numero di piani: ");
        ((Villa)ElencoAbitazioni[cnt]).setnStanze(read.leggiNumero());

        System.out.println("Superficie giardino: ");
        ((Villa)ElencoAbitazioni[cnt]).setSuperficieGiardino(read.leggiNumeroFloat());

        System.out.println("Piscina: 0. NO / 1. SI ");
        ((Villa)ElencoAbitazioni[cnt]).setPiscina(read.leggiNumero());
    }

    public String toString()
    {
        String s = new String(super.toString() + "Numero di piani: " + nPiani + ", Superficie giardino: " + superficieGiardino + ", Piscina: 1. SI / 0. NO: " + piscina);

        return s;
    }


    @Override
    public boolean equals(Object o)
    {
        boolean ret = true;

        if (o == null || getClass() != o.getClass())
            ret = false;
        if(!super.equals(o))
            ret = false;

        Villa villa = (Villa) o;

        if(ret)
        {
            if (nPiani != villa.nPiani)
                ret = false;
            if (Float.compare(villa.superficieGiardino, superficieGiardino) != 0)
                ret = false;
            if (piscina != villa.piscina) ret = false;
        }
        return ret;
    }

}
