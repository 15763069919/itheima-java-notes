package practise.File;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class ͳ���ļ������ļ������ͺ����� {

    public static void main(String[] args) {
        System.out.println(getCount(new File("lib")));
    }


    public static HashMap<String, Integer> getCount(File src) {
        HashMap<String, Integer> hm = new HashMap<>();
        //�����ļ�
        File[] files = src.listFiles();
        //��������
        for (File file : files) {
            //������ļ� -- ͳ��
            if (file.isFile()) {
                //ͳ�ƽ�HashMap
                String[] arr = file.getName().split("\\.");
                //aaa,  aa.txt, a.a.txt
                //��ͳ���޺�׺����
                if (arr.length >= 2) {
                    String endName = arr[arr.length - 1];
                    //��׺���Ƿ��Ѵ���
                    if (hm.containsKey(endName)) {
                        int count = hm.get(endName);
                        count++;
                        //����
                        hm.put(endName, count);
                    } else {
                        hm.put(endName, 1);
                    }
                }
            }
            //������ļ��� -- �ݹ�
            else {
                HashMap<String, Integer> sonMap = getCount(file);
                Set<String> sonKeys = sonMap.keySet();
                for (String sonKey : sonKeys) {
                    //���hm�д���sonKey�ļ� -- �ϲ�
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
