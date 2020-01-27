package it.itis.cuneo;

public class Segmento
{
    //Attributi
    private Punto origine;
    private Punto vertice;

    //Costruttori
    public Segmento() {}

    public Segmento(Punto origine, Punto vertice)
    {
        this.origine = new Punto(origine);
        this.vertice = new Punto(vertice);
    }

    public Segmento(Segmento segmento)
    {
        origine = segmento.getOrigine();
        vertice = segmento.getVertice();
    }

    //Get e Set
    public void setOrigine(Punto origine)
    {
        this.origine = origine;
    }

    public Punto getOrigine()
    {
        return this.origine;
    }

    public void setVertice(Punto vertice)
    {
        this.vertice = vertice;
    }

    public Punto getVertice()
    {
        return this.vertice;
    }

    public String toString()
    {
        return "Segmento { \"Origine\": " + origine + ", \"Vertice\": " + vertice + " }";
    }

    public double Lunghezza(Segmento segmento)
    {
        double addendo1 = 0;
        double addendo2 = 0;
        double Ris = 0;

        addendo1 = Math.pow(origine.getX() - vertice.getX(), 2);
        addendo2 = Math.pow(origine.getY() - vertice.getY(), 2);

        Ris = Math.sqrt(addendo1 + addendo2);

        return Ris;
    }

    public boolean equals(double Lunghezza1, double Lunghezza2)
    {
        boolean U = false;

        if(Lunghezza1 == Lunghezza2)
        {
           U = true;
        }

        return U;
    }

    public static void main(String[] args)
    {
        Punto puntoOrigine;
        puntoOrigine = new Punto(5,4);

        Punto puntoVertice;
        puntoVertice = new Punto(8,2);

        Segmento segmento1 = new Segmento(puntoOrigine, puntoVertice);
        System.out.println("Il segmento 1 ha queste coordinate: " + segmento1.toString());

        Punto puntoOrigine2;
        puntoOrigine2 = new Punto(5,4);

        Punto puntoVertice2;
        puntoVertice2 = new Punto(7,3);

        Segmento segmento2 = new Segmento(puntoOrigine2, puntoVertice2);
        System.out.println("Il segmento 2 ha queste coordinate: " + segmento2.toString());


        double Lunghezza1;
        Lunghezza1 = 0;


        Lunghezza1 = segmento1.Lunghezza(segmento1);
        System.out.println("La lunghezza del segmento 1 vale: " + Lunghezza1);


        double Lunghezza2;
        Lunghezza2 = 0;


        Lunghezza2 = segmento2.Lunghezza(segmento2);
        System.out.println("La lunghezza del segmento 2 vale: " + Lunghezza2);


        boolean Uguale = false;
        Segmento ris = new Segmento();

        Uguale = ris.equals(Lunghezza1, Lunghezza2);

        if(Uguale == true)
        {
            System.out.println("I due segmenti hanno la stessa lunghezza.");
        }
        else
        {
            System.out.println("I due segmenti non hanno la stessa lunghezza.");
        }
    }
}
