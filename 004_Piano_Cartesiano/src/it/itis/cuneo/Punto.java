package it.itis.cuneo;

public class Punto {
    //attributi
    private int x;
    private int y;

    //metodi
    public Punto(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public Punto() {}

    public Punto(Punto p)
    {
        x = p.getX();
        y = p.getY();
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getX()
    {
        return this.x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int getY()
    {
        return this.y;
    }

    public String toString()
    {
        return "Punto {\"x\": " + x + ", " + " \"y\": " + y + "}";
    }

    public static void main(String[] args)
    {
        //puntoA e puntoB referenziano due aree di memoria diverse; puntoB è una copia di puntoA per il suo stato, ma fisicamente sono in due aree di memoria diverse.
        Punto puntoA = new Punto(4, 6);
        Punto puntoB = new Punto(puntoA);

        //puntoC e puntoA come handler referenziano  la stessa area di memoria.
        Punto puntoC = puntoA;

        Punto puntoD = new Punto();

        Punto puntoE = null;
        puntoE = new Punto();   //Se il richiamo al costruttore non viene svolto ho un NullPointer.

        System.out.println(puntoE.toString());

    }
}
