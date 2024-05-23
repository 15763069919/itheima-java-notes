public class demo5 {
    /*
    编程题：题目详见课本p123第五部分编程题。
    用类描述计算机中CPU的速度和硬盘的容量，要求Java应用程序有4个类，名字分别是PC，CPU，HardDisk和Test，其中Test是主类。
    在答题系统中，主类改为Main，为了大家答题方便，提供了模版，请按照模版填写。
    输出说明
    测试输出按照如下格式：Test{cpu=2200, hd=200}
    输出示例
    Test{cpu=2200, hd=200}
     */
    public static void main(String[] args) {
        //创建CPU对象
        CPU cpu = new CPU();
        cpu.setSpeed(2200);
        //创建HardDisk对象
        HardDisk disk = new HardDisk();
        disk.setAmount(200);
        //创建PC对象
        PC pc = new PC();
        pc.setCPU(cpu);
        pc.setHardDisk(disk);
        pc.show();
    }
}

class PC {
    CPU cpu;
    HardDisk HD;

    void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    void setHardDisk(HardDisk HD) {
        this.HD = HD;
    }

    void show() {
        System.out.println("Test{cpu="+cpu.speed+", hd="+HD.amount+"}");

    }

}

class CPU {
    int speed;

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }

}

class HardDisk {
    int amount;

    void setAmount(int amount) {
        this.amount = amount;
    }

    int getAmount() {
        return amount;
    }
}

class Test {

}
