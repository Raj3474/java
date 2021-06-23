// when a program with different threads try to access a same resource
// in a multithreading program. This may lead to some problems.
// Therefore we use synchronization to avoid such situations in java.

class Pyramid
{
    synchronized void draw_pyramid(char ch)
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < (4 - i); j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

class A extends Thread
{
    Pyramid p;

    A(Pyramid p)
    {
        this.p = p;
    }

    public void run()
    {
        p.draw_pyramid('*');
    }
}

class B extends Thread
{
    Pyramid p;

    B(Pyramid p)
    {
        this.p = p;
    }
    public void run()
    {
        p.draw_pyramid('#');
    }
}

class synchronization0
{
    public static void main(String []args)
    {
        Pyramid pobj = new Pyramid();

        A threadA = new A(pobj);
        B threadB = new B(pobj);

        threadA.start();
        threadB.start();
    }
}











