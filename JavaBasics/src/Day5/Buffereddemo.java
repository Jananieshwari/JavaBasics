package Day5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class Buffereddemo {
    public static void main(String[] args) throws IOException {  	
        URL resource = Buffereddemo.class.getResource("MVIT.txt");
        if (resource == null) {
            System.err.println("File not found");
            return;
        }
        File file = new File(resource.getFile());
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);

        String line;
        while ((line = reader.readLine()) != null) {
            // Print each line to the console
            System.out.println(line);
        }
        reader.close();
    }
}