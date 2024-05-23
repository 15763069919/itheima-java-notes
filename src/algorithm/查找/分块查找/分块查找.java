package algorithm.查找.分块查找;

import java.util.Scanner;

public class 分块查找 {
    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 12, 21, 18,
                32, 23, 37, 26, 45, 34,
                50, 48, 61, 52, 73, 66};
        //1.分块（总数的开根号）
//        System.out.println(arr.length); //18,分为4块

        //2.创建三个块的对象
        Block block1 = new Block(21, 0, 5);
        Block block2 = new Block(45, 6, 11);
        Block block3 = new Block(73, 12, 17);

        //3.定义数组用来管理三个块的对象（索引表）
        Block[] blocks = {block1, block2, block3};

        //4.定义一个变量用来记录当前查找的数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找的数：");
        int number = scanner.nextInt();

        //5.调用分块查找算法,传递索引表，数组，要查找的元素
        int index = getIndex(blocks, arr, number);


        //6.打印结果
        if (index == -1) {
            System.out.println("没有找到" + number);
        } else {
            System.out.println("找到" + number + "的索引为：" + index);
        }
    }

    //利用分块查找算法查找元素的索引
    //1.确定number所在的块
    //2.在块中查找number
    private static int getIndex(Block[] blockArr, int[] arr, int number) {
        //1.确定number所在的块
        int blockIndex = getBlockIndex(blockArr, number);
        if (blockIndex == -1) {
            //number不在任何块中
            return -1;
        }
        //2.在块中查找number，获取起始和结束索引
        int startIndex = blockArr[blockIndex].getStartIndex();
        int endIndex = blockArr[blockIndex].getEndIndex();

        //3.遍历块中的元素，查找number
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    //定义一个方法用来确定number所在的块
    private static int getBlockIndex(Block[] blockArr, int number) {
        //1.遍历索引表，找到第一个块的最大值，如果number小于等于最大值，则number在该块中
        for (int i = 0; i < blockArr.length; i++) {
            if (number <= blockArr[i].getMax()) {
                return i;
            }
        }
        return -1;

        //2.利用二分查找法，找到number所在的块
        //！！！我不会！！！
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
     * 获取
     *
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     *
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     *
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     *
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     *
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
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