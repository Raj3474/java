// use of stop(), sleep() and yield() methods


class A extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 5; i++)
        {
            if (i == 1)
                yield();
            System.out.println("\tFrom thread A : i = " + i);
        }
        System.out.println("exit from A ");
    }
}

class B extends Thread
{
    public void run()
    {
        for (int j = 0; j <= 5; j++)
        {
            System.out.println("\tFrom Thread B: j = " + j);
            if (j == 3)
                stop();
        }
        System.out.println("exit from B");
    }
}

class C extends Thread
{
    public void run()
    {
        for (int k = 0; k <= 5; k++)
        {
            System.out.println("\tFrom Thread C: k = " + k);
            if (k == 1)
            try
            {
                sleep(1000); // 10000ms
            }
            catch (Exception e)
            {
            }
        }
        System.out.println("exit from C");
    }
}

class ThreadMethods
{
    public static void main(String args[])
    {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        System.out.println("start Thread A");
        threadA.start();

        System.out.println("start Thread B");
        threadB.start();

        System.out.println("start Thread C");
        threadC.start();

        System.out.println("End of main Thread");
    }
}















