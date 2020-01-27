package it.itis.cuneo;

public class Rettangolo
{
    //attributi
    private Segmento segmentoAlto;
    private Segmento segmentoDestro;
    private Segmento segmentoBasso;
    private Segmento segmentoSinistro;


    public Rettangolo(Segmento segmentoAlto, Segmento segmentoDestro, Segmento segmentoBasso, Segmento segmentoSinistro)
    {
        this.segmentoAlto = new Segmento(segmentoAlto);
        this.segmentoBasso = new Segmento(segmentoBasso);
        this.segmentoDestro = new Segmento(segmentoDestro);
        this.segmentoSinistro = new Segmento(segmentoSinistro);
    }

    public Rettangolo(Rettangolo rettangolo)
    {
        this.segmentoAlto = new Segmento(rettangolo.getSegmentoAlto());
        this.segmentoBasso = new Segmento(rettangolo.getSegmentoBasso());
        this.segmentoDestro = new Segmento(rettangolo.getSegmentoDestro());
        this.segmentoSinistro = new Segmento(rettangolo.getSegmentoSinistro());
    }

    public void setSegmentoAlto(Segmento segmentoAlto)
    {
       this.segmentoAlto = segmentoAlto;
    }

    public Segmento getSegmentoAlto()
    {
        return segmentoAlto;
    }

    public void setSegmentoBasso(Segmento segmentoBasso)
    {
        this.segmentoBasso = segmentoBasso;
    }

    public Segmento getSegmentoBasso()
    {
        return segmentoBasso;
    }

    public void setSegmentoDestro(Segmento segmentoDestro)
    {
        this.segmentoDestro = segmentoDestro;
    }

    public Segmento getSegmentoDestro()
    {
        return segmentoDestro;
    }

    public void setSegmentoSinistro(Segmento segmentoSinistro)
    {
        this.segmentoSinistro = segmentoSinistro;
    }

    public Segmento getSegmentoSinistro()
    {
        return segmentoSinistro;
    }

    public String toString()
    {
        return "Rettangolo { \"SegmentoAlto\":" + segmentoAlto + ", \"SegmentoBasso\": " + segmentoBasso + ", \"SegmentoDestro\": " + segmentoDestro + ", \"SegmentoSinistro\": " + segmentoSinistro + "}";
    }

}
