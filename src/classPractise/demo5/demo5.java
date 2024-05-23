public class demo5 {
    /*
    ����⣺��Ŀ����α�p123���岿�ֱ���⡣
    ���������������CPU���ٶȺ�Ӳ�̵�������Ҫ��JavaӦ�ó�����4���࣬���ֱַ���PC��CPU��HardDisk��Test������Test�����ࡣ
    �ڴ���ϵͳ�У������ΪMain��Ϊ�˴�Ҵ��ⷽ�㣬�ṩ��ģ�棬�밴��ģ����д��
    ���˵��
    ��������������¸�ʽ��Test{cpu=2200, hd=200}
    ���ʾ��
    Test{cpu=2200, hd=200}
     */
    public static void main(String[] args) {
        //����CPU����
        CPU cpu = new CPU();
        cpu.setSpeed(2200);
        //����HardDisk����
        HardDisk disk = new HardDisk();
        disk.setAmount(200);
        //����PC����
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
