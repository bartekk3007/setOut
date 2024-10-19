import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("output.txt");
        PrintStream printStream = new PrintStream(file);
        System.setOut(printStream);
        System.out.println("Printing to file");
    }
}