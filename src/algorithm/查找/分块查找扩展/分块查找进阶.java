package algorithm.查找.分块查找扩展;

import java.util.Scanner;

public class 分块查找进阶 {
    public static void main(String[] args) {
        int[] arr = {27, 22, 30, 40, 36,
                13, 19, 16, 20,
                7, 10,
                43, 50, 48};

        // 创建分块
        Block block1 = new Block(22, 40, 0, 4);
        Block block2 = new Block(13, 20, 5, 8);
        Block block3 = new Block(7, 10, 9, 10);
        Block block4 = new Block(43, 50, 11, 13);

        Block[] blocks = {block1, block2, block3, block4};


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数：");
        int number = sc.nextInt();

        int index = getIndex(arr, blocks, number);

        //6.打印结果
        if (index == -1) {
            System.out.println("没有找到" + number);
        } else {
            System.out.println("找到" + number + "的索引为：" + index);
        }
    }

    private static int getIndex(int[] arr, Block[] blocks,int value) {
        //获取所在块的索引
        int blockIndex = getBlockIndex(arr, blocks, value);

        //获取索引
        int startIndex = blocks[blockIndex].getStartIndex();
        int endIndex = blocks[blockIndex].getEndIndex();

        //遍历所在块
        for (int i =startIndex ; i <=endIndex; i++) {
            if(arr[i] == value)
                return i;
        }
        return -1;
    }

    //确定所在块
    private static int getBlockIndex(int[] arr, Block[] blocks, int value) {
        for (int i = 0; i < blocks.length; i++) {
            if (value >= blocks[i].getMin() && value <= blocks[i].getMax()) {
                return i;
            }
        }
        return -1;
    }

}

// Block类
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
     * 获取
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "Block{min = " + min + ", max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}

