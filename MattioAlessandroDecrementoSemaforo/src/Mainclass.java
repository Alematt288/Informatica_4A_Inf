class MainClass
{
    public static void main(String[] args)
    {
        int c = 20;
        Sincronizzazione s = new Sincronizzazione();
        ThreadDecr t1 = new ThreadDecr(s, 1);
        ThreadDecr t2 = new ThreadDecr(s, 2);
        ThreadDecr t3 = new ThreadDecr(s, 3);

        t1.start();
        t2.start();
        t3.start();

        try
        { t1.join(); }
        catch (InterruptedException e)
        { e.printStackTrace(); }
        try
        { t2.join(); }
        catch (InterruptedException e)
        { e.printStackTrace(); }
        try
        { t3.join(); }
        catch (InterruptedException e)
        { e.printStackTrace(); }

        System.out.println("Contatore: " + s.c);
    }
}