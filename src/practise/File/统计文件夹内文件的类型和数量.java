package practise.File;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class 统计文件夹内文件的类型和数量 {

    public static void main(String[] args) {
        System.out.println(getCount(new File("lib")));
    }


    public static HashMap<String, Integer> getCount(File src) {
        HashMap<String, Integer> hm = new HashMap<>();
        //进入文件
        File[] files = src.listFiles();
        //遍历数组
        for (File file : files) {
            //如果是文件 -- 统计
            if (file.isFile()) {
                //统计进HashMap
                String[] arr = file.getName().split("\\.");
                //aaa,  aa.txt, a.a.txt
                //不统计无后缀名的
                if (arr.length >= 2) {
                    String endName = arr[arr.length - 1];
                    //后缀名是否已存在
                    if (hm.containsKey(endName)) {
                        int count = hm.get(endName);
                        count++;
                        //覆盖
                        hm.put(endName, count);
                    } else {
                        hm.put(endName, 1);
                    }
                }
            }
            //如果是文件夹 -- 递归
            else {
                HashMap<String, Integer> sonMap = getCount(file);
                Set<String> sonKeys = sonMap.keySet();
                for (String sonKey : sonKeys) {
                    //如果hm中存在sonKey的键 -- 合并
                    if (hm.containsKey(sonKey)) {
                        int count = sonMap.get(sonKey) + hm.get(sonKey);
                        hm.put(sonKey,count);
                    } else {
                        hm.put(sonKey, sonMap.get(sonKey));
                    }
                }
            }
        }
        return hm;
    }
}
