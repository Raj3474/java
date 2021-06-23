// threading using runnable interface

class A implements Runnable
{
    public void run()
    {
        int i;
        for (i = 0; i <= 10; i++)
        {
            System.out.println("Thread A " + i);
        }
    }
}

class B implements Runnable
{
    public void run()
    {
        int i;
        for (i = 0; i <= 10; i++)
        {
            System.out.println("Thread B " + i);
        }
    }
}

class thread0
{
    public static void main(String []args)
    {
        Runnable i1 = new A();
        Runnable i2 = new B();

        Thread t1 = new Thread(i1);
        Thread t2 = new Thread(i2);

        t1.start();
        t2.start();
    }
}