import java.util.*;

class A
{
    final static int x = 1, y = 2;
}

class B extends A
{
    // static int x = 5;
}

class main
{
    public static void main(String []args)
    {
        int a = B.x;
        System.out.println(a);
    }
}