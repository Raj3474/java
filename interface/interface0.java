//introduction to interface,

interface Area // interface defined
{
    float pi = 3.14F;
    float compute (float x, float y);
}

class Rectangle implements Area // interface implemented
{
    public float compute (float x, float y)
    {
        return (x * y);
    }
}

class Circle implements Area
{
    public float compute (float x, float y)
    {
        return (pi * x * x);
    }
}

class interface1
{
    public static void main (String []args)
    {
        Rectangle rect = new Rectangle();
        Circle cir = new Circle();

        // same as above, only Area type reference variable
        // is refering to a Rectangle and Circle objects

        // Area rect = new Rectangle();
        // Area cir = new Circle();

        System.out.println("Area of Rectangle = " + rect.compute (4, 5));
        System.out.println("Area of circle = " + cir.compute (4, 0));
    }
}