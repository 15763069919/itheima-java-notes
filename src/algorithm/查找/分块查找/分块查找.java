package algorithm.����.�ֿ����;

import java.util.Scanner;

public class �ֿ���� {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        //1.�ֿ飨�����Ŀ����ţ�
//        System.out.println(arr.length); //18,��Ϊ4��

        //2.����������Ķ���
        Block block1 = new Block(21, 0, 5);
        Block block2 = new Block(45, 6, 11);
        Block block3 = new Block(73, 12, 17);

        //3.����������������������Ķ���������
        Block[] blocks = {block1, block2, block3};

        //4.����һ������������¼��ǰ���ҵ���
        Scanner scanner = new Scanner(System.in);
        System.out.println("������Ҫ���ҵ�����");
        int number = scanner.nextInt();

        //5.���÷ֿ�����㷨,�������������飬Ҫ���ҵ�Ԫ��
        int index = getIndex(blocks, arr, number);


        //6.��ӡ���
        if (index == -1) {
            System.out.println("û���ҵ�" + number);
        } else {
            System.out.println("�ҵ�" + number + "������Ϊ��" + index);
        }
    }

    //���÷ֿ�����㷨����Ԫ�ص�����
    //1.ȷ��number���ڵĿ�
    //2.�ڿ��в���number
    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        //1.ȷ��number���ڵĿ�
        int blockIndex = getBlockIndex(blockArr, number);
        if (blockIndex == -1) {
            //number�����κο���
            return -1;
        }
        //2.�ڿ��в���number����ȡ��ʼ�ͽ�������
        int startIndex = blockArr[blockIndex].getStartIndex();
        int endIndex = blockArr[blockIndex].getEndIndex();

        //3.�������е�Ԫ�أ�����number
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    //����һ����������ȷ��number���ڵĿ�
    private static int getBlockIndex(Block[] blockArr, int number) {
        //1.�����������ҵ���һ��������ֵ�����numberС�ڵ������ֵ����number�ڸÿ���
        for (int i = 0; i < blockArr.length; i++) {
            if (number <= blockArr[i].getMax()) {
                return i;
            }
        }
        return -1;

        //2.���ö��ֲ��ҷ����ҵ�number���ڵĿ�
        //�������Ҳ��ᣡ����
    }
}

class Block {
    private int max;
    private int startIndex;
    private int endIndex;

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * ��ȡ
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * ����
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * ��ȡ
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * ����
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * ��ȡ
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * ����
     *
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}