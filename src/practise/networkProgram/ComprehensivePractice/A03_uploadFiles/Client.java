package practise.networkProgram.ComprehensivePractice.A03_uploadFiles;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建套接字对象
        Socket socket = new Socket(InetAddress.getByName("ckkk"), 10012);

        //2.读取文件 写入服务器
        //创建文件输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/practise/networkProgram/ComprehensivePractice/A03_uploadFiles/a.txt"));
        //获取套接字输出流写入通道
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.flush();

        socket.shutdownOutput();

        //3.接收反馈
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line=br.readLine()) != null){
            System.out.println(line);
        }


        //4.关流
        bis.close();
        socket.close();
    }
}
