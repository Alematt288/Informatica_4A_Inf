package it.itis.cuneo;

public class Punto
{
    //Attributi
    private double x;
    private double y;

    //Costruttori
    public Punto() {}

    public Punto(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto punto)
    {
        this.x = punto.getX();
        this.y = punto.getY();
    }

    public void setX(double x)
    {
        this.x = x;
    }

    public double getX()
    {
        return this.x;
    }

    public void setY(double y)
    {
        this.y = y;
    }

    public double getY()
    {
        return this.y;
    }

    public String toString()
    {
        return "Punto { \"X\": " + x + ", \"Y\": " + y + " }";
    }
}

