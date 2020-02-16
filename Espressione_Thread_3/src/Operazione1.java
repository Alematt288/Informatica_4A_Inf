/*calcola  x = ((a+4)*b)
           x = ((a+c)*b)  */

public class Operazione1 extends Thread
{
    Buffer dati;
    private double b;
    private double c = 4;
    private double a;

    public Operazione1(Buffer d)
    {
        dati = d;
        a = dati.a;
        b = dati.b;
    }

    public void run()
    {
        dati.x = (a+c)*b;
        System.out.println("Ho calcolato x : " + dati.x);
    }
}
