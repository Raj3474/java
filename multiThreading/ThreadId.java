// Each thread in a multithreaded program has a unique numeric identifier
// associated with it.

class A extends Thread
{
    public void run()
    {
        System.out.println("This is Thread A\t Thread ID: " +
        Thread.currentThread().getId() + "\tThread Priority: " +
        Thread.currentThread().getPriority());

    }
}

class B extends Thread
{
    public void run()
    {
        System.out.println("This is Thread B\t Thread ID: " +
        Thread.currentThread().getId() + "\tThread Priority: " +
        Thread.currentThread().getPriority());

    }
}

class C extends Thread
{
    public void run()
    {
        System.out.println("This is Thread C\t Thread ID: " +
        Thread.currentThread().getId() + "\tThread Priority: " +
        Thread.currentThread().getPriority());

    }
}

class ThreadId
{
    public static void main(String args[])
    {
        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        // setting the priority of the threads
        threadA.setPriority(Thread.MIN_PRIORITY);
        threadB.setPriority(Thread.NORM_PRIORITY);
        threadC.setPriority(Thread.MAX_PRIORITY);


        System.out.println("\nThis is the main Thread\t Thread ID: " +
        Thread.currentThread().getId() + "\tThread Priority: " +
        Thread.currentThread().getPriority());

        System.out.println("Let's call the other threads in the sequence A -> B -> C\n");

        threadA.start();
        threadB.start();
        threadC.start();
    }
}















