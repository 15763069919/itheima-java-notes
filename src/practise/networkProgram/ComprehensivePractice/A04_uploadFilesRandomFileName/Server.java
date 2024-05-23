package practise.networkProgram.ComprehensivePractice.A04_uploadFilesRandomFileName;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {
        //1.连接客户端
        // 创建服务端套接字对象
        ServerSocket ss = new ServerSocket(10012);

        //死等连接获取客户端套接字
        Socket socket = ss.accept();
        System.out.println("客户端连接成功");

        //2.读取文件并保存到本地文件
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        //随机名称
        String randomName = UUID.randomUUID().toString().replace("-", "");
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/practise/networkProgram/ComprehensivePractice/A04_uploadFilesRandomFileName/"+randomName+".txt"));
        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        System.out.println("文件保存成功");

        //3.反馈
        BufferedWriter sbw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        sbw.write("上传成功！");
        sbw.newLine();
        sbw.flush();

        //4.关流
        sbw.close();
        bos.close();
        socket.close();
        ss.close();
    }
}
