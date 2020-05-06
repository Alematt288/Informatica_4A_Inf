public class ThreadDecr extends Thread
{
    private int tot;
    private int n;
    private Sincronizzazione s;

    public ThreadDecr() { }

    public ThreadDecr(Sincronizzazione s, int n)
    {
        this.n = n;
        this.s = s;
    }

    public int getTot()
    { return tot; }

    public void setTot(int tot)
    { this.tot = tot; }

    @Override
    public void run()
    {
        while(s.c >= 1)
        {
            System.out.println("Thread " + n + ": - Contatore: "+ s.c);
            tot++;
            s.decrementaContatore();

            try
            {
                sleep(1);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println("Thread " + n + ": - Contatore: "+ s.c);
        }
        System.out.println("Totale Thread " + n + ": " + tot);
    }
}