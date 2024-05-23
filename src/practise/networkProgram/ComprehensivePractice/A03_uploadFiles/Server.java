package practise.networkProgram.ComprehensivePractice.A03_uploadFiles;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.连接客户端
        // 创建服务端套接字对象
        ServerSocket ss = new ServerSocket(10012);

        //死等连接获取客户端套接字
        Socket socket = ss.accept();

        //2.读取文件并保存到本地文件
        //获取套接字输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        //创建文件输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/practise/networkProgram/ComprehensivePractice/A03_uploadFiles/a_copy.txt"));
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.flush();

        //3.反馈
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("【服务端】：上传成功！");
        bw.newLine();
        bw.flush();

        //4.关流
        bos.close();
        socket.close();
        ss.close();
    }
}
