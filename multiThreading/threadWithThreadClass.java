// implementing threads using Thread class

class A extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 5; i++)
        {
            System.out.println("Thread A " + i);
        }
        System.out.println("Exit from A ");
    }
}

class B extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 5; i++)
        {
            System.out.println("Thread B " + i);
        }
        System.out.println("Exit from B ");
    }
}

class C extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 5; i++)
        {
            System.out.println("Thread C " + i);
        }
        System.out.println("Exit from C ");
    }
}


class thread1
{
    public static void main(String []args)
    {
        A i1 = new A();
        B i2 = new B();
        C i3 = new C();

        i1.start();
        i2.start();
        i3.start();
    }
}







