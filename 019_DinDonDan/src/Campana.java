public class Campana implements Runnable
{
    String suono;
    int n;

    public Campana(String suono, int n)
    {
        this.suono = suono;
        this.n = n;
    }

    public void run()
    {
        int i;

        for(i = 0; i < n; i++)
        {
            System.out.println((i + 1) + suono + " ");
        }
    }
}
