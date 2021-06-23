import java.io.*;

class fileIO
{
    public static void main(String []args)
    {
         try
         {
            InputStream f = new FileInputStream("hello.txt");

            System.out.println((char)f.read());

          }
          catch(Exception e)
          {
              System.out.println(e);
          }
    }
}