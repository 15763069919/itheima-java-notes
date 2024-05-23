package practise.IO.comprehensiveExercises.软件运行次数;

import java.io.*;

public class demo1 {
    public static void main(String[] args) throws IOException {
        //创建字节缓冲流对象
        BufferedReader fr = new BufferedReader(new FileReader("lib/txt/codeRunNumber.txt"));
        //计数器
        int count = 0;
        //记录读取到的一行数据
        String line;
        while((line = fr.readLine()) != null){
            count = Integer.parseInt(line);
        }
        //释放资源
        fr.close();
        if(count <= 3){
            System.out.println("欢迎使用本软件，第"+count+"次使用免费~");
        }else{
            System.out.println("本软件只免费使用3次，欢迎您注册会员后继续使用~");
        }
        count++;
        //写入
        BufferedWriter bw = new BufferedWriter(new FileWriter("lib/txt/codeRunNumber.txt"));
        bw.write(count+"");
        bw.close();
    }
}
