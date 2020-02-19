import java.io.PrintStream;

public class Fattoriale
{
    public Fattoriale()
    { }

    public static void main(String[] args)
    {
        Thread1 th1 = new Thread1(7);
        th1.start();

        try
        {
            th1.join();
            PrintStream var10000 = System.out;

            int var10001 = th1.getNum();
            var10000.println("Fattoriale{" + var10001 + "}: " + th1.getFattoriale());
        }
        catch (InterruptedException var3)
        {
            var3.printStackTrace();
        }
    }
}
