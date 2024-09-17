import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class copy {
    public static void main(String[] args) {

        String inputName = args[0], outputName = args[1] ;

        File file;
        Scanner input = null;
        PrintWriter output = null;

        try{
            file = new File(inputName);
            input = new Scanner(file);
            output = new PrintWriter(outputName);
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        while (in.hasNextLine()) {
                String value = in.nextLine();
                out.printf("%s%n", value);
        }

        in.close();
        out.close();
    }
}