package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundDemo {

    public void testFileNotFoundException() {
        File file = new File("E://file.txt");
        try {
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileNotFoundDemo f = new FileNotFoundDemo();
        f.testFileNotFoundException();

    }
}
