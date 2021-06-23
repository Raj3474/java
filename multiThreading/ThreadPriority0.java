// prioritizing a thread


class A extends Thread
{
    public void run()
    {
        System.out.println("ThreaA started");
        for (int i = 0; i <= 5; i++)
        {
            System.out.println("\tFrom thread A : i = " + i);
        }
        System.out.println("exit from A ");
    }
}

class B extends Thread
{
    public void run()
    {
        System.out.println("ThreaB started");
        for (int j = 0; j <= 5; j++)
        {
            System.out.println("\tFrom Thread B: j = " + j);
        }
        System.out.println("exit from B");
    }
}

class C extends Thread
{
    public void run()
    {
        System.out.println("ThreadC started");
        for (int k = 0; k <= 5; k++)
        {
            System.out.println("\tFrom Thread C: k = " + k);
        }
        System.out.println("exit from C");
    }
}

class ThreadPriority0
{
    public static void main(String args[])
    {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        // setting the priority of the threads
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority() + 1);
        threadA.setPriority(Thread.MIN_PRIORITY);


        System.out.println("start Thread A");
        threadA.start();

        System.out.println("start Thread B");
        threadB.start();

        System.out.println("start Thread C");
        threadC.start();

        System.out.println("End of main Thread");
    }
}















