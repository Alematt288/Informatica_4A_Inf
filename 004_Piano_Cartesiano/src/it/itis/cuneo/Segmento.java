package it.itis.cuneo;

public class Segmento
{
    //attributi
    private Punto punto1;
    private Punto punto2;

    //metodi
    /*public Segmento(Punto punto1, Punto punto2)
    {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }*/

    public Segmento(Punto punto1, Punto punto2)
    {
        this.punto1 = new Punto(punto1.getX(), punto1.getY());      //Stiamo instanziando degli oggetti
        this.punto2 = new Punto(punto2.getX(), punto2.getY());
    }

    /*public Segmento(Punto punto1, Punto punto2)
    {
        this.punto1 = new Punto(punto1);      E' identico al metodo sopra
        this.punto2 = new Punto(punto2);
    }*/

    public Segmento(Segmento segmento)
    {
        this.punto1 = new Punto(segmento.getPunto1());
        this.punto2 = new Punto(segmento.getPunto2());
    }

    public void setPunto1(Punto punto1)
    {
        this.punto1 = new Punto(punto1);
    }

    public Punto getPunto1()
    {
        return this.punto1;
    }

    public void setPunto2(Punto punto2)
    {
        this.punto2 = new Punto(punto2);
        //this.punto2 = punto2;     //In questo caso potrei perdere il parametro.
    }

    public Punto getPunto2()
    {
        return this.punto2;
    }

}
