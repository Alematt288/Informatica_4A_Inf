package it.itis.cuneo;

public class Vettore
{
    //Attributi
    private Punto origine;
    private Punto vertice;

    //Costruttori
    public Vettore(Punto origine, Punto vertice)
    {
        this.origine = new Punto(origine);
        this.vertice = new Punto(vertice);
    }

    public Vettore(Vettore vettore)
    {
        this.origine = vettore.getOrigine();
        this.vertice = vettore.getVertice();
    }

    public Vettore() {}

    //Get e Set
    public void setOrigine(Punto origine) { this.origine = origine; }

    public Punto getOrigine() { return this.origine; }

    public void setVertice() { this.vertice = vertice; }

    public Punto getVertice() { return this.vertice; }


    public String toString()
    {
        return "Vettore { \"Origine\": " + origine + ";  \"Vertice\": " + vertice + " }";
    }

    public double lenght()
    {
       double addendo1;
       double addendo2;

       addendo1 = Math.pow(origine.getX() - vertice.getX(), 2);
       addendo2 = Math.pow(origine.getY() - vertice.getY(), 2);

       return Math.sqrt(addendo1 + addendo2);
    }

    public boolean equals(Vettore vettore)
    {
        boolean uguali = false;

        if((origine == vettore.getOrigine()) && (vertice == vettore.getVertice()));
        {
            uguali = true;
        }

        return uguali;
    }

    public static void main(String[] args)
    {
       Punto punto1 = new Punto();
       Punto punto2 = new Punto();

       punto1.setX(4);
       punto1.setY(5);

       punto2.setX(6);
       punto2.setY(7);

       Vettore vettore = new Vettore(punto1, punto2);

       System.out.println(vettore.toString());


       double Lunghezza1 = 0;

       Lunghezza1 = vettore.lenght();

       System.out.println("Il vettore ha una lunghezza di valore: " + Lunghezza1);

       boolean Uguali = false;

       Uguali = vettore.equals(vettore);

       if(Uguali == false)
       {
           System.out.println("I punti non sono uguali.");
       }
    }
}