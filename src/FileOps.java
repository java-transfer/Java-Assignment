package src;

import java.io.FileWriter;
import java.io.File;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileOps {
    public void writeData(String data) {
        try {
            File myFile = new File("results.txt");
            FileWriter writeToFile = new FileWriter(myFile);
            writeToFile.write(data);

            writeToFile.flush();
            writeToFile.close();

        } catch (IOException ioException) {
            System.out.println("Cannot save this file");
        }
    }

    public void appendData(String data) {
        try {
            File myFile = new File("test.txt");
            FileWriter fileWriter = new FileWriter(myFile);

            BufferedWriter bufferedWritter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWritter);

            printWriter.println(data);

            printWriter.flush();
            printWriter.close();

        } catch (IOException ioException) {
            System.out.println("Cannot save this file");
        }
    }
}
