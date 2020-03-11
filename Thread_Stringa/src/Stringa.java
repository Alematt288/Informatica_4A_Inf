import java.util.Random;

public class Stringa extends Thread
{
    public static final int MAX = 3000;
    public static final int MIN = 1000;

    private String string;

    public Stringa() { }

    public Stringa(String string)
    {
        this.string = string;
    }

    public void run()
    {
        int cnt = string.length() - 1;

        if(cnt >= 0)
        {
            char c = string.charAt(cnt);
            Random rand = new Random();

            int random = rand.nextInt((MAX - MIN) + 1) + MIN;
            System.out.println(c + "\t" + "Time: "+ random);

            String string2 = string.substring(0, cnt);
            Stringa thr2 = new Stringa(string2);

            thr2.start();
            try
            {
                thr2.join();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}