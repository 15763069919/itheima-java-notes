package algorithm.����.�ֿ������չ;

import java.util.Scanner;

public class �ֿ���ҽ��� {
    public static void main(String[] args) {
        int[] arr = {27, 22, 30, 40, 36,
                13, 19, 16, 20,
                7, 10,
                43, 50, 48};

        // �����ֿ�
        Block block1 = new Block(22, 40, 0, 4);
        Block block2 = new Block(13, 20, 5, 8);
        Block block3 = new Block(7, 10, 9, 10);
        Block block4 = new Block(43, 50, 11, 13);

        Block[] blocks = {block1, block2, block3, block4};


        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ���ҵ�����");
        int number = sc.nextInt();

        int index = getIndex(arr, blocks, number);

        //6.��ӡ���
        if (index == -1) {
            System.out.println("û���ҵ�" + number);
        } else {
            System.out.println("�ҵ�" + number + "������Ϊ��" + index);
        }
    }

    private static int getIndex(int[] arr, Block[] blocks,int value) {
        //��ȡ���ڿ������
        int blockIndex = getBlockIndex(arr, blocks, value);

        //��ȡ����
        int startIndex = blocks[blockIndex].getStartIndex();
        int endIndex = blocks[blockIndex].getEndIndex();

        //�������ڿ�
        for (int i =startIndex ; i <=endIndex; i++) {
            if(arr[i] == value)
                return i;
        }
        return -1;
    }

    //ȷ�����ڿ�
    private static int getBlockIndex(int[] arr, Block[] blocks, int value) {
        for (int i = 0; i < blocks.length; i++) {
            if (value >= blocks[i].getMin() && value <= blocks[i].getMax()) {
                return i;
            }
        }
        return -1;
    }

}

// Block��
class Block {
    private int min;
    private int max;
    private int startIndex;
    private int endIndex;


    public Block() {
    }

    public Block(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * ��ȡ
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * ����
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * ��ȡ
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * ����
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * ��ȡ
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * ����
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * ��ȡ
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * ����
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{min = " + min + ", max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}

