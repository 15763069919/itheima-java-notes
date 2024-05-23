package practise.networkProgram.ComprehensivePractice.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class printWriter {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("src/practise/networkProgram/ComprehensivePractice/Test/a.txt");
        PrintWriter pw = new PrintWriter(fos,true);

        pw.write("666");
        pw.close();
    }
}
