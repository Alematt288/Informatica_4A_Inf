public class Thread1 extends Thread
{
    private int num;
    private int fattoriale;

    public Thread1() { }

    public Thread1(int num)
    {
        this.num = num;
        this.fattoriale = num;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getFattoriale() {
        return this.fattoriale;
    }

    public void setFattoriale(int fattoriale) {
        this.fattoriale = fattoriale;
    }

    public void run()
    {
        if (this.fattoriale > 1)
        {
            Thread1 thread1 = new Thread1(this.num - 1);
            thread1.start();

            try
            {
                thread1.join();
                System.out.println("Fattoriale{" + thread1.num + "}: " + thread1.fattoriale);
                this.fattoriale = this.num * thread1.getFattoriale();
            }
            catch (InterruptedException var3)
            {
                var3.printStackTrace();
            }
        }
    }
}