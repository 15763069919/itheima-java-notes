package practise.networkProgram.ComprehensivePractice.A03_uploadFiles;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/practise/networkProgram/ComprehensivePractice/A03uploadFiles/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/practise/networkProgram/ComprehensivePractice/A03uploadFiles/a_copyTest.txt"));
        int len;
        byte[] bytes = new byte[1024*1024*5];
        while((len=bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();


    }
}
