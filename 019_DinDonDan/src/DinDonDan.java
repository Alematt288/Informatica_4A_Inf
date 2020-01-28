public class DinDonDan
{
    public static void main(String[] args) throws InterruptedException
    {
        Runnable campana1 = new Campana("Din", 5);

        Thread t1 = new Thread(campana1);
        t1.start();

        t1.sleep(1000);

        Runnable campana2 = new Campana("Don", 5);

        Thread t2 = new Thread(campana2);
        t2.start();

        t2.sleep(500);

        Runnable campana3 = new Campana("Dan", 5);

        Thread t3 = new Thread(campana3);
        t3.start();

        t3.sleep(200);


    }
}
