/*calcola  x = ((a+5)*b)
           x = ((a+c)*b)  */

public class Operazione2 extends Thread
{
    Buffer dati;
    private double a;
    private double c = 3;
    private double b;

    public Operazione2(Buffer d)
    {
        dati = d;
        b = dati.b;
        a = dati.a;
    }

    public void run()
    {
        dati.z = (a+c)*b;
        System.out.println("Ho calcolato z : " + dati.z);
    }
}