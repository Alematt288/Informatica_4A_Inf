package it.itis.cuneo;

public class Punto
{
    private int x;
    private int y;

private Punto(int x, int y)
{
    this.x = x;
    this.y = y;
}

private Punto() {}

private void setX(int x)
{
    this.x = x;
}

private int getX()
{
    return this.x;
}

private void setY(int y)
{
    this.y = y;
}

private int getY()
{
    return this.y;
}

private Punto getQuadrante(Punto coordinate)
{
    if((coordinate.getX() > 0) && (coordinate.getY() >= 0))
    {
       System.out.println("Il punto si trova nel quadrante 1.");
    }
    else
    {
        if((coordinate.getX() < 0) && (coordinate.getY() >= 0))
        {
           System.out.println("Il punto si trova nel quadrante 2.");
        }
        else
        {
            if((coordinate.getX() <= 0) && (coordinate.getY() <= 0))
            {
              System.out.println("Il punto si trova nel quadrante 3.");
            }
            else
            {
                System.out.println("Il punto si trova nel quadrante 4.");
            }
        }
    }
   return coordinate;
}

public String toString()
{
    return "Coordinate {X: " + x + ", Y: " + y + "}";
}

public static void main(String[] args)
    {
        Punto coordinate = new Punto(2,3);

        Punto Ris = new Punto();

        Ris = Ris.getQuadrante(coordinate);

        System.out.println(Ris.toString());
    }
}