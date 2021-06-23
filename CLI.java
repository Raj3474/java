class CLI
{
    public static void main(String []args)
    {
        System.out.println(args.length);
        String inputFile = args[0];
        String outputFile = args[1];
        System.out.println(inputFile + outputFile);
    }
}