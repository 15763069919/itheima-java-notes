package practise.networkProgram.ComprehensivePractice.A06_ThreadPoolUploadFile;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable{
    public Socket socket;

    public MyRunnable(Socket socket) {
        this.socket = socket;
    }

    /**
     *
     */
    @Override
    public void run() {
        try {
            //2.读取文件并保存到本地文件
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            //随机名称
            String randomName = UUID.randomUUID().toString().replace("-", "");
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/practise/networkProgram/ComprehensivePractice/A06_ThreadPoolUploadFile/" + randomName + ".txt"));
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            System.out.println("准备读取文件");
            while ((len = bis.read(bytes)) != -1) {
                System.out.println("读取完一次，开始写入本地");
                bos.write(bytes, 0, len);
                System.out.println("写入完本地一次");
            }
            bos.flush();
            System.out.println("文件保存成功");

            //3.反馈
            BufferedWriter  sbw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            System.out.println("准备反馈");
            sbw.write("上传成功！");
            System.out.println("反馈完成");
            sbw.newLine();
            sbw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.关流
            try {
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
