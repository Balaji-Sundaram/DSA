import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.stream.Stream;

public class FileReadingLogic {
    public static void main(String[] args) throws IOException {

        String inFile = "C:\\Users\\BSUNDAR6\\Downloads\\Java\\inF.txt";

        BufferedReader bfR;

        try{
            //the input streams are used in Java 8, they introduced the streams
            // but the buffer reader is introduced in jdk 1.0, so it was born in java 1.0 and still used
            //not the latest way to read, but still it is an old method.
            //********
            //latest approach
            //  Files.readString(): Simple, good for small files.
            //  Files.lines(): Excellent for large files, efficient memory usage.

            bfR = new BufferedReader(new FileReader(inFile)); //used in java 1.0
            System.out.println("Data:" + bfR.readLine());
            System.out.println("Data:" + bfR.readLine());
            System.out.println("Data:" + bfR.readLine());
            System.out.println("Data:" + bfR.readLine());
            bfR.close();

            //for large files, need to use the Streams, and it will not load the whole file
            //so that single line will be read at one and whenever calling the next line, and it will read.
            //Streams given below
            //java 8.0 streams introduced

            //using files
            //here this will pull the entire file, if you want to print the whole file use this,
            //else for checking you should use Streams.
            String fileString =  Files.readString(Path.of(inFile));
            System.out.println("\nPrinting the Whole file: \n"+fileString);



            //streams used with Files
            Stream<String> fileStream =  Files.lines(Path.of(inFile));
            List<String>fileStreamList = fileStream.toList();
            System.out.println("\nPrinting an single line: \n"+fileStreamList.get(0));






        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }




    }
}
