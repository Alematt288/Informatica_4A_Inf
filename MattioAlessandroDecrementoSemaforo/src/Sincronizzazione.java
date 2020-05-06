public class Sincronizzazione
{
    public int c = 20;
    public Sincronizzazione() { }

    public int getC()
    { return c; }

    public void setC(int c)
    { this.c = c; }

    public synchronized void decrementaContatore()
    { c--; }
}