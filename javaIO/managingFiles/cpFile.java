import java.io.*;

class cpFile
{
    public static void main(String []args)
    {
        String inputFile = args[0];
        String outputFile = args[1];
        try (   FileInputStream in = new FileInputStream(inputFile);
                FileOutputStream out = new FileOutputStream(outputFile)
            )
        {
            int c;
            while (( c = in.read()) != -1)
            {
                out.write(c);
            }
            System.out.println("coping... done");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}