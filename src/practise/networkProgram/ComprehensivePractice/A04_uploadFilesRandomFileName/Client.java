package practise.networkProgram.ComprehensivePractice.A04_uploadFilesRandomFileName;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建套接字对象
        Socket socket = new Socket(InetAddress.getByName("ckkk"), 10012);
        System.out.println("服务端连接成功");

        //2.读取文件 写入服务器
        //使用字节流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/practise/networkProgram/ComprehensivePractice/A04_uploadFilesRandomFileName/a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        System.out.println("文件读取成功");
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.flush();
        System.out.println("文件上传成功");

        //结束标志
        socket.shutdownOutput();

        //3.接收反馈
        BufferedReader sbr =new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while((line = sbr.readLine()) != null){
            System.out.print(line);
        }

        //4.关流
        sbr.close();
        bis.close();
        socket.close();
    }
}
