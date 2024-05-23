<a name="e77tR"></a>
# idea
<a name="qPpFt"></a>
## 快捷键
ctrl  + alt + l		整理代码<br />ctrl + alt + m		自动抽取方法(避免代码重复)<br />ctrl + insert 		生成 Javabean<br />ctrl + shift + ， 	【插件】 一键生成标准 JavaBean<br />ctrl + p			展示方法和对应参数<br />ctrl + alt + v 		自动生成对应变量<br />ctrl + b			跟进原码<br />ctrl + alt + t		包裹方式 <br />alt + 回车			拆分为定义和声明<br />ctrl + alt + u		小写变大写<br />ctrl + f12			查看构造方法<br />ctrl + n			查找方法<br />ctrl+alt+左箭头	返回上一级
<a name="A0Z5Y"></a>
## 中文乱码 -- 都改成GBK
<a name="zgUUP"></a>
## 解释
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713677660952-c3b7594a-e001-445f-bba3-dc5c22662b50.png#averageHue=%23cfc7ba&clientId=u1e2d30ff-952f-4&from=paste&height=810&id=u83a3d95d&originHeight=1619&originWidth=2085&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1942460&status=done&style=none&taskId=u758a7238-f864-4d03-b05b-b1a2c490eee&title=&width=1042.5)
:::info
圆圈内有个 c：class<br />圆圈内有个 m：method

方法右边灰色的 “↑”：本方法重写了箭头后面的方法<br />方法右边灰色的 “→”：本方法继承了箭头后面的方法，来自于哪个类或者哪个接口当中
:::

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713677805633-f68042ba-0b50-40b9-97c3-1f4de34992a7.png#averageHue=%23e9ddc9&clientId=u1e2d30ff-952f-4&from=paste&height=487&id=u0c9b7516&originHeight=974&originWidth=1383&originalType=binary&ratio=2&rotation=0&showTitle=false&size=873823&status=done&style=none&taskId=ud3314e4d-b618-4508-b73d-0d91542d54a&title=&width=691.5)
> 圆圈内有个 f：field


![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713677864701-34d3f04b-e179-446a-b92e-266df3b193ce.png#averageHue=%23e4e0ca&clientId=u1e2d30ff-952f-4&from=paste&height=64&id=u986454a4&originHeight=127&originWidth=615&originalType=binary&ratio=2&rotation=0&showTitle=false&size=62416&status=done&style=none&taskId=u6cb2831f-efa3-4909-98f3-f84dd63f598&title=&width=307.5)
> Interface

<a name="EVVxr"></a>
# java
<a name="tWUXV"></a>
## jar
存储 class 文件
<a name="VT0H4"></a>
### 文档性质的
作为第三方类库导入
<a name="zLFpL"></a>
### 可运行的

<a name="eYnwA"></a>
## 文档生成器

<a name="a3ne3"></a>
### 文件注释
/**<br />*@author <br />*/
<a name="ChkYP"></a>
### 抽取文件注释：idea - 文档 - 
<a name="r0yvp"></a>
## 看方法名猜方法作用
isEmpty 是否为空<br />forEach 遍历



<a name="RoA46"></a>
# 自写 Util
<a name="ImQmr"></a>
## 计算程序运行时间
```java
package util;

public class getTimeUtil {
    private getTimeUtil(){}
    public static void getSystemTimeUtil() {
        //纳秒ns：
        long startTime = System.nanoTime(); //获取开始时间
        // 要测的程序或方法
        long endTime = System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： " + (endTime - startTime) + "ns");
    }
}
```
<a name="AOLb0"></a>
# 程序开头格式	大写字母类，小写字母变量
```java
public class  文件名 { 		//类定义
    public static void main(String[] args){		//在idea中可以输入 psvm + Tab
        .....
    }
}
```
<a name="ChJQi"></a>
# 输入输出
<a name="pwEiQ"></a>
## 输入
```java
//导包 -- Scanner这个类在哪
import java.util.Scanner;	//导包的动作必须出现在类定义上面
//创建对象 -- 表示我要开始用Scanner这个类了
Scanner sc = new Scanner(System.in);//只有sc是变量名,可以变,其余都不能变
//接收数据 -- 真正开始干活了
 int i = sc.nextInt();//只有i是变量名,可以改变,其余都不能变
```
<a name="IO4Qa"></a>
### 第一套体系：（遇到空格、制表符、回车停止接收）
<a name="V89D4"></a>
#### nextInt（）；接收整数
<a name="tDsoG"></a>
#### nextDouble（）；接收小数
<a name="EQv8O"></a>
#### next（）；接收字符串
<a name="JrOng"></a>
### 第二套体系：（遇到空格、制表符、回车不停止接收）
<a name="yfhHX"></a>
#### nextLine（）；接收字符串
<a name="XpBKu"></a>
## println 输出
```java
System.out.println();	//打印并换行
System.out.print();	//打印不换行
```
eg :<br />类比 c 语言中打印汉字加变量的值 : printf("共有 %d 个" , num) ;<br />Java 有 : System . out . println ( "共有" + num + "个" ) ;

打印在同一行<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707205369364-7f9b1922-216c-47ae-9350-673bdecc9c17.png#averageHue=%23fafaf9&clientId=u4839fcdf-be61-4&from=paste&height=477&id=nLLTk&originHeight=954&originWidth=1110&originalType=binary&ratio=2&rotation=0&showTitle=false&size=386227&status=done&style=none&taskId=u4300288d-a01e-4599-b430-c9f339bca5a&title=&width=555)<br />eg :
```java
public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else System.out.print(arr[i] + ",");
        }
    }
```
<a name="sY1nh"></a>
## print 输出
System.out.printf( );<br />类似 c 语言，可以用占位符%d、%s 等等<br />但不会自动换行
<a name="eDSoH"></a>
# 数据类型			取值范围byte < short < int < long < float < double
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708150541931-fd967735-915f-4339-8e67-9b9bb1c30eb9.png#averageHue=%23f2f1f1&clientId=u825d5cbb-b262-4&from=paste&height=619&id=uc0dbb058&originHeight=1237&originWidth=2540&originalType=binary&ratio=2&rotation=0&showTitle=false&size=629968&status=done&style=none&taskId=u2d6d402e-be1c-4664-8531-c7fa7e9dbad&title=&width=1270)
<a name="NHUfT"></a>
## 大全	字节都是 2^n
<a name="ZMQbO"></a>
### byte	一个字节		-128~127
byte b = 1;<br />b = b + 1;	//err ，变量+int 型=int 型
<a name="R1WWm"></a>
### short	两个字节
<a name="ljbQ7"></a>
### int		四个字节
<a name="D0xPy"></a>
### long 需要加入 L 标识符 (大小写都可)	八个字节		64 位
<a name="VnWsS"></a>
### float 需要加入 F 标识符 (大小写都可)	四个字节
<a name="fJ3Ds"></a>
### double	八个字节		保留 16 位有效数字
<a name="D5U1J"></a>
### char		Unicode 表中		\u 加上位次（十六进制）可表示字符，eg：\u0041 表示'A'
<a name="mj1kV"></a>
### boolean
<a name="tn7X7"></a>
### String
<a name="cQ4s6"></a>
## 基本数据类型
<a name="d5xkq"></a>
### 分类
<a name="IaHnG"></a>
#### 整数类型
<a name="MYv3R"></a>
#### 浮点类型
<a name="wlI9p"></a>
#### 布尔类型
<a name="v0qVg"></a>
#### 字符类型
<a name="np14D"></a>
### 内存图
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708150421400-3a356b5c-40a8-4dcb-b1be-1c24a7ee4e48.png#averageHue=%23f6f0e8&clientId=u825d5cbb-b262-4&from=paste&height=612&id=u1d65f212&originHeight=1224&originWidth=2199&originalType=binary&ratio=2&rotation=0&showTitle=false&size=341906&status=done&style=none&taskId=u6e4d014d-e489-4840-80ea-5276aeff53d&title=&width=1099.5)
<a name="gvEvw"></a>
## 引用数据类型
<a name="xrrOW"></a>
### 分类
除基本数据类型以外的其他所有类型
<a name="cNRBr"></a>
### 内存图
<a name="hdEAM"></a>
#### 定义对象
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708150471349-b7b8c5fa-950e-450f-abe5-e05dd3b5a2ca.png#averageHue=%23f5ede4&clientId=u825d5cbb-b262-4&from=paste&height=636&id=u6c8b3c3f&originHeight=1272&originWidth=2661&originalType=binary&ratio=2&rotation=0&showTitle=false&size=642443&status=done&style=none&taskId=u2306b715-30dd-461f-928c-567593d542a&title=&width=1330.5)
<a name="vSObC"></a>
#### 数组
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708150510110-e0fd34b9-987b-40d9-b2ad-60febd0bd94f.png#averageHue=%23f9f2e8&clientId=u825d5cbb-b262-4&from=paste&height=645&id=u5f35d6e0&originHeight=1289&originWidth=2673&originalType=binary&ratio=2&rotation=0&showTitle=false&size=576929&status=done&style=none&taskId=u2ac659af-f31f-47fd-9c61-624929a82ab&title=&width=1336.5)
<a name="KinIV"></a>
# 运算符
取值范围byte < short < int < long < float < double
<a name="b9RTk"></a>
## 转换
<a name="odRg4"></a>
### 隐式转换
取值范围小的数值 -> 取值范围大的数值
<a name="kBS23"></a>
### 强制转换
取值范围大的数值 -> 取值范围小的数值
<a name="yQNcc"></a>
## 加法
<a name="Gz6sX"></a>
### 字符串加数字
```java
System.out.println("123"+123);	//"123123"	字符串加数字
System.out.println(123+123);	//246
```
<a name="l27M6"></a>
### 字符加数字 , 字符加字符
会把字符通过ASCII码查询到对应数字再进行计算
<a name="zeslJ"></a>
## 除法  整数/整数=整数
如下计算时,<br />整数除以整数输出整数
```java
System.out.println(10 / 3);		//结果为3
```
<a name="MCzg9"></a>
## 数值拆分公式总结
<a name="G5a4o"></a>
### 例题
123拆为个位,十位,百位.
<a name="B8eup"></a>
### 数值拆分公式总结
个位 : 数值 % 10		123 % 10 = 3<br />十位 : 数值 / 10 % 10	123 /10 % 10 = 2<br />百位 : 数值 / 100 % 10	123 / 100 % 10 = 1<br />千位 :  数值 / 1000 % 10 <br />...
<a name="sC1FL"></a>
### 代码实现
```java
package com.itheima.AB算法;

import java.util.Scanner;   //导包

public class AB获取个位 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数值:");
        int number = sc.nextInt();
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100 % 10;
        System.out.println(ge);
        System.out.println(shi);
        System.out.println(bai);
    }

}

```

<a name="SiX1l"></a>
## 逻辑运算符（不常用）
<a name="GR0F2"></a>
### 与 : &	区别c语言的 &&
<a name="npmjD"></a>
### 或 : |		区别c语言的 ||
<a name="OS7gz"></a>
### 其余和c语言一样
<a name="PlRXL"></a>
## 短路逻辑运算符（常用）
若式子左边能确定整个表达式的结果 , 则右边不继续执行
```java
int a = 10;
int b = 10;
boolean result = ++a < 5 && ++b < 5;
System.out.println(result);//false
System.out.println(a);//11	//判断到 ++a<5 时式子已经为false,故不继续进行 ++b < 5 的判断
System.out.println(b);//10
```
<a name="OmZ1H"></a>
### 短路与 : &&	同 c 语言
<a name="Qa6Ai"></a>
### 短路或 : ||		同 c 语言
<a name="dM2NF"></a>
## 三元运算符	...？...：...；
同c语言
<a name="bKhkW"></a>
## 【难】其他运算符
<a name="y8x2k"></a>
### 左移 <<
向左移动 , 低位补0
<a name="sdYYN"></a>
### 右移 >>
向右移动 , 高位补(如果原来的数字为负)1或(如果原来的数字为正)0
<a name="CncMs"></a>
### 无符号右移 >>>
向右移动 , 高位补0
<a name="x8Ddz"></a>
## instanceof 运算符
当父类存在多个子类，可以使用此判断是否为该对象，进行对应操作<br />张三如果是老虎这个类创建的对象，则张三 instancepf 老虎，返回 true
<a name="plcE2"></a>
## 运算符的重载
sout("1"+2);	//12	看前面，是字符串，所以 2 调用了 toString 方法
<a name="bAJBY"></a>
# 【难】原码反码补码
1bit(比特)<br />1byte(字节)=8bit(比特)
<a name="VlQTx"></a>
## 原码
<a name="CnLUs"></a>
### 定义
十进制数的二进制的表现形式 , 最左边为符号位 , 0为正 , 1为负
<a name="fR7kG"></a>
### 弊端
对于负数计算时会出错,因为符号位不变,负数加一只会加数字,例如在原码中-2+1只会对数字加1得-3,违背数学理论
<a name="Cx9W5"></a>
## 反码
为了解决原码不能计算负数的问题而出现的
<a name="rMBzd"></a>
### 正数的反码是其本身
<a name="GdktC"></a>
### 负数的反码是符号位不变 , 其余位取反
<a name="JDX5s"></a>
## 补码
eg：<br />-3的8位原码、反码和补码是：<br />原码：1000 0011 <br />反码：1111 1100<br />补码：1111 1101
<a name="eb1vd"></a>
### 正数的补码是其本身
<a name="bXBZG"></a>
### 负数的补码是在其反码的基础上+1
<a name="raSPo"></a>
## 规律：1.正数的原码反码补码相同。2.

<a name="zxjLX"></a>
## 原码反码补码
<a name="TKTUQ"></a>
### 原码：十进制->二进制，正 0 负 1，不能进行数学加法减计算（数字和符号分离，计算只会在数字上计算）
<a name="BN2xq"></a>
### 反码：正不变负除符号位取反
<a name="f6GcH"></a>
### 补码：正不变负反码+1
<a name="qNL0T"></a>
# 判断
同 c 语言
<a name="HyEvn"></a>
## if
<a name="F1R3y"></a>
## switch
<a name="y4s3b"></a>
### 注:
<a name="shYOB"></a>
#### 可使用 case 1,2,3,4,5 :.......... ;
<a name="BHoCa"></a>
#### 可使用 case -> .......... ;	//箭头这种用法可不用加 break
<a name="fBgI2"></a>
#### 表达式的值可以是 String
<a name="NDxOF"></a>
# 循环
<a name="eKITM"></a>
## 可在循环前写 loop：，然后可以通过 break loop;跳过此循环
<a name="OLYfJ"></a>
## 停止虚拟机运行：System.exit(0)
<a name="R0DAZ"></a>
## for
<a name="Ivwi5"></a>
## while
<a name="t9kom"></a>
## do......while
<a name="t46iX"></a>
## for each
for 进阶遍历 for(int i:a){sout(i);}
<a name="G2dEN"></a>
# algorithm
<a name="bbrRy"></a>
## 数值逐位倒置
```java
public class 数值逐位倒置 {
    public static void main(String[] args) {
       
        int x = 12345;
        int num = 0;
        while(x!=0)
        {
            int ge = x % 10;    //取余,即取每个数的个位数
            x = x / 10; //java中整数除以整数仍是整数,即去掉个位数
            num = num * 10 + ge;    //把每个个位数变为十位,百位,千位,万位
        }
        System.out.println(num);
    }
}

```
<a name="Db3pu"></a>
## 判断是否为回文数(eg: 12321,1234554321)
<a name="R4qQB"></a>
### 思路:   
<a name="z20mE"></a>
#### 1.把数倒过来 (见算法(一))
<a name="POgA8"></a>
#### 2.比较是否一样
<a name="IQEHu"></a>
### 代码实现:
<a name="Z2Rqw"></a>
## 字符串反转两种方法
[https://www.yuque.com/ckkkk-mmgvr/nw3cgc/wu1ie2ic6z6snopi#gkhSc](#gkhSc)
<a name="QIUx4"></a>
## 查找
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712839994618-6bb9d52a-83fa-4653-a7a9-a690ffeb46d1.png#averageHue=%23fcf8f7&clientId=uaa21001a-1a3e-4&from=paste&height=432&id=uebf45b6d&originHeight=864&originWidth=2346&originalType=binary&ratio=2&rotation=0&showTitle=false&size=357650&status=done&style=none&taskId=uf3ee4ef8-5201-47af-9860-2d1bbaeff9a&title=&width=1173)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712833094238-14f41393-931c-4851-aa10-eb81ac16c6f9.png#averageHue=%23fdfafa&clientId=uaa21001a-1a3e-4&from=paste&height=554&id=u405ad22b&originHeight=1108&originWidth=2534&originalType=binary&ratio=2&rotation=0&showTitle=false&size=572708&status=done&style=none&taskId=uf4fe7d05-9f4f-47e7-93a5-0cbe7902a5d&title=&width=1267)
<a name="DEB0a"></a>
### 二分查找（折半查找）
把数组小到大排列，找中间的数，对比要查找的数，大于中间数则在数组后半段，小于中间数则在数组前半段

```java
package algorithm.查找;

import java.util.Arrays;

import

public class 二分查找 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 5, 4, 2, 3, 6, 5};
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(halfSearch(arr, 6));
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }

    public static Boolean halfSearch(int[] arr, int num) {
        int i = 0;  //左指针
        int j = arr.length - 1; //右指针
        while (i <= j) { //左指针大于右指针
            int half = (i + j) / 2; //一半
            if (num == arr[half]) { //相等
                return true;
            } else if (num > arr[half]) {   //
                i = half + 1;
            } else {
                j = half - 1;
            }
        }
        return false;
    }
}
```
<a name="NhQrm"></a>
### 插值查找（二分查找进阶版） --   前提：数值里面的数据要分布均匀
在折半查找的基础上，对 half 指针进行处理移动<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712832783162-a9b9d510-c9f5-4c2e-89df-a1fbe24f9582.png#averageHue=%23f8f4f4&clientId=uaa21001a-1a3e-4&from=paste&height=387&id=u0a634146&originHeight=774&originWidth=1492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=256818&status=done&style=none&taskId=u451acba6-9533-46d3-9c66-693d4e8a959&title=&width=746)

```java
package algorithm.查找;

import util.getTimeUtil;

import java.util.Arrays;

public class 插值查找_改进版二分查找 {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 5, 4, 2, 3, 6, 5};
        System.out.println(Arrays.toString(arr));
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(halfSearch(arr, 6));
        getTimeUtil.getSystemTimeUtil();
    }

    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }

    public static Boolean halfSearch(int[] arr, int num) {
        int min = 0;  //左指针
        int max = arr.length - 1; //右指针
        while (min <= max) { //左指针大于右指针
            //            int half = (min + max) / 2; //一半
            int half = (num - min) / (arr[max] - arr[min]) * (max - min);
            if (num == arr[half]) { //相等
                return true;
            } else if (num > arr[half]) {   //
                min = half + 1;
            } else {
                max = half - 1;
            }
        }
        return false;
    }
}
```
<a name="Yiz8B"></a>
### 斐波那契查找（二分查找改进）
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712833068360-00432810-da5b-4a34-8ae2-3dc19bb19445.png#averageHue=%23f8f2f2&clientId=uaa21001a-1a3e-4&from=paste&height=512&id=ue3242b82&originHeight=1024&originWidth=2408&originalType=binary&ratio=2&rotation=0&showTitle=false&size=223267&status=done&style=none&taskId=u984e648b-11c5-444f-909c-b58af2db2de&title=&width=1204)
<a name="pGZvy"></a>
### 分块查找

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712833169133-05c20208-897d-48c5-a098-8b9f6922f041.png#averageHue=%23fbf8f8&clientId=uaa21001a-1a3e-4&from=paste&height=621&id=u63d6b59a&originHeight=1242&originWidth=2552&originalType=binary&ratio=2&rotation=0&showTitle=false&size=259090&status=done&style=none&taskId=u2f7c534a-06d3-4167-ad6d-459fcceaa3c&title=&width=1276)
<a name="CB9v8"></a>
#### 步骤：
<a name="XVu7H"></a>
##### 把数据分成 n 多的小块![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712833233653-41f47ff8-5e59-4cfa-934b-c89851c1ea4a.png#averageHue=%232293c4&clientId=uaa21001a-1a3e-4&from=paste&height=598&id=ua3cb9fc4&originHeight=1196&originWidth=2546&originalType=binary&ratio=2&rotation=0&showTitle=false&size=775253&status=done&style=none&taskId=u07f3ddee-e969-421c-9757-b3e599bb278&title=&width=1273)
<a name="rOl3i"></a>
##### 存储小块![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712833400241-ee499ff6-7f93-4a7b-b5a6-f6695af4cb92.png#averageHue=%23fbf3ec&clientId=uaa21001a-1a3e-4&from=paste&height=569&id=u6ff03d84&originHeight=1138&originWidth=2660&originalType=binary&ratio=2&rotation=0&showTitle=false&size=525834&status=done&style=none&taskId=u354e657a-d997-425d-9600-7240e5facd0&title=&width=1330) 
<a name="ZQDMf"></a>
##### 将待查找的数据与每一块的 max 进行比较，找到小于 max 的最大区域，可使用二分查找
<a name="apkEo"></a>
##### 在块中挨个往后找

<a name="qI3Sc"></a>
#### 代码

```java
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
```

<a name="L1SaA"></a>
### 拓展的分块查找（无规律的数据）


![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712837309430-e412a78a-0b33-4db8-8542-b070d1436975.png#averageHue=%23fbf3f2&clientId=uaa21001a-1a3e-4&from=paste&height=600&id=u5f34394d&originHeight=1200&originWidth=2710&originalType=binary&ratio=2&rotation=0&showTitle=false&size=502140&status=done&style=none&taskId=u6708df51-1b20-4cc9-8350-c9818299e2c&title=&width=1355)

```java
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

    private static int getIndex(int[] arr, Block[] blocks, int value) {
        //获取所在块的索引
        int blockIndex = getBlockIndex(arr, blocks, value);

        //获取索引
        int startIndex = blocks[blockIndex].getStartIndex();
        int endIndex = blocks[blockIndex].getEndIndex();

        //遍历所在块
        for (int i = startIndex; i <= endIndex; i++) {
            if (arr[i] == value)
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


```
<a name="DCbyw"></a>
## 排序
<a name="Y6KUj"></a>
### 选择法排序	
每一次找出最小的排在前面
<a name="rQ3Ui"></a>
### 选择法排序进阶
找出最小和最大的排到前面和后面
<a name="hGiL2"></a>
### 插入排序

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712840231608-9bcacd05-b406-4c12-9ebd-92c95e347c82.png#averageHue=%23fcf9f6&clientId=uaa21001a-1a3e-4&from=paste&height=680&id=ue05939d8&originHeight=1360&originWidth=2739&originalType=binary&ratio=2&rotation=0&showTitle=false&size=586675&status=done&style=none&taskId=u5fa3fdd7-a70e-4c0e-8c59-3209b228433&title=&width=1369.5)

从无序中挨个向有序放，并从右往左进行遍历，若大于这个无需的数，则交换位置，若小于，则循环停止

```java
package algorithm.排序.插入排序;

import java.util.Arrays;

public class 插入排序 {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        System.out.println(Arrays.toString(arr));


        //1.寻找无序开始的索引
        int startIndex = -1;
        for (int i = 0; i < arr.length; i++) {//从头遍历寻找
            if (arr[i] > arr[i + 1]) {  //如果不是小->大
                //                System.out.println(i);
                startIndex = i + 1; //记录下一位，即无序开始索引
                break;
            }
        }
        //2.依次得到无序的每一个元素
        //{3, 44,       38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48}
        for (int i = startIndex; i < arr.length; i++) { //遍历无序
            for (int j = i - 1; j >= 0; j--) {    //倒叙遍历有序
                if (arr[i] < arr[j]) {  //取出的数若比有序的小，则交换位置
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i -= 1; //移动指针持续指向原数
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
```
<a name="tRYuK"></a>
### 快速排序

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712927704384-602e07db-1371-413e-9ef4-9cc9d3effcd9.png#averageHue=%23f8f0ef&clientId=u5bc5484d-1293-4&from=paste&height=685&id=ueb286a82&originHeight=1370&originWidth=2622&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1346394&status=done&style=none&taskId=uc66a3ac5-5239-4874-a8c3-3d9e6d45740&title=&width=1311)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712922669820-3f7b325f-bd2a-4425-8813-10872224e88a.png#averageHue=%23f6f4f3&clientId=uc5d2a69d-90e9-4&from=paste&height=565&id=ucf10c6fe&originHeight=1130&originWidth=2164&originalType=binary&ratio=2&rotation=0&showTitle=false&size=266355&status=done&style=none&taskId=ud9e492f6-54fa-4457-a495-d487b55401b&title=&width=1082)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712922684233-70d5308d-9a7b-4ac6-b6a5-d754b8442894.png#averageHue=%23faf8f8&clientId=uc5d2a69d-90e9-4&from=paste&height=628&id=u9e8aab0d&originHeight=1256&originWidth=2486&originalType=binary&ratio=2&rotation=0&showTitle=false&size=402581&status=done&style=none&taskId=ud83e0125-528f-4564-8c90-a26b0a0c031&title=&width=1243)
<a name="VOcDT"></a>
#### 步骤：

1. <br />

找到后互换位置，然后继续查找。<br />双指针碰撞的位置就是基准数的位置，即交换 基准数位置上的数 和 基准数 的位置

2.  

在次基准数左右分别继续寻找基准数，重复此操作
<a name="NssPC"></a>
#### 问题

1. 快速排序手写，交换：
```java
//利用end，从后往前，找比基准数小的数字
while (true) {
    if (end <= start || arr[end] < baseNumber) {
        break;
    }
    end--;
}
//利用start，从前往后，找比基准数大的数字
while (true) {
    if (end <= start || arr[start] > baseNumber) {
        break;
    }
    start++;
}
```
的位置，为什么会改变结果<br />解答：
:::warning
因为先移动end可以确保第一个找到的是小于基准数的，如果是先动start先找到的就是大于基准数的，如果要先动start基准数应该从数组最后开始，个人是这么理解的，不知道对不对
:::
先移动 start：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712927596355-2f6fdaf4-8e0a-4132-8b0e-4bd2734a45c3.png#averageHue=%23f8f6f6&clientId=u99b21357-7875-4&from=paste&height=407&id=ub3c9193c&originHeight=814&originWidth=1492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=200401&status=done&style=none&taskId=u817837a1-6b00-4d39-b0e1-bed667a449d&title=&width=746)<br />先移动 end：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712927630304-3c45a9b8-cede-4976-8c7d-aaeb6c83bfe2.png#averageHue=%23faf5f4&clientId=u99b21357-7875-4&from=paste&height=602&id=u6d677227&originHeight=1204&originWidth=2412&originalType=binary&ratio=2&rotation=0&showTitle=false&size=311333&status=done&style=none&taskId=u3e8e240a-08d1-4727-9588-8e90f9dde3e&title=&width=1206)
<a name="YcULV"></a>
## 一维数组转二维数组
:::info
//法一：遍历一维数组<br />//        for (int i = 0; i < tempArr.length; i++) {<br />//            arr[i / 4][i % 4] = tempArr[i];<br />//        }
:::
<a name="QOb8w"></a>
## 求最大公约数 -- 辗转相除法
A = B * q + R<br />（A,B) = (B,R)
<a name="eUeJp"></a>
# 类
<a name="PGKxS"></a>
## 类的定义及约束

<a name="TRCTF"></a>
## 成员变量和成员方法	见面向对象
<a name="qgNuP"></a>
## 类的分类
<a name="he0x3"></a>
### JavaBean 类：用来描述一类事物的类，比如：Student、Teacher、Dog、Cat 等。需要提供：空参构造，全参构造，get，set，成员方法。
<a name="zZDbb"></a>
### 测试类：检查其他的类是否书写正确的类，带有 main 方法的类是程序的入口。
<a name="ZokGQ"></a>
### 工具类：不是用来描述一类事物的，而是帮我们做一些事情的类。
<a name="Rlqs5"></a>
## Scanner输入
```java
//导包 -- Scanner这个类在哪
import java.util.Scanner;	//导包的动作必须出现在类定义上面

public class 输入 {
	public static void main (String[] args) {
		
		//创建对象 -- 表示我要开始用Scanner这个类了
		Scanner sc = new Scanner(System.in);//只有sc是变量名,可以变,其余都不能变
		//接收数据 -- 真正开始干活了
		 int i = sc.nextInt();//只有i是变量名,可以改变,其余都不能变
		
	}
}
```
<a name="WuhMO"></a>
## Random随机数
```java
import  java.util.Random;   //导包 -- Random这个类在哪

public class 获取随机数 {
    public static void main(String[] args) {
		
		 //创建对象 -- 表示我现在要开始用Random这个类了
        Random r = new Random();   
		 //生成随机数 -- 真正开始干活了(括号里面填生成随机数的范围)
        int number = r.nextInt(10);  //0~9
		
    }
}
```

<a name="BMBTy"></a>
## 类的 UML 图：用来描述面向对象的
虚线：依赖<br />creat：创建了这个类的对象<br />实线：组合<br />共享生命周期：实线加黑菱形<br />一个是另一个的一部分：实线加空心<br />空心三角形箭头（指向父类表示继承于该父类）：继承 
<a name="dMVYN"></a>
# 数组
<a name="OSxf9"></a>
## 数组 定义
<a name="ZLCJN"></a>
### 方式一 : 
数据类型[ ]      数组名 <br />eg : int[ ] array ;
<a name="cJQ3T"></a>
### 方式二 :
数据类型     数组名 [ ]<br />eg : int array[ ] ; 
<a name="Yv0rg"></a>
## 数组的静态初始化	Java 在 new 完后自动初始化
<a name="sCNtG"></a>
### 完整格式
数据类型[ ]   数组名 = new 数据类型 [ ] { 元素 1 , 元素 2 , 元素 3 , ...... } ;<br />eg : int[ ] array = new int[ ]{ 1 , 2 , 3 } ;
<a name="mZZdl"></a>
### 简化格式
数据类型[ ]   数组名 = { 元素 1 , 元素 2 , 元素 3 , ...... } ;<br />eg : int[ ] array = { 1 , 2 , 3 } ;
<a name="MnM1n"></a>
## 数组的动态初始化
即手动指定长度 , 由系统初始化<br />类比 c 语言的 int arr[5];<br />Java : int arr[ ] = new int[5] ; 
<a name="TWaeD"></a>
## 数组值的使用
arr[0] , arr[1] , .....<br />同 c 语言<br />直接打印数组名,获得地址值
<a name="WrgYE"></a>
## 遍历数组
<a name="q1n7n"></a>
### 生成 for 循环遍历数组
arr . fori + Tab 
<a name="AIAJL"></a>
### 获取数组长度
数组名 . length<br />eg : <br />arr . length<br />可直接打印 , 也可用于 for 循环中

<a name="p6CCR"></a>
## 数组的内存图
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707191859716-086c93ab-6c82-4a63-9014-a2fb647cdfc4.png#averageHue=%23f5f4c9&clientId=u4839fcdf-be61-4&from=paste&height=649&id=u20467dab&originHeight=1298&originWidth=2630&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1303858&status=done&style=none&taskId=ue07bdc45-211b-4748-8ba2-225ddd8d1a6&title=&width=1315)<br />即数组中 int[ ] arr = new int [2] ; 中的 new 即是在堆内存中开辟 , 此时 arr 存的是堆内存空间的地址值<br />注意 :<br />在 int arr[ ] = {1,2,3}; 中 , 数组元素也存在于堆空间中 , 因为其原格式为 int arr[ ] = new int[ ] {1,2,3}; 同样也是 new 出来的堆空间存放 , 而 arr 中存放的为指向堆空间中存放数组首元素的地址值 


![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707191919888-a639f759-d1d7-4a53-9d94-8894217e8302.png#averageHue=%239bdab4&clientId=u4839fcdf-be61-4&from=paste&height=661&id=u6d03bf2d&originHeight=1321&originWidth=2637&originalType=binary&ratio=2&rotation=0&showTitle=false&size=782532&status=done&style=none&taskId=ud5f290af-2ef4-4119-8379-fc5771fe130&title=&width=1318.5)<br />若另一数组 arr2 被赋值为 arr1 , 则其代表的内存相同 , 共同指向堆内存的这个空间，若改变 arr2 的值，则改变的是 arr1 和 arr2 共同指向的值，故 arr2 的改变会影响 arr1 。
<a name="tLdoz"></a>
## 二维数组
int arr[ ][ ] = new int [ ][ ] { { 1 , 2 , 3 } , { 4 , 5 , 6} } ;<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707652460212-a5ea0714-64c0-4edf-8423-85ca26db41d0.png#averageHue=%23f6edc2&clientId=u73f4be19-b656-4&from=paste&height=618&id=u5f4c10ee&originHeight=1236&originWidth=2674&originalType=binary&ratio=2&rotation=0&showTitle=false&size=707926&status=done&style=none&taskId=u3cb994a0-5e50-44f4-8088-e38006e9e7f&title=&width=1337)<br />类似 c 语言的指针数组 , 即存储每个一维数组的地址的数组
<a name="tFvRr"></a>
## 可变参数传值
即在参数列表可写为`int...x`，方法内把 x 当作数组操作
<a name="WQXyf"></a>
# 方法
<a name="e71Pm"></a>
## 方法的定义
方法即 main 方法 , 类似 c 语言用户自定义函数 , Java 中同样可自定义
```java
public class 方法{
	
	//定义main方法
	public static void main(String[] args){
		...........
	}
	
	//定义其他方法1
	public static void method1(){
		.........
	}

	//定义其他方法2
	public static method2(int a , int b ){
		.........
	}

	//..........

}
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707192292194-59e42e4e-a0ca-4916-9583-51c0ae1a9b4e.png#averageHue=%23f6f1e9&clientId=u4839fcdf-be61-4&from=paste&height=532&id=u76fbe963&originHeight=1064&originWidth=2308&originalType=binary&ratio=2&rotation=0&showTitle=false&size=407533&status=done&style=none&taskId=u3077f4a6-4f85-4975-81a7-0c5a542ea8e&title=&width=1154)
<a name="C0tYG"></a>
## 方法调用
同 c 语言调用函数
<a name="LM9iE"></a>
## 方法中返回值
同 c 语言 return ;
<a name="RuhbA"></a>
## 方法的重载
<a name="aVypN"></a>
### 重载的定义
Java 中相同功能的方法可以起同一个名字,但是方法的形参不能一样 , 这些同名的方法构成了重载关系
<a name="TF0UP"></a>
### 简单记 :
同一个类中 , 方法名相同 , 参数不同的方法 , 与返回值无关(不看不比较返回值)
<a name="B3kUa"></a>
### 参数不同 :
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707199895090-17c6fb91-056f-47e0-91cc-36b8f615ccb5.png#averageHue=%23f7f7ca&clientId=u4839fcdf-be61-4&from=paste&height=229&id=qbZI6&originHeight=458&originWidth=890&originalType=binary&ratio=2&rotation=0&showTitle=false&size=194261&status=done&style=none&taskId=u7f1afa4c-74ac-4a81-af2e-be62be4fd65&title=&width=445)<br />不构成 , 因为与返回值无关(即不比较返回值的前提下) , 参数相同了 , 则不构成重载关系 <br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707200184999-8d950694-bf63-4e5c-99fa-fe299b6b8109.png#averageHue=%23f7f6c8&clientId=u4839fcdf-be61-4&from=paste&height=268&id=f0mzl&originHeight=535&originWidth=1065&originalType=binary&ratio=2&rotation=0&showTitle=false&size=236698&status=done&style=none&taskId=u1e154cf4-c332-4074-b32f-21228db5a79&title=&width=532.5)<br />不构成 , 因为不在同一个类中
<a name="yZgQP"></a>
#### 个数不同
eg : 判断下两个方法构不构成重载关系 ?<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707200005037-7caa9fbd-c036-42bb-b14b-41dfa6de308e.png#averageHue=%23f6f6c8&clientId=u4839fcdf-be61-4&from=paste&height=236&id=UdWhO&originHeight=472&originWidth=1028&originalType=binary&ratio=2&rotation=0&showTitle=false&size=202007&status=done&style=none&taskId=u53beb866-5829-48a8-b53b-e42e899a950&title=&width=514)<br />构成 , 因为不比较返回值的前提下 , 参数不同(参数的个数不同) , 则构成重载关系
<a name="jzTXw"></a>
#### 类型不同 
eg : 判断下两个方法构不构成重载关系 ?<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707200219433-a864f441-7e4c-4d65-a65c-2c1b0d58b27b.png#averageHue=%23f4f4c6&clientId=u4839fcdf-be61-4&from=paste&height=238&id=dZngQ&originHeight=476&originWidth=935&originalType=binary&ratio=2&rotation=0&showTitle=false&size=174057&status=done&style=none&taskId=ufc828781-3732-462f-bd4a-d51acb54c3e&title=&width=467.5)<br />构成 , 因为参数不同(参数的类型不同)
<a name="WilI1"></a>
#### 顺序不同
eg : 判断下两个方法构不构成重载关系 ?<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707200272053-daaafd04-acb2-4995-a74d-67b2899c9c9f.png#averageHue=%23f8f8ca&clientId=u4839fcdf-be61-4&from=paste&height=226&id=hlPKS&originHeight=452&originWidth=1203&originalType=binary&ratio=2&rotation=0&showTitle=false&size=207616&status=done&style=none&taskId=u48af7dd9-c39c-48ed-817d-15ec5980685&title=&width=601.5)<br />构成 , 因为参数的顺序不同

<a name="Y7Mo4"></a>
## 方法的内存原理
<a name="Al0WZ"></a>
### Java 的内存分配
<a name="WNbCR"></a>
#### 栈
<a name="agSrf"></a>
##### 定义
方法运行时的内存 , 方法进栈运行 , 运行完毕就出栈
<a name="oJUNz"></a>
##### 进栈过程
像压子弹一样 , 先进栈的后出栈 , 后进栈的先出栈
<a name="oi6bW"></a>
#### 堆
new 出来的 , 都在堆内存中开辟了一个小空间
<a name="DXxB3"></a>
#### 方法区
存储可以运行的 class 文件<br />当我们运行一个类的时候，这个类的字节码文件就会被加载到方法区当中临时存储。<br />在 jdk7 以及实际当中，堆和方法区是连接在一起的<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708145995818-5d109599-c506-4a82-90df-59a918f9c56b.png#averageHue=%23aeb843&clientId=u825d5cbb-b262-4&from=paste&height=367&id=ubfb3328c&originHeight=1200&originWidth=1274&originalType=binary&ratio=2&rotation=0&showTitle=false&size=187664&status=done&style=none&taskId=ub15b7e02-fc69-493f-bc95-e885401efdb&title=&width=390)<br />从 jdk8 开始，取消方法区，新增元空间。把原来方法区的多种功能进行拆分，有的功能放在了堆中，有的功能呢放在了元空间中<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708146010685-15c38624-4188-4b08-a146-e05923ce43ac.png#averageHue=%23adb73e&clientId=u825d5cbb-b262-4&from=paste&height=352&id=u766646f7&originHeight=1174&originWidth=1287&originalType=binary&ratio=2&rotation=0&showTitle=false&size=169464&status=done&style=none&taskId=ud88e03ac-d564-4f6e-8b11-66217e1a8c5&title=&width=385.5)<br />加载字节码文件的功能在 jdk8 开始被归属元空间了。
<a name="TtSts"></a>
#### 本地方法栈
JVM 在使用操作系统功能时候使用 , 和我们开发无关
<a name="dgOl2"></a>
#### 寄存器
给 CPU 使用 , 和我们开发无关
<a name="yXDem"></a>
#### StringTable（串池（字符串常量池））
> 详见十六（一）4.
> [https://www.yuque.com/ckkkk-mmgvr/nw3cgc/wu1ie2ic6z6snopi#qqRx3](#qqRx3)

<a name="tDKVY"></a>
### 调用方法试图改变 main 方法中变量的值(形参仍不能改变实参的值)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707274445492-a8d06f33-0c49-4bf0-9137-39989a8d231f.png#averageHue=%23f2e9c0&clientId=u6ce17c82-f8de-4&from=paste&height=444&id=ucdea4c4c&originHeight=887&originWidth=1857&originalType=binary&ratio=2&rotation=0&showTitle=false&size=606751&status=done&style=none&taskId=u31d3ec4e-6b93-47b3-8323-b5021115e3e&title=&width=928.5)<br />此代码中的 change 只是改变了 change 方法中的 number 的值 , 并没有改变 main 方法中 number 的值 , change 方法执行完出栈销毁
<a name="K4XHV"></a>
### 调用方法试图改变 main 方法中数组的值(传递引用数据类型时 , 传递的是地址值 , 形参的改变影响实参)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707276907953-c77ed863-1199-4e78-9d3b-5189fd39e328.png#averageHue=%23f1f0c9&clientId=u6ce17c82-f8de-4&from=paste&height=685&id=u735db4a5&originHeight=1370&originWidth=2742&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1112900&status=done&style=none&taskId=u1784cb7b-e89b-4275-b625-ee69ed52e0e&title=&width=1371)<br />通过操作(指向堆内存的)地址修改值.<br />(数组存储与堆内存中 , 在栈内存中仅存储的是在堆内存中存储的数组首元素的地址)

<a name="hqTdi"></a>
### 方法传递参数的结论
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707277075281-a213356a-2713-411c-b7b5-7c9c3189b3c2.png#averageHue=%23faf7f4&clientId=u6ce17c82-f8de-4&from=paste&height=662&id=u9a502df5&originHeight=1324&originWidth=2742&originalType=binary&ratio=2&rotation=0&showTitle=false&size=696743&status=done&style=none&taskId=u61fc2b0a-bbeb-44d6-a119-55fd0458c04&title=&width=1371)
<a name="YotTQ"></a>
# 面向对象
<a name="AfhUk"></a>
## 面向对象的定义
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707652633896-88ce36f8-eb7e-4728-87db-eb41d4f8dec3.png#averageHue=%23265539&clientId=u73f4be19-b656-4&from=paste&height=235&id=ubbab9aa2&originHeight=469&originWidth=930&originalType=binary&ratio=2&rotation=0&showTitle=false&size=186681&status=done&style=none&taskId=u04b8cabc-352e-4a46-9f80-e1df391f3f5&title=&width=465)<br />要做对应的事情 , 就找对应的东西来解决 , 这种找东西来解决的过程就是面向对象编程.<br />获取随机数 -> Random<br />控制台输出内容 -> System<br />键盘录入 -> Scanner
<a name="GjVsx"></a>
## 用户自定义对象
<a name="cT10W"></a>
### 设计对象并使用
<a name="ha636"></a>
#### 类和对象
<a name="VAUBV"></a>
##### 定义
对象 : 是真实存在的具体东西<br />eg : 洗衣机 \ 手机 \......	( 一个有一个能够帮助我们解决问题的东西 )<br />类 ( 设计图 ):	是对象共同特征的描述<br />eg : 物品的设计图.	( 造对象的时候是根据设计图才能造出来的 , 在 Java 中这些设计图叫作"类". )<br />在 Java 中必须先设计类 , 才能获取对象.
```java
public class Phone {	//表示是一个手机的"设计图"
	......
}
```
<a name="Wwuq9"></a>
##### 如何定义类
```java
public class 类名 {
	1.成员变量 (代表属性,一般是名词)	eg:手机的价格\品牌\颜色\......
	2.成员方法 (代表行为,一般是动词)	eg:打电话\发短信\玩游戏\......
	3.构造器 (后面学习)
	4.代码块 (后面学习)
	5.内部类 (后面学习)
}
```
eg : 
```java
public class Phone {	//描述手机这类事物的
	//属性 (成员变量)	
	String brand;	//类只是表示手机这类事物,所以只定义不赋值
	double price;	//类只是表示手机这类事物,所以只定义不赋值

	//行为 (方法)
	public void call(){
		
	}
	public void playGame(){
		
	}
}
```
<a name="jOjGl"></a>
#####   如何得到类的对象
类名 对象名 = new 类名( ) ;<br />eg : 
```java
Phone p = new Phone();
```
<a name="gdhya"></a>
##### Phone 案例综合写法
<a name="HjqHz"></a>
###### 创建 Java 类 名为 Phone :
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707912801678-f1826090-8e73-4d16-9d78-a3d5cb81725e.png#averageHue=%232e383e&clientId=u9d17722e-dbca-4&from=paste&height=347&id=ub06f9dd5&originHeight=693&originWidth=457&originalType=binary&ratio=2&rotation=0&showTitle=false&size=164406&status=done&style=none&taskId=u7a601d16-814a-436e-8670-375e886101f&title=&width=229)
```java
public class Phone {
    // 定义类

    //属性
    String brand;
    double price;
    //行为
    public void call(){
        System.out.println("手机在打电话");
    }
    public void playGame(){
        System.out.println("手机在玩游戏");
    }
}
```
<a name="ZDnUS"></a>
###### 创建名为 PhoneText 的 Java 类
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707912982277-f3ce1fa1-1c5e-4e6a-bed5-3b05aaf2f17f.png#averageHue=%23303a43&clientId=u9d17722e-dbca-4&from=paste&height=367&id=u6c1a3dd9&originHeight=734&originWidth=465&originalType=binary&ratio=2&rotation=0&showTitle=false&size=177154&status=done&style=none&taskId=uddf97307-773c-4c41-bc7b-af52d26b1db&title=&width=232.5)
```java
public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        Phone p = new Phone();

        //给手机赋值
        p.brand = "小米";
        p.price = 1999.98;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用手机中的方法
        p.call();
        p.playGame();

        // 如果有第二部手机该怎么办 ?
        Phone p2 = new Phone();
        p2.brand = "苹果";
        p2.price = 8999;
        System.out.println(p2.brand);
        System.out.println(p2.price);
        p2.call();
        p2.playGame();
    }
}

```
<a name="k2rxR"></a>
##### 总结
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707913122073-b74913ca-e34e-48ae-ac68-c73883da5b0b.png#averageHue=%23f3f0ef&clientId=u9d17722e-dbca-4&from=paste&height=557&id=u436d96b0&originHeight=1114&originWidth=2371&originalType=binary&ratio=2&rotation=0&showTitle=false&size=512190&status=done&style=none&taskId=u89f76afb-073c-4fec-97da-be5f62ecbe7&title=&width=1185.5)
<a name="t6bth"></a>
#### 类的几个补充注意事项
<a name="wZTRu"></a>
##### “类”的分类
<a name="K4LFl"></a>
###### JavaBean 类
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707996541001-3d4daad2-583d-43f8-83f8-79d43a7adcfa.png#averageHue=%23f0eded&clientId=ufad22ebe-38a1-4&from=paste&height=509&id=u59e3fde3&originHeight=1017&originWidth=1237&originalType=binary&ratio=2&rotation=0&showTitle=false&size=333917&status=done&style=none&taskId=u49a49a15-b649-4ff6-83a0-45dbdf95cc3&title=&width=618.5)<br />用来描述一类事物的类 , 专业叫做 : JavaBean 类.<br />在 JavaBean 类中 , 是不写 main 方法的.<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707913505563-8ca377ad-e4fc-4a5e-a1c9-728bc74cbc8c.png#averageHue=%23383428&clientId=u9d17722e-dbca-4&from=paste&height=331&id=u6c59d694&originHeight=662&originWidth=1410&originalType=binary&ratio=2&rotation=0&showTitle=false&size=594819&status=done&style=none&taskId=u95a474df-4601-433e-b4c5-302f71c7953&title=&width=705)
<a name="w9m6C"></a>
###### 测试类
在以前 , 编写 main 方法的类 , 叫做测试类.<br />我们可以在测试类中创建 JavaBean 类的对象并进行赋值调用.<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707913567364-688826f7-b3fa-4809-ae20-1afbd413cf43.png#averageHue=%23272720&clientId=u9d17722e-dbca-4&from=paste&height=489&id=u722baacd&originHeight=978&originWidth=1857&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1154347&status=done&style=none&taskId=ubde72c8f-9b00-40d5-ba03-f3d2641df78&title=&width=928.5)
<a name="cPdEz"></a>
##### 定义类补充注意事项
<a name="N7Cha"></a>
###### 类名首字母建议大写，需见名知意，驼峰模式。
<a name="qOHiB"></a>
###### 一个 Java 文件中可以定义多个 class 类，且只能一个类是 public 修饰，而且 public 修饰的类名必须成为代码文件名。实际开发中建议还是一个文件定义一个 class 类。
<a name="IRa08"></a>
###### 成员变量的完整定义格式是：修饰符 数据类型 变量名称 = 初始化值；一般无需指定初始化值，存在默认值。！！！！！！！！！！但是局部变量不会存在默认值！！！！！！！！
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707974875287-a4f92abc-029a-4292-bdcf-87f0a80ae7f3.png#averageHue=%23e1d0d0&clientId=u6af51946-f881-4&from=paste&height=480&id=ucb99a8da&originHeight=959&originWidth=1547&originalType=binary&ratio=2&rotation=0&showTitle=false&size=223916&status=done&style=none&taskId=u809344af-3cc3-48e7-a7ab-b0780d2540c&title=&width=773.5)<br />返回值可以是类的实例
<a name="GWUTE"></a>
### 封装
面向对象三大特征：封装、继承、多态。<br />封装，即如何正确设计对象的属性和方法，对象代表什么，就得封装对应的数据，并提供数据对应的行为。<br />好处：让编程更简单<br />eg：人画圆，定义一个人对象，一个圆对象，画圆包括在圆对象里，需用到圆对象中的半径等等
<a name="snm1u"></a>
### this 关键字
> 见十四、（三）[https://www.yuque.com/ckkkk-mmgvr/nw3cgc/wu1ie2ic6z6snopi#NhIwH](#NhIwH)

<a name="BoQ93"></a>
### 【难！！！】构造方法（快捷键 alt+insert）
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707996271747-e720ead1-7963-4c03-b660-b4235609c933.png#averageHue=%23f1efe4&clientId=ufad22ebe-38a1-4&from=paste&height=375&id=u7cb0e4ca&originHeight=749&originWidth=1869&originalType=binary&ratio=2&rotation=0&showTitle=false&size=326901&status=done&style=none&taskId=uec1db60f-2611-475b-8ee8-7335669a01b&title=&width=934.5)
<a name="QSJpQ"></a>
#### 作用
<a name="dMHdP"></a>
##### 给变量一个初始化的值，初始化对象
<a name="tXdBx"></a>
##### 构造函数存在的意义就是为了方便new的时候直接传参数，比如Student s = new Student (18,刘亦菲)
<a name="opcC5"></a>
#### 格式
```java
public class Student {
	
	修饰符 类名（参数）{
		方法体；
	}
}
```
<a name="qrON8"></a>
#### 特点
<a name="mBXpT"></a>
##### 方法名与类名相同，大小写也要一致
<a name="faVBP"></a>
##### 没有返回值类型，连 void 也没有
<a name="v3OSa"></a>
##### 没有具体的返回值，无 return
<a name="B73K9"></a>
#### 执行时机
<a name="ISX0q"></a>
##### 创建对象的时候由虚拟机调用，不能手动调用构造方法
<a name="qELKa"></a>
##### 每创建一次对象，就会调用一次构造方法
<a name="ZcOSz"></a>
#### 分类
<a name="vCkhs"></a>
##### 空参构造
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707993984957-f72ce6df-1b92-4eac-b1ce-4abd6bf146ca.png#averageHue=%23faf9df&clientId=ufad22ebe-38a1-4&from=paste&height=240&id=u74a3528d&originHeight=479&originWidth=739&originalType=binary&ratio=2&rotation=0&showTitle=false&size=118368&status=done&style=none&taskId=u992fd67b-8e2d-43bc-91cf-96bfbad9d7d&title=&width=369.5)<br />如果我们自己没有写任何的构造方法，那么虚拟机给我们加一个空参构造方法。<br />  即：
```java
public Student(){
            ......	 //eg：System.out.println("看看我执行了吗");
}
```
<a name="iez76"></a>
##### 带参构造
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707993996314-cc725739-5695-4455-b1ea-0db9ddcbe0d7.png#averageHue=%23faf9df&clientId=ufad22ebe-38a1-4&from=paste&height=467&id=ubcab877e&originHeight=933&originWidth=1011&originalType=binary&ratio=2&rotation=0&showTitle=false&size=194887&status=done&style=none&taskId=u3931e8b6-0348-49c1-b7a9-639ef538405&title=&width=505.5)

<a name="zkqHU"></a>
#### 注意：
<a name="n5aSc"></a>
##### 若已经写了带参构造没有写无参构造，则在创建对象时如果调用到无参构造会报错，所以开发中最好都写好空参构造
<a name="irb2o"></a>
##### 构造方法可重载
<a name="AWq2B"></a>
#### 总结
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707996132595-d4f49f5e-a553-40cf-9d9f-167cddd19d97.png#averageHue=%23f1efef&clientId=ufad22ebe-38a1-4&from=paste&height=549&id=u7baa9ff7&originHeight=1097&originWidth=2581&originalType=binary&ratio=2&rotation=0&showTitle=false&size=576411&status=done&style=none&taskId=u512e7d93-246e-4748-ac2a-34148643070&title=&width=1290.5)
<a name="yhsGD"></a>
### 标准 JavaBean
手动输入、alt+insert、插件 PTG
```java
package com.itheima.AG标准的JavaBean;

public class User {
    //属性
    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;
    
    手动输入
//    //空参
//    public User(){}
//    //带参
//    public User(String username,String password,String email,String gender,int age){
//        this.username=username;
//        this.password=password;
//        this.email=email;
//        this.gender=gender;
//        this.age=age;
//    }
//    //get set
//    public void setUsername(String username){
//        this.username = username;
//    }

    快捷键alt+insert
//
//    public User() {
//    }
//
//    public User(String username, String password, String email, String gender, int age) {
//        this.username = username;
//        this.password = password;
//        this.email = email;
//        this.gender = gender;
//        this.age = age;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}

    插件PTG 1秒生成JavaBean
```

<a name="TLME4"></a>
### 对象内存图
<a name="yWbvP"></a>
#### Java 内存分配
Java 内存分配介绍：栈、堆方法区、本地方法栈、寄存器
> 详见十二（五）[https://www.yuque.com/ckkkk-mmgvr/nw3cgc/wu1ie2ic6z6snopi#Al0WZ](#Al0WZ)

<a name="jcVzk"></a>
#### 创建对象七步骤(eg : Student s = new Student(); )
<a name="DEVrP"></a>
##### 加载 class 文件，即把 Student 这个类的字节码文件加载到内存。
<a name="oPk4b"></a>
##### 申明局部变量，即对“=”左边的“s”进行声明
<a name="AbmI6"></a>
##### 在堆内存中开辟一个空间，即“=”右边在堆空间中“new”出来一个小空间，而这个小空间就是我们平时所说的对象。
<a name="q7Sc8"></a>
##### 默认初始化
<a name="wU2AX"></a>
##### 显示初始化
<a name="bKqDZ"></a>
##### 构造方法初始化
<a name="mXdvx"></a>
##### 将堆内存中的地址值赋值给左边的局部变量

<a name="cNZcI"></a>
#### 一个对象创建过程
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708149150858-6bcfe0fe-1ee4-40ab-9707-d05598c92595.png#averageHue=%23f2f1c6&clientId=u825d5cbb-b262-4&from=paste&height=748&id=QIUrZ&originHeight=1495&originWidth=2675&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1404545&status=done&style=none&taskId=u5ed5d80c-8a42-48d1-8019-e42e2457477&title=&width=1337.5)
<a name="aMjsX"></a>
##### main 方法是一个程序的主入口，所以先从 main 开始，即把 StudentTest.class 文件中的 main 方法加载到方法区进行临时存储
<a name="g1fxB"></a>
##### 虚拟机会自动调用程序中的 main 方法，所以此时会将 main 方法加载到栈内存中，下面开始执行 main 方法中的代码了：
<a name="T8QBw"></a>
##### 运行到 Student s = new Student（）；即进行创建对象的七步：
<a name="ku9Zv"></a>
##### 第一步，先加载 class 文件，即将 Student.class 文件加载到方法区临时存储，在这里面会有 Student 这个类的所有信息，比如说所有的成员变量和所有的成员方法。
<a name="VvGQp"></a>
##### 第二步，申明局部变量，即声明创建对象（Student s = new Student();）“=”左边的这个代码（Student s），在栈内存的 main 方法中开辟了一个名为“s”的空间，其仅用于存储 Student 这个类的对象的地址值
<a name="q7cKl"></a>
##### 第三步，在堆内存中开辟一个空间，其实就是在创建对象（Student s = new Student();）“=”右边的代码（new Student();），开辟后会把 Student 这个类中的成员变量拷贝一份放到此堆内存空间，每个堆空间对应一个地址值，假设此开辟的空间为 001， 除此之外其还会有成员方法的地址（指向存储在方法区中的 Student.class 文件中的成员方法），堆里面 001 的空间就是我们平时所说的对象，但此时仍没有创建完毕，因为成员变量都还没有值，那怎么赋值呢？
<a name="CEozw"></a>
##### 第四步，进行默认初始化 。此例子 name 默认 null，age 默认 0
<a name="SP9AP"></a>
##### 第五步，显示初始化。
若定义成员变量时直接给值了，如👇，直接给了 name=“张三”，age=23，那么这个就叫显示初始化。<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708148516583-7c23e86b-41c1-42c1-9d00-6ad23628bebb.png#averageHue=%23f6f6c7&clientId=u825d5cbb-b262-4&from=paste&height=222&id=u9cd54cb4&originHeight=443&originWidth=785&originalType=binary&ratio=2&rotation=0&showTitle=false&size=131619&status=done&style=none&taskId=uc4986177-42a0-450d-b6f5-e9b9fb0cb16&title=&width=392.5)<br />若定义时并没有给值，那么显示初始化这一步我们可以忽略
<a name="J0iHJ"></a>
##### 第六步，构造方法初始化。
若此时为👇，小括号里面什么都没写，所以说就表示现在我调用的是空参构造，而空参构造里我也没有写代码，所以说构造方法初始化我们也可以忽略。<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708148715830-767a7da8-0762-4128-8be1-f159d5bef09e.png#averageHue=%23f0ddb3&clientId=u825d5cbb-b262-4&from=paste&height=33&id=u68933d78&originHeight=66&originWidth=557&originalType=binary&ratio=2&rotation=0&showTitle=false&size=29648&status=done&style=none&taskId=ua79dd8df-cb76-4993-afa4-7e1bb97d3d7&title=&width=278.5)<br />若此时你用的是带参构造来创建对象，那么 name 和 age 就会有值了。所以说构造方法只是创建对象的一步而已
<a name="WfSRe"></a>
##### 第七步，把堆内存中的地址赋值给左边的局部变量，即 ”s“ = 001；
<a name="bL7ld"></a>
##### 执行完，出栈如压子弹打子弹，先入后出，后入先出，Java 中堆内存没有变量指向时自动释放，无需手动释放
<a name="yCCD3"></a>
#### 两个对象创建过程

<a name="jEeNY"></a>
#### 两个引用指向同一对象
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708149987883-c161871a-fc90-442a-932b-f3c66b9bfb4f.png#averageHue=%23f2f0c6&clientId=u825d5cbb-b262-4&from=paste&height=734&id=u0d79ca3b&originHeight=1467&originWidth=2653&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1244386&status=done&style=none&taskId=ubdb0b558-861d-47e9-8544-735a9f55fae&title=&width=1326.5)<br />【注意！】修改 stu2 指向的堆内存即相当于 stu1 指向的堆内存（因为 stu2=stu1=001） 👇<br />多个变量指向同一个空间时，只要有其中一个变量对这个空间里面的值发生改变，那么其他变量再次访问的时候就是改变之后的结果了<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708149834781-f61801a0-d03c-41ff-8c8d-fafd777967b5.png#averageHue=%23f8f9cc&clientId=u825d5cbb-b262-4&from=paste&height=310&id=u8e7e6185&originHeight=620&originWidth=1597&originalType=binary&ratio=2&rotation=0&showTitle=false&size=217261&status=done&style=none&taskId=uc6c47d48-bec7-4e63-bbd4-4c20a5bf45b&title=&width=798.5)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708149854627-159c4457-ac00-4777-a180-69edfe285d65.png#averageHue=%23f4f5c9&clientId=u825d5cbb-b262-4&from=paste&height=352&id=u3fa22b97&originHeight=703&originWidth=1638&originalType=binary&ratio=2&rotation=0&showTitle=false&size=331576&status=done&style=none&taskId=u49b08813-70e8-48c1-9757-c47244ec850&title=&width=819)

<a name="q80Bg"></a>
### 补充知识 : 成员变量 \ 局部变量的区别 
<a name="kmskT"></a>
#### 定义
<a name="RT02R"></a>
##### 成员变量：类方法外的变量
<a name="TuE8p"></a>
##### 局部变量：方法中的变量
<a name="PlnzB"></a>
#### 区别
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708151840798-f39f4790-3a08-4be0-9780-e9ea3aa0f750.png#averageHue=%23f7eada&clientId=u825d5cbb-b262-4&from=paste&height=564&id=ud02a9db9&originHeight=1128&originWidth=2299&originalType=binary&ratio=2&rotation=0&showTitle=false&size=668691&status=done&style=none&taskId=u7e2b2dcb-295f-4a54-8808-1baa6170ab1&title=&width=1149.5)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708151850557-deb628a3-17db-4652-a817-6dfaf50b359b.png#averageHue=%23e0cfcf&clientId=u825d5cbb-b262-4&from=paste&height=584&id=u3a08a85f&originHeight=1168&originWidth=2475&originalType=binary&ratio=2&rotation=0&showTitle=false&size=544736&status=done&style=none&taskId=ue125ac98-b80a-4f13-b54d-0c5c219d782&title=&width=1237.5)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708152098561-45f1d021-9840-4948-ae74-ea7bb7c9278d.png#averageHue=%23eaf2ec&clientId=u825d5cbb-b262-4&from=paste&height=621&id=ufa487341&originHeight=1242&originWidth=2500&originalType=binary&ratio=2&rotation=0&showTitle=false&size=514398&status=done&style=none&taskId=u325ff72e-f08f-40a0-a0e3-8ac245ec828&title=&width=1250)
<a name="o4xFv"></a>
#### 
<a name="utBkO"></a>
## 例题
<a name="oovjg"></a>
### 【出错点】
<a name="ks3jV"></a>
#### 设置存储对象的数组只是这个数组可以存储对象。然而，你只是在数组中分配了空间，并没有真正地创建对象并放入这些空间，例如不加👇蓝框内容则会报错 CarArr[i]=null ：
```java
package com.itheima.AC练习.对象数组2;

import java.util.Scanner;

public class CarTest2 {
    public static void main(String[] args) {
        //1.创建一个数组用来存3辆汽车
        Car CarArr[] = new Car[3];
        //2.创建汽车对象，数据来自键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < CarArr.length; i++) {
    ******************************************************************
    |       /*创建汽车对象*/											 |
    |       CarArr[i] = new Car();									 |
    |       解释：在堆区创建三块空间并把方法区的成员变量拷贝到堆区		 |
    |       把成员方法在方法区的地址赋给堆区，然后把堆区的地址付给数组	 |
    ******************************************************************  
            //录入品牌
            System.out.println("请输入第" + (i + 1) + "辆汽车的品牌");
            CarArr[i].setBrand(sc.next());
            //录入价格
            System.out.println("请输入第" + (i + 1) + "辆汽车的价格");
            CarArr[i].setPrice(sc.nextInt());
            //录入颜色
            System.out.println("请输入第" + (i + 1) + "辆汽车的颜色");
            CarArr[i].setColor(sc.next());
            
            //存入数组
            已在前面存入，省略
        }
        //遍历数组
        for (int i = 0; i < CarArr.length; i++) {
            System.out.println(CarArr[i].getBrand()+","+CarArr[i].getPrice()+","+CarArr[i].getColor());
        }



    }
}

```

下方为详细易于理解版👇
```java
package com.itheima.AC练习.对象数组2;

import java.util.Scanner;

public class CarTest1 {
    public static void main(String[] args) {
        //1.创建一个数组用来存3辆汽车
        Car CarArr[] = new Car[3];
        //2.创建汽车对象，数据来自键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < CarArr.length; i++) {
            //创建汽车对象
            Car c = new Car();
            //录入品牌
            System.out.println("请输入第" + (i + 1) + "辆汽车的品牌");
            c.setBrand(sc.next());
            //录入价格
            System.out.println("请输入第" + (i + 1) + "辆汽车的价格");
            c.setPrice(sc.nextInt());
            //录入颜色
            System.out.println("请输入第" + (i + 1) + "辆汽车的颜色");
            c.setColor(sc.next());
            //3.存入数组
            CarArr[i] = c;
        }
        for (int i = 0; i < CarArr.length; i++) {
            System.out.println(CarArr[i].getBrand()+","+CarArr[i].getPrice()+","+CarArr[i].getColor());
        }
    }
}
```
<a name="y1Pzf"></a>
#### 对象数组存的是每个对象的地址值（指向堆内存中的空间），创建对象位置不同效果不同
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708238488060-069b6653-e1c5-4f64-9387-a618ff94a045.png#averageHue=%23f5f5f3&clientId=u9ff3b11b-5a2f-4&from=paste&height=520&id=ufa7b3d92&originHeight=1089&originWidth=1035&originalType=binary&ratio=2&rotation=0&showTitle=false&size=508859&status=done&style=none&taskId=ud825f4ad-bb63-40fc-abe0-13323ec38e7&title=&width=494)<br />若 car c = new car();此时这句放在 for 循环内，即是每循环一次都创建了一个新的对象，只是将前一个的覆盖了，实际还是创建了三个对象

若 car c = new car( );这句如果放在 for 循环外，实际是创建了一个对象，获取完值存入数组的始终都是一个对象的地址，即：👇<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708238652234-797a5fd6-23e3-4ea0-811b-0e71b326ee29.png#averageHue=%23fbfbfb&clientId=u9ff3b11b-5a2f-4&from=paste&height=307&id=u2a9634d5&originHeight=834&originWidth=1524&originalType=binary&ratio=2&rotation=0&showTitle=false&size=77714&status=done&style=none&taskId=ua9336e43-ff6e-47a0-9eec-cc95512522e&title=&width=561)

若在 for 循环外使用 CarArr[i] = new Car( );，区别于car c = new car();这句放在 for 循环内，CarArr[i] = new Car( );创建三个对象的同时，记录下每一个地址，不覆盖
<a name="hPQjq"></a>
## 依赖和组合
依赖：遥控器和电池<br />组合：汽车和发动机
<a name="L0WSJ"></a>
## 


<a name="PH46v"></a>
# 关键字、类学习
<a name="Km8fB"></a>
## public（公共的、公开的）和 private 相反
<a name="tTI4A"></a>
## private （私有）权限修饰符 和 public 相反
可以修饰成员（成员变量和成员方法 ）<br />被 private 修饰的成员只能在本类使用<br />针对每个私有化的成员变量，都要提供 set 和 get 方法<br />set 方法：给成员变量赋值。<br />get 方法：对外提供成员变量的值<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707988980454-af6d9437-bf8a-48b4-a4ea-26260d9a1a3e.png#averageHue=%23f3f3ec&clientId=u6af51946-f881-4&from=paste&height=554&id=uc3426347&originHeight=1107&originWidth=1203&originalType=binary&ratio=2&rotation=0&showTitle=false&size=283078&status=done&style=none&taskId=u1cd1b937-43c5-4b7e-be15-02040186e7c&title=&width=601.5)
<a name="NhIwH"></a>
## this 使变量变为成员变量（这个类）
<a name="Balk9"></a>
### this 的使用
作用：区分成员变量和局部变量<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707992169588-10247f7d-9f5c-45db-8d7e-5cc20fb39209.png#averageHue=%23f8f7de&clientId=u6af51946-f881-4&from=paste&height=450&id=u70910048&originHeight=899&originWidth=1133&originalType=binary&ratio=2&rotation=0&showTitle=false&size=310568&status=done&style=none&taskId=u2fce2db4-39a7-46fd-bc11-3c575f521e9&title=&width=566.5)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707992237848-0178febc-f6e2-4fbd-80be-ac14ea44ddc9.png#averageHue=%23f9f8e9&clientId=u6af51946-f881-4&from=paste&height=491&id=u370e30bc&originHeight=981&originWidth=1213&originalType=binary&ratio=2&rotation=0&showTitle=false&size=272159&status=done&style=none&taskId=u4fa56ccf-0f4a-4db7-9abb-212a1b13efd&title=&width=606.5)<br />默认就近原则使用局部变量 ↑↑↑

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707992213064-0b8b2012-58b1-4620-a227-dc89757d6368.png#averageHue=%23f9f7de&clientId=u6af51946-f881-4&from=paste&height=357&id=u16d99c63&originHeight=713&originWidth=1269&originalType=binary&ratio=2&rotation=0&showTitle=false&size=208504&status=done&style=none&taskId=u7bd5bb71-7ccb-49d9-b998-83b61a5ef4b&title=&width=634.5)<br />加入 this 则使用成员变量 ↑↑↑

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1707993106407-51fc8f37-295e-42c0-9a06-e5f303d0e11d.png#averageHue=%23363227&clientId=ufad22ebe-38a1-4&from=paste&height=312&id=uc83eea66&originHeight=623&originWidth=1397&originalType=binary&ratio=2&rotation=0&showTitle=false&size=633801&status=done&style=none&taskId=u08687f7a-1dd3-47b4-a67f-605f32d5822&title=&width=698.5)<br />善于利用 this ↑↑↑（因为要做到见名知意）
<a name="gB01O"></a>
### this 特点：不能写在类中，因为没有调用，或说不能出现在 static 修饰中。若出现在构造方法，则表示其所创建的对象
<a name="NJa8n"></a>
### this 内存原理解释：		
本质：所在方法调用者的地址值<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708151134341-e07749f9-6563-408a-a37f-2fae767d963b.png#averageHue=%23f2efc5&clientId=u825d5cbb-b262-4&from=paste&height=404&id=ud67f2831&originHeight=1294&originWidth=2624&originalType=binary&ratio=2&rotation=0&showTitle=false&size=801401&status=done&style=none&taskId=u31c649ee-f77b-44a1-9608-42865b1419c&title=&width=819)<br />方法：method<br />调用语句： s.method( ) ;<br />调用者：s （001）<br />this：（001）<br />s 的地址为 001，则 this 即代表 001<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708151329359-34cb6321-1c87-4cb9-8fcb-39ffcf29b44f.png#averageHue=%23f4ecc0&clientId=u825d5cbb-b262-4&from=paste&height=663&id=ued154516&originHeight=1325&originWidth=2671&originalType=binary&ratio=2&rotation=0&showTitle=false&size=979239&status=done&style=none&taskId=ud309fcd8-69ed-4de7-a19d-db47641807b&title=&width=1335.5)


set 方法里面的 this 👇<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708151590960-6e9c49fa-b122-46bb-a1f4-6a13d881953e.png#averageHue=%23f4e9c9&clientId=u825d5cbb-b262-4&from=paste&height=628&id=uce5ef5aa&originHeight=1255&originWidth=2592&originalType=binary&ratio=2&rotation=0&showTitle=false&size=928678&status=done&style=none&taskId=uaae678bc-2772-44d3-8208-99c083225eb&title=&width=1296)
<a name="epWoJ"></a>
## charAt	通过字符串的索引找到字符
[https://www.yuque.com/ckkkk-mmgvr/nw3cgc/wu1ie2ic6z6snopi#YEikg](#YEikg)
<a name="zHs6U"></a>
## substring 截取
[https://www.yuque.com/ckkkk-mmgvr/wahxul/wu1ie2ic6z6snopi#MsV3b](#MsV3b)
<a name="yzRZ6"></a>
## replace 替换
[https://www.yuque.com/ckkkk-mmgvr/wahxul/wu1ie2ic6z6snopi#KBRmI](#KBRmI)
<a name="oC7YT"></a>
## StringBuilder
[https://www.yuque.com/ckkkk-mmgvr/wahxul/wu1ie2ic6z6snopi#gWUl7](#gWUl7)
<a name="KDYA7"></a>
## short.sort 方法	数组排序

<a name="o1VW1"></a>
# 字符串
<a name="nRY6X"></a>
## String
<a name="xhFaH"></a>
### String 定义
java.lang.String 类代表字符串，java 中所有的字符串文字都为此类对象。java.lang 包是 java 的核心包，所以使用时无需导包。
<a name="JlwC7"></a>
### String 的注意点
字符串一旦创建不会发生改变，它的对象在创建之后不能被改变。若将两个字符串进行拼接，会形成一个新的字符串，对原来字符串没有影响。<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708323798266-1b97ca6d-d09e-4091-ae70-80c276076754.png#averageHue=%23f1f1e4&clientId=uf504d46a-a13c-4&from=paste&height=127&id=ua3ce702a&originHeight=253&originWidth=1062&originalType=binary&ratio=2&rotation=0&showTitle=false&size=111369&status=done&style=none&taskId=u7b2b60dd-16e9-4178-86af-f5d14b9fde5&title=&width=531)<br />此处不是改变了原来字符串，而是重新创建了一个字符串。一共两个字符串👆
<a name="tdoh5"></a>
### 创建 String 对象的两种方式
<a name="HGGP8"></a>
#### 方式 一：直接赋值：
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708324048037-2cb6cbf6-eec0-4ce2-ab0a-7c85de67b391.png#averageHue=%23f5f5ed&clientId=uf504d46a-a13c-4&from=paste&height=103&id=u69fb334f&originHeight=206&originWidth=1746&originalType=binary&ratio=2&rotation=0&showTitle=false&size=116168&status=done&style=none&taskId=u1290ca1e-8b29-4a22-988d-6a32aacc415&title=&width=873)
<a name="m6u5b"></a>
#### 方式二：构造方法：
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708324081440-bdbca0ac-98d0-40c2-85b4-dfb596a9616e.png#averageHue=%23e9dedd&clientId=uf504d46a-a13c-4&from=paste&height=379&id=u47ecf438&originHeight=758&originWidth=2509&originalType=binary&ratio=2&rotation=0&showTitle=false&size=272395&status=done&style=none&taskId=u4197cee2-48d5-4e7c-aa68-1b5c8fce42d&title=&width=1254.5)
<a name="xI1hy"></a>
##### new 方法来获取一个对象
String s2 = new String();
```java
//2.使用new的方式来获取一个字符串对象
//空参构造
String s2 = new String();
System.out.println("@"+s2+"!");
```
<a name="OAQ43"></a>
##### 传递一个字符串，根据字符串内容再创建一个新的字符串
String s3 = new String("abc");
```java
//3.传递一个字符串，根据传递的字符串内容再创建一个新的字符串
String s3 = new String("abc");
System.out.println(s3);
```
<a name="KtQQM"></a>
##### 【重难点！！!】传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
char chs[ ] = {'a','b','c'};<br />String  s4 = new String(chs);
```java
//4.传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
//需求：修改字符串的内容。abc->qbc
//abc -> {'a','b','c'} -> {'q','b','c'} -> "qbc"
//字符串不可以发生变化，但字符数组可以发生变化
char chs[] = {'a', 'b', 'c', 'd'};
String s4 = new String(chs);
System.out.println(s4);
```
<a name="NrBZM"></a>
##### 【重难点！！！】传递一个字节数组，根据字节数组的内容在创建一个新的字符串对象
byte bytes[ ] = {97,98,99,100};<br />String s5 = new String(bytes);
```java
//5.传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
//应用场景：以后在网络当中传输的数据其实都是字节信息
//我们要把字节信息进行转换成字符串，此时就用到这个构造
byte bytes[] = {97,98,99,100};//ASCII码查后转换
String s5 = new String(bytes);
System.out.println(s5);//abc
```


<a name="FDt3e"></a>
### 字符串内存模型
> 详见十二（五）
> [https://www.yuque.com/ckkkk-mmgvr/nw3cgc/wu1ie2ic6z6snopi#Al0WZ](#Al0WZ)

<a name="qqRx3"></a>
#### StringTable（串池）（字符串常量池）定义
只有直接赋值的方式获取的字符串才会存在这个串池当中，否则 new 出来的一律在堆中 <br />从 JDK 开始，StringTable（串池）从方法区中挪到了堆内存
<a name="PDUmP"></a>
#### 【当字符串直接使用双引号进行赋值时】StringTable（串池）内存工作原理步骤
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708518902956-391cc06c-2ee0-4638-86f0-30ded8d9c887.png#averageHue=%23f7f1e8&clientId=ua1124f0b-c1af-4&from=paste&height=471&id=vG9mQ&originHeight=942&originWidth=1864&originalType=binary&ratio=2&rotation=0&showTitle=false&size=469758&status=done&style=none&taskId=u381d8287-17f8-4842-aed9-577e9bc2cdb&title=&width=932)
<a name="aLKCL"></a>
##### class 文件加载到方法区.....main 方法开始......
<a name="ygYOS"></a>
##### String s1 = “abc”; 为直接赋值 , 所以会先创建一个变量 s1
<a name="KOkH9"></a>
##### 系统观察 StringTable（串池）中有没有等号左边的字符串"abc"，没有的话就会创建一个新的字符串"abc"，并把地址 0x0011 赋值给 s1。
<a name="Rjvhx"></a>
##### 同样，若系统观察到 StringTable（串池）中已经有字符串"abc",那么会直接把地址 0x0011 赋值给 s2
<a name="yBwic"></a>
#### 【当字符串直接使用双引号进行赋值时】StringTable（串池）内存工作原理的总结👆
<a name="uVZyA"></a>
##### 当使用双引号直接给字符串赋值时，系统会检查 StringTable（串池）中是否存在该字符串。
不存在：创建新的<br />存在：复用 <br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708519436914-146af2df-1228-4d66-908a-e054f53f117e.png#averageHue=%23ebebe3&clientId=ua1124f0b-c1af-4&from=paste&height=318&id=Pjnsi&originHeight=635&originWidth=1313&originalType=binary&ratio=2&rotation=0&showTitle=false&size=166228&status=done&style=none&taskId=u798641fb-007d-4722-968c-74f483ff9e2&title=&width=656.5)
<a name="l3BDf"></a>
##### 好处：代码简单且节约内存（相同会复用）
<a name="yfybB"></a>
#### 【手动 new 出来的字符串（以字符数组为例）】在内存中的工作原理步骤
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708520645626-d5120437-9e25-45a2-988a-3121a60b9c9d.png#averageHue=%23f9f3ec&clientId=ua1124f0b-c1af-4&from=paste&height=408&id=ufd0009ed&originHeight=815&originWidth=1827&originalType=binary&ratio=2&rotation=0&showTitle=false&size=332199&status=done&style=none&taskId=u9919ba4b-4701-46a6-9bde-87706874f8a&title=&width=913.5)
<a name="U3yEX"></a>
###### main 方法先进栈......
<a name="zuq0E"></a>
###### 执行 char[ ] chs ={'a','b','c'};此时在堆内存中就有了一个 char 类型的数组，再把地址值 0x0011 赋值给在栈内存的变量 chs
<a name="FLnwy"></a>
###### 再执行 String s1 = new String(chs);此时是 new 出来的，即在堆里面开辟了一个新的小空间，存放字符数组的内容"abc"，在把地址值 0x0022 赋值给 s1
<a name="sZl4J"></a>
###### 再执行 String s2 = new String(chs); 此时是仍 new 出来的，即又 在堆里面开辟了一个新的小空间，存放字符数组的内容"abc"，在把地址值 0x0033 赋值给 s2
<a name="LQQoi"></a>
#### 【手动 new 出来的字符串（以字符数组为例）】特点👆
每次都要 在堆中 new 出一个小空间，不会复用，浪费内存空间
<a name="ZK6zH"></a>
### 【==】【equals、equalsIgnoreCase】字符串比较 
<a name="fsCEm"></a>
#### ==
<a name="BN2UI"></a>
##### ' == ' 比的到底是什么？
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708521133658-b91d448a-24d8-4ad7-9487-b722d8c60364.png#averageHue=%23f5f3ec&clientId=ua1124f0b-c1af-4&from=paste&height=435&id=ub3b49cfc&originHeight=870&originWidth=1749&originalType=binary&ratio=2&rotation=0&showTitle=false&size=283038&status=done&style=none&taskId=u86ac7e64-e7f9-45b9-b531-fc1367b347e&title=&width=874.5)
<a name="H7tza"></a>
###### 基本数据类型：比较的是具体的值。
<a name="irUoX"></a>
###### 引用数据类型：比较的是地址值。
<a name="fUiLc"></a>
##### ' == ' 比较的情况分类
<a name="A6kGo"></a>
###### 两个直接赋值的字符串的比较
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708520887882-b72187fd-d0fe-46fb-9a70-18b4eaad2240.png#averageHue=%23ebebc1&clientId=ua1124f0b-c1af-4&from=paste&height=76&id=bF7XO&originHeight=156&originWidth=1542&originalType=binary&ratio=2&rotation=0&showTitle=false&size=119284&status=done&style=none&taskId=u4af3f051-6a1f-4dda-91cc-0da786b3af2&title=&width=750)<br />即在 StringTable（串池）里比较，复用使地址值一样
<a name="kDpqF"></a>
###### 直接赋值和 new 出来的字符串之间的比较
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708520960004-bb90fd00-545e-48d3-a57d-201fd531516a.png#averageHue=%23f1f1d7&clientId=ua1124f0b-c1af-4&from=paste&height=88&id=u90a27fa5&originHeight=176&originWidth=743&originalType=binary&ratio=2&rotation=0&showTitle=false&size=62212&status=done&style=none&taskId=u93b586ad-4c53-4555-8e40-71bfdbf6aca&title=&width=371.5)<br />s1 记录的是在堆里面的地址，s2 记录的是在串池里面的地址。<br />false，因为引用‘==’比较引用数据类型时比较的是地址值
<a name="fwT4g"></a>
###### 键盘录入和代码赋值的字符串之间的比较
通过查看原码可知，Scanner 中 sc.next() 最底层也是 new 出来的
```java
//5. 键盘录入和代码赋值的字符串用==比较
Scanner sc = new Scanner(System.in);
String str1 = sc.next();//new出来的
String str2 = "abc";
System.out.println(str1==str2);
```
<a name="AuQ2R"></a>
#### boolean equals 方法（要比较的字符串），不忽略大小写（eg：比较密码）
<a name="Aipy5"></a>
#### boolean equalsIgnoreCase（要比较的字符串），忽略大小写（eg：比较验证码）
<a name="WoWD5"></a>
### 【charAt】字符串遍历字符
```java
package com.itheima.AC练习.字符串例题;

import java.util.Scanner;

public class 字符串遍历 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //2.遍历
        for (int i = 0; i < str.length(); i++) {
            //i一次表示字符串每一个索引
            System.out.println(str.charAt(i));//charAt字符串索引->字符
        }
    }
}
```
<a name="S1Dji"></a>
#### 快捷键： 字符串变量名.lenth().fori 
<a name="YEikg"></a>
#### 通过索引找到每一个字符：字符变量名.charAt(索引)
传入索引，返回索引对应的字符
<a name="Vmyuj"></a>
### 【+】 字符串拼接（优点：简洁易理解，缺点：速度慢（所以可使用 StringBuilder））
可直接用‘+’相加即拼接，
```java
package com.itheima.AC练习.字符串例题;

import java.util.Scanner;

public class 拼接字符串 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        String str = arrToString(arr);
        System.out.println(str);


    }

    public static String arrToString(int arr[]) {
        if (arr == null)
            return "";
        else if (arr.length == 0)
            return "[]";
        else {
            String result = "[";
            for (int i = 0; i < arr.length; i++) {
                if (i == arr.length - 1)
                    result += arr[i];
                else
                    result += arr[i] + ",";
            }
            result += "]";
            return result;
        }
    }

}
```
<a name="tdxnv"></a>
### 【StringBuilder】 字符串拼接（优点：速度快，缺点：麻烦（所以可使用 StringJoiner））i++
StringBuilder：<br />[https://www.yuque.com/ckkkk-mmgvr/wahxul/wu1ie2ic6z6snopi#gWUl7](#gWUl7)<br />StringJoiner：<br />[https://www.yuque.com/ckkkk-mmgvr/wahxul/wu1ie2ic6z6snopi#IFYMm](#IFYMm)
<a name="igjrm"></a>
### 字符串统计大小写及数字
```java
package com.itheima.AC练习.字符串例题;

import java.util.Scanner;

public class 统计字符次数 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串：");
        String str = sc.next();

        //2.统计 -- 计数器思想
        //定义三个计数器
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            //遍历每一个字符
            char c = str.charAt(i);
            //            System.out.println(c);
            //计数
            if (c >= 'a' && c <= 'z')
                smallCount++;
            else if (c >= 'A' && c <= 'Z')
                bigCount++;
            else if (c >= '0' && c <= '9') {
                numberCount++;
            }


        }
        //3.输出打印
        System.out.println("小写字母有：" + smallCount + "个");
        System.out.println("大写字母有：" + bigCount + "个");
        System.out.println("数字有：" + numberCount + "个");
    }
}
```
<a name="gkhSc"></a>
### 字符串反转-
法一：<br />倒序遍历，然后result += c；<br />法二：<br />正序遍历，然后result = c + result；
```java
package com.itheima.AC练习.字符串例题;

import java.util.Scanner;

public class 字符串反转 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(stringReverse1(str));
        System.out.println(stringReverse2(str));
    }

    //法一：
    //倒序遍历，然后result += c
    public static String stringReverse1(String str) {
    String result = "";
    for (int i = str.length() - 1; i >= 0; i--) {
        char c = str.charAt(i);
        result += c;
    }
    return result;
}

//法二：
//正序遍历，然后result = c + result
public static String stringReverse2(String str) {
String result = "";
for (int i = 0; i < str.length(); i++) {
    char c = str.charAt(i);
    result = c + result;
}
return result;
}

}
```
<a name="MsV3b"></a>
### 【substring】 字符串截取
<a name="WQBLG"></a>
#### substring
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708613450349-8834b9ac-25d8-4873-8cd1-898703d201d3.png#averageHue=%232b583f&clientId=u2efebd63-e380-4&from=paste&height=241&id=u63cde1a6&originHeight=482&originWidth=1021&originalType=binary&ratio=2&rotation=0&showTitle=false&size=220820&status=done&style=none&taskId=u2313eddc-6171-486d-ae05-ea089144248&title=&width=510.5)
<a name="sjYdu"></a>
#### 例题：手机号屏蔽
```java
package com.itheima.AC练习.字符串例题;

public class 手机号屏蔽 {
    public static void main(String[] args) {
        //1.获取一个手机号码
        String phoneNumber = "15763069919";

        //2.截取手机号码前三位
        String start = phoneNumber.substring(0,3);
        //        System.out.println(start);

        //3.截取手机号后四位
        String end = phoneNumber.substring(7);

        //4.拼接
        String result = start + "****" + end;

        //5.打印
        System.out.println(result);
    }
}
```

<a name="xcEuo"></a>
### 字符转换为数字 (eg:‘0’->0 )
<a name="f08DW"></a>
#### 字符 - '0' = 数字
即 ASCII 码相减
<a name="R1IP7"></a>
#### 身份证信息获取
```java
package com.itheima.AC练习.字符串例题;

public class 身份证信息查看 {
    public static void main(String[] args) {
        //1.定义一个字符串记录身份证号码
        String id = "370702200503116218";

        //2.获取出生年月日
        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);

        System.out.println("人物信息为：" + year + "年" + month + "月" + day + "日");

        //3.获取性别
        char sex = id.charAt(16);
        //字符'0' -> 数字0
        int sexId = sex - '0';
        //奇男偶女
        if (sexId % 2 == 0) {
            System.out.println("性别为：女");
        } else {
            System.out.println("性别为：男");
        }
    }
}

```
<a name="d6Blq"></a>
### 数字转字符串	数字+'' ''
<a name="sUbCN"></a>
### 金额换算

```java
package com.itheima.AC练习.字符串例题;

import java.util.Scanner;

public class 金额转换 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("请输入金额");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("金额无效");
            }
        }
        //定义一个变量用来表示钱的大写
        String moneyStr = "";
        //2.得到money中每位数字,再转成中文
        while (true) {
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr = capitalNumber + moneyStr;
//            System.out.println(capitalNumber);
            money /= 10;
//            System.out.println(ge);
            if (money == 0)
                break;
        }

        //3.在前面补零
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零"+ moneyStr;
        }

        //4.插入单位
        String result = "";
        String arr[] = {"佰","拾","万","仟","佰","拾","元"};
        for (int i = 0; i < moneyStr.length(); i++) {
            result += moneyStr.charAt(i) + arr[i];
        }
        System.out.println(result);
    }

    //1->壹
    public static String getCapitalNumber(int number) {
        String arr[] = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }


}

```

<a name="KBRmI"></a>
### 【replace】字符串替换
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708615058403-93f4afff-2de2-418a-ac40-5a032a9a6624.png#averageHue=%2327553b&clientId=u2efebd63-e380-4&from=paste&height=249&id=uf6842c97&originHeight=498&originWidth=1014&originalType=binary&ratio=2&rotation=0&showTitle=false&size=120599&status=done&style=none&taskId=u83797b14-07d6-48bc-a9db-fffd50ebc39&title=&width=507)
<a name="yvZAI"></a>
#### 例题：敏感词屏蔽
```java
package com.itheima.AC练习.字符串例题;

public class 单个敏感词替换 {
    public static void main(String[] args) {
        //1.获取到说的话
        String talk = "你玩的真好，以后不要再玩了，TMD";

        //2.把TMD替换成***
        String result = talk.replace("TMD","***");

        System.out.println(result);


    }
}
```
<a name="wxuY3"></a>
### 【toCharArray】字符串->字符数组
<a name="rGfDU"></a>
### 【startswith】eg：xxxx.startswith("0")//若开头字符为 0 返回 true，否则返回 false

<a name="zXrxJ"></a>
### split(String regex)		 字符串切割								参数：切割点		返回值：切割形成的数组
<a name="gWUl7"></a>
## StringBuilder		（使用场景：字符串的拼接，字符串的反转。方法：append，toString，reverse，length）（因为麻烦，所以可使用 StringJoiner）
<a name="Yb0VP"></a>
### StringBuilder 概述
StringBuilder 可以看作一个容器，创建之后里面的内容是可变的<br />打印 StringBuilder 定义的对象的时候，因为 StringBuilder 是 Java 已经写好的类，打印对象不是地址值而是属性值<br />作用：提高字符串的操作效率<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708652397141-1ce76986-7f0c-4695-bc6e-e0c34fff5d49.png#averageHue=%23faf9f9&clientId=u2ddbc8dc-1be1-4&from=paste&height=334&id=uf32f50e4&originHeight=668&originWidth=1585&originalType=binary&ratio=2&rotation=0&showTitle=false&size=195190&status=done&style=none&taskId=ue3809331-6b17-4533-a29a-202b60bb278&title=&width=792.5)
<a name="PdeHT"></a>
###  StringBuilder 构造方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708652469894-ba4357fd-e7be-48f2-85e5-dbcb13545b44.png#averageHue=%23e6e7c7&clientId=u2ddbc8dc-1be1-4&from=paste&height=400&id=uf5a44c14&originHeight=800&originWidth=1573&originalType=binary&ratio=2&rotation=0&showTitle=false&size=249224&status=done&style=none&taskId=ucfbb870c-d0c7-49b4-918a-7d673fb0b7a&title=&width=786.5)
<a name="Mzn0t"></a>
### StringBuilder 常用方法 
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708652695852-338b214e-13d7-4f61-a137-7680b164c43a.png#averageHue=%23fcfefd&clientId=u2ddbc8dc-1be1-4&from=paste&height=343&id=u205ff591&originHeight=686&originWidth=1615&originalType=binary&ratio=2&rotation=0&showTitle=false&size=200102&status=done&style=none&taskId=u61d43db7-d164-46bb-86c4-6554f1578eb&title=&width=807.5)
```java
package com.itheima.AA基础.StringBuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder("abc");

        //2.添加元素
        sb.append(1);
        sb.append(2.3);
        sb.append(true);

        //打印 StringBuilder 定义的对象的时候，
        // 因为 StringBuilder 是 Java 已经写好的类，
        // 打印对象不是地址值而是属性值

        System.out.println(sb); //abc12.3true


        //3.反转数据
        sb.reverse();
        System.out.println(sb); //eurt3.21cba

        //4.获取长度
        int len = sb.length();
        System.out.println("长度为"+len);

        //5.StringBuilder -> String
        String str = sb.toString();
        System.out.println(str);

    }
}
```
<a name="YLU3L"></a>
#### public StringBuilder append(任意类型)		添加数据，并返回对象本身
<a name="QkGyP"></a>
#### public StringBuilder reverse()		反转容器中的内容 
<a name="WHOVj"></a>
#### public int length()			返回长度（字符出现的个数）
<a name="ig3ei"></a>
#### public String toString()		通过 toString()就可以实现把 StringBuilder 转换为 String
<a name="KfsId"></a>
#### capacity（）显示 StringBuilder 容量
eg：sout（sb.capacity）;
<a name="Orpmi"></a>
#### 
<a name="ukXic"></a>
### 链式编程
当我们在调用一个方法的时候，不需要用变量接收他的结果，可以继续调用其他方法
<a name="YiwmI"></a>
### StringBuilder 提高效率原理图
![211705041.jpg](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1709708350976-7ea29ec5-600d-4df8-913e-7785583b00ad.jpeg#averageHue=%23f7f6f6&from=url&height=499&id=jdkCh&originHeight=909&originWidth=1932&originalType=binary&ratio=1&rotation=0&showTitle=false&size=305070&status=done&style=none&title=&width=1061)

<a name="mWgba"></a>
### StringBuilder 源码分析（StringBuilder 扩容原理）
StringBuilder 会不会撑爆呢？<br />不会，因为：<br />![-1826519846.jpg](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1709708469376-79dc1798-d2d5-4d88-9644-f3f27aa1853f.jpeg#averageHue=%23f1eeee&from=url&height=445&id=PLj8q&originHeight=585&originWidth=921&originalType=binary&ratio=1&rotation=0&showTitle=false&size=135362&status=done&style=none&title=&width=701)
<a name="IFYMm"></a>
## StringJoiner		（好处：高效方便的拼接字符串，可指定间隔符号，开始符号，结束符号）
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708757521045-214bdc3f-8a06-4127-bd7c-a119e040a0e0.png#averageHue=%23e0e0cc&clientId=u3fb714f2-9fb4-4&from=paste&height=606&id=ud2de9b71&originHeight=1212&originWidth=1934&originalType=binary&ratio=2&rotation=0&showTitle=false&size=545033&status=done&style=none&taskId=u9039262b-94e2-45ac-a874-3962be910a8&title=&width=967)
<a name="t4Mns"></a>
### StringJoiner 概述
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708757630893-6205e82a-cb86-4474-9f40-f2bbd3b23fd8.png#averageHue=%23f6f4f4&clientId=u3fb714f2-9fb4-4&from=paste&height=179&id=ua6756e9e&originHeight=358&originWidth=1404&originalType=binary&ratio=2&rotation=0&showTitle=false&size=161631&status=done&style=none&taskId=u435f580b-2ca0-44ae-857e-910f36de003&title=&width=702)
<a name="iJXiA"></a>
### StringJoiner 构造方法（无空参构造）
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708757737060-11622ecc-fe73-44d5-bcab-413e8bf9a75e.png#averageHue=%23e6e8be&clientId=u3fb714f2-9fb4-4&from=paste&height=365&id=u4978002e&originHeight=730&originWidth=1583&originalType=binary&ratio=2&rotation=0&showTitle=false&size=259087&status=done&style=none&taskId=u912a9453-639a-402a-a0b3-02799686ce0&title=&width=791.5)
<a name="OXagU"></a>
### StringJoiner 成员方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708757800964-0594e75d-1728-4c1f-b722-81dd5fb51041.png#averageHue=%23c5c6c5&clientId=u3fb714f2-9fb4-4&from=paste&height=252&id=u3b429bbe&originHeight=503&originWidth=1564&originalType=binary&ratio=2&rotation=0&showTitle=false&size=188540&status=done&style=none&taskId=u6f396bd1-6f09-4be4-bf1a-2ac816227bd&title=&width=782)<br />add 不能添加数字，只能添加字符串！！！
<a name="RfLVz"></a>
## 字符串原理
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1709720604839-f1bf1ab0-5e3f-4d87-a2d6-9300186dd113.png#averageHue=%23f1f0f0&clientId=udb901744-14e6-4&from=paste&height=633&id=u5f053930&originHeight=1264&originWidth=2580&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1234259&status=done&style=none&taskId=u8736afbc-27b9-4a33-89ce-994c9840fbb&title=&width=1293)
<a name="xLHr8"></a>
### 字符串存储的内存原理
[https://www.yuque.com/ckkkk-mmgvr/wahxul/wu1ie2ic6z6snopi#qqRx3](#qqRx3)
<a name="BRdbz"></a>
#### 直接赋值会复用字符串常量池中的（串池会查找存储的字符串是否相同，相同复用，不同创建）
<a name="GzWmd"></a>
#### new 出来的不会复用，而是开辟一个新的空间
<a name="urQAJ"></a>
### ==号比较的到底是什么？
[https://www.yuque.com/ckkkk-mmgvr/wahxul/wu1ie2ic6z6snopi#ZK6zH](#ZK6zH)
<a name="MurlO"></a>
#### 基本数据类型比较数据值
<a name="gIlm4"></a>
#### 引用数据类型比较地址值
<a name="NNbUu"></a>
### 字符串拼接的底层原理
<a name="R7hLo"></a>
#### 拼接时没有变量参与
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708760910655-36d7d4dd-b0e9-4223-8d57-f49a7620c9dc.png#averageHue=%23f3e5c8&clientId=u3fb714f2-9fb4-4&from=paste&height=181&id=u5a44f67a&originHeight=362&originWidth=712&originalType=binary&ratio=2&rotation=0&showTitle=false&size=85501&status=done&style=none&taskId=u159d2f19-f0bc-4599-8595-c5bf72746a9&title=&width=356)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708761034343-f778356b-a75b-4183-93db-258a67768b8b.png#averageHue=%23faf8e8&clientId=u3fb714f2-9fb4-4&from=paste&height=423&id=kCiIG&originHeight=845&originWidth=1729&originalType=binary&ratio=2&rotation=0&showTitle=false&size=373324&status=done&style=none&taskId=u025c03c6-6868-4ff2-bb1c-a2ee0916d95&title=&width=864.5)


<a name="z7Kpe"></a>
#### 拼接时有变量参与
<a name="abjQk"></a>
##### JDK1-7
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708760942431-c4e2f2ba-4b21-4b57-b665-59c6a08584d4.png#averageHue=%23f7f7c8&clientId=u3fb714f2-9fb4-4&from=paste&height=209&id=uf5cd689e&originHeight=417&originWidth=729&originalType=binary&ratio=2&rotation=0&showTitle=false&size=100851&status=done&style=none&taskId=u48db48c4-3c51-40c9-a797-df49936d3a7&title=&width=364.5)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1708761677144-19543e41-f6ab-487a-b3df-e5bf74ec04e5.png#averageHue=%23f2f4c5&clientId=u3fb714f2-9fb4-4&from=paste&height=458&id=u93f7ef3c&originHeight=916&originWidth=1825&originalType=binary&ratio=2&rotation=0&showTitle=false&size=437099&status=done&style=none&taskId=udbd3a296-fe31-4b1c-8052-65827a7d858&title=&width=912.5)系统会自动使用 StringBuilder 拼接，一次+，两个对象（Stringbuilder、String） ，浪费性能
<a name="vTxH3"></a>
##### JDK 8 的优化
会提前预估大小，但是每次含变量的字符串拼接都要预估一次，同样浪费时间
<a name="kUkm8"></a>
### 

<a name="ceSpr"></a>
## 综合练习
<a name="ACNbP"></a>
# 重难易混理解
<a name="J9S0Q"></a>
## 静态变量、函数 与 非静态变量、函数 之间的关系
```java
package com.itheima.AC练习;

public class demo1 {
    //静态变量   --->  共享变量
    public static int have = 10;
    //非静态变量 --->  成员变量（用于定义对象）
    public int nohave = 666;
    //静态方法	--->   方法
    public static void State(){
        System.out.println("haveState!");
    }
    //非静态方法  --->  成员方法（用于定义对象）
    public void noState(){
        System.out.println("no have State!");
    }
    //main
    public static void main(String[] args) {
        //定义对象
        demo1 dm = new demo1();

        //【静态】（共享）
        //静态变量直接访问 √
        System.out.println(have);
        //静态变量通过类名访问 √
        System.out.println(demo1.have);
        //静态变量通过对象实例访问 √
        System.out.println(dm.have);
        //静态函数直接访问 √
        State();
        //静态函数通过类名访问 √
        demo1.State();
        //静态函数通过对象实例访问 √
        dm.State();

        //【非静态】（对象）
        //非静态变量直接访问 ×
        System.out.println(nohave);//err
        //非静态变量通过类名访问 ×
        System.out.println(demo1.nohave); //err
        //非静态变量通过对象实例访问 √
        System.out.println(dm.nohave);
        // 非静态方法直接访问 ×
        noState();//err
        //非静态方法通过类名访问 ×
        demo1.noState();//err
        //非静态方法通过对象实例访问 √
        dm.noState();

    }
}
```
<a name="ChgHN"></a>
### 静态变量、方法可以直接访问或通过类名、对象名 访问
（静态方法、非静态方法，都可以访问静态）<br />静态方法 （直接访问）---访问--->   静态（共享）<br />非静态方法 （对象）   ---访问--->   静态（共享）
<a name="f2CDv"></a>
### 非静态变量只可以通过对象名来访问
（非静态方法可以访问非静态变量、方法）<br />非静态方法 （对象）   ---访问--->	非静态（不共享）
<a name="A7kw9"></a>
## 为什么自定义的类要把成员私有化？
在面向对象编程中，将类的成员设置为私有（private）有几个重要的原因：

1.  **封装性（Encapsulation）**：私有成员变量可以隐藏类的实现细节，只暴露必要的接口给外部。这种封装性可以防止外部直接访问和修改类的内部状态，从而保护数据的完整性。 
2.  **安全性**：私有成员变量可以防止外部直接修改类的状态，确保数据的有效性。通过提供公共方法（getters和setters）来访问和修改私有成员，可以实现数据的有效控制和验证。 
3.  **灵活性**：封装私有成员变量可以让类的实现细节独立于类的使用者。这意味着类的内部实现可以更改而不影响外部代码，从而提高代码的灵活性和可维护性。 
4.  **信息隐藏**：私有成员变量可以隐藏实现细节，使得类的使用者不需要关心内部实现，只需关注类提供的接口。这种信息隐藏可以降低类之间的耦合度，提高代码的模块化程度。 

总之，通过将类的成员设置为私有，可以提高代码的安全性、封装性和灵活性，同时实现信息隐藏，从而更好地组织和管理代码。
<a name="cc0GE"></a>
## 为什么 abstract 和 static 不能一起用？
在Java中，`abstract`和`static`这两个关键字有一些冲突，因此不能同时用于同一个方法。这种限制是由Java语言设计所决定的，主要原因如下：

1.  **抽象方法的特性**： 
   - 抽象方法必须在子类中被实现，因为抽象方法没有具体的实现体，需要子类提供具体的实现。
   - 静态方法是属于类的方法，不依赖于具体的对象实例，无法被子类继承或重写。
2.  **静态方法的调用方式**： 
   - 静态方法可以直接通过类名调用，而不需要创建对象实例。
   - 抽象方法必须在子类中被实现后才能被调用，无法直接通过类名调用。

由于上述原因，Java不允许在抽象方法中使用`static`关键字，因为这会导致矛盾：抽象方法要求在子类中被实现，而静态方法不具有继承性（不属于虚方法表中的内容，不能继承），无法被子类继承和重写。

如果一个方法被声明为抽象方法，它必须在子类中被实现，而静态方法不需要实例化对象就可以调用。因此，将`abstract`和`static`同时用于同一个方法会导致矛盾，违反了Java语言的设计原则。

综上所述，由于抽象方法和静态方法在设计和使用上存在冲突，Java不允许将`abstract`和`static`同时用于同一个方法。
<a name="ytJHv"></a>
# 集合
<a name="UZ7Pr"></a>
## 集合的定义
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1709805564583-7ad5b042-a8ca-4539-97c2-28c47af80c74.png#averageHue=%23f2e9e9&clientId=u75ba8d87-3119-4&from=paste&height=516&id=u10c8bbb8&originHeight=1032&originWidth=1894&originalType=binary&ratio=2&rotation=0&showTitle=false&size=378355&status=done&style=none&taskId=ueca9b6cf-229e-43ac-b517-2f5cc06f8d0&title=&width=947)<br />自动扩容<br />集合只能存储引用数据类型，不能直接存基本数据类型，需要把他们变成其对应的包装类
<a name="DXBnU"></a>
## 集合体系结构
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713067056415-f7eb1bf7-18f3-4395-84c2-b7ea0812ca2f.png#averageHue=%23fbf3f3&clientId=u709a988d-0555-4&from=paste&height=294&id=u547cf19a&originHeight=1242&originWidth=2476&originalType=binary&ratio=2&rotation=0&showTitle=false&size=562606&status=done&style=none&taskId=u51eb3a36-abbf-4823-8d0a-1b493cf3314&title=&width=586)	<br />![](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1713068631552-5c1408dc-e3f5-4021-8403-6ad700595bab.jpeg)
<a name="eNND6"></a>
## 集合具体常用类型学习
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713098253335-1c88c470-3683-44ec-97dd-17234c597d08.png#averageHue=%23ed8946&clientId=u8023686a-c168-4&from=paste&height=563&id=u44305783&originHeight=1126&originWidth=1992&originalType=binary&ratio=2&rotation=0&showTitle=false&size=517667&status=done&style=none&taskId=u2897ac82-e591-4b1b-a8fc-6e6a3d1e8af&title=&width=996)
<a name="FkEan"></a>
### Collection 单列集合：每次只能添加一个元素
<a name="Lsbpm"></a>
#### Collection
<a name="x0koi"></a>
##### Collection 方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713068863729-55048161-4847-4d24-b1bf-060ae9cbfe88.png#averageHue=%23e7dcda&clientId=u709a988d-0555-4&from=paste&height=561&id=D1T2s&originHeight=1122&originWidth=2330&originalType=binary&ratio=2&rotation=0&showTitle=false&size=478356&status=done&style=none&taskId=u4ac5e1df-67fa-4517-ac03-d0425ca8974&title=&width=1165)

<a name="sJL4r"></a>
##### Collection 方法【细节】

```java
package practise.ListAndMap.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection单列集合 {
    public static void main(String[] args) {

        //Collection是一个接口，我们不能直接创建他的对象，只能创建其实现类的对象，为了学习方便

        //我们使用其实现类ArrayList演示
        Collection<String> collection = new ArrayList<>();

        //1.创建对象
        //返回值：
        //  往List系列添加永远返回ture
        //  往Set系列添加，若添加元素不在Set里面存在，返回ture，否则表示元素已经存在。返回false
        //  因为Set系列不允许重复
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");

        System.out.println("1." + collection);

        //2.清空
        collection.clear();
        System.out.println("2." + collection);

        //3.删除
        //因为在Collection定义的是List和Set的共性的方法
        // 而Set系列没有索引，所以Collection的remove方法不能通过索引删除
        //比如：面试题目 remove(1) 和 remove(new Integer(1)) 区别
        //  前者为据索引删除，后者为删除对象
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        System.out.println("3.1" + collection);
        collection.remove("aaa");
        System.out.println("3.2删除aaa:" + collection);

        //4.判断元素是否包含
        //接口中定义的方法是抽象方法，需要重写
        //底层：依赖Object的equals方法进行判断的
        //如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，一定要重写equals方法
        //因为equals比较的是地址值，即使对象中的属性值一样
        boolean ddd = collection.contains("ddd");
        System.out.println(ddd);

        //5.判断是否为空isEmpty()
        //6.获取集合长度size() 
    }
}
```
<a name="sLbKE"></a>
##### Collection 遍历方式：迭代器遍历，增强 for 遍历，Lambda 表达式遍历
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713073562139-ebe45467-83f4-4f0e-afce-322e98609ba9.png#averageHue=%23f8f4f3&clientId=u709a988d-0555-4&from=paste&height=494&id=oIFKR&originHeight=988&originWidth=2568&originalType=binary&ratio=2&rotation=0&showTitle=false&size=547152&status=done&style=none&taskId=u05643135-db20-4114-a1ff-592db961169&title=&width=1284)
<a name="U2Vz1"></a>
######  迭代器遍历	Iterator
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713071216353-3b3ce1fd-77a7-48ad-9021-1ac97804182a.png#averageHue=%23f9f7f7&clientId=u709a988d-0555-4&from=paste&height=558&id=kuue4&originHeight=1116&originWidth=2238&originalType=binary&ratio=2&rotation=0&showTitle=false&size=239424&status=done&style=none&taskId=uf3e160d0-5b76-436e-9007-69f48e32a14&title=&width=1119)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713075729628-679604bc-3cf7-4168-a2af-254641b4555e.png#averageHue=%23e6d4d1&clientId=u709a988d-0555-4&from=paste&height=380&id=u0177c628&originHeight=760&originWidth=1492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=309278&status=done&style=none&taskId=u70e25991-22da-4176-be33-a64298d9130&title=&width=746)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713071486132-c911d388-7f83-4da6-9b7c-123d03373456.png#averageHue=%23f8f3eb&clientId=u709a988d-0555-4&from=paste&height=610&id=qoSgV&originHeight=1220&originWidth=2578&originalType=binary&ratio=2&rotation=0&showTitle=false&size=505629&status=done&style=none&taskId=u93b9db9f-6567-4b9f-804a-65ffce422df&title=&width=1289)

```java
package practise.ListAndMap.Collection.迭代器;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator迭代器 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();//获取元素并移动指针
            System.out.println(next);
        }
    }
}
```

【细节】：<br />1. 迭代器指针不会复位，若想再次使用只能重新创建迭代器！！！！！！！！！！！<br />2.只能用一次 next 方法，否则调用一次，移动一次，只能添加变量来操作<br />3.迭代器遍历时，不能用集合的方法进行增加或删除，应使用迭代器自带的 remove<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713071814124-0f6b43be-0d88-4626-a875-4e1b3f0007d3.png#averageHue=%23f7f5ee&clientId=u709a988d-0555-4&from=paste&height=692&id=DMJs6&originHeight=1384&originWidth=2636&originalType=binary&ratio=2&rotation=0&showTitle=false&size=674500&status=done&style=none&taskId=ubd3939c3-d107-4e4f-b4b1-c776e6c2be4&title=&width=1318)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713072282493-be6a12e7-d1d2-4f65-9ea0-8cf9a0f3f31e.png#averageHue=%23f7f2ec&clientId=u709a988d-0555-4&from=paste&height=603&id=yqH6C&originHeight=1206&originWidth=2642&originalType=binary&ratio=2&rotation=0&showTitle=false&size=747879&status=done&style=none&taskId=uf2e6edbb-2834-490a-a104-76532a5ced5&title=&width=1321)

<a name="xAqI5"></a>
###### 增强 for 遍历	底层是迭代器
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713072437021-b7b7ebd0-ab2c-4d59-95e9-fd7c70c4a24e.png#averageHue=%23f7f5e9&clientId=u709a988d-0555-4&from=paste&height=578&id=nXoaX&originHeight=1156&originWidth=2424&originalType=binary&ratio=2&rotation=0&showTitle=false&size=449677&status=done&style=none&taskId=u83fcef5f-29fa-46e7-97c0-93d5de287d2&title=&width=1212)

```java
package practise.ListAndMap.Collection.迭代器;

import java.util.ArrayList;
import java.util.Collection;

public class Iterator迭代器 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");

        //2.增强for循环
        System.out.println("================增强for循环================");
        for (String s : collection) {
            System.out.println(s);
        }

    }
}
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713072906635-2f510b76-fbde-4869-93a3-dad1d439f776.png#averageHue=%23fbfafa&clientId=u709a988d-0555-4&from=paste&height=617&id=lIPi0&originHeight=1234&originWidth=2266&originalType=binary&ratio=2&rotation=0&showTitle=false&size=212984&status=done&style=none&taskId=u5dd9ec64-5700-46d3-8b90-3ebc66340e2&title=&width=1133)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713072938288-279d5ac7-10c9-4295-b2e5-d3b49205008e.png#averageHue=%23f7f6f6&clientId=u709a988d-0555-4&from=paste&height=565&id=hHt5I&originHeight=1130&originWidth=2204&originalType=binary&ratio=2&rotation=0&showTitle=false&size=217216&status=done&style=none&taskId=u62128c62-b533-497d-9bc9-8949aa377cc&title=&width=1102)<br />另外开辟的一个空间进行取出遍历，改变的只是这个新空间的值，而非原本的数据
<a name="OIKbm"></a>
###### Lambda 表达式进行遍历
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713073013998-81ceb9a4-ee07-4580-928c-5ae08dd6b97f.png#averageHue=%23f0dfdd&clientId=u709a988d-0555-4&from=paste&height=404&id=EoPC1&originHeight=808&originWidth=2547&originalType=binary&ratio=2&rotation=0&showTitle=false&size=288598&status=done&style=none&taskId=u968059ed-29ce-4269-915b-abe4c5c0caa&title=&width=1273.5)

```java
package practise.ListAndMap.Collection.Collection遍历;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Collection遍历 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("aaa");
        collection.add("bbb");
        collection.add("ccc");
        collection.add("ddd");

        //3.lambda表达式遍历
        //方法底层会自己遍历集合，依次得到每一个元素，把得到的每一个元素传递给accept方法
        System.out.println("================匿名内部类================");
        collection.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("================lambda表达式遍历================");
        collection.forEach(s -> System.out.println(s));
    }
}
```
<a name="sK8mM"></a>
#### List 系列集合：添加的元素是有序（存和取的顺序一样）、可重复（能存储重复的元素）、有索引（可通过索引获取元素）
<a name="xfPau"></a>
##### List
<a name="Q8OLS"></a>
###### 特点及方法及代码
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713073874315-263168d1-2c85-42ea-b645-c25f4e57dc93.png#averageHue=%23f9f6f5&clientId=u709a988d-0555-4&from=paste&height=553&id=u251f61fe&originHeight=1106&originWidth=2528&originalType=binary&ratio=2&rotation=0&showTitle=false&size=352951&status=done&style=none&taskId=u42c081ad-7f67-406d-9b2f-260ec9727fd&title=&width=1264)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713073954257-a1708a35-a2ce-4aeb-9f18-fd9a9c48b368.png#averageHue=%23e7dedc&clientId=u709a988d-0555-4&from=paste&height=400&id=u296f9154&originHeight=799&originWidth=1492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=320268&status=done&style=none&taskId=u480001e3-6810-4fe9-ad57-25aa5c642ed&title=&width=746)<br />重载时冲突：优先调用，实参跟形参类型一致的那个方法。👇<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713074401021-9802a1f3-ecce-4d8c-8144-c39ba2af0337.png#averageHue=%23fdfdfc&clientId=u709a988d-0555-4&from=paste&height=610&id=u4a774940&originHeight=1220&originWidth=1740&originalType=binary&ratio=2&rotation=0&showTitle=false&size=533129&status=done&style=none&taskId=uebcf333b-a624-45a2-9d40-06ac5056d96&title=&width=870)

```java
package practise.ListAndMap.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class List集合 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //1.add
        //细节：若添加的索引处有元素，则该元素向后移
        System.out.println("=================add=================");
        list.add(0, "aaa");
        list.add(0, "bbb");
        list.add(0, "ccc");
        list.add(0, "ddd");
        System.out.println(list);

        //2.remove
        System.out.println("=================remove=================");
        String remove = list.remove(0);
        System.out.println(remove);

        //3. set
        System.out.println("=================set=================");
        String qqq = list.set(0, "qqq");
        System.out.println(qqq);
        System.out.println(list);

        //4.get
        System.out.println("=================get=================");
        String s = list.get(0);
        System.out.println(s);
    }
}
```

<a name="RfyYl"></a>
###### 遍历：迭代器，增强 for，lambda 表达式、列表迭代器（独有），普通 for（因为 list 存在索引）

列表迭代器（独有）![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713075294443-13d83ced-ef0e-46b7-966f-7fd801aa4296.png#averageHue=%23f5f5f5&clientId=u709a988d-0555-4&from=paste&height=332&id=ud67270d4&originHeight=664&originWidth=1730&originalType=binary&ratio=2&rotation=0&showTitle=false&size=213097&status=done&style=none&taskId=u2df1de95-3fc7-4154-b8a7-d6fcdc7d6ff&title=&width=865)

```java
package practise.ListAndMap.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List遍历 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //1.迭代器
        System.out.println("===============迭代器================");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        //2.增强for
        System.out.println("===============增强for================");
        for (String s : list) {
            System.out.println(s);
        }

        //3.lambda
        System.out.println("===============lambda================");
        list.forEach(System.out::println);

        //4.for
        System.out.println("===============for================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //5.列表迭代器
        System.out.println("===============列表迭代器================");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String next = listIterator.next();
            System.out.println(next);
            if ("bbb".equals(next)) {
                listIterator.add("qqq");
            }
        }
        System.out.println(list);
    }
}
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713075554600-361dced4-5e5d-44be-ae80-caa664496745.png#averageHue=%23f7f7f7&clientId=u709a988d-0555-4&from=paste&height=579&id=ub5e5c291&originHeight=1158&originWidth=1930&originalType=binary&ratio=2&rotation=0&showTitle=false&size=443315&status=done&style=none&taskId=ue4e9c368-5c73-4c55-bf92-6f13ba80724&title=&width=965)
<a name="kYtcQ"></a>
##### ArrayList	可存储对象
```
//提示词
```
此时我们创建的是 ArrayList 的对象，而 ArrayList 是已经写好的一个类，这个类在底层做了一些处理，打印对象的时候打印的不是地址值，而是集合中存储的数据内容，在展示的时候会拿 [ ] 把所有数据进行包裹，如：<br />ArrayList<String> list  = new ArrayLisy<>();<br /> sout(list);	//打印结果为 [ ]
<a name="Y49Mw"></a>
###### JDK 7 以前：
```java
package itheima.AA基础.ArrayList;

import java.util.ArrayList;

public class Demo1 {
    //JDK 7以前
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
    }
}

```
<a name="aZjV4"></a>
###### JDK 7 及以后：
```java
package itheima.AA基础.ArrayList;

import java.util.ArrayList;

public class Demo1 {
    //JDK 7以后
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
    }
}
```
<a name="pcFus"></a>
###### ArrayList 成员方法（增删改查）
![8b49c33c0f4ffde026c6fe9e7ccdc04.jpg](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1709811263280-cd0fda0b-e097-4caa-950c-8acc8b33f8f3.jpeg#averageHue=%23fcfdf9&clientId=ue11e4e86-5845-4&from=paste&height=437&id=sGgd6&originHeight=1240&originWidth=2772&originalType=binary&ratio=2&rotation=0&showTitle=false&size=487759&status=done&style=none&taskId=ufd1c62d6-09e1-4371-8cd5-1dc7519ff9d&title=&width=976)<br />add 返回值只有 true，所以一般不去管其返回值，但是由于是返回的 boolean，所以不能链式编程
<a name="BKvRd"></a>
###### itr 迭代器 是 ArrayList 的内部类
<a name="QNgvp"></a>
###### ArrayList	底层原理
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713077241766-29bd44c5-ee9e-46eb-a2fe-414a845a1999.png#averageHue=%23f6f3f3&clientId=u709a988d-0555-4&from=paste&height=576&id=u7ff3f26c&originHeight=1152&originWidth=2560&originalType=binary&ratio=2&rotation=0&showTitle=false&size=370886&status=done&style=none&taskId=u6c615e1f-454e-4077-81dc-1be335448b4&title=&width=1280)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713077282037-5b75bca7-2c38-4f81-b295-a5c4b0ae4cec.png#averageHue=%23f5efee&clientId=u709a988d-0555-4&from=paste&height=340&id=u8db999ba&originHeight=680&originWidth=2464&originalType=binary&ratio=2&rotation=0&showTitle=false&size=268798&status=done&style=none&taskId=ua56e2958-b0f9-4916-910d-d6cea2e38bb&title=&width=1232)<br />第一次存储数据（数据个数<10）：👇<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713081772347-777aae5d-af96-40e3-922e-5313f6a70af4.png#averageHue=%23fdfbfa&clientId=u709a988d-0555-4&from=paste&height=570&id=u1739a798&originHeight=1140&originWidth=2560&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1179282&status=done&style=none&taskId=ucbaa7cab-7f29-46b7-b919-974f3766739&title=&width=1280)<br />数据个数=10 再存数据：👇<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713082615772-9b74cb5c-8b5d-4754-88f8-a7741d32e3cd.png#averageHue=%23e5ddd3&clientId=u709a988d-0555-4&from=paste&height=625&id=u7acc20ea&originHeight=1250&originWidth=2666&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1628831&status=done&style=none&taskId=ud56cf8ba-3414-47b7-bd48-d7aa0013f37&title=&width=1333)
<a name="DWE0U"></a>
##### LinkedList	底层是双链表
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713082721276-52eeed78-f3e8-4bb0-b69a-2c5902a8c490.png#averageHue=%23f3eeee&clientId=u709a988d-0555-4&from=paste&height=469&id=u192aa2c6&originHeight=938&originWidth=2486&originalType=binary&ratio=2&rotation=0&showTitle=false&size=387865&status=done&style=none&taskId=ub50f4c1d-158b-4545-a3ba-256299f3b6a&title=&width=1243)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713082730575-c0cbcbe5-eb4f-4eb5-867b-1e04d3a68389.png#averageHue=%23e8dedc&clientId=u709a988d-0555-4&from=paste&height=567&id=ub049c577&originHeight=1134&originWidth=2444&originalType=binary&ratio=2&rotation=0&showTitle=false&size=488034&status=done&style=none&taskId=u06e0ac46-e6f7-474c-a478-6e3d9e70c61&title=&width=1222)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713083772945-9f0e4618-76bc-477e-9d1d-a29b50ddfe5e.png#averageHue=%23f9f6f5&clientId=u709a988d-0555-4&from=paste&height=560&id=u60679554&originHeight=1120&originWidth=2714&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1406003&status=done&style=none&taskId=uc187158f-e21a-4020-a889-518c2a58d4d&title=&width=1357)
<a name="yMjxY"></a>
##### Vector		淘汰了
<a name="lqEUn"></a>
#### Set 系列集合：添加的元素是无序(存和取的顺序可能不一样)、不重复（不能存储重复的元素）、无索引		Set 是一个接口
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713610577449-89ed33e4-1369-47b8-940a-b73b13a875c4.png#averageHue=%23f9f8f8&clientId=u2110e27a-6007-4&from=paste&height=524&id=u2abd3ab4&originHeight=1048&originWidth=2058&originalType=binary&ratio=2&rotation=0&showTitle=false&size=325322&status=done&style=none&taskId=u79567af0-2907-44bc-a4c9-915377d6dd5&title=&width=1029)
<a name="cFdog"></a>
##### HashSet
<a name="R0hGL"></a>
###### 底层原理简介
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713615293790-97bd5e29-27fb-4e0c-bf39-5e07766245f6.png#averageHue=%23f8f4f3&clientId=u2110e27a-6007-4&from=paste&height=393&id=ud2dece5d&originHeight=786&originWidth=1436&originalType=binary&ratio=2&rotation=0&showTitle=false&size=268200&status=done&style=none&taskId=uc59500a8-afdb-4fd3-8f6b-00ffe967819&title=&width=718)
<a name="ymMKc"></a>
###### 哈希值
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713616892342-fd77fc97-7917-435b-9867-7536da76454c.png#averageHue=%23f4efee&clientId=u2110e27a-6007-4&from=paste&height=577&id=u95a12b42&originHeight=1154&originWidth=2368&originalType=binary&ratio=2&rotation=0&showTitle=false&size=552028&status=done&style=none&taskId=uca068938-2400-4095-840c-7b2a035c88e&title=&width=1184)


<a name="QyihK"></a>
###### JDK8 以前底层原理：数组+链表	JDK8 以后底层原理：数组+链表+红黑树
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713619391854-62d609c0-3ac1-4d47-8323-0705b58a301d.png#averageHue=%23f6f5f4&clientId=u2110e27a-6007-4&from=paste&height=432&id=u99ec5b8a&originHeight=864&originWidth=2510&originalType=binary&ratio=2&rotation=0&showTitle=false&size=305537&status=done&style=none&taskId=u832268d5-0cda-4a9c-85c0-6e769ee4aea&title=&width=1255)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713619475033-077cbbb4-fc78-400a-93e1-21e934c68aaa.png#averageHue=%23f6f4f4&clientId=u2110e27a-6007-4&from=paste&height=495&id=u5706daa0&originHeight=990&originWidth=2488&originalType=binary&ratio=2&rotation=0&showTitle=false&size=360057&status=done&style=none&taskId=u1f7340fe-af56-4614-b136-52d735b2e05&title=&width=1244)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713619553278-1ca9cac9-d21c-4793-ba98-61ac7ffcda7c.png#averageHue=%23f5f3f2&clientId=u2110e27a-6007-4&from=paste&height=546&id=uf5a7baa1&originHeight=1092&originWidth=2542&originalType=binary&ratio=2&rotation=0&showTitle=false&size=348654&status=done&style=none&taskId=u4c90c6f7-17ff-4554-8b2c-fd146e81e6c&title=&width=1271)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713619563293-2baaa590-0401-4085-a367-93c33526751c.png#averageHue=%23f4f2f2&clientId=u2110e27a-6007-4&from=paste&height=541&id=u37e1bf70&originHeight=1082&originWidth=2518&originalType=binary&ratio=2&rotation=0&showTitle=false&size=424802&status=done&style=none&taskId=u235030ca-84d7-406a-bf6b-656dfd4c72e&title=&width=1259)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713619595593-20de9a21-41bf-465d-92e0-c75293d1b574.png#averageHue=%23f6f5f4&clientId=u2110e27a-6007-4&from=paste&height=561&id=u16f48224&originHeight=1122&originWidth=2474&originalType=binary&ratio=2&rotation=0&showTitle=false&size=431859&status=done&style=none&taskId=u2ef2a168-327b-4004-941a-6c05baa58b9&title=&width=1237)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713619633210-1ed995f5-5492-4c68-9498-4a4c6d2b082d.png#averageHue=%23f7f4f3&clientId=u2110e27a-6007-4&from=paste&height=596&id=u3844a3e6&originHeight=1192&originWidth=2616&originalType=binary&ratio=2&rotation=0&showTitle=false&size=644129&status=done&style=none&taskId=u28ed916c-c7fc-4f30-a7f4-bb3c0e08f93&title=&width=1308)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713619667726-09f3bf7e-7281-41f1-903d-02fbdaeb5123.png#averageHue=%23f6f3f2&clientId=u2110e27a-6007-4&from=paste&height=608&id=u577aa581&originHeight=1216&originWidth=2524&originalType=binary&ratio=2&rotation=0&showTitle=false&size=578412&status=done&style=none&taskId=u25b6c702-7351-4ade-b73e-b8362568772&title=&width=1262)


解释“默认加载因为0.75的数组”：

1. 当数组里面存了 16 * 0.75 = 12 个元素以后，数组会扩容成原来的两倍
2. 当链表的长度大于 8 而且数组长度大于等于 64 时，那么当前的链表就会自动转换成红黑树

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713619900754-5e9dafed-adbf-42fe-82c4-49e9b18e35b1.png#averageHue=%23f5f1f0&clientId=u2110e27a-6007-4&from=paste&height=601&id=u66d5ca29&originHeight=1202&originWidth=2534&originalType=binary&ratio=2&rotation=0&showTitle=false&size=628960&status=done&style=none&taskId=u052338bd-ac46-4a5b-8a11-32d73841167&title=&width=1267)


按 alt+insert 重写<br />重写 hashCode 即是把根据地址值计算哈希值重写为根据属性值计算哈希值<br />重写 equal 方法即是把根据地址值比较重写为根据属性值比较<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713619973987-3a7af7dd-91c3-400d-b0be-7928cb906d58.png#averageHue=%23eae7e7&clientId=u2110e27a-6007-4&from=paste&height=414&id=ua7b7ab04&originHeight=828&originWidth=2398&originalType=binary&ratio=2&rotation=0&showTitle=false&size=346937&status=done&style=none&taskId=uc75793cf-3e33-4d64-8c7d-1ad6d054ac5&title=&width=1199)
<a name="DI1vo"></a>
###### hashCode 三个问题

1. HashSet 为什么存和取的顺序不一样

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713620243045-12175513-29ee-40df-97c5-b7ecccc28fa6.png#averageHue=%23f1efee&clientId=u2110e27a-6007-4&from=paste&height=534&id=u0b46dd1a&originHeight=1068&originWidth=2484&originalType=binary&ratio=2&rotation=0&showTitle=false&size=293477&status=done&style=none&taskId=u043d68c0-d1b3-48a4-bc0b-5c6f6983245&title=&width=1242)

2. HashSet 为什么没有索引

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713620283294-68bbab33-3bb9-44c1-8a3e-babf7a341d4a.png#averageHue=%23f6f4f3&clientId=u2110e27a-6007-4&from=paste&height=564&id=uf3c2013e&originHeight=1128&originWidth=2684&originalType=binary&ratio=2&rotation=0&showTitle=false&size=311308&status=done&style=none&taskId=u65de6298-366b-4211-b9cb-0b20984e9eb&title=&width=1342)

3. HashSet 是利用什么机制取保证数据去重的

所以自定义类中一定要重写 HashCode 和 equal 方法，可以保证其都根据属性值去判断，使得不是根据地址值计算，可保证数据不重复<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713620298162-25847dfc-6fa3-401b-9c24-d56617cf8716.png#averageHue=%23f5f2f1&clientId=u2110e27a-6007-4&from=paste&height=614&id=uf6f95a63&originHeight=1228&originWidth=2492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=417664&status=done&style=none&taskId=u98c67517-406b-4339-8c3b-579ef2a0640&title=&width=1246)



<a name="zWOIh"></a>
###### eg

```java

package practise.ListAndMap.Collection.Set.哈希表.hashSet去除重复的元素;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        //1.创建集合存储学生对象
        HashSet<Student> s = new HashSet<>();

        //2.创建学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);
        Student s4 = new Student("zhangsan", 23);

        //3.添加集合
        System.out.println(s.add(s1));
        System.out.println(s.add(s2));
        System.out.println(s.add(s3));
        //没有重写时为true，因为是根据地址值进行计算的
        //重写后是false，是根据属性值进行计算的
        System.out.println(s.add(s4));

        //4.打印集合
        System.out.println(s);


    }
}
```

```java

package practise.ListAndMap.Collection.Set.哈希表.hashSet去除重复的元素;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
```
<a name="GLB9C"></a>
##### TreeSet
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713622482750-2448484f-1d19-427a-b117-3649b06dadba.png#averageHue=%23f8f5f5&clientId=u2110e27a-6007-4&from=paste&height=328&id=u5d7558f8&originHeight=656&originWidth=2088&originalType=binary&ratio=2&rotation=0&showTitle=false&size=267196&status=done&style=none&taskId=u6a7ed3f3-0729-4227-a776-347d68a76df&title=&width=1044)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713623080617-004feccf-2faa-4b1b-a5f4-67d6ee8d47e4.png#averageHue=%23f8ece8&clientId=u2110e27a-6007-4&from=paste&height=578&id=u0b046ef5&originHeight=1156&originWidth=2464&originalType=binary&ratio=2&rotation=0&showTitle=false&size=512828&status=done&style=none&taskId=udeb13376-a6b3-48d8-83dd-c0ae3b60496&title=&width=1232)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713629376274-a772119e-535b-40ae-a35e-a0435ff0c843.png#averageHue=%23eeebeb&clientId=u2110e27a-6007-4&from=paste&height=595&id=ufb72be94&originHeight=1190&originWidth=2504&originalType=binary&ratio=2&rotation=0&showTitle=false&size=650092&status=done&style=none&taskId=u89f3d3a1-d304-4096-be64-f80779d5cb0&title=&width=1252)

<a name="xI851"></a>
###### TreeSet 两种比较方式	若都写，按照 comparator 的来
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713629331000-661eaa3a-f68f-41c2-8d0a-4eb602c8b0d2.png#averageHue=%23f8f2f1&clientId=u2110e27a-6007-4&from=paste&height=613&id=u6b749dd7&originHeight=1226&originWidth=2472&originalType=binary&ratio=2&rotation=0&showTitle=false&size=852596&status=done&style=none&taskId=ud7f1a25b-e967-42a7-9af7-69be63398fa&title=&width=1236)

1. 方式 1 Comparable 接口

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713623452196-9178c3a7-f7ea-4381-a570-eb2afbfc85a2.png#averageHue=%23fdfbfb&clientId=u2110e27a-6007-4&from=paste&height=459&id=u4f0e0fb9&originHeight=918&originWidth=2164&originalType=binary&ratio=2&rotation=0&showTitle=false&size=204801&status=done&style=none&taskId=u355733ad-11a7-4a03-b09b-dfc6c772a59&title=&width=1082)<br />不断调用，直至确定自己的位置<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713623887067-ac5b37bc-f9de-430a-b489-ed8c62592ca5.png#averageHue=%23f9f8f7&clientId=u2110e27a-6007-4&from=paste&height=430&id=u8d04e799&originHeight=616&originWidth=750&originalType=binary&ratio=2&rotation=0&showTitle=false&size=282435&status=done&style=none&taskId=u08c81134-e1b3-4019-98f8-3f64546fc04&title=&width=524)

```java
package practise.ListAndMap.Collection.Set.TreeSet.demo2;

import java.util.TreeSet;

public class demo2 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("lisi", 24);
        Student s3 = new Student("wangwu", 25);

        TreeSet<Student> ts = new TreeSet<>();
        System.out.println(ts.add(s1));
        System.out.println(ts.add(s2));
        System.out.println(ts.add(s3));

        System.out.println(ts);
    }
}
```

```java
package practise.ListAndMap.Collection.Set.TreeSet.demo2;

public class Student implements Comparable<Student> {
    private String name;
    public int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Student o) {
        //只看年龄
        return this.getAge() - o.getAge();
    }
}
```

2. 方式 2 比较器 Conparator 排序

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713626795907-f21f5d89-7893-4371-85c9-8ca770bb6d5c.png#averageHue=%23f8f6f6&clientId=u2110e27a-6007-4&from=paste&height=610&id=u913aa566&originHeight=1220&originWidth=2550&originalType=binary&ratio=2&rotation=0&showTitle=false&size=416819&status=done&style=none&taskId=u7b2aa143-0043-4fc9-a08f-c49afcbc2c7&title=&width=1275)

```java
package practise.ListAndMap.Collection.Set.TreeSet.demo3;

import java.util.TreeSet;

public class demo3 {
    public static void main(String[] args) {

        /* TreeSet<String> ts = new TreeSet<>();
        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);*/


        //比较器排序
        //o1:当前要添加的元素
        //02：已添加的元素
        //返回值，和之前一样
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            //按长度排序
            int i = o1.length() - o2.length();
            //如果长度一样按首字母排序
            i = i == 0 ? o1.compareTo(o2) : i;
            return i;

        });

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);

    }
}
```

<a name="X0I17"></a>
##### LinkedHashSet：可以保证数据的存储顺序，底层使用双链表实现
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713621092671-2d5875d2-e3a6-4884-91c1-1aa0395a942e.png#averageHue=%23f8f5f4&clientId=u2110e27a-6007-4&from=paste&height=611&id=u4f9d79b0&originHeight=1222&originWidth=2571&originalType=binary&ratio=2&rotation=0&showTitle=false&size=601138&status=done&style=none&taskId=u87536540-15b2-455a-a16a-a7cadee66fd&title=&width=1285.5)
<a name="GVLka"></a>
### Map 双列集合：每次添加一对数据
<a name="VyHWP"></a>
#### Map 双列集合的特点
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713659603786-d7964e6c-7945-460d-a93f-574a8a7124e8.png#averageHue=%23faf3f3&clientId=u1e2d30ff-952f-4&from=paste&height=624&id=uc0cc7d2e&originHeight=1248&originWidth=2350&originalType=binary&ratio=2&rotation=0&showTitle=false&size=526501&status=done&style=none&taskId=u5b7a26cf-9756-4cb9-94ac-1d633b9dc82&title=&width=1175)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713659678095-cebbe117-c440-484c-8591-696e58d3d7c4.png#averageHue=%23f9e8de&clientId=u1e2d30ff-952f-4&from=paste&height=651&id=u626bc10d&originHeight=1302&originWidth=2368&originalType=binary&ratio=2&rotation=0&showTitle=false&size=533690&status=done&style=none&taskId=u3ca6d737-01e9-4b2d-b323-8036f7ebcaf&title=&width=1184)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713659786998-ca1e9cd0-383e-42f0-bc10-ccb746168df8.png#averageHue=%23f4f4f4&clientId=u1e2d30ff-952f-4&from=paste&height=331&id=uHucU&originHeight=662&originWidth=2258&originalType=binary&ratio=2&rotation=0&showTitle=false&size=300241&status=done&style=none&taskId=u0419960f-f7b9-4524-8334-8b2eeb1fac0&title=&width=1129)

<a name="F0NCp"></a>
#### Map 集合常见的 API	Map -- 接口
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713659925878-16e6b161-f989-4ef1-9b40-9134c1c0d5ac.png#averageHue=%23e4d5d3&clientId=u1e2d30ff-952f-4&from=paste&height=553&id=u326eb6d9&originHeight=1106&originWidth=2344&originalType=binary&ratio=2&rotation=0&showTitle=false&size=703152&status=done&style=none&taskId=u9c26230f-f8bc-4014-a541-2c38a5f68a1&title=&width=1172)
:::success
put 方法作用：

1. 添加
2. 覆盖

put 方法的细节：

1. 在添加数据的时候，如果键不存在，就会直接把键值对对象添加到 map 集合中
2. 在添加数据的时候，如果键是存在的，就会把原有的键值对对象覆盖，返回被覆盖的值
3. 没有覆盖则返回 null
:::
:::info
remove 方法细节：<br />删除键值对，并返回值
:::

```java
package practise.ListAndMap.Map.Map的常见api;

import java.util.HashMap;
import java.util.Map;

public class demo1 {
    public static void main(String[] args) {
        //1.创建Map集合的对象
        Map<String, String> m = new HashMap<>();

        //2.添加元素
        System.out.println("=========put===========");

        String put1 = m.put("郭靖", "黄蓉");
        System.out.println(put1);   //null
        String put2 = m.put("韦小宝", "沐剑屏");
        System.out.println(put2);   //null
        String put3 = m.put("尹志平", "小龙女");
        System.out.println(put3);   //null

        //覆盖并返回被覆盖的值
        String put4 = m.put("韦小宝", "双儿");
        System.out.println(put4);   //沐剑屏

        //3.打印集合
        System.out.println(m);  //{韦小宝=双儿, 尹志平=小龙女, 郭靖=黄蓉}


        //4.删除
        System.out.println("=========remove===========");

        System.out.println(m);
        String remove = m.remove("郭靖");
        System.out.println(remove);
        System.out.println(m);

        //5.清空
        //        m.clear();

        //6.判断是否包含键
        System.out.println("=========containsKey===========");

        boolean result1 = m.containsKey("韦小宝");
        System.out.println(result1);    //true
        boolean result2 = m.containsKey("韦小宝2");
        System.out.println(result2);    //false

        //6.判断是否包含值
        System.out.println("=========containsValue===========");

        boolean result3 = m.containsValue("小龙女");
        System.out.println(result3);    //true
        boolean result4 = m.containsValue("小龙女2");
        System.out.println(result4);    //false

        //7.判断是否为空
        System.out.println("=========isEmpty===========");
        boolean empty = m.isEmpty();
        System.out.println(empty);  //false

        //8.获取长度
        System.out.println("=========size===========");
        int size = m.size();
        System.out.println(size);   //2

    }
}
```


<a name="mH5ch"></a>
#### Map 遍历

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713661247832-cddc2373-3f19-4fc7-84c4-0332c75d7281.png#averageHue=%23faeeec&clientId=u1e2d30ff-952f-4&from=paste&height=425&id=ufa2f8fda&originHeight=850&originWidth=1008&originalType=binary&ratio=2&rotation=0&showTitle=false&size=124282&status=done&style=none&taskId=udd388326-d8cb-4849-ba90-96d50f344b4&title=&width=504)

<a name="yYCSo"></a>
##### 键找值
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713661279004-613179b7-02f3-48a4-9085-0302370a649a.png#averageHue=%23faf7f6&clientId=u1e2d30ff-952f-4&from=paste&height=583&id=u23acd638&originHeight=1166&originWidth=2432&originalType=binary&ratio=2&rotation=0&showTitle=false&size=503369&status=done&style=none&taskId=u90a5c138-4809-4a8f-a07a-3e69d461666&title=&width=1216)

```java
package practise.ListAndMap.Map.Map集合遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 键找值 {
    public static void main(String[] args) {

        Map<String, String> m = new HashMap<>();

        m.put("尹志平", "小龙女");
        m.put("郭靖", "穆念慈");
        m.put("欧阳克", "黄蓉");

        //通过键找值
        //把key放在一个map中
        Set<String> keys = m.keySet();
        System.out.println(keys);

        //遍历单列集合得到每一个键
        for (String key : keys) {
            //            System.out.println(key);
            //利用键获取对应的值
            String s = m.get(key);
            System.out.println(key + "=" + s);
        }
    }
}
```
<a name="rqO2L"></a>
##### 键值对

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713663996911-4ca8fa67-d0e6-4d76-968c-761c060a0d02.png#averageHue=%23f4d1b5&clientId=u1e2d30ff-952f-4&from=paste&height=508&id=u38577a56&originHeight=1016&originWidth=1812&originalType=binary&ratio=2&rotation=0&showTitle=false&size=453417&status=done&style=none&taskId=u8f710cbb-b576-4dd9-a827-8e1d79db926&title=&width=906)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713664006671-97eda5a2-66b4-4afc-899f-84dc088612c8.png#averageHue=%23f7dfcd&clientId=u1e2d30ff-952f-4&from=paste&height=550&id=u1f5066d6&originHeight=1100&originWidth=2218&originalType=binary&ratio=2&rotation=0&showTitle=false&size=440920&status=done&style=none&taskId=ue4275b94-d46b-4762-98ae-5ba7c62fcc8&title=&width=1109)

```java

package practise.ListAndMap.Map.Map集合遍历;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class 键值对 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("尹志平", "小龙女");
        m.put("郭靖", "穆念慈");
        m.put("欧阳克", "黄蓉");

        Set<Map.Entry<String, String>> entries = m.entrySet();
        //遍历Set集合，获取每个entry对象
        System.out.println("=========for==========");
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("=========Iterator==========");
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> next = iterator.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key + "=" + value);
        }

        System.out.println("=========lambda==========");
        entries.forEach((Map.Entry<String, String> stringStringEntry) -> {
            String key = stringStringEntry.getKey();
            String value = stringStringEntry.getValue();
            System.out.println(key + "=" + value);

        });

    }
}
```




<a name="YgSro"></a>
##### lambda
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713667452456-da711bb5-297a-4afb-95af-1abf97814418.png#averageHue=%23fdfbf8&clientId=u1e2d30ff-952f-4&from=paste&height=224&id=ufe4cde41&originHeight=448&originWidth=1112&originalType=binary&ratio=2&rotation=0&showTitle=false&size=259982&status=done&style=none&taskId=uca6aa076-9ec7-42af-87e7-d8db474aaa8&title=&width=556)

```java

package practise.ListAndMap.Map.Map集合遍历;

import java.util.HashMap;
import java.util.Map;

public class lambda表达式遍历 {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();

        m.put("尹志平", "小龙女");
        m.put("郭靖", "穆念慈");
        m.put("欧阳克", "黄蓉");

        m.forEach((s, s2) -> System.out.println(s + "=" + s2));


    }
}
```
<a name="m1lDR"></a>
#### HashMap
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713667715067-aa05b244-c757-4c1f-8ff6-87117cc78f9d.png#averageHue=%23f2f0f0&clientId=u1e2d30ff-952f-4&from=paste&height=319&id=u9a1b4c5a&originHeight=638&originWidth=1850&originalType=binary&ratio=2&rotation=0&showTitle=false&size=272023&status=done&style=none&taskId=uc8d21f11-1d32-4e93-902a-d0fa061e90c&title=&width=925)

根据键来计算哈希值<br />若此处为 null，则直接添加<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713667744710-256ec7c6-9d5d-49ae-8d80-b03655cd3846.png#averageHue=%23f8f2f2&clientId=u1e2d30ff-952f-4&from=paste&height=535&id=u44eafc24&originHeight=1070&originWidth=2484&originalType=binary&ratio=2&rotation=0&showTitle=false&size=257977&status=done&style=none&taskId=u7f971be2-11da-40d2-a025-a37989e4ea6&title=&width=1242)

若此处不为 null，则调用 equals 方法，只比较键的属性值，若一样，则覆盖原有的 entry 对象<br />若比较不一样，则会添加到其下面（JDK8 以后）<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713668083257-368975f1-79f5-45e1-b98a-8b3aed7e69da.png#averageHue=%23f9f7f6&clientId=u1e2d30ff-952f-4&from=paste&height=580&id=ua1f645cb&originHeight=1160&originWidth=2494&originalType=binary&ratio=2&rotation=0&showTitle=false&size=286540&status=done&style=none&taskId=u15d35d0a-bbc4-4c91-b6cb-7b5feef5602&title=&width=1247)<br /> <br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713667812821-dec12562-a696-4181-a9e9-fae7f016c6f0.png#averageHue=%23f4f1f0&clientId=u1e2d30ff-952f-4&from=paste&height=398&id=u938e658a&originHeight=796&originWidth=2380&originalType=binary&ratio=2&rotation=0&showTitle=false&size=370995&status=done&style=none&taskId=uc89e7c27-c2a0-465e-9c8a-ad9d5e7c043&title=&width=1190)
<a name="SgTl8"></a>
#### LinkedHashMap
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713674287648-6733b417-8c10-4adc-80fa-352bb99cb352.png#averageHue=%23f6f3f3&clientId=u1e2d30ff-952f-4&from=paste&height=660&id=u78cb4dd0&originHeight=1320&originWidth=2728&originalType=binary&ratio=2&rotation=0&showTitle=false&size=591389&status=done&style=none&taskId=ufcb919f2-d02b-4d8b-ac8a-31b3b33be15&title=&width=1364)
<a name="DpDwp"></a>
#### TreeMap
若都写，按照 comparator 的来<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713674635482-6ea04725-7d1d-42e2-bd76-649ed70f9b56.png#averageHue=%23f8f2f1&clientId=u1e2d30ff-952f-4&from=paste&height=594&id=uc8ef3318&originHeight=1188&originWidth=1884&originalType=binary&ratio=2&rotation=0&showTitle=false&size=526718&status=done&style=none&taskId=u86605374-b898-4968-808e-96f7593a7e1&title=&width=942)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713677429587-e206f87b-d1b7-4fd5-b2ae-561705492dc8.png#averageHue=%23f9f5f5&clientId=u1e2d30ff-952f-4&from=paste&height=589&id=ua5ba4bc6&originHeight=1178&originWidth=2647&originalType=binary&ratio=2&rotation=0&showTitle=false&size=720104&status=done&style=none&taskId=u02897879-7d11-4190-98b5-274163b4ae3&title=&width=1323.5)
<a name="na8E4"></a>
## 泛型：<引用数据类型>	限定集合中存储数据的类型			编译阶段约束			相当于看门大爷
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713097085561-2b505d9e-b3db-4b1f-8a50-46f1897dff89.png#averageHue=%23fbf4f3&clientId=u8023686a-c168-4&from=paste&height=574&id=uaf522ce7&originHeight=1148&originWidth=2562&originalType=binary&ratio=2&rotation=0&showTitle=false&size=856877&status=done&style=none&taskId=u8481bac5-ec23-4b73-bc1a-3404c95ecab&title=&width=1281)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713097268136-f8755095-7cd0-4cbf-bf58-6dbd9d7d5891.png#averageHue=%23f7e7e5&clientId=u8023686a-c168-4&from=paste&height=168&id=u1904a0d1&originHeight=336&originWidth=1648&originalType=binary&ratio=2&rotation=0&showTitle=false&size=384337&status=done&style=none&taskId=u8474657e-8a05-4d98-b609-860e507349e&title=&width=824)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713097279130-af6fbddc-254b-4ea2-b503-89af8b6c39f3.png#averageHue=%23f8efdc&clientId=u8023686a-c168-4&from=paste&height=238&id=u80410953&originHeight=476&originWidth=1572&originalType=binary&ratio=2&rotation=0&showTitle=false&size=218420&status=done&style=none&taskId=uc9570059-b674-4410-85b2-f71cb975759&title=&width=786)
:::warning
泛型不能多态，数据可以
:::
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713097298629-20807322-935b-4086-a121-cbeaadfc6e25.png#averageHue=%23f7efda&clientId=u8023686a-c168-4&from=paste&height=275&id=uc51241de&originHeight=550&originWidth=1616&originalType=binary&ratio=2&rotation=0&showTitle=false&size=296174&status=done&style=none&taskId=uf0eaa341-6cf2-4290-b006-e06353deb52&title=&width=808)
> 意思就是父类的集合可以添加子类对象，添加数据的时候可以添加数据的子类

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713097898343-da0152ab-5b91-4783-bc5d-43847199fa0a.png#averageHue=%23fbf4f3&clientId=u8023686a-c168-4&from=paste&height=286&id=uda3305f5&originHeight=572&originWidth=1694&originalType=binary&ratio=2&rotation=0&showTitle=false&size=327069&status=done&style=none&taskId=ud4f4b94d-4522-4ce1-9c11-54f9feba59d&title=&width=847)
<a name="QA9uq"></a>
### 使用泛型
ArrayList<引用数据类型><br />不能写基本数据类型，因为集合不能直接存储基本数据类型<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713083930356-2282a9ac-5141-4eb2-9eec-ead13703195f.png#averageHue=%23faf9f2&clientId=u709a988d-0555-4&from=paste&height=599&id=u0e7f6896&originHeight=1198&originWidth=2416&originalType=binary&ratio=2&rotation=0&showTitle=false&size=531497&status=done&style=none&taskId=u45b28f92-6bb0-42ad-868a-9145afd7662&title=&width=1208)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713084234613-2e0cdc1b-dbf7-4b0e-95b2-f08a8c5fcab8.png#averageHue=%23fcfbfa&clientId=u709a988d-0555-4&from=paste&height=639&id=ua16a4893&originHeight=1278&originWidth=1714&originalType=binary&ratio=2&rotation=0&showTitle=false&size=865832&status=done&style=none&taskId=u6ba626f7-03dc-497a-863c-fa787ac1e65&title=&width=857)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713084335020-a3091b1d-707e-4c61-beb3-82faf3821a88.png#averageHue=%23f9f2f2&clientId=u709a988d-0555-4&from=paste&height=595&id=u8509863f&originHeight=1190&originWidth=2450&originalType=binary&ratio=2&rotation=0&showTitle=false&size=632596&status=done&style=none&taskId=uf33c535e-541c-4cde-8238-fd1e3287e94&title=&width=1225)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713084344829-c0aceb96-ff83-4782-9c82-60ab055de055.png#averageHue=%23f8efe5&clientId=u709a988d-0555-4&from=paste&height=585&id=u690a4c4d&originHeight=1170&originWidth=2522&originalType=binary&ratio=2&rotation=0&showTitle=false&size=529170&status=done&style=none&taskId=ud32c24a3-ea79-4520-9c2c-d0344783406&title=&width=1261)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713084415665-2867b812-4c3b-4078-bf37-4d71d3214a5f.png#averageHue=%23e9ded7&clientId=u709a988d-0555-4&from=paste&height=628&id=ucc7dd654&originHeight=1256&originWidth=2468&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1277257&status=done&style=none&taskId=ub1eee6c8-da98-4231-a8fb-f3323548e1f&title=&width=1234)

为什么不能作用于基本数据类型？<br />包装类是符合Java设计原则的可以继承object，而这些基本数据类型没有类。![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713084505686-f0a9f3f1-b06b-4383-97af-1debf5a2f17a.png#averageHue=%23f4f3f3&clientId=u709a988d-0555-4&from=paste&height=259&id=u6f10fc2a&originHeight=518&originWidth=1670&originalType=binary&ratio=2&rotation=0&showTitle=false&size=226975&status=done&style=none&taskId=u7e1bd02d-8226-403a-a6eb-d79dcb3e204&title=&width=835)
<a name="qwSxD"></a>
### 自己写泛型
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713084544948-8134d88e-2389-46e6-97ac-682308a15b31.png#averageHue=%23fdf7f6&clientId=u709a988d-0555-4&from=paste&height=589&id=ud95cebfc&originHeight=1178&originWidth=2350&originalType=binary&ratio=2&rotation=0&showTitle=false&size=234577&status=done&style=none&taskId=u33f447ab-d9fe-4316-b73e-745b5690f72&title=&width=1175)
<a name="il22H"></a>
#### 泛型类
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713084614302-c58958e2-5652-4587-ac3f-b23e260be428.png#averageHue=%23f1efe6&clientId=u709a988d-0555-4&from=paste&height=321&id=uacfbc48f&originHeight=642&originWidth=1492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=200306&status=done&style=none&taskId=u9a3a4a9a-296a-49f3-9ea9-f1b550c2d3f&title=&width=746)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713084635291-dd0d5835-d53f-4ac5-9cc7-29b1b91d68df.png#averageHue=%23ede7e0&clientId=u709a988d-0555-4&from=paste&height=592&id=ua852e9dd&originHeight=1183&originWidth=2546&originalType=binary&ratio=2&rotation=0&showTitle=false&size=555071&status=done&style=none&taskId=ub0d589aa-7245-486c-8642-f9d5412a58d&title=&width=1273)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713084687388-f87f7fb3-fb94-4f3c-a79b-9a2c85dc6b31.png#averageHue=%23f8f0e6&clientId=u709a988d-0555-4&from=paste&height=677&id=u7f108173&originHeight=1354&originWidth=2542&originalType=binary&ratio=2&rotation=0&showTitle=false&size=761817&status=done&style=none&taskId=u25c51d73-30ee-459e-ac0d-76591a91f93&title=&width=1271)

```java
package practise.genericity;

import java.util.Arrays;

public class MyArrayList<E> {
    Object[] objects = new Object[10];
    int size;

    public boolean add(E e) {
        objects[size] = e;
        size++;
        return true;
    }

    public E get(int index) {
        return (E) objects[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(objects);
    }
}
```
 
<a name="TmRxw"></a>
#### 泛型方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713085480862-f7786b6e-6ce1-44f1-904e-c769d0f1d7d7.png#averageHue=%23fbfae8&clientId=u709a988d-0555-4&from=paste&height=541&id=u9f51679d&originHeight=1082&originWidth=1858&originalType=binary&ratio=2&rotation=0&showTitle=false&size=250147&status=done&style=none&taskId=ue7607258-4c29-4993-b6dc-c554b56bf94&title=&width=929)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713085497576-e4a7d4df-9b7f-4857-9e4e-c9b09d2a299c.png#averageHue=%23efeded&clientId=u709a988d-0555-4&from=paste&height=526&id=u6cd8249d&originHeight=1052&originWidth=2320&originalType=binary&ratio=2&rotation=0&showTitle=false&size=406086&status=done&style=none&taskId=u875af596-7d84-49a9-bd19-48c5d5a21d8&title=&width=1160)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713085528156-9b888cfc-1d43-4731-9fb7-e2148ff5d030.png#averageHue=%23f0eadf&clientId=u709a988d-0555-4&from=paste&height=479&id=u54004e8c&originHeight=958&originWidth=2534&originalType=binary&ratio=2&rotation=0&showTitle=false&size=441441&status=done&style=none&taskId=uce120f4d-0d23-48b3-9cf4-2a34b44c5dc&title=&width=1267)
<a name="oIH9y"></a>
#### 泛型接口
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713092246455-32082340-3bb5-4758-9480-f3440f5b9c74.png#averageHue=%23e5e7e2&clientId=u8023686a-c168-4&from=paste&height=587&id=uf1d693fb&originHeight=1174&originWidth=2504&originalType=binary&ratio=2&rotation=0&showTitle=false&size=684585&status=done&style=none&taskId=uab1ed74f-decf-4ca2-830c-5d53b2dc439&title=&width=1252)
:::info
使用：

1. 实现类给出具体的类型

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713093023867-aa5e565a-b19a-45f5-ae89-4548e2b91004.png#averageHue=%23353538&clientId=u8023686a-c168-4&from=paste&height=143&id=u3fd96fe2&originHeight=285&originWidth=1204&originalType=binary&ratio=2&rotation=0&showTitle=false&size=109678&status=done&style=none&taskId=ud0c13d40-6a49-47ed-9dcf-8bda2ee7706&title=&width=602)

2. 实现类延续泛型，创建实现对象时再确定类型

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713093054456-aa445806-eac2-4c86-be3e-d3df52353614.png#averageHue=%23303134&clientId=u8023686a-c168-4&from=paste&height=195&id=u504a8fdf&originHeight=390&originWidth=1184&originalType=binary&ratio=2&rotation=0&showTitle=false&size=58078&status=done&style=none&taskId=u2da6dd46-6d91-4e6c-83ee-d0934485757&title=&width=592)
:::
<a name="bMXy6"></a>
### 泛型的继承和通配符
<a name="YDNtQ"></a>
#### 泛型的继承
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713093941873-f166da59-72c1-43fe-929e-0d02d08387bd.png#averageHue=%23f3ecd9&clientId=u8023686a-c168-4&from=paste&height=636&id=u10cb068e&originHeight=1272&originWidth=1124&originalType=binary&ratio=2&rotation=0&showTitle=false&size=449699&status=done&style=none&taskId=uafa49577-b2cd-4764-9a7d-65bffd8f41c&title=&width=562)
<a name="URhTm"></a>
#### 泛型的通配符 		？

```java
package practise.genericity.泛型的继承性和通配符;

import java.util.ArrayList;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        ArrayList<Student> list4 = new ArrayList<>();   //ok -- 无论什么类都可以传递

        method(list1);
        method(list2);
        method(list3);
        method(list4);  //ok -- 无论什么类都可以传递
    }

    public static <E> void method(ArrayList<E> list) {

    }
}

class Ye<String> {
}

class Fu extends Ye {
}

class Zi extends Fu {
}

class Student {
};
```
只想传递 Ye Fu Zi，怎么解决？<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713094396285-f0b4c9cf-1e01-4c5a-9ee9-a1868b2313fc.png#averageHue=%23fefefc&clientId=u8023686a-c168-4&from=paste&height=313&id=u978d4cb4&originHeight=626&originWidth=1084&originalType=binary&ratio=2&rotation=0&showTitle=false&size=361969&status=done&style=none&taskId=u11ffe951-6263-43b8-9d19-8a64302d775&title=&width=542)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713094769781-7c9854f0-7029-4c0b-b186-2895a1a69412.png#averageHue=%23363639&clientId=u8023686a-c168-4&from=paste&height=633&id=ue511eeff&originHeight=1265&originWidth=1492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=560449&status=done&style=none&taskId=ub3e4be1e-1fdb-4b99-99cc-c0fbe00d792&title=&width=746)

应用场景：![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713094841481-1c4f7582-1713-4aa3-8336-f5fe6bfa9ac2.png#averageHue=%23fbf8e9&clientId=u8023686a-c168-4&from=paste&height=126&id=udd3e4a72&originHeight=252&originWidth=1448&originalType=binary&ratio=2&rotation=0&showTitle=false&size=211604&status=done&style=none&taskId=u5717c9ec-00ed-4a52-970a-668ea3980b6&title=&width=724)
<a name="IEXom"></a>
## 基本数据类型对应的包装类
![245e017be8fe7e2f21dbed4e3f50813.jpg](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1709813320230-b096557f-c541-4f4a-97d7-1529f85d2dde.jpeg#averageHue=%23c2b8b8&clientId=ue11e4e86-5845-4&from=paste&height=620&id=u7cef8012&originHeight=1240&originWidth=2772&originalType=binary&ratio=2&rotation=0&showTitle=false&size=374753&status=done&style=none&taskId=u5cad568e-b259-4fd9-9193-a9f3f8e91d5&title=&width=1386)

<a name="l1Bub"></a>
## 可变参数
> 可变参数的小细节：
> 1. 在方法的形参最多只能写一个可变参数
> 2. 若除可变参数以外还有其他的形参，那么可变参数需要写在最后

```java
package practise.ListAndMap.可变参数;

public class Demo1 {
    public static void main(String[] args) {


    }

    public static int getSum(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
}
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713688710069-29bf9549-e81e-4d0a-bebb-cdf6d03b8915.png#averageHue=%23f8f5f5&clientId=u1e2d30ff-952f-4&from=paste&height=582&id=u2ad2e469&originHeight=1164&originWidth=2276&originalType=binary&ratio=2&rotation=0&showTitle=false&size=428721&status=done&style=none&taskId=uf7d20f3c-aef2-415f-9459-c4f28c8533c&title=&width=1138)
<a name="T2waA"></a>
## 不可变集合
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713759713796-d2c13595-b83c-43ee-8019-22c1e47605da.png#averageHue=%23faf5f4&clientId=u8daf4e41-2bb2-4&from=paste&height=620&id=u5572b703&originHeight=1240&originWidth=2416&originalType=binary&ratio=2&rotation=0&showTitle=false&size=581489&status=done&style=none&taskId=u31f34b3a-23b8-4b9a-bb71-e8af6887844&title=&width=1208)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713757469970-f5ec4af5-6f27-4bb4-b27d-023cd36cdb96.png#averageHue=%23ebdbd9&clientId=u8daf4e41-2bb2-4&from=paste&height=479&id=u7f5a266b&originHeight=958&originWidth=2496&originalType=binary&ratio=2&rotation=0&showTitle=false&size=412046&status=done&style=none&taskId=u2a2e6739-b161-4fd8-9c09-67609511c91&title=&width=1248)


![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713757804138-fcc78aef-e97c-4634-8839-4a6913ecd604.png#averageHue=%23fefcf7&clientId=u8daf4e41-2bb2-4&from=paste&height=72&id=u48564207&originHeight=144&originWidth=1038&originalType=binary&ratio=2&rotation=0&showTitle=false&size=70047&status=done&style=none&taskId=u0cb7906d-d1d3-462c-b651-4f46133cfa6&title=&width=519)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713757816479-92ded405-ae38-47be-8449-0006bbb1ace8.png#averageHue=%233a3a3e&clientId=u8daf4e41-2bb2-4&from=paste&height=807&id=u553db3f8&originHeight=1614&originWidth=2879&originalType=binary&ratio=2&rotation=0&showTitle=false&size=544986&status=done&style=none&taskId=u574692f7-cae3-48eb-bd33-cb2396381ee&title=&width=1439.5)

使用 map 的不可变集合时，只能 of 方法内只能传递偶数个形参，因为会自动凉凉组合为一个 entry 对象，且最多只能传递 20 个参数，即 10 个键值对<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713758868302-29d4063d-6665-4214-a88f-51ae7376bcf5.png#averageHue=%233a3b3e&clientId=u8daf4e41-2bb2-4&from=paste&height=810&id=u7e5a5234&originHeight=1619&originWidth=2879&originalType=binary&ratio=2&rotation=0&showTitle=false&size=519868&status=done&style=none&taskId=u14072cf9-cb91-4db6-9c28-971273a80a6&title=&width=1439.5)

> 若想要存的键值对超过十个，则：
> ![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713758952073-3ded17aa-f341-41b9-a97c-067ce63a7aeb.png#averageHue=%23fbfbf9&clientId=u8daf4e41-2bb2-4&from=paste&height=301&id=GnZcv&originHeight=602&originWidth=852&originalType=binary&ratio=2&rotation=0&showTitle=false&size=292502&status=done&style=none&taskId=u3e92d3d5-eaba-41e7-941e-4ec2c75e8c6&title=&width=426)
> ![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713759003727-a2f9c5ca-34fc-42b9-b754-303143d4d0ba.png#averageHue=%23fcfaf7&clientId=u8daf4e41-2bb2-4&from=paste&height=189&id=u845595a1&originHeight=378&originWidth=984&originalType=binary&ratio=2&rotation=0&showTitle=false&size=204297&status=done&style=none&taskId=u4b57b6d4-38a2-4aca-906f-b3f706a27f6&title=&width=492)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713759204569-b1247b66-2cae-46e9-a0f6-82a238592a8d.png#averageHue=%23fbfaf8&clientId=u8daf4e41-2bb2-4&from=paste&height=60&id=uc0f1f7e2&originHeight=120&originWidth=694&originalType=binary&ratio=2&rotation=0&showTitle=false&size=46481&status=done&style=none&taskId=udbf5e57b-4dfd-44ed-934c-5ebff2b2f15&title=&width=347)
> 
> 简化版：
> ![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713759260810-0e94bbd5-3f6b-4cbb-8fd2-c8e98f3e6890.png#averageHue=%23e0d9cf&clientId=u8daf4e41-2bb2-4&from=paste&height=36&id=u6cc4ee72&originHeight=72&originWidth=1348&originalType=binary&ratio=2&rotation=0&showTitle=false&size=77264&status=done&style=none&taskId=u942cc247-f5f8-4096-bac3-e4c951f7e52&title=&width=674)
> 
> 
> eg：
> HashMap<String,String> hm = new HashMap<>();<br />hm.put("张三","北京");<br />hm.put("李四", "深圳");<br />hm.put( "王五", "深圳");<br />hm.put("赵六", "山东");

Map<Object, Object> objectObjectMap = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));<br />map.put("张三","深圳");
> 
> 再再再简化：
> ![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713759678242-108cb181-7b97-4eda-aa35-723dbdb5ef02.png#averageHue=%23fcfaf8&clientId=u8daf4e41-2bb2-4&from=paste&height=234&id=u1d19d277&originHeight=468&originWidth=1238&originalType=binary&ratio=2&rotation=0&showTitle=false&size=250500&status=done&style=none&taskId=u66fa41bc-e9a1-43b2-a1ef-49341d80836&title=&width=619)
> ![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713759698082-8b3ccfbc-31ae-4a5a-a92b-afddc48e61de.png#averageHue=%23f5f1e4&clientId=u8daf4e41-2bb2-4&from=paste&height=27&id=udce1d44a&originHeight=54&originWidth=788&originalType=binary&ratio=2&rotation=0&showTitle=false&size=38481&status=done&style=none&taskId=ud36b974d-e602-48f9-adad-0f9ba1fd238&title=&width=394)




<a name="n2pYS"></a>
#  面向对象进阶：静态、继承、多态
<a name="ulUV2"></a>
## static 静态 --> 共享
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710081295186-47b111c0-b71e-4c7f-8754-e9259821ebc1.png#averageHue=%23fbf9f9&clientId=u6f17fd8c-ee4c-4&from=paste&height=705&id=ueceb821d&originHeight=1410&originWidth=2612&originalType=binary&ratio=2&rotation=0&showTitle=false&size=543500&status=done&style=none&taskId=u66c327a9-c9ab-4814-b2ca-59833d3d7e2&title=&width=1306)	![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710081378061-2234b44b-b664-4020-99ae-2e16e0c09bd6.png#averageHue=%23f2eded&clientId=u6f17fd8c-ee4c-4&from=paste&height=689&id=u4a0f0e94&originHeight=1378&originWidth=2640&originalType=binary&ratio=2&rotation=0&showTitle=false&size=771522&status=done&style=none&taskId=u937e8b3e-b7ac-461e-b3b2-5e89f7e5594&title=&width=1320)
<a name="iI7L7"></a>
### static 静态变量
加上 static 修饰变量，在这个类中共享此变量![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710049889007-6d9b7b8a-d998-49e6-8a8a-7cc4aa694fe9.png#averageHue=%23f3f0ef&clientId=udac60260-04fe-4&from=paste&height=761&id=u00273a8b&originHeight=1522&originWidth=2708&originalType=binary&ratio=2&rotation=0&showTitle=false&size=877600&status=done&style=none&taskId=u6cc0d3de-83fa-41d1-98a2-277b504de76&title=&width=1354)
<a name="WrmQ1"></a>
### static 静态变量内存原理（代码执行时内存原理
<a name="J8Gn9"></a>
#### 第一行：加载 mian 方法，执行第一行代码，需要用到 Student 这个类，于是就把 Student 这个类的字节码文件加载到方法区，当加载完成之后，就出现了一个“静态存储位置”（静态区），JDK 8 以前，静态区在方法区中，JDK 8 以后挪到了堆空间中。在静态区存储着所有这个类中的静态成员变量，eg：static String teacherName; 此时内存中还无对象
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710048314547-e035e293-07e5-4d06-a467-ec1d67c7a4a7.png#averageHue=%23bfccb3&clientId=udac60260-04fe-4&from=paste&height=741&id=u5146244f&originHeight=1482&originWidth=2694&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1068281&status=done&style=none&taskId=u7cf96834-7a23-40c0-ab03-68c4ffa7121&title=&width=1347)
<a name="iPfkA"></a>
####  第二行：定义一个对象，此时在堆空间开辟一个空间，存储所有非静态的成员变量，再把其地址赋值给 s1 ，若想通过 s1 访问静态变量 teacherName，那么此时会到静态区区找对应的变量了
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710048889796-2ecf2157-ea78-45b2-ab94-7809b00ba90f.png#averageHue=%23faf9cd&clientId=udac60260-04fe-4&from=paste&height=768&id=uc2de1806&originHeight=1535&originWidth=2805&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1187008&status=done&style=none&taskId=ub6ff8247-ed92-4bef-8d3e-63191ef13af&title=&width=1402.5)
<a name="R5DpQ"></a>
#### 第三行：s1 记录的是堆空间中一个空间的地址，假设为 0x0011，那么 s1.name = "张三"; 即把张三赋值给 0x0011 的 name
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710049050234-dbb393a0-68e5-4e46-9974-d6432f7f223f.png#averageHue=%23eaf0cb&clientId=udac60260-04fe-4&from=paste&height=764&id=u9e3b86c5&originHeight=1528&originWidth=2786&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1219293&status=done&style=none&taskId=ub695143b-63a0-4b82-8ecb-5c4078b4de3&title=&width=1393)
<a name="McAWM"></a>
#### 第四行同第三行类似
<a name="nfydi"></a>
#### 第五行：调用 show 方法，那么此时会将 show 方法加载进栈，show 方法的调用者是 s1，那么就会通过 s1 去找这里面的信息，方法执行完毕就会出栈
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710049192278-1a9fe942-e50c-4eb6-9372-1273b7470b14.png#averageHue=%23f9f9cc&clientId=udac60260-04fe-4&from=paste&height=750&id=u6a5df863&originHeight=1500&originWidth=2638&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1343452&status=done&style=none&taskId=u77f76cd9-ff6f-48d3-85ff-07812033f69&title=&width=1319)
<a name="gn8ev"></a>
#### 第六行：又创建了一个对象 s2，即在堆中又开辟了一个新的小空间，假设地址为 0x0022 ，把地址赋值给 s2。 同样在此空间存储所有非静态的成员变量，若想通过 s2 获取静态变量，同样他也可以去找静态区中寻找对应变量
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710049465841-72703f96-beb2-4b31-87f3-c8e1c3e414dd.png#averageHue=%23f6f5c9&clientId=udac60260-04fe-4&from=paste&height=768&id=uddf5b922&originHeight=1536&originWidth=2736&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1539413&status=done&style=none&taskId=u0ff375e8-03ce-428b-b65c-5b7721eedd5&title=&width=1368)
<a name="OCuzs"></a>
#### 第七行：调用 show 方法，show 方法进栈，调用者为 s2，即通过 s2 去找其里面的属性，执行完出栈
![](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710049465841-72703f96-beb2-4b31-87f3-c8e1c3e414dd.png?x-oss-process=image%2Fformat%2Cwebp%2Fresize%2Cw_1500%2Climit_0#averageHue=%23f6f5c9&from=url&id=tYAG3&originHeight=842&originWidth=1500&originalType=binary&ratio=2&rotation=0&showTitle=false&status=done&style=none&title=)
<a name="l56FO"></a>
### 特点：定义在类里面，共享，且可通过类名访问
<a name="slOSm"></a>
### 静态变量 总结：静态变量存储在堆内存中的静态区中，其是对象共享的，在内存中只有一份，谁要用谁去拿，而非静态的变量都是每一个对象独有的，单独存放
<a name="xN8tU"></a>
### static 静态方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710050087546-05c7b653-3583-4373-9798-fc6b39538dee.png#averageHue=%23f5f0f0&clientId=udac60260-04fe-4&from=paste&height=528&id=ufdcbd2e6&originHeight=1486&originWidth=2608&originalType=binary&ratio=2&rotation=0&showTitle=false&size=798359&status=done&style=none&taskId=uc7951969-0e8d-45a7-b62a-52a1e244a2e&title=&width=927)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710062325984-e751e92c-1e4c-4c7c-a8aa-9cf2854dc00d.png#averageHue=%23f4eded&clientId=udac60260-04fe-4&from=paste&height=610&id=u5b76a7d0&originHeight=1220&originWidth=2296&originalType=binary&ratio=2&rotation=0&showTitle=false&size=490108&status=done&style=none&taskId=u151ec626-fe44-43b6-8acf-44e6df1200d&title=&width=1148)

<a name="Url67"></a>
### 总结：  																静态方法中，没有this关键字										静态方法中，只能访问静态										非静态方法，可以访问所有
<a name="SocnX"></a>
#### 通过代码解释
<a name="pMuLD"></a>
##### 静态方法，无 this 关键字    -------隐含------>    非静态方法有 this 关键字			非静态成员方法在形参中隐含了一个 this 的变量输入，但是是调用时虚拟机自动根据调用者（的地址）赋值，而非用户手动赋值，this 即可表示方法调用者的地址值 。非静态方法与对象相关，必须有 this 指定其方法调用，静态是共享的，与某一个对象无关，所以静态无 this 关键字
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710072731353-97eec5de-92a5-4a1c-9f2b-bb59a477226b.png#averageHue=%23f4f2e3&clientId=u38a29fee-e6da-4&from=paste&height=729&id=u504e59e3&originHeight=1457&originWidth=2726&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1013387&status=done&style=none&taskId=u52b53f46-e6f4-4bee-bc29-379b991d22e&title=&width=1363)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710073094268-6e3bb63a-6a68-42b6-8320-da2cf943dbea.png#averageHue=%23f3f2e1&clientId=u38a29fee-e6da-4&from=paste&height=758&id=uda8dfa29&originHeight=1516&originWidth=2692&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1204351&status=done&style=none&taskId=udeb6fbbd-e753-45e2-a133-b807cf21dcb&title=&width=1346)<br />this 在 s1 调用时存的是是 s1 的地址值，show1 打印的即是 s1 的 name 和 age，this 在 s2 调用时存的是是 s2 的地址值，show1 打印的即是 s2 的 name 和 age<br />只不过我们之前认为其局部位置（方法里面）没有和成员方法重名，所以说 this 此时可以省略不写<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710073355159-62685d48-d059-4892-9189-4f05dfc199d9.png#averageHue=%23b9cacb&clientId=u38a29fee-e6da-4&from=paste&height=712&id=ud3aa0993&originHeight=1424&originWidth=2582&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1291222&status=done&style=none&taskId=u8ebf5cc8-deaa-4546-82dc-32eb456f038&title=&width=1291)<br />在成员方法中调用其他方法，同样隐藏了 this，this 也为调用者的地址<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710073513975-291e7e58-4e8d-47bf-bcd4-42cfea75be13.png#averageHue=%23f3f3e5&clientId=u38a29fee-e6da-4&from=paste&height=738&id=u7f95f9b5&originHeight=1476&originWidth=2682&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1259217&status=done&style=none&taskId=u2469b551-ecd9-4f7b-bd7d-e0c0b599dcf&title=&width=1341)<br />若在静态方法中试图尝试定义 this 会报错，因为静态方法调用时是直接调用，而不是通过对象实例调用，没有调用者（没有对象），所以说明静态方法中无 this 关键字
<a name="qG4tT"></a>
##### 静态方法，只能访问静态    -------隐含------>   静态（共享）方法，不能访问非静态（不共享）															静态方法（共享）如果访问非静态（与对象相关），则不知道访问的是哪个对象的，要想知道是哪个对象的，需要 this. ，但是静态方法没有 this（与对象无关） ，所以可得结论。包括在静态方法中调用其他方法，隐含了 this. ，但静态方法没有 this，同样会报错
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710079264732-6fbcd977-06c1-47c7-bad3-591d45f6164b.png#averageHue=%23f1f1f0&clientId=u6f17fd8c-ee4c-4&from=paste&height=790&id=uaa3830cb&originHeight=1580&originWidth=2728&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1358254&status=done&style=none&taskId=uea7f1c81-0205-4ade-b11f-fa9244b657e&title=&width=1364)<br />如果静态方法能访问非静态，那这里打印的 name 是哪个对象的 name 呢？所以静态方法不能访问非静态
<a name="k3XEy"></a>
##### 静态方法，可以访问所有    静态（公共）有两种调用方式：类名和对象名。不光用类名能访问静态，用对象也能访问到共享的数据（静态）
<a name="NsUKs"></a>
##### 弹幕解释：
<a name="KYiq9"></a>
###### 静态属于类，调用要用类名，如果有this就是对象调用的
<a name="KfrT3"></a>
###### 非静态的东西往往和对象相关
<a name="SMYBg"></a>
###### 静态属于类，非静态属于对象
<a name="vqGop"></a>
#### 通过内存解释
<a name="TrsAf"></a>
##### 先明确一点：静态和非静态加载到内存的时机是不一样的，静态随着类的加载而加载，而非静态是跟对象有关，只要没创建对象，非静态的数据就不会出现在内存当中，所以静态是无法访问非静态的
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710079828827-c67a2adc-5cdb-496b-9c4a-c529140afbe7.png#averageHue=%23fcf7f7&clientId=u6f17fd8c-ee4c-4&from=paste&height=474&id=u443d5833&originHeight=1468&originWidth=2634&originalType=binary&ratio=2&rotation=0&showTitle=false&size=426099&status=done&style=none&taskId=ud180b948-e009-4525-896b-92abf728782&title=&width=851)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710079895055-759f5f2b-422b-4fd6-9ebe-71d2c5663237.png#averageHue=%23fdf8f8&clientId=u6f17fd8c-ee4c-4&from=paste&height=457&id=ubd0f64b2&originHeight=1192&originWidth=2218&originalType=binary&ratio=2&rotation=0&showTitle=false&size=270632&status=done&style=none&taskId=ufd176970-46ca-4b31-92ea-5d309953687&title=&width=851)
<a name="W4YQH"></a>
##### 解释 静态方法只能访问静态，静态方法不能访问非静态，解释代码：
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710080104468-a5beeacf-0d2f-4460-85f3-f6b6dd8a55cd.png#averageHue=%23faf7ee&clientId=u6f17fd8c-ee4c-4&from=paste&height=194&id=u9a9c2ccc&originHeight=1450&originWidth=2632&originalType=binary&ratio=2&rotation=0&showTitle=false&size=650325&status=done&style=none&taskId=ueed59518-8526-4316-9a5c-f75365eb9b0&title=&width=352)
<a name="zC9sR"></a>
###### main 方法先进栈。第一行代码：用到了 Student 类，就会把 Student 类的字节码文件加载到方法区，包含成员方法，成员变量。JDK 7 以前，无论静态非静态都存入方法区，但是 JDK 7 以后，静态会存入堆内存中的静态区。
<a name="l8LIb"></a>
###### 第二行：用到了 method ，就去方法去找到 method ，然后把 method 加载到栈中
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710080806759-a2f78d7d-d4ae-4bd3-8af7-64974ac4cbbf.png#averageHue=%23f2f0c3&clientId=u6f17fd8c-ee4c-4&from=paste&height=730&id=u60963357&originHeight=1460&originWidth=2672&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1185825&status=done&style=none&taskId=ub3dcb85e-7df5-4149-a1ff-0f038dd4a18&title=&width=1336)
<a name="BwjXf"></a>
###### 在方法里面，他要获取两个变量，一个是 name，一个是 teacherName。因为是通过 Student 这个类名调用的，所以就回去 Student 这个类的方法区去找，他要去找什么？要找一个是 name，一个是 teacherName，你说他能找到 name 吗？肯定不能，因为并没有创建对象。所以静态方法不能调用非静态成员变量（实例变量），对象没有怎么调用实例变量？
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710080793396-5fc9b499-f4f4-4357-a0a7-5518fbd4ed6f.png#averageHue=%23f2f0c3&clientId=u6f17fd8c-ee4c-4&from=paste&height=730&id=u3d35d961&originHeight=1460&originWidth=2672&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1185825&status=done&style=none&taskId=u23eda838-47f2-4d7b-b54f-91b3c545109&title=&width=1336)
<a name="knJD0"></a>
###### 静态方法不能调用非静态成员方法，没有调用 show 方法的对象
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710080771023-7feed75e-0ea8-449f-87b0-27310fd89eff.png#averageHue=%23f4f2c4&clientId=u6f17fd8c-ee4c-4&from=paste&height=728&id=u19a322ee&originHeight=1456&originWidth=2668&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1282768&status=done&style=none&taskId=uc8b81c1e-4913-4818-965c-c3cfa3e8f49&title=&width=1334)
<a name="Glj1j"></a>
##### 解释 非静态可以访问所有，解释代码：
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710080872137-82efbcb0-e2ba-46fe-bb80-fd3d99fe4f4c.png#averageHue=%23f6f6c8&clientId=u6f17fd8c-ee4c-4&from=paste&height=600&id=u18a5c26c&originHeight=1200&originWidth=1084&originalType=binary&ratio=2&rotation=0&showTitle=false&size=454638&status=done&style=none&taskId=u597733c7-8fe5-4641-b666-685f1bcf71f&title=&width=542)
<a name="pq9bV"></a>
###### main。第一行：用到 Student 类，加载字节码文件到方法区，包含成员变量成员方法，静态变量放在静态区
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710081025084-4e4ddb8c-f9db-4176-98c4-eab79533bac6.png#averageHue=%23f1eec2&clientId=u6f17fd8c-ee4c-4&from=paste&height=752&id=uecddab13&originHeight=1504&originWidth=2704&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1036760&status=done&style=none&taskId=ua698c727-fc5a-4d7c-9c0f-1ccbac321d4&title=&width=1352)
<a name="UFMFf"></a>
###### 第二行：创建对象，存非静态内容（与对象相关），可以通过对象访问静态
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710081068966-940ac300-b0b3-4996-9e65-fd2b21127e26.png#averageHue=%23f3f0c3&clientId=u6f17fd8c-ee4c-4&from=paste&height=715&id=ue3b07dc9&originHeight=1430&originWidth=2686&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1015339&status=done&style=none&taskId=ue946b32e-9f9e-4859-b6d5-019b52a8787&title=&width=1343)
<a name="YsJYX"></a>
###### 第三四行：赋值
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710081101177-9ad877cc-01ad-4f20-90d1-bf09052f66d8.png#averageHue=%23f3f0c3&clientId=u6f17fd8c-ee4c-4&from=paste&height=725&id=ue01f14a3&originHeight=1450&originWidth=2654&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1029402&status=done&style=none&taskId=u0fda8b07-8f59-4d15-857d-50dd842eeba&title=&width=1327)
<a name="x8Sif"></a>
###### show 方法通过 s1 找到 堆内存，然后找到方法区，调用 method
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710081246807-65fa4e3b-7071-4efe-b6ba-044a72f6d941.png#averageHue=%23908f76&clientId=u6f17fd8c-ee4c-4&from=paste&height=711&id=u321a1c0d&originHeight=1422&originWidth=2686&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1194937&status=done&style=none&taskId=u2f9abb0d-bc6f-4fb0-b648-de7cc0a7d1e&title=&width=1343)
<a name="xP49m"></a>
###### 通过 s1 找静态和非静态
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710081137047-8190026e-0398-4cfa-945f-1f972d6bb77c.png#averageHue=%23f2f0c3&clientId=u6f17fd8c-ee4c-4&from=paste&height=732&id=u7e23a71b&originHeight=1464&originWidth=2668&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1138720&status=done&style=none&taskId=u49521713-3ef3-432f-ae79-b1d93842a3d&title=&width=1334)

<a name="PrXhS"></a>
### 工具类：帮助我们做一些事情，但是不描述任何事物的类
<a name="ZgCky"></a>
#### 三种类：JavaBean 类，测试类，工具类
<a name="UgRl1"></a>
#### 工具类的定义：
<a name="qLoSh"></a>
##### 类名见名知意
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710050520805-89d89966-9687-44fd-9caf-6f37463fca1d.png#averageHue=%23f7f6f6&clientId=udac60260-04fe-4&from=paste&height=381&id=ubc7a973e&originHeight=1032&originWidth=2340&originalType=binary&ratio=2&rotation=0&showTitle=false&size=218105&status=done&style=none&taskId=uae6a682b-07d6-4bc1-a728-fd3d557f66f&title=&width=865)<br />用来进行数学计算<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710050546083-383a1a3e-4f28-4e8c-a701-36731bef5a42.png#averageHue=%23f9f9f9&clientId=udac60260-04fe-4&from=paste&height=473&id=u9a07e3d5&originHeight=1390&originWidth=2586&originalType=binary&ratio=2&rotation=0&showTitle=false&size=377235&status=done&style=none&taskId=uaf1b60bd-d32b-4d24-9ef8-ac7b210a46b&title=&width=880)<br />用来操作数组
<a name="JtLGS"></a>
##### 私有化构造方法：构造方法一旦私有，外界就不能创建这个类的对象了，为什么不让外界创建这个类的对象？因为这个是工具类，不描述任何事物，创建他的对象没有任何意义
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710050759330-091d1aa5-4968-4a00-b073-e8ef2034b12e.png#averageHue=%23e9e9e8&clientId=udac60260-04fe-4&from=paste&height=510&id=u1f2fedf6&originHeight=1382&originWidth=2728&originalType=binary&ratio=2&rotation=0&showTitle=false&size=492699&status=done&style=none&taskId=ub61c5f74-8313-4870-8582-fe20a40685e&title=&width=1007)
<a name="KGLlO"></a>
##### 方法都定义为静态：方便调用（public 说明 其他类也可以调用。 static。说明 静态方法可以通过类名调用）（用static修饰方法可以直接用类名调用，不用再创建对象，创建的对象放的内存中，所以说要更节省内存空间。）
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710050951349-abc92a18-10f8-4f12-abee-56e1a144431e.png#averageHue=%23f7f7f0&clientId=udac60260-04fe-4&from=paste&height=720&id=uc80233b9&originHeight=1439&originWidth=2640&originalType=binary&ratio=2&rotation=0&showTitle=false&size=731836&status=done&style=none&taskId=uc4bb6818-cadc-463b-a18f-c6f135e041d&title=&width=1320)
<a name="kBFgq"></a>
#### eg:定义一个工具类用于计算学生最大年龄
```java
package itheima.AC练习.工具类.操作学生;

import java.util.ArrayList;

public class studentUtil {
    //私有化无参构造以组织创建对象 
    private studentUtil (){}
    public static int oldest(ArrayList<Student> list){
        int max = list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge()>max)
                max = list.get(i).getAge();
        }
        return max;
    }
}

```

<a name="nj1Pz"></a>
#### 常用工具类
<a name="C4PWm"></a>
##### Arrays
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712927789075-9df166f9-1675-4c16-a727-257da96497c1.png#averageHue=%23e5dad9&clientId=u5bc5484d-1293-4&from=paste&height=636&id=ude9ba9cb&originHeight=1272&originWidth=2436&originalType=binary&ratio=2&rotation=0&showTitle=false&size=436658&status=done&style=none&taskId=u15eaee45-7d1d-472b-829e-45e4c311248&title=&width=1218)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712928145838-c5e47af3-038c-405b-a001-f6a431fa8ade.png#averageHue=%23f3f2e3&clientId=u5bc5484d-1293-4&from=paste&height=282&id=u01447540&originHeight=564&originWidth=1238&originalType=binary&ratio=2&rotation=0&showTitle=false&size=657224&status=done&style=none&taskId=u5986f6e8-8101-436e-a0c8-a7df74571a4&title=&width=619)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712928165305-57cdb4a4-b28b-4500-a5f0-5255914da8e4.png#averageHue=%23f1eedf&clientId=u5bc5484d-1293-4&from=paste&height=228&id=u056d2b6f&originHeight=456&originWidth=1260&originalType=binary&ratio=2&rotation=0&showTitle=false&size=425738&status=done&style=none&taskId=u83c8588a-06dc-46a3-84f1-ab503585d3b&title=&width=630)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712928181335-bb6bb6d7-c0df-4fea-9485-4c99a87dca21.png#averageHue=%23eae8dc&clientId=u5bc5484d-1293-4&from=paste&height=120&id=ude9aa47f&originHeight=240&originWidth=1234&originalType=binary&ratio=2&rotation=0&showTitle=false&size=243856&status=done&style=none&taskId=ue8dbfc97-86d2-47f4-9fce-097def9e0d3&title=&width=617)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712928226925-07a1f3ec-a8fa-4763-a558-96c8985ae267.png#averageHue=%23f3f0e0&clientId=u5bc5484d-1293-4&from=paste&height=152&id=uf196d63c&originHeight=304&originWidth=1282&originalType=binary&ratio=2&rotation=0&showTitle=false&size=235606&status=done&style=none&taskId=ue35248fe-53a8-475e-bfd6-a6738af30b1&title=&width=641)




public static void sort(数组，排序规则） 按照指定的规则排序：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712929875756-c1561452-a255-4f2b-b2f7-8d21b0134e26.png#averageHue=%23f5f4e6&clientId=u5bc5484d-1293-4&from=paste&height=411&id=uc98527e2&originHeight=822&originWidth=1074&originalType=binary&ratio=2&rotation=0&showTitle=false&size=763713&status=done&style=none&taskId=u91beb365-797a-48af-a8f2-78e18b34a95&title=&width=537)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712930192589-0f2ac82f-b5e6-487b-99aa-a9f6801f1bbc.png#averageHue=%23faf7e5&clientId=u5bc5484d-1293-4&from=paste&height=76&id=u1943b67d&originHeight=152&originWidth=450&originalType=binary&ratio=2&rotation=0&showTitle=false&size=47984&status=done&style=none&taskId=ua72b1c7c-614f-4cbf-874b-0731e093d83&title=&width=225)<br />无序元素（o1）- 有序元素（o2）为正，说明无序元素>有序元素，无序元素（o1）放有序元素（o2）右边，即是升序<br />有序元素（o2）- 无序元素（o1）为正，说明有序元素>无序元素，有序元素（o2）放无序元素（o1）右边，即是降序<br />12升序，21降序很好记<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712930701010-d8c26bff-ec50-4476-ae2c-a3c6b7c13477.png#averageHue=%23f9f6c5&clientId=u5bc5484d-1293-4&from=paste&height=276&id=u8225b5e6&originHeight=552&originWidth=1420&originalType=binary&ratio=2&rotation=0&showTitle=false&size=207704&status=done&style=none&taskId=u0c39181e-fe63-4c70-bc8c-dc6dc8ac633&title=&width=710)
<a name="xSji7"></a>
##### Objects
<a name="pIKoo"></a>
##### Collections
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713688754189-3a743f7c-bdd5-4d04-9679-ce5ac147adaf.png#averageHue=%23f0e1de&clientId=u1e2d30ff-952f-4&from=paste&height=513&id=u5e4af4b8&originHeight=1026&originWidth=2660&originalType=binary&ratio=2&rotation=0&showTitle=false&size=383986&status=done&style=none&taskId=u9d02a03c-0aa0-4fa3-8fe3-7fc81eeeea4&title=&width=1330)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713688953363-1e125149-75fb-4cb2-93df-b9c00c2bdbe6.png#averageHue=%23eadedc&clientId=u1e2d30ff-952f-4&from=paste&height=669&id=ue3579835&originHeight=1338&originWidth=2670&originalType=binary&ratio=2&rotation=0&showTitle=false&size=773764&status=done&style=none&taskId=u7953c758-7c74-47d1-a719-76cb15c2f1d&title=&width=1335)
<a name="RTorn"></a>
## 重新认识 main 方法
JVM 虚拟机<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710154206989-50bb8d98-30e9-491a-a464-9deb18b29e73.png#averageHue=%23fafaf3&clientId=u8aa3b312-d3fe-4&from=paste&height=714&id=u46d4f757&originHeight=1427&originWidth=2289&originalType=binary&ratio=2&rotation=0&showTitle=false&size=737241&status=done&style=none&taskId=u53e15619-7cbf-4cb9-a23a-53511edf595&title=&width=1144.5)
<a name="OPQ6x"></a>
## 封装：对象代表什么，就得封装对应的数据，并提供数据对应的行为。比如说用户自定义类
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710157985904-1046a022-f7e2-4748-a5c3-3e4b520c6281.png#averageHue=%23f2f5c1&clientId=uabef0591-af6b-4&from=paste&height=736&id=uf708264b&originHeight=1472&originWidth=2688&originalType=binary&ratio=2&rotation=0&showTitle=false&size=658894&status=done&style=none&taskId=u229749e0-2053-41f5-8b2e-3d27d9871cc&title=&width=1344)
<a name="zlxdY"></a>
## 继承	: 需皆满足：1.相同属性可抽取 2.具有父子类关系
<a name="Gde8x"></a>
### 继承的含义：类和类之间的父子关系
在封装了不同的类中，具有相同属性，导致代码重复<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710158092219-566d9fac-ca55-4bf4-b72b-9ff7ad880dde.png#averageHue=%23faf7f6&clientId=uabef0591-af6b-4&from=paste&height=750&id=u07a9ae11&originHeight=1499&originWidth=2702&originalType=binary&ratio=2&rotation=0&showTitle=false&size=569257&status=done&style=none&taskId=u8507594e-fa2e-4618-a517-6924fd6bb50&title=&width=1351)<br />===============================================================<br />为了解决这一点，把其重复的属性放在同一个单独的地方<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710158302353-3f59386a-f251-4782-8e46-b4370a85c179.png#averageHue=%23fbf6f5&clientId=uabef0591-af6b-4&from=paste&height=743&id=u36de24fc&originHeight=1486&originWidth=2692&originalType=binary&ratio=2&rotation=0&showTitle=false&size=521133&status=done&style=none&taskId=uea898e3c-2b28-4065-b866-cd44f91b2a9&title=&width=1346)<br />===========================================================================================      总结     ============================<br />===============================================================<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710158469656-c1aa9a25-1b7b-4093-8774-0e5b85f06f2f.png#averageHue=%23fbf8f7&clientId=uabef0591-af6b-4&from=paste&height=750&id=ub443b094&originHeight=1500&originWidth=2704&originalType=binary&ratio=2&rotation=0&showTitle=false&size=823214&status=done&style=none&taskId=ua0ac4f2a-8abe-4d56-9c14-209f20024fb&title=&width=1352)
<a name="QXphR"></a>
### 什么时候用继承？
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710158837231-6827dcfe-67b6-4d60-8aab-6314beaa459d.png#averageHue=%23a49b71&clientId=uabef0591-af6b-4&from=paste&height=743&id=ua63426cb&originHeight=1485&originWidth=2716&originalType=binary&ratio=2&rotation=0&showTitle=false&size=795173&status=done&style=none&taskId=u982fb727-a029-4f41-933c-de7dc68253d&title=&width=1358)
<a name="KCzeL"></a>
### 怎么使用继承？public class 子类 extends 父类 { }
![](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710158469656-c1aa9a25-1b7b-4093-8774-0e5b85f06f2f.png?x-oss-process=image%2Fformat%2Cwebp%2Fresize%2Cw_1500%2Climit_0#averageHue=%23fbf8f7&from=url&id=T4hqP&originHeight=832&originWidth=1500&originalType=binary&ratio=2&rotation=0&showTitle=false&status=done&style=none&title=)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710159327812-dcdc7bfd-c96b-42fb-8045-baf11a82623e.png#averageHue=%23fcfbfb&clientId=uabef0591-af6b-4&from=paste&height=663&id=u2f060ffc&originHeight=1326&originWidth=2680&originalType=binary&ratio=2&rotation=0&showTitle=false&size=526368&status=done&style=none&taskId=u234eccce-1025-4c60-92d4-2add28fc2f5&title=&width=1340)
<a name="hykI0"></a>
### 继承的特点	注意：不同包中使用 protected（不同包中的子类也可以用）
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710206142877-89154436-550c-423a-8843-fd0978d5d057.png#averageHue=%23f9f8f8&clientId=u9c6a874e-0e16-4&from=paste&height=762&id=u23e7037d&originHeight=1524&originWidth=2678&originalType=binary&ratio=2&rotation=0&showTitle=false&size=520588&status=done&style=none&taskId=ua03333bb-be21-4b14-8227-9f9492eaf3e&title=&width=1339)
<a name="JtULP"></a>
#### Java 只支持单继承，不支持多继承，但支持多层继承											弹幕：一个人只能有一个爸，不能有好几个爸爸，但能有爷爷，太爷爷等等
名词解释：<br />单继承：一个子类只能继承一个父类（一个儿子只能有一个爸爸）<br />不支持多继承：子类不能同时继承多个父类（一个儿子不能有两个亲爸）<br />多层继承：子类 A 可以继承父类 B，父类 B 可以继承父类 C

<a name="E5uPw"></a>
#### 为什么不支持多继承？
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710205614636-9be7100c-8f22-4914-82f8-dfaaff214e2b.png#averageHue=%23f8f6f4&clientId=u9c6a874e-0e16-4&from=paste&height=644&id=ub99fadb7&originHeight=1287&originWidth=2552&originalType=binary&ratio=2&rotation=0&showTitle=false&size=839768&status=done&style=none&taskId=ub5e6e535-8968-4a39-86d7-761a7b6f844&title=&width=1276)
<a name="qGBS8"></a>
#### 每个类都直接或间接继承于 Object，即如果不写 extends 会默认继承 Object
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710206039325-b9ea2462-1b17-40d1-a286-e03e8d6fbbd3.png#averageHue=%23fefdfd&clientId=u9c6a874e-0e16-4&from=paste&height=717&id=uabab662f&originHeight=1434&originWidth=2586&originalType=binary&ratio=2&rotation=0&showTitle=false&size=595476&status=done&style=none&taskId=u5e6e2c6c-7f04-43f2-be59-ac6b6d28b9c&title=&width=1293)
<a name="GPbZ2"></a>
### 继承书写案例及书写技巧
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710207061859-c4caf63b-49fc-40d0-813d-f2c887c0e8f8.png#averageHue=%23f5f5f5&clientId=u9c6a874e-0e16-4&from=paste&height=749&id=u439a4554&originHeight=1498&originWidth=2710&originalType=binary&ratio=2&rotation=0&showTitle=false&size=808834&status=done&style=none&taskId=uc1bd4e06-bc81-4d44-8c09-b1899774484&title=&width=1355)
<a name="j7V7I"></a>
### 子类到底能继承父类中的哪些内容？（内存图 / 内存分析工具）
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710159643284-de65551e-7eda-4f75-a481-4cb8fe94e168.png#averageHue=%23faeeee&clientId=uabef0591-af6b-4&from=paste&height=387&id=u40c640c4&originHeight=1252&originWidth=2668&originalType=binary&ratio=2&rotation=0&showTitle=false&size=519272&status=done&style=none&taskId=uc02236ba-638b-4592-9d48-b492b00c3f6&title=&width=824)
<a name="ysWUw"></a>
#### 父类成员方法 private 私有 ---------- 子类无法访问									私有：只能在本类访问
<a name="Fxi4S"></a>
#### 构造方法是否可以被子类继承？不可以，违背构造方法名与文件名相同 
子类创建对象时，子类的构造方法总是先调用父类的某个构造方法<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710332095838-43841488-36ed-4090-bfaa-160783c93ff8.png#averageHue=%23faf6e7&clientId=u95aa7923-0c07-4&from=paste&height=754&id=u6d7b190d&originHeight=1507&originWidth=2676&originalType=binary&ratio=2&rotation=0&showTitle=false&size=866517&status=done&style=none&taskId=u7fe756d5-62fd-4c6d-9e7f-11b0ec2e07c&title=&width=1338)
<a name="wD63H"></a>
#### 成员变量为什么都能被继承？	//都能被继承，但是带 private 的成员变量不能被直接访问。
<a name="stQLO"></a>
##### 理解图
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710332786014-9535163f-8372-478b-8b8b-ef88193770b3.png#averageHue=%23f9f8ee&clientId=u95aa7923-0c07-4&from=paste&height=723&id=u97ea5a2a&originHeight=1446&originWidth=2594&originalType=binary&ratio=2&rotation=0&showTitle=false&size=548329&status=done&style=none&taskId=uabe15701-89b2-457e-9c1a-402d4d488d8&title=&width=1297)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710332804760-2190dfd3-98ae-4269-990d-e23a040fa53c.png#averageHue=%23f9f9ed&clientId=u95aa7923-0c07-4&from=paste&height=691&id=u40210e27&originHeight=1382&originWidth=2646&originalType=binary&ratio=2&rotation=0&showTitle=false&size=549930&status=done&style=none&taskId=ufeb34707-ed0d-43cc-bd75-3096df7c324&title=&width=1323)

<a name="BmmRl"></a>
##### 不带 private 的成员变量的内存原理
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710340408559-097513f7-a5f2-40ce-8140-190c4dca15ee.png#averageHue=%23f6f7d0&clientId=ub3da64a5-c856-4&from=paste&height=747&id=u0dd3dde3&originHeight=1494&originWidth=2712&originalType=binary&ratio=2&rotation=0&showTitle=false&size=699935&status=done&style=none&taskId=u510efb2d-9e60-40e1-801f-a75aebeffac&title=&width=1356)
<a name="EquDG"></a>
###### 加载包含 main 的 TestStudent 的 class 字节码文件加载到方法区，main 方法进栈
<a name="DvMDa"></a>
###### 第一行用到了 Zi 这个类，于是把 Zi 这个类的字节码文件加载到方法区，加载 Zi 时发现父类 Fu，于是把父类也加载到方法区当中，加载 Fu 时发现默认的父类 Objects，于是把 Objects 的字节码文件加载到方法区
<a name="Fcjog"></a>
###### 然后执行等号左边 Zi z ，即声明一个变量 z，可存储 Zi 这个对象的地址值，然后执行等号右边，即在堆空间开辟一个小空间，和以前不一样的是，以前没有讲继承，所以堆中的空间只有一块，现在讲了继承，堆空间有两块，一块记录 Fu 这个类的成员变量，一块记录 Zi 这个类的成员变量，然后赋初始化值，最后把这两块统一的地址赋值给变量 z
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710341002285-a58b949a-65d8-4bea-9deb-c6a95cbcb454.png#averageHue=%23f5f5cb&clientId=ub3da64a5-c856-4&from=paste&height=810&id=u75c1a150&originHeight=1620&originWidth=2880&originalType=binary&ratio=2&rotation=0&showTitle=false&size=887922&status=done&style=none&taskId=u4818f7e2-053b-42b1-a017-a6396b8f1a2&title=&width=1440)
<a name="Hwuy4"></a>
###### 然后赋值即根据地址去修改
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710341246245-8ac80263-eab1-40d7-ac0c-1608baadf65e.png#clientId=ub3da64a5-c856-4&from=paste&height=810&id=ua7c9fdfe&originHeight=1620&originWidth=2880&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1172125&status=done&style=none&taskId=u07b2d03f-05dc-433d-83a8-1131cf7ccd9&title=&width=1440)
<a name="IrUnx"></a>
##### 带 private 的成员变量的内存原理
若子类直接修改，则会报错：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710341337550-10bb8e08-f92c-4efb-9eff-b6d8c029b06c.png#averageHue=%23e9e8de&clientId=ub3da64a5-c856-4&from=paste&height=259&id=u17bebea7&originHeight=1620&originWidth=2880&originalType=binary&ratio=2&rotation=0&showTitle=false&size=671358&status=done&style=none&taskId=u77ea25f0-7a1e-4286-9405-d0aca1366fd&title=&width=460)
<a name="f05mJ"></a>
###### 加载 TestStudent 字节码文件，加载 Zi 字节码文件，加载 Fu 字节码文件，定义变量 z，开辟一块堆内存空间（两小块），存储成员变量，地址赋给变量
<a name="kAizs"></a>
###### 第三行，虽然在内存中，但是无法直接访问，因为被 private 修饰
<a name="kNBoc"></a>
###### 第四行正常赋值，因为没有 private

<a name="acIgn"></a>
#### 成员方法能不能被继承？
<a name="xECp5"></a>
##### 只有父类的虚方法才可以被子类继承
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710341836300-d93ecea8-8bf6-4f2a-8de2-82933b0e8a2f.png#averageHue=%23fcfbf3&clientId=ub3da64a5-c856-4&from=paste&height=341&id=ubfd88a54&originHeight=1176&originWidth=2437&originalType=binary&ratio=2&rotation=0&showTitle=false&size=397898&status=done&style=none&taskId=uf7be14f9-dcdd-41f6-9c6e-a556df8e802&title=&width=707)<br />如果 A 的对象要调用方法 C，怎么调用？是从 A 开始查吗？<br />不是，因为若继承层太多，导致效率太低<br />于是 Java 底层就设计了“虚方法表”，非 private、非 static、非 final 的方法会被记录到虚方法表中，在继承的时候会将虚方法表一同继承，并不断添加自己类中的方法表，并继续继承。若调用的方法不是虚方法，还是需一层一层向父类找。<br />只有父类的虚方法才可以被子类继承<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710342347440-f07a78c6-0247-428f-8b49-da3282204fa9.png#averageHue=%23faf8f2&clientId=ub3da64a5-c856-4&from=paste&height=748&id=u76d838aa&originHeight=1496&originWidth=2690&originalType=binary&ratio=2&rotation=0&showTitle=false&size=827346&status=done&style=none&taskId=u01c683c1-5c96-474f-bd96-b36bc5ea058&title=&width=1345)


<a name="H8HZr"></a>
##### 代码内存分析 
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710342522268-3aa214e0-b096-45c5-8c50-48cf056f7cbc.png#averageHue=%23f5f6d1&clientId=ub3da64a5-c856-4&from=paste&height=488&id=ude407d81&originHeight=1468&originWidth=2685&originalType=binary&ratio=2&rotation=0&showTitle=false&size=730287&status=done&style=none&taskId=u56815cd0-5787-4fbe-ad4a-bbeeb13a962&title=&width=893)
<a name="IpOnD"></a>
###### 加载带 main 的字节码文件，用到 Zi 加载其字节码文件，放入成员变量、成员方法。加载 Fu 字节码文件，放成员，加载 Object 方法。
<a name="nnDut"></a>
###### 生成虚方法表（非 private，非 static，非 final），记录 Object 中的虚方法（共 5 个），开始继承并继承虚方法表，然后继承到 Fu，记录 fuShow1，然后继承到 Zi，记录 ziShow

<a name="vDfrq"></a>
### 继承中访问特点
<a name="IoUKR"></a>
#### 继承中成员变量访问特点	就近原则
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710403177911-d1b87d45-cef2-475e-8088-70612320c32b.png#averageHue=%23f8f6f5&clientId=u2caeacef-f790-4&from=paste&height=642&id=ua0564c08&originHeight=1284&originWidth=2610&originalType=binary&ratio=2&rotation=0&showTitle=false&size=692416&status=done&style=none&taskId=u49f18ee1-dd9d-4f45-8e90-33c2549ceb8&title=&width=1305)
<a name="GSyy3"></a>
##### 就近原则
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710402169048-4924e8f7-2adb-48d3-8d8d-762461ccac08.png#averageHue=%23f9f8e6&clientId=u2caeacef-f790-4&from=paste&height=573&id=u64aae051&originHeight=1146&originWidth=2442&originalType=binary&ratio=2&rotation=0&showTitle=false&size=438693&status=done&style=none&taskId=ue60cd8f3-7ac6-4a96-ba97-6cdaf902052&title=&width=1221)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710402190581-a1859bc4-4f96-4d37-9378-b0b00283716e.png#averageHue=%23f9f9eb&clientId=u2caeacef-f790-4&from=paste&height=728&id=ue4580240&originHeight=1456&originWidth=2572&originalType=binary&ratio=2&rotation=0&showTitle=false&size=601173&status=done&style=none&taskId=u34435af5-e52d-4005-b141-cbcd575ae23&title=&width=1286)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710402211510-9b9d7e52-fc65-4760-8e35-a2764ba30829.png#averageHue=%23f9f9e7&clientId=u2caeacef-f790-4&from=paste&height=586&id=ufc381e0b&originHeight=1172&originWidth=2434&originalType=binary&ratio=2&rotation=0&showTitle=false&size=397252&status=done&style=none&taskId=ua1ded21d-b328-4a8a-a54e-2d2681abbdd&title=&width=1217)
<a name="jeFfV"></a>
##### super 关键字-----父类，类似 this 的指向调用者												this 先从本类找，super先从父类找，都是向上找
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710402304509-3251ba54-bbf2-4d71-b8ed-64289e246fc6.png#averageHue=%23f8f8e3&clientId=u2caeacef-f790-4&from=paste&height=571&id=u7df03ec6&originHeight=1142&originWidth=2358&originalType=binary&ratio=2&rotation=0&showTitle=false&size=604340&status=done&style=none&taskId=u1fb8f1b1-f82e-4891-b0ae-4d461892898&title=&width=1179)
<a name="ryOsw"></a>
#### 继承中成员方法的访问特点   就近原则
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710406639527-4055f94f-2649-4ea0-873e-0a2d15dec9b1.png#averageHue=%23f8f5f5&clientId=u2caeacef-f790-4&from=paste&height=754&id=u039e5c1b&originHeight=1508&originWidth=2670&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1192157&status=done&style=none&taskId=uf3c83246-34e7-46be-b4a9-d1e7a8eb313&title=&width=1335)
<a name="zwjrs"></a>
##### 先在本类查找方法，如果没有就会查找从父类继承下来的方法
<a name="VSwlz"></a>
##### 方法的重写----对虚方法表的覆盖	父类的方法不能满足子类的需求												只有被添加在虚方法表里的方法才能被重写，不属于虚方法表的方法当然不能被重写					@Override 写在每个重写方法上面														方法的重写会覆盖虚方法表中父类的方法													重写的方法权限只能升高不能降低														重写时形参列表不能改变	
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710403982957-7c0a0015-8aef-4a26-9940-1dd6a3d49ad5.png#averageHue=%23f9f8f8&clientId=u2caeacef-f790-4&from=paste&height=696&id=uf7ed12ce&originHeight=1392&originWidth=2456&originalType=binary&ratio=2&rotation=0&showTitle=false&size=669752&status=done&style=none&taskId=ua5632b8e-fea6-460f-bb94-8e6b98be7ac&title=&width=1228)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710404132322-a952e9a6-aa8b-44ab-9802-92b3acdc883b.png#averageHue=%23faf5f5&clientId=u2caeacef-f790-4&from=paste&height=718&id=ue7959307&originHeight=1436&originWidth=2678&originalType=binary&ratio=2&rotation=0&showTitle=false&size=545482&status=done&style=none&taskId=u00ab66ad-81f8-46da-806a-8c688f56dae&title=&width=1339)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713169987087-125d8b3d-8ab5-43a9-9fc5-06b1955e9ab1.png#averageHue=%23f5f4f3&clientId=udc5fdf7e-9c3f-4&from=paste&height=266&id=u2a1e8725&originHeight=532&originWidth=1492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=226646&status=done&style=none&taskId=ucb76fa61-07cd-49b0-989d-54f9c77ceef&title=&width=746)<br />👆：2：子类访问权限用了 protected，父类访问权限不能空着不写<br />👆：3：eg： Animal，Dog 继承 Animal，则方法返回值不能父类为 Dog，子类为 Animal<br />👆：4：重写的方法名必须和原方法名一致<br />👆：5：只有非 private，非 static， 非 final 的方法才能被保存在虚方法表，所以这三种不能重写

<a name="jvMny"></a>
#### 继承中构造方法的特点	子类不能继承父类的构造方法，但是可以调用
子类构造方法第一行，有一个默认的 super();<br />但是父类没有无参构造，子类必须明确父类带参构造方法 super（参数。。。），并且必须放在子类构造方法的第一句<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713168420607-0a4df718-c1ca-4a09-9c7d-6f1325608d33.png#averageHue=%23f7f4f4&clientId=ua24fc516-297b-4&from=paste&height=312&id=u0199b479&originHeight=624&originWidth=1492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=318501&status=done&style=none&taskId=u98b139df-c473-4c0c-a39a-d41a1c888bb&title=&width=746)
<a name="YdReg"></a>
##### 子类所有的构造方法默认先访问父类中的无参构造，再执行自己，
<a name="Wxh6V"></a>
###### 为什么？因为父类的无参构造是父类成员变量的初始化，若父类没有完成初始化，那么子类将无法使用父类的数据。
<a name="K0qaG"></a>
###### 怎么调？子类构造方法的第一行默认语句都是：super（），不写也存在，且必须在第一行，如果想调用父类的有参构造，必须手动写 。eg：super（name，age）；即调用父类的有参构造
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710407601758-cdb30e6a-d176-41c2-b4e4-f505f3483deb.png#averageHue=%23f3f3f1&clientId=u2caeacef-f790-4&from=paste&height=676&id=u6fe4e853&originHeight=1352&originWidth=2692&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1115979&status=done&style=none&taskId=u81070a69-647a-4d42-9c66-d59c5f44ffa&title=&width=1346)

<a name="aTkfO"></a>
### this 和 super		super 是调用父类有参无参构造方法的
有关构造this 和 super必须写在第一行

调用父类无参构造（默认)：	super();<br />调用父类有参构造（如需要用需手动添加）：	super(xxx，xxx);<br />调用本类有参构造 ：		this(xxx，xxx)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710408416753-95b438fe-0d41-4bd5-8c8a-16a9e8d38ce4.png#averageHue=%23e3e4e1&clientId=u2caeacef-f790-4&from=paste&height=549&id=u87ba4c23&originHeight=1098&originWidth=2188&originalType=binary&ratio=2&rotation=0&showTitle=false&size=678640&status=done&style=none&taskId=u92c426b4-1be0-4c30-8218-fbfa614b9ff&title=&width=1094)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710408769394-e191ab52-62fd-4b8a-99bc-1ec92c75fbc6.png#averageHue=%23fafaf9&clientId=u2caeacef-f790-4&from=paste&height=589&id=ud4914083&originHeight=1178&originWidth=2158&originalType=binary&ratio=2&rotation=0&showTitle=false&size=727115&status=done&style=none&taskId=u935b9e5f-dc18-44d8-b8cf-1f70f60bff8&title=&width=1079)
<a name="HsPAQ"></a>
### 父类的成员变量的隐藏
子类重新声明了一个和父类成员变量名一样的成员变量，则会隐藏父类的成员变量<br />可通过其父类的方法调用。
<a name="IukAL"></a>
## 多态：对象的多种形态	 弊端：不能访问子类的特有功能
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710416337059-7442ffd2-8fd5-4359-9164-a89fe4ead7b3.png#averageHue=%23f6f3f3&clientId=u2caeacef-f790-4&from=paste&height=619&id=u1dba993a&originHeight=1238&originWidth=2520&originalType=binary&ratio=2&rotation=0&showTitle=false&size=575596&status=done&style=none&taskId=ueedcf2c6-2925-4f44-aae8-39c686c36b7&title=&width=1260)
<a name="pJ24q"></a>
### 多态的定义
例如学生管理系统，向对象传递参数时，需要一个能接收管理员、老师、学生的对象的参数。这就是多态<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710414761164-7005f95d-7234-4283-b01e-295700623b18.png#averageHue=%23f4f4f4&clientId=u2caeacef-f790-4&from=paste&height=668&id=u2e245d78&originHeight=1336&originWidth=2568&originalType=binary&ratio=2&rotation=0&showTitle=false&size=514449&status=done&style=none&taskId=ub02ea1c3-fb5c-4b7e-a5c1-969edbe7f17&title=&width=1284)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710415045624-b220b28b-1317-4146-8256-c67eae250693.png#averageHue=%23f7f6f6&clientId=u2caeacef-f790-4&from=paste&height=621&id=u56dbcce3&originHeight=1242&originWidth=1664&originalType=binary&ratio=2&rotation=0&showTitle=false&size=346977&status=done&style=none&taskId=ucb024f5e-8521-4871-bf19-fbb3ee67fb8&title=&width=832)

<a name="m3G4Y"></a>
### 多态的使用
```java
package itheima.AC练习.ArrayList.多态;

public class Test1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(23);
        show(s);

        Teacher t = new Teacher();
        t.setName("李四");
        t.setAge(34);
        show(t);

        Administrator a = new Administrator();
        a.setName("王五");
        a.setAge(45);
        show(a);

    }
    //多态的使用，即定义一个方法，然后定义一个父类的对象的形参接收
    //多态不仅可以接收所有子类对象，还可以自动分别调用子类重写的方法
    public static void show(Person p){
        p.show();
    }
}
class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public void show(){
        System.out.println("姓名："+name+",年龄："+age);
    }
}
class Student extends Person{
    @Override
    public void show() {
        System.out.println("学生姓名："+getName()+",学生年龄："+getAge());
    }
}
class Teacher extends Person{
    @Override
    public void show() {
        System.out.println("老师姓名："+getName()+",老师年龄："+getAge());
    }
}
class Administrator extends Person{
    @Override
    public void show() {
        System.out.println("管理员姓名："+getName()+",管理员年龄："+getAge());
    }
}




```
<a name="la1Wx"></a>
### 多态调用成员的特点

<a name="GaqHc"></a>
#### 调用成员变量		编译看左边，运行也看左边
```java
*调用成员变量：
        Animal d = new Dog();
        System.out.println(d.name);//Animal 		//首先去左边的类型去找成员变量
```
 	//编译看左边，运行也看左边<br />        //编译看左边：javac在编译的时候，会看左边的父类有没有这个成员，如果有，编译通过，如果		没有，编译失败<br />        //运行看左边：java在运行的时候，实际获取的就是左边父类中的成员变量的值

<a name="jtchX"></a>
#### 调用成员方法	 	编译看左边，运行看右边
```java
 *调用成员方法：
        Animal d = new Dog();
        d.show();//狗的show方法 //覆盖了父类的show方法
```
 //编译看左边，运行看右边<br />        //编译看左边：javac在编译的时候，会看左边的父类有没有这个成员，如果有，编译通过，如果		没有，编译失败<br />        //运行看右边：java在运行的时候，实际调用的是右边子类中的成员方法(因为被重写)
<a name="NQZuS"></a>
#### 代码理论讲解
```java
package itheima.AC练习.ArrayList.多态;

public class 多态调用成员的特点 {
    public static void main(String[] args) {
        Animal d = new Dog();
        *调用成员变量：
        System.out.println(d.name);//Animal //首先去左边的类型去找成员变量
        //编译看左边，运行也看左边
        //编译看左边：javac在编译的时候，会看左边的父类有没有这个成员，如果有，编译通过，如果没有，编译失败
        //运行看左边：java在运行的时候，实际获取的就是左边父类中的成员变量的值

        *调用成员方法：
        d.show();//狗的show方法 //覆盖了父类的show方法
        //编译看左边，运行看右边
        //编译看左边：javac在编译的时候，会看左边的父类有没有这个成员，如果有，编译通过，如果没有，编译失败
        //运行看右边：java在运行的时候，实际调用的是右边子类中的成员方法

        *理解：
        //Animal d = new Dog();
        //Dog d = new Dog();
        //现在用d去调用变量和方法的呀？是的
        //而d是Animal类型的，所以默认都会从Animal这个类中去找

        //之前我们是用Dog这个子类去调用的，所有获取的是子的name，而现在是Animal这个父类去调用的，所以获取的是父的name
        //成员变量：在子类的对象中，会把父类的成员变量也继承下来。父：name。子：name
        //成员方法：如果子类对方法进行了重写，那么在虚方法表中是会把父类的方法进行覆盖的。
    }
}
class Animal {
    String name = "Animal";

    public void show() {
        System.out.println("动物的show方法");

    }
}
class Dog extends Animal{
    String name = "Dog";
    @Override
    public void show() {
        System.out.println("狗的show方法");
    }
}
class Cat extends Animal{
    String name = "Cat";
    @Override
    public void show() {
        System.out.println("猫的show方法");
    }
}

```
<a name="De12u"></a>
#### 代码内存讲解
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710418460352-91f73aa2-57a3-4e30-aaec-07efcf93c8fd.png#averageHue=%23f2f0cc&clientId=u2caeacef-f790-4&from=paste&height=753&id=u1590469d&originHeight=1505&originWidth=2873&originalType=binary&ratio=2&rotation=0&showTitle=false&size=805997&status=done&style=none&taskId=uf0f046e7-8b58-4de2-a060-8c5b32f21db&title=&width=1436.5)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710423734844-b892fa85-4756-4985-9615-c129b03f41fd.png#averageHue=%23f2f1c8&clientId=u2caeacef-f790-4&from=paste&height=751&id=ue3275461&originHeight=1502&originWidth=2706&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1383690&status=done&style=none&taskId=u12e0f576-8afc-4b93-87d3-60191176539&title=&width=1353)
<a name="P1tAn"></a>
##### 加载含 main 的类的字节码文件进入方法区，然后先加载父类再加载子类，即先加载 object 再加载 Animal 类，并且在 Animal 类”挂“一个虚方法表，并且把 Animal 这个类中的虚方法加载进虚方法表，在这里即 show 方法，再加载 Dog 类，并且把父类的虚方法表继承过来，然后把自己的虚方法添加进去，这里是重写了 show 方法，所以这里是覆盖了虚方法中的 show 虚方法。然后子类会记住自己父类的位置
<a name="wns2r"></a>
##### 第一行创建了一个 Animal 类型的名叫 a 的小空间在栈内存中，然后在堆内存中 new 了一块空间， 并一分为二，一部分存储从父类继承下来的 name=”动物“，另一部分存储本类的 name=”狗“，然后把地址给变量 a
<a name="ZlkYj"></a>
##### 多态调用成员变量：编译看左边，运行也看左边。
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710418942948-8172cca6-7695-4589-b3b2-e949a622766c.png#averageHue=%2393927e&clientId=u2caeacef-f790-4&from=paste&height=801&id=u8fac1f3a&originHeight=1602&originWidth=2862&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1178903&status=done&style=none&taskId=u73cd0244-7b0a-4e26-a1cf-b8ccc6679db&title=&width=1431)<br />编译时：<br />即系统先去堆内存中根据 dog 类 new 出来的空间去查找从父类继承过来的成员变量当中有		无多态调用到的变量，如果有，则使用，没有则编译失败报错。<br />运行时：<br />同样，获取值打印
<a name="cxU9v"></a>
##### 多态调用成员方法：编译看左边，运行看右边。
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710419827067-8dea5035-0250-407a-bf2b-22e480eb333f.png#averageHue=%2393927e&clientId=u2caeacef-f790-4&from=paste&height=810&id=u5d888ae3&originHeight=1619&originWidth=2879&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1443984&status=done&style=none&taskId=u54e88a1f-1f97-4acc-9d0e-5cdf08f59be&title=&width=1439.5)<br />编译时：<br />会去找父类的成员方法。如果有则编译成功，如果没有，则编译失败<br />运行时：<br />会去看子类的成员方法，因为子类重写的方法覆盖掉了父类的成员方法
<a name="vpqGl"></a>
### 对象的上转型对象 -- 父类对象
子类创建的对象放在父类<br />本质：父类对象指向了一个子类对象<br />上转型对象是子类的简化对象，可以通过强制转换恢复成子类。
<a name="aIzQn"></a>
### 多态的作用
实现父类一个方法，子类可以调用自己的这个方法<br />本质：多态中调用方法时优先调用子类重写的方法。
<a name="Aqayg"></a>
# 包、final、权限修饰符、代码块
<a name="UcROS"></a>
## 包
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710468451751-31973a9b-aea9-4b44-84af-8ea576894eeb.png#averageHue=%23f5f1f1&clientId=ua219797f-1041-4&from=paste&height=572&id=u0d79b513&originHeight=1144&originWidth=2232&originalType=binary&ratio=2&rotation=0&showTitle=false&size=795801&status=done&style=none&taskId=u67b8dd0a-5a75-4b99-9e0f-52985978d35&title=&width=1116)
<a name="RfjSR"></a>
### 定义
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710467817792-fd5b4ce7-506c-4bd4-a5bf-6af1ddbe5e3f.png#averageHue=%23f8f8ed&clientId=ua219797f-1041-4&from=paste&height=577&id=u63cdb93b&originHeight=1154&originWidth=2176&originalType=binary&ratio=2&rotation=0&showTitle=false&size=434539&status=done&style=none&taskId=u94d99ae3-b3ce-43e0-b838-f8973146dec&title=&width=1088)

<a name="iaNVa"></a>
### package
<a name="yIYUy"></a>
####  域名的反写
<a name="bIZRx"></a>
#### 包名不要出现大写字母
<a name="mLvJh"></a>
### import
不在同一个包中<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710467909578-b0c5be4d-b115-4e7e-b8a1-90802a4174bd.png#averageHue=%23f4f4e4&clientId=ua219797f-1041-4&from=paste&height=309&id=u5ed1f52b&originHeight=1282&originWidth=2418&originalType=binary&ratio=2&rotation=0&showTitle=false&size=802133&status=done&style=none&taskId=u0fd6abd7-a047-4a44-8a9f-634fd0b8a0c&title=&width=583)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710467944168-60e067ac-c2bf-4a4c-9b39-b7358ebf104f.png#averageHue=%23f6f6db&clientId=ua219797f-1041-4&from=paste&height=248&id=u91c95068&originHeight=1008&originWidth=2390&originalType=binary&ratio=2&rotation=0&showTitle=false&size=343637&status=done&style=none&taskId=u67d1e55a-b477-42ab-8844-3fd7105e663&title=&width=587)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712562192187-8c825f1a-0691-43da-9254-82157bec76c2.png#averageHue=%23e8e5e5&clientId=ue1190bba-1784-4&from=paste&height=283&id=u27a91633&originHeight=566&originWidth=1276&originalType=binary&ratio=2&rotation=0&showTitle=false&size=272841&status=done&style=none&taskId=u6fb8a47a-59dc-416c-adad-b45f55502f6&title=&width=638)
<a name="A8eYT"></a>
### 使用其他类规则
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710467994607-305f6fbb-c82d-4c72-b896-5b3d0386ce4e.png#averageHue=%23f3f0f0&clientId=ua219797f-1041-4&from=paste&height=297&id=gsUkV&originHeight=594&originWidth=1206&originalType=binary&ratio=2&rotation=0&showTitle=false&size=210311&status=done&style=none&taskId=ude90eb1b-3005-4f4f-8125-45d5ee2f3b7&title=&width=603)

第四条👇：不同包下的同名类调用时需要使用全类名<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710468353475-c18ea750-cba6-429b-b964-9874032ed3a7.png#averageHue=%23edecec&clientId=ua219797f-1041-4&from=paste&height=343&id=u2d251c18&originHeight=1244&originWidth=2176&originalType=binary&ratio=2&rotation=0&showTitle=false&size=596174&status=done&style=none&taskId=ud43cace3-1437-4269-869b-4eee83da324&title=&width=600)
<a name="CfKOZ"></a>
## final
<a name="zsG9A"></a>
### 定义：最终的 ---> 不可被改变的
<a name="MIegM"></a>
### 修饰（方法、类、变量）
<a name="YIXKt"></a>
##### 修饰方法：当前方法是一个最终方法，不能被子类重写	public final void xxx(){}
<a name="KJqAg"></a>
##### 修饰类：这个是最终类，不能被继承			final class Fu(){}
<a name="LRnJg"></a>
##### 修饰变量：常量，只能被赋值一次		核心：常量记录的数据是不能发生改变的						字符串是不可变的->因为字符串实际上是一个被 final 修饰的字节数组 value 存储的。又因为 value 被 private 修饰，则外界不能访问 value 的内部，所以字符串不可改变	
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710469631967-2c983d97-650b-4431-bb57-2864dbab8f4c.png#averageHue=%23f8f7f7&clientId=ua219797f-1041-4&from=paste&height=681&id=u6bcc8cf7&originHeight=1362&originWidth=2522&originalType=binary&ratio=2&rotation=0&showTitle=false&size=595991&status=done&style=none&taskId=ue852c567-74f0-4b5d-a90e-40fa46412ae&title=&width=1261)
<a name="cUfu3"></a>
###### 修饰基本数据类型		不可以 修改 a 存储的值												final int a = 10
<a name="qHJih"></a>
###### 修饰引用数据类型		可以修改其内部值，但是不能修改 s 锁存储的地址值							final Student s = new Student();														final int[] arr = {1,2,3,4,5};
<a name="XmYip"></a>
### 实际开发使用实例（以学生管理系统为例）
要加static刚刚不是说了嘛，这个startStuSys被静态修饰，静态只能访问静态，所以常量也需要静态修饰
```java
.................

//实际开发使用实例（以学生管理系统为例）👇
private static final String ADD_STUDENT = "1";
private static final String DELETE_STUDENT = "2";
private static final String UPDATE_STUDENT = "3";
private static final String QUERY_STUDENT = "4";
private static final String EXIT = "5";
实际开发使用实例（以学生管理系统为例）👆

public static void startStudentSystem() {
    //创建集合
    ArrayList<itheima.AC练习.学生管理系统.Student> list = new ArrayList<>();
    //界面UI显示
    loop:
    while (true) {
        System.out.println("------------欢迎来到ckkk学生管理系统--------");
        System.out.println("1:添加学生");
        System.out.println("2:删除学生");
        System.out.println("3:修改学生");
        System.out.println("4:查询学生");
        System.out.println("5:退出");
        System.out.println("请输入您的操作：");
        //键盘录入操作
        Scanner sc = new Scanner(System.in);
        String choose = sc.nextLine();
        //执行键盘对应操作
        //实际开发使用实例（以学生管理系统为例）👇

        switch (choose) {
                //增
            case ADD_STUDENT -> addStudent(list);
                //删
            case DELETE_STUDENT -> deleteStudent(list);
                //改
            case UPDATE_STUDENT -> updateStudent(list);
                //查
            case QUERY_STUDENT -> queryStudent(list);
                //退
            case EXIT -> {
                System.out.println("【系统】退出成功！");
                break loop;
                //或使用停止虚拟机运行System.exit(0);
            }
        //实际开发使用实例（以学生管理系统为例）👆

```
<a name="d1OZB"></a>
## 权限修饰符	private < 空着不写 / 缺省 /默认 < protected < public
<a name="xq2Qg"></a>
### 权限修饰符的定义
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710557935247-9ff0ad71-b96d-41ce-a604-00fbd2f69c59.png#averageHue=%23f5f4ec&clientId=ufe1ccef5-d440-4&from=paste&height=537&id=ud81a414e&originHeight=1074&originWidth=1582&originalType=binary&ratio=2&rotation=0&showTitle=false&size=395643&status=done&style=none&taskId=ud43bbc47-e8ff-4b96-81bf-5791b40a95b&title=&width=791)
<a name="ufOp3"></a>
### 权限修饰符的分类
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710558023012-45f86da6-1a47-4f05-a7be-8eadc1343afb.png#averageHue=%23d9dbda&clientId=ufe1ccef5-d440-4&from=paste&height=638&id=u703ff6c5&originHeight=1276&originWidth=2522&originalType=binary&ratio=2&rotation=0&showTitle=false&size=625958&status=done&style=none&taskId=u35dd68d5-30d1-41cf-9f92-974fcabdf65&title=&width=1261)<br />空着不写  =  修饰符 friendly
<a name="tJhfe"></a>
#### private 私有的		私房钱，只能自己（本类）用
<a name="e9uRs"></a>
#### 空着不写		一个家庭（包） 的人（类）用
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710558484330-d87ef774-1a49-4d34-9c38-c4782211f062.png#averageHue=%23f4e5e3&clientId=ufe1ccef5-d440-4&from=paste&height=725&id=u63d27c6a&originHeight=1450&originWidth=2622&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1308024&status=done&style=none&taskId=u161a118b-2f4b-4759-9466-3e3437e7075&title=&width=1311)
<a name="khw0d"></a>
#### protected 受保护的		一个家庭（包） 的人（类）和 外面收法律保护的人（不同包下的子类）能用
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710558493326-02d2403b-675d-47ad-b530-0a9acc1c1fae.png#averageHue=%23f2e1df&clientId=ufe1ccef5-d440-4&from=paste&height=728&id=u731e399d&originHeight=1456&originWidth=2702&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1278696&status=done&style=none&taskId=u6abb7374-6ff4-40b6-8099-72e1c2f922b&title=&width=1351)
<a name="e7iv5"></a>
#### public 公共的		都可以用
<a name="Fajw5"></a>
### 权限修饰符的使用
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710570577536-a4a7aec0-61d3-46c6-82ce-13d48b6d4fdd.png#averageHue=%23f4f0ef&clientId=ufe1ccef5-d440-4&from=paste&height=431&id=u9400a1c7&originHeight=862&originWidth=2082&originalType=binary&ratio=2&rotation=0&showTitle=false&size=260324&status=done&style=none&taskId=u7ba49651-c1a6-4ffb-94de-bd3b2e7fc3d&title=&width=1041)
<a name="JOiJm"></a>
## 代码块
<a name="TpERy"></a>
### 【了解】局部代码块：写在方法里面的单独的大括号
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710570707289-10f40ffb-e0dd-4618-a7e6-c2df970ad1b3.png#averageHue=%23faf7e3&clientId=ufe1ccef5-d440-4&from=paste&height=621&id=ud86446a2&originHeight=1242&originWidth=1860&originalType=binary&ratio=2&rotation=0&showTitle=false&size=277754&status=done&style=none&taskId=uabb0a7b6-c3de-406f-ba72-82baf3eb3ce&title=&width=930)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710570916282-1fe5f8bb-5bbf-4343-b7a6-f8e4cc4a1393.png#averageHue=%23fcfbf8&clientId=ufe1ccef5-d440-4&from=paste&height=255&id=u0af81f6f&originHeight=510&originWidth=964&originalType=binary&ratio=2&rotation=0&showTitle=false&size=228112&status=done&style=none&taskId=u3770e5a7-dbc1-4041-8cbd-01581c59d60&title=&width=482)
<a name="QfSgp"></a>
##### 局部的定义：方法里面
<a name="ySULE"></a>
##### 局部代码块的作用：提前结束代码周期

<a name="NyTWy"></a>
### 【了解】构造代码块：写在成员位置的代码块
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710570965093-60b33484-4072-41f9-922c-9bcbf4b34e34.png#averageHue=%23faf7e4&clientId=ufe1ccef5-d440-4&from=paste&height=655&id=u7ab72531&originHeight=1310&originWidth=1998&originalType=binary&ratio=2&rotation=0&showTitle=false&size=516147&status=done&style=none&taskId=u46deb98f-a546-4526-b8d2-2d7b411a5cd&title=&width=999)<br />在构造方法中有重复的代码👆<br />所以可抽取出来用大括号包围
<a name="vq0Zy"></a>
#### 构造代码块的定义
写在成员位置的代码块
<a name="eDMt6"></a>
#### 构造代码块的作用
可以把多个构造方法中的重复代码抽取出来
<a name="oYhzk"></a>
#### 构造代码块的使用时机
我们在创建本类对象的时候，他会先执行构造代码块，再执行构造方法，即先执行构造代码块，再执行构造方法
<a name="pqEjJ"></a>
#### 缺点：不灵活，创建第三个有参构造时若不想执行同样的代码，也同样必须先执行构造代码块中的，而不能不执行，那怎么解决抽取有参构造和无参构造中的重复代码呢？												答：可以把代码写在有参构造中，然后在无参构造中写 this(null.0);即在无参构造中调用有					参构造		//this(null,0)调用本类的有参构造,即类似前面学的 【super();调用父类的有参构造】																		![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710594696876-63ee5568-9173-42eb-be57-38a584ca7a01.png#averageHue=%23f8f8c8&clientId=ufe1ccef5-d440-4&from=paste&height=590&id=ucce0021d&originHeight=1179&originWidth=1252&originalType=binary&ratio=2&rotation=0&showTitle=false&size=363162&status=done&style=none&taskId=u293a89e0-4fcf-40e8-acd9-e5f11c4bddd&title=&width=626)

<a name="mZ7Qf"></a>
### 【重点掌握】静态代码块
<a name="jDSLu"></a>
#### 静态代码块的格式：static{}
<a name="pB4aG"></a>
#### 静态代码块的特点：需要通过 static 关键字修饰，随着类的加载而加载，并且自动触发、只执行一次
<a name="OJmIq"></a>
#### 静态代码块与构造代码块的区别：构造代码块是每一次创建对象的时候执行，而静态代码块是只执行一次，而且是随着类的加载而加载
<a name="zbaWQ"></a>
#### 静态代码块的使用场景：在类的加载的时候，做一些数据初始化的使用									在程序刚开始的时候做一次静态初始化，可解决重复调用方法导致重复初始化的弊端
静态代码块加载一次的 eg：👇<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710595767796-3ecd911a-7640-4516-b207-20e88bb987c2.png#averageHue=%233a3b3e&clientId=ufe1ccef5-d440-4&from=paste&height=432&id=ued88f6c9&originHeight=1619&originWidth=2877&originalType=binary&ratio=2&rotation=0&showTitle=false&size=695818&status=done&style=none&taskId=ud50ba20c-3009-4757-aca0-ba1ee52bbb1&title=&width=767)<br />输出：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710595821409-b25e1f6b-6023-4df2-8015-94d601be1815.png#averageHue=%23434347&clientId=ufe1ccef5-d440-4&from=paste&height=206&id=u1bd2a34d&originHeight=411&originWidth=340&originalType=binary&ratio=2&rotation=0&showTitle=false&size=21037&status=done&style=none&taskId=u616140e9-d48e-4b47-ae22-bc44fa26607&title=&width=170)

<a name="yidZK"></a>
# 抽象类、接口、内部类
<a name="jFFyA"></a>
## 抽象类：只要类中有一个抽象方法就要声明抽象类
![778045601.jpg](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1710732609044-846692ae-404d-47ed-a1a6-bc5a6892f0a3.jpeg#averageHue=%23f7f4f4&from=url&id=SS4F2&originHeight=1202&originWidth=2191&originalType=binary&ratio=1&rotation=0&showTitle=false&size=458869&status=done&style=none&title=)

<a name="cWcZ5"></a>
### 抽象方法的定义：												子类重写或声明也是抽象类，否则报错。重写也要写@Override
<a name="Zbu0F"></a>
#### ![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710597060959-084a309d-95a3-43ea-b869-3e4e0b5cd359.png#averageHue=%23f9f4f4&clientId=ufe1ccef5-d440-4&from=paste&height=590&id=u00f08eff&originHeight=1179&originWidth=2392&originalType=binary&ratio=2&rotation=0&showTitle=false&size=554286&status=done&style=none&taskId=u013e36c4-27df-4b16-aa69-20286f6f107&title=&width=1196)
<a name="QH9gX"></a>
### 抽象类的定义：抽象方法所在的类
<a name="KQWoI"></a>
### 抽象类、抽象方法的定义格式
<a name="a6XCs"></a>
#### ![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710597090872-1e5f8f64-8677-4323-832e-d574a3d12d42.png#averageHue=%23f6f3f3&clientId=ufe1ccef5-d440-4&from=paste&height=319&id=u37586e77&originHeight=638&originWidth=1330&originalType=binary&ratio=2&rotation=0&showTitle=false&size=243068&status=done&style=none&taskId=u13ff39cf-eea4-4930-a955-048c23c1d87&title=&width=665)
```java
public abstract class Person {
    public abstract void work();

}
```
<a name="lnYgq"></a>
### 抽象类和抽象方法的注意事项
不能实例化：不能创建对象，为什么？<br />因为如果能创建对象，是不是就能调用方法，所以不能实例化<br />那为什么又有构造方法？<br />因为可以用于子类重写后使用。当创建子类对象时，给属性进行赋值的<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710597517774-24efec34-2091-4691-acbb-1b21da3f5cad.png#averageHue=%23f4f3f3&clientId=ufe1ccef5-d440-4&from=paste&height=398&id=u7b1fc54d&originHeight=796&originWidth=1598&originalType=binary&ratio=2&rotation=0&showTitle=false&size=320255&status=done&style=none&taskId=uf0f6aa2b-52dd-4aeb-bdf4-73742a70553&title=&width=799)
<a name="n2iTu"></a>
### 子类继承抽象类之后，如何重写抽象方法
<a name="NzC2Q"></a>
### 抽象类在实际开发中的意义所在
![-362219410.jpg](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1710732266206-9a4750cf-9293-4722-a11c-2f04dcbc38b8.jpeg#averageHue=%23c6c5c5&from=url&id=iSeAc&originHeight=1240&originWidth=2772&originalType=binary&ratio=1&rotation=0&showTitle=false&size=265565&status=done&style=none&title=)<br />![-1220974541.jpg](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1710732267789-9ccf3ffb-c848-4b25-8487-1fcfa5002c80.jpeg#averageHue=%23c3c1b9&from=url&id=kKviy&originHeight=1240&originWidth=2772&originalType=binary&ratio=1&rotation=0&showTitle=false&size=511809&status=done&style=none&title=)

<a name="ZAtea"></a>
## 接口：侧重于 行为。接口就是一种规则，是对行为的抽象。
不同类中的部分类有特殊的行为，则可通过接口规范行为的书写，接口中的方法无方法体，实现接口必须重写，implement 几个接口，其中的方法都要重写，接口可以单继承，多继承，即一个类可以继承多个接口。接口中方法不写 static 或 default，会被默认为抽象方法
<a name="F0z8P"></a>
### 初步认识接口
<a name="koLqJ"></a>
#### 为什么有接口
![-667111894.jpg](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1710733162462-e617ff25-76c3-4d58-827b-ec189f05c32b.jpeg#averageHue=%23bfbebe&from=url&height=247&id=LMg4L&originHeight=1240&originWidth=2772&originalType=binary&ratio=1&rotation=0&showTitle=false&size=360558&status=done&style=none&title=&width=552)

![314475.jpg](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1710733163678-3ee5d473-ed5a-4f13-bba4-0924036feccd.jpeg#averageHue=%23bebcbc&from=url&height=251&id=jrW5I&originHeight=1240&originWidth=2772&originalType=binary&ratio=1&rotation=0&showTitle=false&size=415947&status=done&style=none&title=&width=560)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710751852110-4fe22fd0-017a-4a2a-b82b-cc549ec7fd3c.png#averageHue=%23f2f0ef&clientId=uab4a4023-1119-4&from=paste&height=314&id=ued147619&originHeight=1610&originWidth=2879&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1232215&status=done&style=none&taskId=u59977664-0f08-467a-be3b-9d456b306aa&title=&width=561)


<a name="d2TvQ"></a>
#### 接口的应用
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710751948749-2627f758-8ebe-4a20-ac47-ed7da4cc8251.png#averageHue=%23fbfaf1&clientId=uab4a4023-1119-4&from=paste&height=322&id=ua54f8116&originHeight=1620&originWidth=2880&originalType=binary&ratio=2&rotation=0&showTitle=false&size=617609&status=done&style=none&taskId=ua89d4fc4-9014-4034-a377-3579c9ed648&title=&width=572)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710752013334-1ea10423-2775-43ae-bc3f-86b1ead6804d.png#averageHue=%23f9f4e8&clientId=uab4a4023-1119-4&from=paste&height=318&id=u15fc2a35&originHeight=1620&originWidth=2880&originalType=binary&ratio=2&rotation=0&showTitle=false&size=833423&status=done&style=none&taskId=uab4cbdaf-0408-4ba2-b36b-174609bd59f&title=&width=566)

<a name="dpmV6"></a>
#### 接口和抽象类的异同
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710752170806-5da20d17-1933-4b1a-a467-4048a82483c9.png#averageHue=%23f5f4f3&clientId=uab4a4023-1119-4&from=paste&height=322&id=cFteu&originHeight=1620&originWidth=2880&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1010569&status=done&style=none&taskId=ub775552b-ee40-4e51-ae90-9435ebdfa60&title=&width=572)<br />抽象类：侧重于表示一类事物<br />接口：侧重于表示行为
<a name="rpnQN"></a>
### 如何定义一个接口
public interface 接口名{}
<a name="YeNpH"></a>
### 如何使用一个接口
<a name="z4HtT"></a>
#### 接口不能实例化，即接口不能创建对象
<a name="LzbQz"></a>
#### 接口和类之间是实现关系，通过 implements 关键字表示									public class 类名 implement 接口名{}
<a name="BBb6g"></a>
#### 接口的子类（实现类）																要么重写接口中的所有抽象方法	（多用）											要么是抽象类
<a name="aXqtc"></a>
#### 注意：	(1) 接口和类是实现关系，可以单实现，也可以多实现									public class 类名 implement 接口名 1，接口名 2{}							(2)实现类还可以在继承一个类的同时实现多个接口										public class 类名 extends 父类 implement 接口 1，接口 2{}
<a name="KSPNN"></a>
#### 例题：
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710768328426-5ffb97ff-ef67-4844-a4e0-98d2c329064d.png#averageHue=%23f3f2f1&clientId=u59691b5a-e3ae-4&from=paste&height=298&id=uaae27a5c&originHeight=596&originWidth=1208&originalType=binary&ratio=2&rotation=0&showTitle=false&size=216575&status=done&style=none&taskId=u4f6af049-1662-4561-8537-47a169c6c32&title=&width=604)
```java
package itheima.AC练习.接口;

public abstract class Animals {
    private String name;
    private int age;

    public Animals() {
    }

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Animals{name = " + name + ", age = " + age + "}";
    }

    public abstract void eat();
}

```
```java
package itheima.AC练习.接口;

public interface Swim {
    public abstract void swim();
}

```
```java
package itheima.AC练习.接口;

public class Dog extends Animals implements Swim{

    public Dog() {
    }

    public Dog(String name,int age) {
        super(name,age);

    }

    @Override
    public void eat() {
        System.out.println("吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");

    }

    public String toString() {
        return "Dog{}";
    }
}

```
```java
package itheima.AC练习.接口;

public class Frog extends Animals implements Swim{

    public Frog() {
    }

    public Frog(String name,int age) {
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }


    public String toString() {
        return "Frog{}";
    }
}

```
```java
package itheima.AC练习.接口;

public class Rabbit extends Animals {


    public Rabbit() {
    }

    public Rabbit(String name ,int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("吃胡萝卜");
    }

    public String toString() {
        return "Rabbit{}";
    }
}

```
```java
package itheima.AC练习.接口;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("zhangsan",23);
        System.out.println(d.getName());
        System.out.println(d.getAge());
        d.swim();
        Rabbit r = new Rabbit("lisi",24);
        System.out.println(r.getName());
        System.out.println(r.getAge());

        Frog f = new Frog("wangwu",25);
        System.out.println(f.getName());
        System.out.println(f.getAge());
        f.swim();
    }
}

```
<a name="xhcDW"></a>
### 接口里面的成员特点
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710769823005-ed04226e-7536-43b0-93b3-ed44a68175b3.png#averageHue=%23f7f4f4&clientId=u59691b5a-e3ae-4&from=paste&height=578&id=ud2c4e896&originHeight=1156&originWidth=1180&originalType=binary&ratio=2&rotation=0&showTitle=false&size=337585&status=done&style=none&taskId=u23460dbd-02b9-4c02-859c-5ccf30819fd&title=&width=590)
<a name="HgT9I"></a>
#### 成员变量	只能是常量，默认修饰符：public static final	//此处是定义变量时
<a name="UMadX"></a>
#### 构造方法	没有，因为接口不能创建对象，也无需赋值
<a name="vcfAN"></a>
#### 成员方法	只能是抽象方法。默认修饰符：public abstract 										JDK7 以前：接口中只能定义抽象方法											JDk8 新特性：接口中可以定义有方法体的方法										JDK9：接口中可以定义私有方法
<a name="zHDst"></a>
### 接口和类之间的关系
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710771069493-8819b3fd-1c69-4fb7-a6f9-99ffba37d411.png#averageHue=%23f7f6f6&clientId=u59691b5a-e3ae-4&from=paste&height=441&id=ub7c7a0f9&originHeight=881&originWidth=1996&originalType=binary&ratio=2&rotation=0&showTitle=false&size=417340&status=done&style=none&taskId=ue54bcf99-843f-4534-94bf-48eb1800742&title=&width=998) 
<a name="UBeLs"></a>
#### 类和类的关系：继承关系，只能单继承，不能多继承，但可以多层继承
<a name="IeyFN"></a>
#### 类和接口的关系：实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口（若实现了多个接口，要把所有抽象方法全部重写，若接口间有重复的方法名，则重写一次即可）	
<a name="kuAjf"></a>
#### 接口和接口的关系：继承关系，可以单继承，也可以多继承									（若实现的接口继承了其他接口，同样要把所有抽象方法重写）			
<a name="OjhQE"></a>
### 接口的小扩展“多学三招”
<a name="NOgpM"></a>
#### JDK8 新增方法
<a name="aSY0C"></a>
##### JDK7 以前，接口中只能定义抽象方法。
接口若增加方法，实现类必须重写增加的方法，否则报错<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710807009645-443a354f-c85d-46cc-8b45-0c9c8ab2d069.png#averageHue=%23ecece2&clientId=u21c0627a-dbe3-4&from=paste&height=391&id=u065ecc87&originHeight=1543&originWidth=2725&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1046307&status=done&style=none&taskId=u21d6585d-679a-4cad-8933-a2c5931106e&title=&width=690)
<a name="oZwng"></a>
##### JDK8，接口中可以定义有方法体的方法（默认、静态）。考虑到接口升级
实现类不需要立马修改，等以后用到了某个规则，再重写就行了

<a name="TafQ5"></a>
###### 接口中默认方法定义格式：
public default 返回值类型 方法名(参数列表){}	//此定义是在接口类中<br />默认方法不是抽象方法，所以不强制被重写，但是如果被重写，重写的时候去掉 default 关键字（并		非去掉接口中的 default，而是重写的时候不加 default）<br />public 可以省略，default 不能被省略，省略就被默认为抽象方法<br />如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写（因为不		知道调用的是谁的 show 方法）

<a name="pR9xZ"></a>
###### 接口中的静态方法
格式：public static 返回值类型 方法名(参数列表){}<br />只能通过接口名调用，不能通过类名或者对象名调用<br />不能省略 static，否则将被默认为抽象方法<br />静态方法不能被重写（因为重写是指继承父类的虚方法表，将虚方法表中的方法进行覆盖，而 static 不属于虚方法，不在虚方法表中）
<a name="fPYdC"></a>
##### JDK9，接口中可以定义私有方法。考虑到不想让外界访问 JDK8 中默认、静态方法中抽取的重复代码
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710808880646-ed890d5d-6071-45d6-8b5b-50c9e1d0eb71.png#averageHue=%23f9f6dd&clientId=u21c0627a-dbe3-4&from=paste&height=364&id=u7d499ef0&originHeight=1090&originWidth=1434&originalType=binary&ratio=2&rotation=0&showTitle=false&size=438568&status=done&style=none&taskId=udce0f632-59d6-4467-a98a-47a698687d0&title=&width=479)<br />default 方法具有重复的代码，以前只能重新定义一个 default，然后调用👇（右上角）					JDK9 开始，若不想让方法被外界访问，可私有，无需加 default👇（右下角）<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710808992371-cf441736-6660-48db-974c-60e160141ed5.png#averageHue=%23faf8e2&clientId=u21c0627a-dbe3-4&from=paste&height=496&id=u0bf22bad&originHeight=992&originWidth=2372&originalType=binary&ratio=2&rotation=0&showTitle=false&size=603560&status=done&style=none&taskId=uf5c0560e-4c38-467c-ac5f-a58cb33acb7&title=&width=1186)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710809102507-b9bf76bc-767d-4f1d-abcf-4519dfbc8ac8.png#averageHue=%23f4eeee&clientId=u21c0627a-dbe3-4&from=paste&height=384&id=u7d878fc5&originHeight=768&originWidth=1466&originalType=binary&ratio=2&rotation=0&showTitle=false&size=267441&status=done&style=none&taskId=u16d25fb1-2e37-4672-849d-4e298d48de5&title=&width=733)<br />第一种服务于默认方法。服务：抽取重复代码。普通私有方法<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710809372028-4669b96d-c498-4ee5-8986-171180686843.png#averageHue=%23fcfcfb&clientId=u21c0627a-dbe3-4&from=paste&height=502&id=u8831a77b&originHeight=1004&originWidth=1350&originalType=binary&ratio=2&rotation=0&showTitle=false&size=371610&status=done&style=none&taskId=u2148b8e8-e539-4bfb-ba1f-3230dbc6786&title=&width=675)<br />第二种服务于静态方法。服务：抽取重复代码。静态私有方法。（为什么要加静态？以区分服务的是默认方法还是静态方法）<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710809409755-229fd0a0-96ce-43b5-94cd-1edc936b53cc.png#averageHue=%23fcfbfb&clientId=u21c0627a-dbe3-4&from=paste&height=614&id=u0b3a93ef&originHeight=1228&originWidth=1418&originalType=binary&ratio=2&rotation=0&showTitle=false&size=582609&status=done&style=none&taskId=u57be2935-8028-47c6-90c1-6885f47e2ce&title=&width=709)
<a name="NQFck"></a>
#### 接口的应用：
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710856615324-b548a783-ba2e-4265-9c87-f1eb8a021e6e.png#averageHue=%23f5f2f2&clientId=u21c0627a-dbe3-4&from=paste&height=435&id=u14f2d9a1&originHeight=869&originWidth=2265&originalType=binary&ratio=2&rotation=0&showTitle=false&size=358036&status=done&style=none&taskId=u95d93ecf-ed4f-4516-8a20-fbcb71bf25d&title=&width=1132.5)
<a name="zrfct"></a>
##### 用法一：多个类的规则定义为接口，想要让实现类拥有什么功能，就实现什么接口
<a name="QpWqA"></a>
##### 用法二：接口的多态：在一个方法中如果把参数写成了为接口，那么在调用方法的时候就可以传递所有的实现类对象
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710810158471-7a02c48a-55d1-439c-89af-dadf6a4adf54.png#averageHue=%23f6f5ea&clientId=u21c0627a-dbe3-4&from=paste&height=759&id=uba1735b4&originHeight=1518&originWidth=2732&originalType=binary&ratio=2&rotation=0&showTitle=false&size=705942&status=done&style=none&taskId=u4b874be2-3551-4f9e-9a50-ea9e5d6acc6&title=&width=1366)<br />接口类型 j = new 实现类对象（）；		//类比： 父类 对象名 = new 子类（）； 调用成员变量，编译看左边，运行也看左边。调用成员方法，编译看左边，运行看右边<br />遵循实现看左边，运行看右边的原则
<a name="XOFJj"></a>
#### 适配器设计模式
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710912418437-ccfcc8b4-a78c-4455-8b1b-962ef0928a5b.png#averageHue=%23f6f5f5&clientId=u6b9fb705-a38b-4&from=paste&height=505&id=uc1945ff2&originHeight=1010&originWidth=2292&originalType=binary&ratio=2&rotation=0&showTitle=false&size=525456&status=done&style=none&taskId=u63ab4e38-f49d-4093-8fa2-9780adcc19e&title=&width=1146)<br />如果想要调用 method5，需要把所有方法进行重写，使得代码可读性降低。所以可定义另一个类“xxxAdapter”用来空实现其他方法，然后在实现 method5 的类中继承 Adapter 类，然后重写需要用的方法。相当于在接口和实现类之间添加了第三者。最后为了避免其他类调用适配器（Adapter 类），需要把其变成抽象类![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710912875534-67f1991e-5249-4ee3-86cf-89b304db46c4.png#averageHue=%23f3f1f1&clientId=u6b9fb705-a38b-4&from=paste&height=482&id=uf3bb2826&originHeight=964&originWidth=2244&originalType=binary&ratio=2&rotation=0&showTitle=false&size=468292&status=done&style=none&taskId=u7cafa0f9-2f75-4549-a2dc-ce0f01544ff&title=&width=1122)<br />若实现类需要继承别的类，但是 java 不能多继承，于是可以将适配器继承实现类所要继承的类，然后是实现类继承适配器
<a name="cWuDP"></a>
## 内部类
<a name="HcgNW"></a>
### 什么是内部类：在一个类里面再定义一个类
类的五大成员：属性、方法、构造方法、代码块、内部类![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710913237531-4bae0bb2-fcd0-4301-bf8e-7848b551050b.png#averageHue=%23f8f4e0&clientId=u6b9fb705-a38b-4&from=paste&height=402&id=uf21950a0&originHeight=804&originWidth=2462&originalType=binary&ratio=2&rotation=0&showTitle=false&size=374746&status=done&style=none&taskId=ud5b2cd16-edfc-4361-b7e1-3dbd9c9fdde&title=&width=1231)
<a name="n4qZU"></a>
### 为什么要学习内部类：
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710913389407-1e8b200e-07ff-4bab-a9ac-504ae5c90d68.png#averageHue=%23f8f6e6&clientId=u6b9fb705-a38b-4&from=paste&height=594&id=u72b71a17&originHeight=1188&originWidth=2500&originalType=binary&ratio=2&rotation=0&showTitle=false&size=730636&status=done&style=none&taskId=u408c4c81-d85b-4b0f-b745-07e92819bcd&title=&width=1250)<br />xia 内部类可以访问外部类的成员，包括私有。![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710980964938-0c0ec448-9c3c-4f16-9796-029cff08df99.png#averageHue=%233a3a3e&clientId=u25754d0b-e0ea-4&from=paste&height=810&id=u1eaf263d&originHeight=1620&originWidth=2880&originalType=binary&ratio=2&rotation=0&showTitle=false&size=624522&status=done&style=none&taskId=u9902de73-0600-4b81-9550-8b94dc47d2c&title=&width=1440)<br />👇但是外部类不能直接访问内部类成员，因为内部类方法隐含 this，指的是调用者的地址值，而调用者是 Car 而不是 Engine。![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710982486473-d0c57200-e80b-492e-838e-23f163ca77cf.png#averageHue=%233a3a3e&clientId=u25754d0b-e0ea-4&from=paste&height=808&id=uf8102eee&originHeight=1615&originWidth=2875&originalType=binary&ratio=2&rotation=0&showTitle=false&size=666144&status=done&style=none&taskId=ua0cfdd08-74a8-4ba0-be7b-481967f8283&title=&width=1437.5)
<a name="NATXd"></a>
### 内部类的使用：B类表示的事物是 A 类的一部分，且 B 单独存在没有意义
<a name="DlgQl"></a>
#### itr 迭代器 是 ArrayList 的内部类

<a name="MgvQH"></a>
### 内部类的分类
<a name="IerMY"></a>
#### 成员内部类（了解）写在成员位置的。属于外部类的成员
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710983761029-8d942189-e892-480c-b4e2-31a3ba1c1a0f.png#averageHue=%23fbf8eb&clientId=u25754d0b-e0ea-4&from=paste&height=662&id=uf59375c9&originHeight=1323&originWidth=2492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=684737&status=done&style=none&taskId=u772aa643-88a5-4b2b-ba57-e0edd633d1c&title=&width=1246)
<a name="yCR2k"></a>
##### 成员内部类的代码如何去写
一旦被私有修饰，只能在本类中使用 👇![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710983599465-4d2b8544-e3ac-48bc-8475-ea6902bb2db6.png#averageHue=%23fcfbcd&clientId=u25754d0b-e0ea-4&from=paste&height=358&id=Ee0ev&originHeight=716&originWidth=1276&originalType=binary&ratio=2&rotation=0&showTitle=false&size=311612&status=done&style=none&taskId=u713e833f-eb09-415e-95a3-d452aec61ff&title=&width=638)

<a name="uUU9r"></a>
##### 如何创建成员内部类的对象
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710983819793-ed9eb2b0-1218-4ac7-9630-e6bdc012fe87.png#averageHue=%23c0c0bf&clientId=u25754d0b-e0ea-4&from=paste&height=802&id=u9ddcf3fa&originHeight=1603&originWidth=2864&originalType=binary&ratio=2&rotation=0&showTitle=false&size=849997&status=done&style=none&taskId=u453d9053-bc14-4870-923a-859d1a2cfe5&title=&width=1432)
<a name="G4Oxb"></a>
###### 法一：外部类编写方法，对外提供内部类对象 (一般内部类被 private 修饰时使用)
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710984860832-ca572ff3-686f-445e-b4cb-69d5d7999109.png#averageHue=%23333337&clientId=u25754d0b-e0ea-4&from=paste&height=453&id=ucb7c8fbb&originHeight=906&originWidth=2212&originalType=binary&ratio=2&rotation=0&showTitle=false&size=253292&status=done&style=none&taskId=u86263beb-1b13-494b-9bb4-966d40f3951&title=&width=1106)<br />若将内部类私有化：<br />则Outer.Inner oi = o.getInner();    //err，因为不知道 Outer 中有 Inner 这个类<br />解决方法：可使用多态解决，即通过父类创建可接收子类对象地址的变量。所有类都继承 Object，所以可以改为：Object oi = o.getInner();<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710985092531-7424813e-c44c-43e2-8fcc-a5c062b149b0.png#averageHue=%23313235&clientId=u25754d0b-e0ea-4&from=paste&height=430&id=u4884a4c2&originHeight=860&originWidth=2232&originalType=binary&ratio=2&rotation=0&showTitle=false&size=256293&status=done&style=none&taskId=u6bbbcc3d-d035-4e20-b8aa-13445096856&title=&width=1116)<br />解决方法二：直接使用链式编程，不去通过变量接收地址值
<a name="QaHAk"></a>
###### 法二：直接创建
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710984192779-62250eec-153f-4f0e-9db8-8d56125c77eb.png#averageHue=%23fefefd&clientId=u25754d0b-e0ea-4&from=paste&height=470&id=u6139474c&originHeight=940&originWidth=1356&originalType=binary&ratio=2&rotation=0&showTitle=false&size=529340&status=done&style=none&taskId=uf4e3b758-0a86-4572-aaf2-17843561b42&title=&width=678)<br />创建 Outer 的对象并返回地址值：new Outer()<br />在 Outer 中再创建 Inner 的对象并返回地址值：new  Outer () . new Inner();<br />链式编程，最后返回的是 Inner 的地址值，用能够接收 Outer 中的 Inner 对象地址值的变量 oi 来接收其地址值<br />但是如果被 private 修饰，<br />那么外界无法获取内部类的对象	
<a name="ZNYLJ"></a>
##### 成员内部类如何获取外部类的成员变量
<a name="B7GAq"></a>
###### 关键字 this 拓展
Outer.this.a、this、a<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710999312063-7bfec6e8-6491-48ab-8146-7d862275e95e.png#averageHue=%23353539&clientId=ua62dc5d6-8e2f-4&from=paste&height=598&id=u46584762&originHeight=1196&originWidth=2256&originalType=binary&ratio=2&rotation=0&showTitle=false&size=343444&status=done&style=none&taskId=u303c8666-b923-4cee-aaf5-806a1f137c6&title=&width=1128)
<a name="O10aW"></a>
###### 内存图
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710999432983-155a9a2e-b8b9-420f-97fe-3a99db05c37a.png#averageHue=%23f5f5cc&clientId=ua62dc5d6-8e2f-4&from=paste&height=754&id=u1a3152eb&originHeight=1508&originWidth=2720&originalType=binary&ratio=2&rotation=0&showTitle=false&size=968985&status=done&style=none&taskId=ua15bbd7e-9aa8-48f8-8f8a-717c1de3355&title=&width=1360)<br />注意！内部类和外部类的字节码文件是两个文件分开的![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1710999770369-9ed113d5-7900-4532-b565-0b1f8e1e5cf3.png#averageHue=%23f4f3c9&clientId=ua62dc5d6-8e2f-4&from=paste&height=758&id=u4779630b&originHeight=1516&originWidth=2732&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1405965&status=done&style=none&taskId=u3f4f5025-e9c0-4e57-8a46-01fcc44e242&title=&width=1366)<br />内部类中有一个隐藏的，记录的是外部类的地址值，即：外部类 . this
<a name="bqXI0"></a>
#### 静态内部类（了解）
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711000326438-1a8215c0-07ba-4ada-a656-66d04faf2071.png#averageHue=%23f7f3e8&clientId=ua62dc5d6-8e2f-4&from=paste&height=646&id=u0dfaf520&originHeight=1291&originWidth=2386&originalType=binary&ratio=2&rotation=0&showTitle=false&size=768812&status=done&style=none&taskId=ub3aae361-9084-4246-8858-ad1ff013c4c&title=&width=1193)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711001432842-527158ff-407a-49e4-ade4-8888550405ac.png#averageHue=%23343538&clientId=ua62dc5d6-8e2f-4&from=paste&height=577&id=uabe722b6&originHeight=1154&originWidth=2150&originalType=binary&ratio=2&rotation=0&showTitle=false&size=366989&status=done&style=none&taskId=ue813b0d6-1033-4f65-898b-43520978ba6&title=&width=1075)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711001459434-ee7e0aed-af30-488d-9562-63cbc31bdedd.png#averageHue=%23f7f3f3&clientId=ua62dc5d6-8e2f-4&from=paste&height=502&id=u233e2543&originHeight=1004&originWidth=2278&originalType=binary&ratio=2&rotation=0&showTitle=false&size=576349&status=done&style=none&taskId=ua13ee07e-278f-4598-b11a-2e4b59648c3&title=&width=1139)
<a name="JbmIS"></a>
#### 局部内部类（了解）
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711001512816-d9fafcbb-d5fa-478d-b7db-f0239d8e8ae6.png#averageHue=%23ececec&clientId=ua62dc5d6-8e2f-4&from=paste&height=301&id=uf8637491&originHeight=602&originWidth=2124&originalType=binary&ratio=2&rotation=0&showTitle=false&size=276537&status=done&style=none&taskId=u3d3f29f2-1d22-4f08-9f52-fb20ebd4c47&title=&width=1062)
```java
package itheima.AC练习.内部类.局部内部类;

public class Outer {
        int b = 20;
    public void show(){
        int a = 10;
        class Inner{
            String name;
            int age;
            public void method1(){
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部类中的method1非静态方法");
            }
            static public void method2() {
                System.out.println("局部类中的method1静态方法");
            }
        }
        System.out.println(new Inner().name);
        System.out.println(new Inner().age);
        new Inner().method1();
        Inner.method2();
    }
}

```
```java
package itheima.AC练习.内部类.局部内部类;

public class Test {
    public static void main(String[] args) {
        new Outer().show();
    }
}

```

<a name="FnxPD"></a>
#### 匿名内部类【终点掌握】：隐藏了名字的内部类	真正的匿名内部类是大括号里面的，而非 加上前面的 new，因为前面的 new 是创建了匿名内部类的对象，若 new 后面是接口，则匿名内部类是与接口是实现关系，若 new 后面是类，那么匿名内部类与类是继承关系，即匿名内部类继承了类
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711106085927-8c49c5d3-674f-4b84-be4b-f1e2a6cc2d43.png#averageHue=%23f8f5f3&clientId=u1053d911-8fc4-4&from=paste&height=664&id=uac2a157b&originHeight=1327&originWidth=2548&originalType=binary&ratio=2&rotation=0&showTitle=false&size=979758&status=done&style=none&taskId=ud867162e-e094-481b-a112-41e7e2581f7&title=&width=1274)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711002440577-b598199a-2590-4d47-a86a-1d80af84c955.png#averageHue=%23f5eed9&clientId=ua62dc5d6-8e2f-4&from=paste&height=379&id=u5bced7fc&originHeight=1394&originWidth=1576&originalType=binary&ratio=2&rotation=0&showTitle=false&size=408479&status=done&style=none&taskId=u4631f54b-1654-4d28-8a0b-b4cd2a25d4b&title=&width=428)<br />匿名内部类真的没有名字吗？不是的，通过查看源文件可知，名字是外部类+&+序号<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711104328699-efb09ebf-ea0a-4326-bc9d-5ac9559b051a.png#averageHue=%23fafaf9&clientId=u1053d911-8fc4-4&from=paste&height=182&id=uc64a080e&originHeight=224&originWidth=310&originalType=binary&ratio=2&rotation=0&showTitle=false&size=31231&status=done&style=none&taskId=u8f5b44cd-f0fb-4933-b1a6-fc558e6e710&title=&width=252)
<a name="WOYca"></a>
##### 接口	实现关系
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711013859817-77c023dd-5f54-4d7e-8ab8-27f234da70e8.png#averageHue=%23fafafa&clientId=uc585c987-6ce9-4&from=paste&height=267&id=ufc26b4d8&originHeight=1082&originWidth=2689&originalType=binary&ratio=2&rotation=0&showTitle=false&size=658483&status=done&style=none&taskId=u5b0a90fd-ca58-45fb-a414-3ffdd633669&title=&width=663)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711013882182-dca78785-729a-40d1-8cda-a78cea7df376.png#averageHue=%23fafafa&clientId=uc585c987-6ce9-4&from=paste&height=267&id=ud761cf2a&originHeight=1082&originWidth=2689&originalType=binary&ratio=2&rotation=0&showTitle=false&size=658483&status=done&style=none&taskId=u7cc8645d-2e06-4d23-8e5d-08fb34d37a0&title=&width=664)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711014892795-8355d97b-dbf6-4739-959f-e4a23f1d4fa8.png#averageHue=%23fefefc&clientId=uc585c987-6ce9-4&from=paste&height=295&id=u8f761cba&originHeight=191&originWidth=194&originalType=binary&ratio=2&rotation=0&showTitle=false&size=36945&status=done&style=none&taskId=u4c72265b-4d15-4597-9490-346c2584dab&title=&width=300)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711014921429-448be947-a837-416c-9a57-2de87377383b.png#averageHue=%23fefdfd&clientId=uc585c987-6ce9-4&from=paste&height=391&id=u688d4dce&originHeight=782&originWidth=1228&originalType=binary&ratio=2&rotation=0&showTitle=false&size=237412&status=done&style=none&taskId=u4623296d-28a3-48a3-8cd4-5393e44dc4c&title=&width=614)<br />整体是匿名内部类的对象，而匿名内部类是括号里面的<br />大括号里面的实现了接口 Swim
<a name="I2On2"></a>
##### 类 继承关系
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711104079765-a0e6e5be-9b7f-4aee-a4ae-c4bddc416234.png#averageHue=%23fdfdfd&clientId=u1053d911-8fc4-4&from=paste&height=602&id=ua5318705&originHeight=1204&originWidth=2642&originalType=binary&ratio=2&rotation=0&showTitle=false&size=396979&status=done&style=none&taskId=u11aa0cc3-53cb-418a-a9ec-36d2a320c61&title=&width=1321)<br />大括号里面的继承 Animal 这个类
<a name="MAleW"></a>
##### 匿名内部类的应用
这是增添了一段代码，省去了一个Dog类文件，以后的项目中一次性应用场景可能有成百上千个，那就剩去了成百上千个无用类文件的创建，怎么可能没用？
```java
package itheima.AC练习.内部类.匿名内部类.Demo2;

public class Test {
    public static void main(String[] args) {

        new Animal(){
            @Override
            public void eat() {
                System.out.println("重写了eat方法");
            }
        };

        //在测试类中调用下面的method方法？

        //以前的方式如何调用？
        //要自己写一个子类继承Animal类
        //再创建子类的对象，把对象传给method
        Dog d = new Dog();
        method(d);

        //如果Dog只要用一次，那么还需要单独定义一个类，太麻烦了，
        //所以说可以用匿名内部类的方法简化代码
        //使用以下代码可以去掉Dog这个类的定义
        method(
            //Animal的子类的对象
            new Animal() {
                @Override
                public void eat() {
                    System.out.println("狗吃骨头");
                }
            }
        );
    }

    public static void method (Animal a){//传给Animal，Animal a = 子类对象  --》多态
        a.eat();                        //遵循编译看左边，运行看右边
    }
}
```
```java
package itheima.AC练习.内部类.匿名内部类.Demo2;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}

```
```java
package itheima.AC练习.内部类.匿名内部类.Demo2;

public abstract class Animal {
    public abstract void eat();
}

```
<a name="M5aff"></a>
##### 匿名内部类的拓展应用
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711105821485-c4120ee6-caba-43fa-a011-9f5dd9408252.png#averageHue=%23fdfdfc&clientId=u1053d911-8fc4-4&from=paste&height=499&id=u922058b8&originHeight=998&originWidth=1124&originalType=binary&ratio=2&rotation=0&showTitle=false&size=237147&status=done&style=none&taskId=u72ee360c-9b81-411f-a745-350ccfc512a&title=&width=562)<br />拓展一<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711105882765-9ce60fec-abff-4af0-8232-06bbb7e49e74.png#averageHue=%23fdfdfd&clientId=u1053d911-8fc4-4&from=paste&height=312&id=u79c65db3&originHeight=624&originWidth=848&originalType=binary&ratio=2&rotation=0&showTitle=false&size=170029&status=done&style=none&taskId=u3d2aba64-40b8-450f-a211-66f6d3f1c01&title=&width=424)<br />拓展二<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711105942166-2d0e45dd-92a5-4394-a0bd-638e79be8937.png#averageHue=%23fdfcf9&clientId=u1053d911-8fc4-4&from=paste&height=213&id=u2e9f3544&originHeight=426&originWidth=952&originalType=binary&ratio=2&rotation=0&showTitle=false&size=105020&status=done&style=none&taskId=u79c3fb2c-bde4-47e7-925e-3e86751a786&title=&width=476)

<a name="fwMEf"></a>
# 数据库访问
单例访问，数据库访问池 pool
<a name="Su6Mg"></a>
#  API
<a name="jbJKo"></a>
## API 定义
Application Programming Interface ：应用程序编程接口<br />简单理解：API 就是别人已经写好的东西，不需要自己编写，直接调用即可<br />Java API ：JDK 中提供的各种功能的 Java 类
<a name="e93Mg"></a>
## Math
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711518486498-564e6047-c6fe-4f35-afae-d199a1b4dc15.png#averageHue=%23f4ebdb&clientId=u96fa91ff-d53b-4&from=paste&height=585&id=u85be167f&originHeight=1169&originWidth=2472&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1666750&status=done&style=none&taskId=ud6bbd431-b4cf-4a4f-9917-9f4c3d4285a&title=&width=1236)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711518649805-685899bc-1e66-4367-a3da-276ab1eba968.png#averageHue=%23edf3e8&clientId=u96fa91ff-d53b-4&from=paste&height=36&id=u9e156ca7&originHeight=72&originWidth=1274&originalType=binary&ratio=2&rotation=0&showTitle=false&size=87716&status=done&style=none&taskId=u86802b6c-ef73-4e63-b5e8-09a33cb50da&title=&width=637)
<a name="ckAZ3"></a>
## System
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711519039227-d4b8a595-7843-400e-89e8-2084bcf42dec.png#averageHue=%23f5f0e6&clientId=u96fa91ff-d53b-4&from=paste&height=470&id=u2b542e1c&originHeight=940&originWidth=2426&originalType=binary&ratio=2&rotation=0&showTitle=false&size=973481&status=done&style=none&taskId=u01f41a42-ba41-481f-a5a0-6d1f4b64c4b&title=&width=1213)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711519028570-729c22ab-56fc-4082-8f83-e56f59068570.png#averageHue=%23f6f0ef&clientId=u96fa91ff-d53b-4&from=paste&height=628&id=ud60a20f9&originHeight=1256&originWidth=2578&originalType=binary&ratio=2&rotation=0&showTitle=false&size=646150&status=done&style=none&taskId=u507a2541-59be-4105-afdd-ddb68fd2261&title=&width=1289)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711519274715-61e4cba5-f13c-4e35-b293-479a422bde00.png#averageHue=%23f5f4e8&clientId=u96fa91ff-d53b-4&from=paste&height=247&id=ud25b4a15&originHeight=494&originWidth=1056&originalType=binary&ratio=2&rotation=0&showTitle=false&size=371162&status=done&style=none&taskId=uc873aed6-6739-4441-9905-c895cd417d7&title=&width=528)
<a name="BzLTi"></a>
## Runtime 
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711519596892-af4508b9-69ac-4308-ae81-ae7a760834ad.png#averageHue=%23e2e0e0&clientId=u96fa91ff-d53b-4&from=paste&height=109&id=udf185830&originHeight=218&originWidth=994&originalType=binary&ratio=2&rotation=0&showTitle=false&size=56144&status=done&style=none&taskId=ubd7c3589-35d7-4566-8649-ed0dae2288f&title=&width=497)<br />此类方法不是静态的，需要创建对象，但是不能我们自己去创建对象，而是通过 getRuntime()方法获取<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711520011768-70e8ef76-f7a5-40db-8b69-e0774b1652b6.png#averageHue=%23f4eadb&clientId=u96fa91ff-d53b-4&from=paste&height=594&id=ud4823447&originHeight=1188&originWidth=2316&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1632263&status=done&style=none&taskId=ufbf3d49e-83bb-4ea9-ad23-ad24bbc904f&title=&width=1158)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711520305715-7fccfccc-1516-4dbc-9324-942d417b6148.png#averageHue=%23f7f8ef&clientId=u96fa91ff-d53b-4&from=paste&height=166&id=ue4844fc8&originHeight=332&originWidth=604&originalType=binary&ratio=2&rotation=0&showTitle=false&size=148449&status=done&style=none&taskId=udd30e8cd-59d4-46a9-9c79-d7aacf33983&title=&width=302)
<a name="BKCbY"></a>
## Object
<a name="KVfyE"></a>
### 常用方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711520718844-46182352-5e98-4655-9317-9e370c20544b.png#averageHue=%23f7f1e6&clientId=u96fa91ff-d53b-4&from=paste&height=431&id=u9cf540cd&originHeight=862&originWidth=2480&originalType=binary&ratio=2&rotation=0&showTitle=false&size=861848&status=done&style=none&taskId=u96fa4796-03e5-4c4b-91b7-3cc5bcbda6e&title=&width=1240)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711584213135-f943e7be-a5ae-4429-b1e2-e35d03811ed9.png#averageHue=%23fefefc&clientId=u73ed8dba-1539-4&from=paste&height=467&id=u1a033962&originHeight=933&originWidth=1375&originalType=binary&ratio=2&rotation=0&showTitle=false&size=694879&status=done&style=none&taskId=u4edeb17a-604f-4c7b-9fad-d3c1e173ce7&title=&width=687.5)<br />若想输出成员变量或比较成员变量，即原方法不能满足现在的需求，则重写该方法，toString 重写在 ptg 上可自动重写，equal 重写可点击右键找到 equal 和 hashcode 重写
<a name="ZlOWH"></a>
### equal
equal 方法在 Object 是比较地址值<br />在 String 中是先比较是否为字符串，如果是字符串，再比较内部属性，如果不是字符串，直接返回 false
<a name="bRnJw"></a>
### 对象克隆：Object 中的克隆是浅克隆
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711585287686-36c356c3-5997-4e8b-8ff1-c4e1fb784f1c.png#averageHue=%23e9e8e8&clientId=u73ed8dba-1539-4&from=paste&height=178&id=u8cb8b789&originHeight=356&originWidth=2017&originalType=binary&ratio=2&rotation=0&showTitle=false&size=135859&status=done&style=none&taskId=ub415d5b0-b609-4c30-8bec-9f450f68f31&title=&width=1008.5)<br />clone 不能直接调用，因为其底层是受保护的，只能在本类或者其他类的子类使用，但是我们无法在其本类 Object 使用，所以只能在 JavaBean 中重写其方法<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711586891782-24ffb3fd-6be5-40c9-9efd-b24ceb389058.png#averageHue=%23404044&clientId=u73ed8dba-1539-4&from=paste&height=178&id=u7ea633ec&originHeight=356&originWidth=1248&originalType=binary&ratio=2&rotation=0&showTitle=false&size=64723&status=done&style=none&taskId=u586d1754-cfe2-4500-abc8-5f3d955127d&title=&width=624)<br />还没完，还需要在 JavaBean 类实现一个标记性接口 cloneable ![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711585768998-eb8becde-1303-48c5-ab1d-254614aa5021.png#averageHue=%23f4f4e6&clientId=u73ed8dba-1539-4&from=paste&height=288&id=u3207a9c6&originHeight=575&originWidth=1076&originalType=binary&ratio=2&rotation=0&showTitle=false&size=374288&status=done&style=none&taskId=ua49f0fcb-0324-4877-b29d-3c9d821ea28&title=&width=538)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711588125364-d642d04d-9702-4ee8-bbb0-70d6d99b4050.png#averageHue=%23f9f8e8&clientId=u73ed8dba-1539-4&from=paste&height=154&id=udee51349&originHeight=308&originWidth=992&originalType=binary&ratio=2&rotation=0&showTitle=false&size=198553&status=done&style=none&taskId=u2f40c67b-76c9-4fc4-a1af-1316fb0bb31&title=&width=496)
<a name="sJUDt"></a>
### 浅克隆、浅拷贝
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711588294033-40ac7627-cfef-4271-8125-b63706c8032c.png#averageHue=%23c6d7c1&clientId=u73ed8dba-1539-4&from=paste&height=601&id=RPh8q&originHeight=1201&originWidth=2395&originalType=binary&ratio=2&rotation=0&showTitle=false&size=837241&status=done&style=none&taskId=u61ffddb5-a605-4713-a2c6-d3681eae153&title=&width=1197.5)
<a name="RSapG"></a>
### 深克隆、深拷贝	要想使用只能通过自己实现或使用第三方工具
<a name="Vz7ou"></a>
#### 定义
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711588660228-d2605a57-f574-473d-8071-a95dff7ae5e1.png#averageHue=%23ccdbc7&clientId=u73ed8dba-1539-4&from=paste&height=623&id=u6aec0bbb&originHeight=1245&originWidth=2313&originalType=binary&ratio=2&rotation=0&showTitle=false&size=863525&status=done&style=none&taskId=u5782377f-8b4b-409d-a91a-dd148bf3828&title=&width=1156.5)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711588773599-63234256-1af9-4f9d-aef4-a84d074c0bf4.png#averageHue=%23f7f6f6&clientId=u73ed8dba-1539-4&from=paste&height=563&id=HrfUb&originHeight=1125&originWidth=2504&originalType=binary&ratio=2&rotation=0&showTitle=false&size=571390&status=done&style=none&taskId=ued307795-679b-461a-85c1-38d37124231&title=&width=1252)
<a name="sJv8F"></a>
#### 自己实现：
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711588978575-65b3ca91-7e3d-4749-80ae-1853785c750a.png#averageHue=%23fdfdfb&clientId=u73ed8dba-1539-4&from=paste&height=465&id=kNsqT&originHeight=929&originWidth=1295&originalType=binary&ratio=2&rotation=0&showTitle=false&size=497371&status=done&style=none&taskId=u36e9c736-9f39-432d-91f9-3c6d3ea5e4d&title=&width=647.5)

<a name="LpAaR"></a>
#### 第三方工具实现深克隆
先创建 Gson 的对象<br />`Gson gson = new Gson();`<br />再把要克隆的对象 u1 变为字符串 s<br />`String s = gson.toJson(u1);`<br />再把字符串变为对象，方法会返回一个对象，只需设置变量接收即可<br />`User user = gson.fromJson(s,User.class);`
<a name="JBtT0"></a>
### Objects 工具类
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711874326660-867c70b1-1143-4c72-9c84-191aaafc31b9.png#averageHue=%23efe9df&clientId=ud31ce474-1db6-4&from=paste&height=445&id=u451dfd5c&originHeight=890&originWidth=2530&originalType=binary&ratio=2&rotation=0&showTitle=false&size=939282&status=done&style=none&taskId=u6aaf7ad4-e589-47ce-9b32-629729982d5&title=&width=1265)<br />！！！！！！！！！！！！！注意！！！！！！！！！！！！！<br />Object 的 equals 方法和 Objects.equals 方法不一样，前者可能出现空指针调用的问题，而后者则会先做非空判断<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711874784388-f8ad6cd6-f29b-48da-a861-eab31b200817.png#averageHue=%23303034&clientId=ud31ce474-1db6-4&from=paste&height=217&id=u0adcf945&originHeight=434&originWidth=1242&originalType=binary&ratio=2&rotation=0&showTitle=false&size=119258&status=done&style=none&taskId=u971ad282-b2cb-4078-a0df-8a80d278ddf&title=&width=621)
<a name="dU6qQ"></a>
## BigInteger（大的整数） 和 BigDecimal（大的小数）
<a name="j5oi7"></a>
### BigInteger
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712019718629-4ab53ab2-84e9-4ddd-a7a9-a39c75a444fb.png#averageHue=%23fcfafa&clientId=u66371417-999e-4&from=paste&height=671&id=u73fcb796&originHeight=1342&originWidth=2645&originalType=binary&ratio=2&rotation=0&showTitle=false&size=792093&status=done&style=none&taskId=u8aa4e8f3-5f81-4852-9fe5-83292c15d8c&title=&width=1322.5)
<a name="M5Qa1"></a>
#### BigInteger 创建对象
无限大的类型，但必须是整数<br />获取的数字在 long 之内，用第四个。比较大或不确定，用第二个<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711977362146-d132dbfa-5f12-48cf-b661-695a28d25cd9.png#averageHue=%23f1e6dd&clientId=uf02d173e-0004-4&from=paste&height=328&id=u712c2314&originHeight=1178&originWidth=2504&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1318105&status=done&style=none&taskId=ua5277589-c60a-4da5-94d1-1d1fafa302d&title=&width=698)<br />对象一旦创建，里面的数据不能发生改变👇
```
/对象一旦创建，里面的数据不能发生改变
BigInteger bi6 = BigInteger.valueOf(1);
BigInteger bi7 = BigInteger.valueOf(2);
BigInteger result = bi6.add(bi7);
System.out.println(result == bi6);//false
System.out.println(result == bi7);//false
//此时，不会修改参与计算的BIgInteger的值，而是会重新创建一个对象
```
例子：👇
```java
public static void main(String[] args) {
    Random r = new Random();
    //获取一个随机的大整数
    BigInteger bi = new BigInteger(4, r);

    System.out.println("获取一个随机的大整数："+bi);

    //获取一个指定的大整数
    BigInteger b2 = new BigInteger("1234567890000000000000000");

    System.out.println("获取一个指定的大整数："+b2);
}


/*输出：
获取一个随机的大整数：9
获取一个指定的大整数：1234567890000000000000000
*/
```

3 . 获取指定进制的大整数<br />细节：<br />（1）字符串中的数字必须是整数<br />（2）字符串中的数字必须要跟进制吻合，比如二进制中只能写 01，写其他的就报错<br />public biginteger(string val, int radix) 获取指定进制的大整数：👇<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711978917409-0526a946-c492-4c24-9d06-095160bdcc75.png#averageHue=%23e5ede1&clientId=uf02d173e-0004-4&from=paste&height=136&id=u75cd1ffa&originHeight=166&originWidth=706&originalType=binary&ratio=2&rotation=0&showTitle=false&size=117265&status=done&style=none&taskId=u04f23152-d089-49a2-82bc-d80d38f7e68&title=&width=578)<br />4 . 静态方法获取 BigInteger 的对象，内部有优化<br />细节<br />（1）能表示的范围很小，在 long 的取值范围之内，如果超出 long 的范围就不行了<br />验证：<br />查看 long 的取值范围：`System.out.println("long的最大值："+Long.MAX_VALUE);`<br />（2）在内部对数字 -16 ~ 16 进行了优化，提前把 -16 ~ 16 先创建好对象，如果多次调用获取不会创建新的对象<br />验证：
```
//验证-16~16的优化
BigInteger bi2 = BigInteger.valueOf(16);
BigInteger bi3 = BigInteger.valueOf(16);
System.out.println(bi2 == bi3);//true

BigInteger bi4 = BigInteger.valueOf(17);
BigInteger bi5 = BigInteger.valueOf(17);
System.out.println(bi4 == bi5);//false
```
<a name="XiuXu"></a>
#### BigBigInteger 常用方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712018134603-42dca372-5689-4ed0-bda4-a7d97d04cd71.png#averageHue=%23f4eadb&clientId=u66371417-999e-4&from=paste&height=705&id=OpNbH&originHeight=1410&originWidth=2616&originalType=binary&ratio=2&rotation=0&showTitle=false&size=2377793&status=done&style=none&taskId=u6f024aa8-9ea5-4d74-b170-a08110ceac4&title=&width=1308)
<a name="BBwLk"></a>
#### BigBigInteger 底层存储方式
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712019551526-c842313c-e6fc-4f9b-9bad-01692197583a.png#averageHue=%23f7f5f1&clientId=u66371417-999e-4&from=paste&height=668&id=u26fe96fa&originHeight=1336&originWidth=2698&originalType=binary&ratio=2&rotation=0&showTitle=false&size=647689&status=done&style=none&taskId=u926222bd-6083-47b1-af5c-650575ac096&title=&width=1349)<br />把一个数转为二进制的补码，定义一个变量存储符号（1 为正号，-1 为负号），然后定义一个数组， 32 位为一组存进数组中
<a name="eToZr"></a>
#### BigBigInteger 存储上限
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712019705102-bd5e9818-80ca-45df-8ad0-0820b2dde2a0.png#averageHue=%23f8f8f8&clientId=u66371417-999e-4&from=paste&height=565&id=u7f3cf49a&originHeight=1130&originWidth=2550&originalType=binary&ratio=2&rotation=0&showTitle=false&size=330770&status=done&style=none&taskId=u39186f32-d196-47e7-bd5c-4cabefb635f&title=&width=1275)
<a name="jB8gp"></a>
### BigDecimal
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712108833633-b8eb3da1-564b-4e37-adb7-b5ba52489858.png#averageHue=%23f7f5f5&clientId=ud02d463b-fa77-4&from=paste&height=704&id=uaef0eda5&originHeight=1408&originWidth=2710&originalType=binary&ratio=2&rotation=0&showTitle=false&size=684310&status=done&style=none&taskId=u8ab020aa-7e53-48ad-817e-35db8b3dfcd&title=&width=1355)
<a name="R4puS"></a>
#### 获取BigDecimal 的对象
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712104559176-5cb5dc94-4c2f-4de5-b3a3-33aefbf23943.png#averageHue=%23e4e3de&clientId=ud02d463b-fa77-4&from=paste&height=810&id=ua051689a&originHeight=1620&originWidth=2880&originalType=binary&ratio=2&rotation=0&showTitle=false&size=921528&status=done&style=none&taskId=ufc9781ca-2b0e-447a-96c1-7df0fd3769c&title=&width=1440)<br />使用构造方法 `BigDecimal(double val);	//不精确，不经常使用`

使用构造方法 `BigDecimal(String val);	//精确，常用	`若想获取的数字超出 double 范围，建议使用此构造方法

使用静态函数 `public static BigDecimal valueOf(double val)	//常用	`获取对象，若没有超出 double 范围，建议使用此方法，底层：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712106845445-695ff946-4576-4dad-bdb5-072aad36c2fc.png#averageHue=%23f5f2e5&clientId=ud02d463b-fa77-4&from=paste&height=199&id=ud480efdf&originHeight=398&originWidth=1272&originalType=binary&ratio=2&rotation=0&showTitle=false&size=288267&status=done&style=none&taskId=ufb626d40-8a18-4491-ac1c-59e7ab82fef&title=&width=636)<br />细节：在👇<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712107212408-f8ddba65-b951-486d-90d0-e67e958c16e6.png#averageHue=%23323337&clientId=ud02d463b-fa77-4&from=paste&height=230&id=u85681213&originHeight=460&originWidth=1420&originalType=binary&ratio=2&rotation=0&showTitle=false&size=138306&status=done&style=none&taskId=u58b230b5-6820-45e1-a1df-cd5c4471273&title=&width=710)<br />跟进数组ZERO_THROUGH_TEN  可知：![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712107266069-9493836d-105a-4915-b9cc-18d4ff9be74d.png#averageHue=%233f4044&clientId=ud02d463b-fa77-4&from=paste&height=414&id=P1Eqz&originHeight=828&originWidth=1474&originalType=binary&ratio=2&rotation=0&showTitle=false&size=330536&status=done&style=none&taskId=u46d98dae-eb2b-47f0-9ab9-b2cbf274360&title=&width=737)<br />如果我们传递的是 0~10 之间的整数，包含 0 和 10， 那么方法会返回已经提前创建好的对象，不会重新 new。若为 1.0 或 2.0 等等的小数，即使其整数部分在 0~10 区间内，但因为类型是 double，而 double 是直接 new 的
<a name="hdLzL"></a>
#### BigDecimal 的成员方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712108047937-79ab7c8a-fe12-4e29-936b-bf86231592a0.png#averageHue=%23f0eade&clientId=ud02d463b-fa77-4&from=paste&height=327&id=udc109f71&originHeight=653&originWidth=1492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=405731&status=done&style=none&taskId=u08d81125-af80-4aea-9926-e3661bc42fc&title=&width=746)<br />更多舍入模式： <br />UP：远离 0<br />DOWN：向 0<br />CEILING：向正无限大（向上取整）<br />FLOOR：向负无穷大（向下取整）<br />HALF_UP：距离相等，向上舍入<br />HALF_DOWN：距离相等，向下舍入<br /> 
<a name="agEZt"></a>
#### BigDecimal 底层存储方式
底层并不是分段存储，因为如果小数过大，分段存储也不合适，效率低<br />而是将存储小数的字符串进行遍历，然后转为 ASCII 码存储到数组中，数组位数就是小数的位数，符号也存为 ASCII 码，正号不存	![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712108730072-1ac25c44-09e2-46e2-894c-6f3e881aeb6c.png#averageHue=%23f9f9f7&clientId=ud02d463b-fa77-4&from=paste&height=621&id=ufed12195&originHeight=1242&originWidth=2722&originalType=binary&ratio=2&rotation=0&showTitle=false&size=441989&status=done&style=none&taskId=u07dd1265-fa26-43e3-8450-d22c9ff37b1&title=&width=1361) 

<a name="d49mg"></a>
## 正则表达式 	帮助文档搜 pattern
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712207249943-ebfb6ce5-9e7c-4ff5-8887-84cc4677ce02.png#averageHue=%23dce3d1&clientId=u94140222-2870-4&from=paste&height=740&id=u85945d7c&originHeight=1480&originWidth=2569&originalType=binary&ratio=2&rotation=0&showTitle=false&size=811077&status=done&style=none&taskId=uce280b2a-732f-464a-8be1-bca14f9690f&title=&width=1284.5)


![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712207304440-469a5895-229f-4e85-8295-4028501b5e85.png#averageHue=%23f2f5eb&clientId=u94140222-2870-4&from=paste&height=509&id=u7035f359&originHeight=1018&originWidth=2528&originalType=binary&ratio=2&rotation=0&showTitle=false&size=411018&status=done&style=none&taskId=u2edf17f8-f9f0-48cc-872d-1d3742689d2&title=&width=1264)


![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712219572191-e4becacf-58b2-4cd1-8d3d-4d5f6d8ff203.png#averageHue=%23f9f7f7&clientId=ucf86e06e-a802-4&from=paste&height=650&id=u7dc8ba71&originHeight=1300&originWidth=2680&originalType=binary&ratio=2&rotation=0&showTitle=false&size=663180&status=done&style=none&taskId=u1a4d5926-31e2-4794-8b0c-e4562a56a37&title=&width=1340)
<a name="JznLJ"></a>
### 体验正则表达式
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712109643468-a5e3e2a5-a94f-4f14-8378-f5a5b3210954.png#averageHue=%23f7f7f5&clientId=ud02d463b-fa77-4&from=paste&height=320&id=uac50daad&originHeight=640&originWidth=1104&originalType=binary&ratio=2&rotation=0&showTitle=false&size=340394&status=done&style=none&taskId=ufb2520b5-c147-4f5f-9785-61ec419a279&title=&width=552)

<a name="TSTqw"></a>
### 正则表达式的作用
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712137716523-43702089-e12a-46a1-ac14-d4fce98ef68b.png#averageHue=%23f4ebea&clientId=ud02d463b-fa77-4&from=paste&height=286&id=u86ba417a&originHeight=572&originWidth=1366&originalType=binary&ratio=2&rotation=0&showTitle=false&size=161001&status=done&style=none&taskId=ub1f9b8ac-0b45-43d9-8386-1bfd7920e6b&title=&width=683)
<a name="tS57z"></a>
### 正则表达式的使用
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712140361832-7f6a724b-6c65-4efd-bee9-3c83bdaf1ef8.png#averageHue=%23f3edd7&clientId=ud02d463b-fa77-4&from=paste&height=625&id=uf8f55827&originHeight=1250&originWidth=2446&originalType=binary&ratio=2&rotation=0&showTitle=false&size=906446&status=done&style=none&taskId=u69d93108-d3ed-412f-83a9-3517e3000c4&title=&width=1223)注意：<br />1 .  正则表达式中[a-dm-p]和 [a-d[m-p]]有区别吗？没有区别<br />2 . 若&&写为&，则表示“且”这个符号，及和字母一样是否在字符串中，意思就是吧&当成一个要匹配的符号了<br />3 . digit数字 space空白 word单词<br />4 . 转义字符 \ <br />5 . 注意多处只匹配一个字符<br />6 . 在 java 中，\\ 表示 \，即转义字符转义了转义字符，所以预定义字符也是需要再加一个 \

易错题：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712138156057-9341b32a-7e79-491a-a5d5-6150ef624a8c.png#averageHue=%23ececd9&clientId=ud02d463b-fa77-4&from=paste&height=47&id=u96f08914&originHeight=88&originWidth=1152&originalType=binary&ratio=2&rotation=0&showTitle=false&size=117462&status=done&style=none&taskId=u97c6efa6-77cb-4536-8263-39193e419ee&title=&width=609)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712138198465-833a72d7-8bf9-4d89-a199-dbb06edb0712.png#averageHue=%23ebf0e1&clientId=ud02d463b-fa77-4&from=paste&height=57&id=u2f36c856&originHeight=114&originWidth=1106&originalType=binary&ratio=2&rotation=0&showTitle=false&size=122390&status=done&style=none&taskId=u645d1245-0e9e-40e4-8a9c-cc2084fe268&title=&width=553)

忽略大小写的方式：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712200846173-c47f5435-eec6-4b0b-aad0-5e996604cd9b.png#averageHue=%23e6ede0&clientId=u94140222-2870-4&from=paste&height=115&id=u3a1b8f94&originHeight=138&originWidth=534&originalType=binary&ratio=2&rotation=0&showTitle=false&size=80851&status=done&style=none&taskId=u487718d3-78e3-4a04-9e4c-246a7e437bf&title=&width=444)<br />（？i）只会忽略其后面的

<a name="cdj0y"></a>
### 例题
```java
package 练习.正则表达式;

public class Test2 {
    public static void main(String[] args) {
        //验证用户名
        //要求：大小写字母，数字，下划线一共4-16位
        //请编写正则表达式验证身份证号码是否满足要求。
        String regex1 = "\\w+{4,16}";

        //验证身份证
        //简单要求：18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
        //复杂要求：按照身份证号码的格式严格要求。
        String regex2 = "\\d{17}(\\d|X|x)";
        String regex3 = "\\d{17}[\\dXx]";
        String regex4 = "\\d{17}[\\d(?i)x]";
        String regex5 = "\\d{17}(\\d|(?i)x)";
        System.out.println("370702200502224234".matches(regex2));
        System.out.println("370702200502224234".matches(regex3));
        System.out.println("370702200502224234".matches(regex4));
        System.out.println("370702200502224234".matches(regex5));

        //严格验证
        //3 70702 2005 02 22 4234
        //前面6位：省份，市区，派出所等信息 第一位不能是0，后面5位是任意数字    [1-9]\d{5} √
        // 年的前半段18 19 20                                           (1[89]|20)  √
        // 年的后半段是任意数字出现两次                                    \\d{2} √
        // 月份：01~09 10 11 12                                         (0\d|1[012])   √
        // 日期：01~31                                                  ([01]\\d|3[01]) √
        //后面四位：任意数字出现三次，最后一位是数字或x或X                    \d{3}[\\d(?i)x]  √
        //        String regex6 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[012])  (0[1-9]|[12]\\d|\\d3[01])  \\d{3}[\\d(?i)x]";
        //        System.out.println("regex6:"+"370702200502224234".matches(regex6));
        String regex7 = "[1-9]\\d{5}(1[89]|20)\\d{2}(0\\d|1[012])([012]\\d|3[01])\\d{3}[\\dx]";
        System.out.println("regex7:" + "370702200502224234".matches(regex7));
    }
}
```
<a name="fb8Ba"></a>
### 爬虫
<a name="C1PKl"></a>
#### 本地爬取
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712207401444-0f65d57f-1f77-4e66-8b57-902cd564beca.png#averageHue=%23f7f5f5&clientId=u94140222-2870-4&from=paste&height=413&id=ucaa1f0ec&originHeight=826&originWidth=2462&originalType=binary&ratio=2&rotation=0&showTitle=false&size=337737&status=done&style=none&taskId=uad92b688-3185-4b2b-bc34-ed0b6e00bbe&title=&width=1231)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712207830179-11c303fd-d162-443b-9537-32fc7e17553c.png#averageHue=%23e8e6e3&clientId=u94140222-2870-4&from=paste&height=65&id=u26c9d4b3&originHeight=130&originWidth=580&originalType=binary&ratio=2&rotation=0&showTitle=false&size=47013&status=done&style=none&taskId=u84b94a3d-b7ad-476b-8d7c-b40d94d402f&title=&width=290)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712207853212-97576aee-2212-474d-823b-15b9328a150f.png#averageHue=%23f7f9f2&clientId=u94140222-2870-4&from=paste&height=86&id=ua9772ad0&originHeight=172&originWidth=1154&originalType=binary&ratio=2&rotation=0&showTitle=false&size=132753&status=done&style=none&taskId=u555cdf71-bd55-49bb-838a-4a9e52d35ed&title=&width=577)
> 用到方法介绍：
> 1. `Pattern 正则表达式对象名 = Pattern.compile("正则表达式")`会根据括号里写的正则表达式返回一个该正则表达式的 Pattern 的对象，类似于规则
> 2. `Matcher 文本匹配器对象名 = 正则表达式的对象.matcher(大串)`会根据正则表达式创建并返回一个该正则表达式的文本匹配的 Matcher 对象
> 3. `Boolean 布尔类型变量名 = 文本匹配器的对象.find()`会根据规则进行查找，成功返回 true 并记录其查找到的第一个的开始索引和第一个的结束索引+1，以便于后续使用 subString（起始索引，终止索引） 进行字符串切割，subString 方法包头不包尾
> 4. `Stirng 字符串名 = 文本匹配器的对象.group()`该方法在底层会使用 subString 进行切割并返回切割出的字符串


> 1. 创建正则表达式对象：`Pattern p = Pattern.compile("正则表达式");`
> 2. 创建文本匹配器对象：`Matcher m = p.mahcer(大串);`	//拿着文本匹配器的对象在大串中从头开始读取，寻找符合正则表达式规则的子串	
> 3. 循环{	`while(m.find()){`	//find 会继续查找下一个，而非一直查找一个
>    1. 截取并接收子串：	`String s = m.group;`
>    2. 打印：			`sout(s);`
> 
}		`}`


```java
package 练习.正则表达式.爬虫;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    /*
    有如下文本，请按照要求爬取数据。
Java 自从95年问世以来，经历了很多版本，目前企业中用的最多的是java8和java11,因为这
两个是长期支持版本，下一个长期支持版本是laval7,相信在未来不久laval7也会逐新登上历史舞台
要求：找出里面所有的javaxx
     */
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11," +
        "因为这两个是长期支持版本，下一个长期支持版本是Java7,相信在未来不久Java7也会逐新登上历史舞台";

        //pattern：表示正则表达式
        //Matcher：文本匹配器，作用是按照正则表达式的规则去读取字符串，从头开始读取
        //在大串中去寻找符合匹配规则的子串

        //        method1(str);



        //1.获取正则表达式的对象
        Pattern p = Pattern.compile("(?i)java\\d{0,2}");
        //2.获取文本匹配器的对象
        //拿着m去找str中符合p规则的子串
        Matcher m = p.matcher(str);
        //3。利用循环
        while(m.find()){
            String s = m.group();
            System.out.println(s);
        }

    }

    private static void method1(String str) {
        //获取正则表达式的对象
        Pattern p = Pattern.compile("(?i)java\\d{0,2}");
        //获取文本匹配器的对象
        //m：文本匹配器的对象
        //p：规则（正则表达式的对象）
        //str：大串
        //m要在str中去找符合p规则的小串
        Matcher m = p.matcher(str);

        //拿着文本匹配器从头开始读取，寻找是否有满足规则的子串
        //如果没有，返回false
        //如果有，返回true。在底层记录子串的起始索引和结束索引+1
        //eg:记录开头的java，则会记录0,4
        boolean b = m.find();

        //方法底层会根据find方法记录的字符串索引进行截取
        //subString(起始索引，结束索引); 包头不包尾
        //(0,4)但是不包含4索引
        //会把截取完的小串进行返回
        String s1 = m.group();
        System.out.println(s1);

        //第二次调用find方法的时候，会继续读取后面的内容
        //读取到第二个满足的子串，方法会继续返回true
        //并把第二个子串的起始索引和结束索引+1，进行记录
        b = m.find();

        //第二次调用group方法的时候，会根据find方法记录的索引进行截取
        String s2 = m.group();
        System.out.println(s2);
    }
}
```
<a name="HovsG"></a>
#### 网络爬取
```java
package 练习.正则表达式.爬虫;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo2网络爬取 {
    public static void main(String[] args) throws IOException {
        //创建URL的对象
        URL ur1 = new URL("https://m.sengzan.com/jiaoyu/29104.html?ivk_sa=1025883i");
        //连接上这个网址
        URLConnection conn = ur1.openConnection();
        //创建一个对象去读取网络中的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        //获取正则表达式的对象
        String regex = "[1-9]\\d{17}";
        Pattern p = Pattern.compile(regex);
        //在读取的时候每次读取一整行
        while ((line = br.readLine()) != null) {
            Matcher macher = p.matcher(line);
            while (macher.find()) {
                System.out.println(line);
            }
        }
        br.close();
    }
}
```
<a name="tVsUL"></a>
#### 常用正则表达式
> 手机号码	`1[3-9]\\d{9}`
> 邮箱		`\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-z]{2,3}){1,2}`
> 座机		`0\\d{2,3}-?[1-9]\\d{4,9}`
> 热线电话	`400-?\\d{3}-?\\d{4}`

<a name="OTzma"></a>
#### 条件爬取	含非捕获分组
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712216117662-a7e20ac4-c5d8-4571-a230-668b229ce1e2.png#averageHue=%23f3f1f1&clientId=ucf86e06e-a802-4&from=paste&height=523&id=u4ab9748f&originHeight=1046&originWidth=2604&originalType=binary&ratio=2&rotation=0&showTitle=false&size=567487&status=done&style=none&taskId=u38f24047-2ec4-4f48-a220-5a12db03023&title=&width=1302)

1. `？=`	`String redex1 = "(?i)java(?=8|11|17)";//爬取 java8 或 java11 或 java17，记录 java 不记录数字`

其中的问号 ？可以理解为等同于前面文字的一个占位符，而？后面的=，则为拼接的哪些东西。但是在获取的时候，只获取前半部分，即只打印 java，不打印后面的数字

2. `？：`	`String redex3 = "((?i)java)(?:8|11|17)";//记录 java8 或 java11 或 java17`其中的冒号 ：代表获取的时候获取整体
3. `？！`	`String redex4 = "((?i)java)(?!8|11|17)";//记录 java8 或 java11 或 java17 以外的 java 或 java 数字`

```java
package 练习.正则表达式.有条件的爬取;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo1 {
    /*
    有如下文本，请按照要求爬取数据。
Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11,因为这两个是长
期支持版本，下一个长期支持版本是Java17.相信在未来不久Java17也会逐渐登上历史舞台
需求1:爬取版本号为8,11,17的Java文本，但是只要Java不显示版本号。
需求2:爬取版本号为8,11,17的Java文本。正确爬取结果为：Java8 Java11 Java17 Java17
需求3:爬取除了版本号为8,11,17的Java文本，
     */

    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11,因为这两个是长\n" +
        "期支持版本，下一个长期支持版本是Java17.相信在未来不久Java17也会逐渐登上历史舞台";

        //需求1:爬取版本号为8,11,17的Java文本，但是只要Java不显示版本号。
        //?可以理解为前面的数据Java
        //=表示在Java后面要跟随的数据，但是在获取的时候，只获取前半部分
        String redex1 = "((?i)java)(?=8|11|17)";
        Pattern p1 = Pattern.compile(redex1);
        Matcher m1 = p1.matcher(str);
        while(m1.find()){
            String s1 = m1.group();
            System.out.println(s1);
        }

        System.out.println("=============================");

        //        需求2:爬取版本号为8,11,17的Java文本。正确爬取结果为：Java8 Java11 Java17 Java17
        String redex2 = "((?i)java)(8|11|17)";
        Pattern p2 = Pattern.compile(redex2);
        Matcher m2 = p2.matcher(str);
        while(m2.find()){
            String s2 = m2.group();
            System.out.println(s2);
        }

        System.out.println("=============================");

        String redex3 = "((?i)java)(?:8|11|17)";
        Pattern p3 = Pattern.compile(redex3);
        Matcher m3 = p3.matcher(str);
        while(m3.find()){
            String s3= m3.group();
            System.out.println(s3);
        }

        System.out.println("=============================");

        //        需求3:爬取除了版本号为8,11,17的Java文本，

        String redex4 = "((?i)java)(?!8|11|17)";
        Pattern p4 = Pattern.compile(redex4);
        Matcher m4 = p4.matcher(str);
        while(m4.find()){
            String s4= m4.group();
            System.out.println(s4);
        }

    }
}
```
<a name="uWHeL"></a>
#### 贪婪爬取和非贪婪爬取
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712216104827-64427f86-c096-404e-944c-ee0fb29fa057.png#averageHue=%23f6f4f4&clientId=ucf86e06e-a802-4&from=paste&height=525&id=u2f09851e&originHeight=1050&originWidth=2526&originalType=binary&ratio=2&rotation=0&showTitle=false&size=511280&status=done&style=none&taskId=u45c2de36-ff33-492b-a76d-4c9c791b440&title=&width=1263)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712216270189-c5e3d913-fd4f-4127-ae09-14b2d233973b.png#averageHue=%23fefefb&clientId=ucf86e06e-a802-4&from=paste&height=285&id=uf741815d&originHeight=570&originWidth=814&originalType=binary&ratio=2&rotation=0&showTitle=false&size=228252&status=done&style=none&taskId=u7072aff1-718e-489f-b4ef-c97653254df&title=&width=407)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712216295857-bc1fdcab-4dd6-4c4e-bdfa-f42880ea4c5a.png#averageHue=%23f7f9f0&clientId=ucf86e06e-a802-4&from=paste&height=69&id=u7afbc5f0&originHeight=138&originWidth=988&originalType=binary&ratio=2&rotation=0&showTitle=false&size=97852&status=done&style=none&taskId=ue4c660a9-6c74-459f-a31f-98107f4fe06&title=&width=494)
> 1. 贪婪爬取（默认），正则表达式：`ab+`
> 2. 非贪婪爬取，正则表达式`ab+?`	//后面加个问号，如+？或 *？


![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712216656534-b9ba32ff-0c88-431e-beb1-1a1b2429e4d7.png#averageHue=%2337373b&clientId=ucf86e06e-a802-4&from=paste&height=724&id=u3a644fe1&originHeight=1448&originWidth=1858&originalType=binary&ratio=2&rotation=0&showTitle=false&size=421634&status=done&style=none&taskId=u0c37c769-80be-47b2-8922-d2afca3ec59&title=&width=929)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712216669914-61c3f956-6814-44c6-9cf9-013230b2e344.png#averageHue=%23454649&clientId=ucf86e06e-a802-4&from=paste&height=330&id=u0f91c46d&originHeight=424&originWidth=706&originalType=binary&ratio=2&rotation=0&showTitle=false&size=28393&status=done&style=none&taskId=u9349e138-1b59-4423-9586-28389ec7565&title=&width=550)
<a name="MejWW"></a>
### 正则表达式在字符串方法中的使用
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712216829039-ac064758-239b-49ee-bcdc-29b8c5972782.png#averageHue=%23f6efe4&clientId=ucf86e06e-a802-4&from=paste&height=465&id=ud5ac33dc&originHeight=930&originWidth=2686&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1113543&status=done&style=none&taskId=u7d74fd87-8653-4c73-988c-e8714f58a61&title=&width=1343)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712217112741-3251eac0-366b-4731-a149-6622e014daba.png#averageHue=%23fcfcfb&clientId=ucf86e06e-a802-4&from=paste&height=601&id=u61827a7b&originHeight=1202&originWidth=1934&originalType=binary&ratio=2&rotation=0&showTitle=false&size=975667&status=done&style=none&taskId=u5dc087d4-f201-430e-a9a8-ab28566670a&title=&width=967)
<a name="AdqB6"></a>
### 分组
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712219333254-0afe6e50-9948-4603-8449-0def5b79d641.png#averageHue=%23faf9f8&clientId=ucf86e06e-a802-4&from=paste&height=802&id=ufc6ddd0c&originHeight=1603&originWidth=2859&originalType=binary&ratio=2&rotation=0&showTitle=false&size=852252&status=done&style=none&taskId=u96973d33-b6d6-47c1-b6a0-5b8fe8540ee&title=&width=1429.5)
<a name="Vh5nx"></a>
#### 定义
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712217308550-5aa98696-1641-46a8-96f6-914cb7c8f327.png#averageHue=%23f7f4e9&clientId=ucf86e06e-a802-4&from=paste&height=791&id=uaa1731ae&originHeight=1582&originWidth=2871&originalType=binary&ratio=2&rotation=0&showTitle=false&size=930379&status=done&style=none&taskId=u19856843-b4ce-4b2b-b586-f2507520e47&title=&width=1435.5)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712217389865-40553079-5e7b-4eec-9613-5d56743fb0b4.png#averageHue=%23f7f3e6&clientId=ucf86e06e-a802-4&from=paste&height=756&id=ub1bc439e&originHeight=1511&originWidth=2791&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1029131&status=done&style=none&taskId=uf910c742-a5ee-4402-8833-f2f8a367d00&title=&width=1395.5)
<a name="U2MsT"></a>
#### 捕获分组（正则内部）例题及使用
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712217435664-8ec5517c-6f6e-4789-8e9b-21ab681a26b5.png#averageHue=%23f9f8f8&clientId=ucf86e06e-a802-4&from=paste&height=810&id=ud477b653&originHeight=1619&originWidth=2837&originalType=binary&ratio=2&rotation=0&showTitle=false&size=865768&status=done&style=none&taskId=ue3c48a93-b412-405b-8c75-48a5fbf4c5e&title=&width=1418.5)
> 1. `\\ 组号`	表示把第 x 组的内容拿出来再用一次，eg：`\\1 	//即把第 1 组的内容拿出来再用一次`
> 2. `String redex2 = "(.+).+\\1";`
> 
`(.+)：任意字符出现一或多次`
> 3. `String redex3 = "((.)\\1*).+\\2";`	难！！！！！！
> 
`*出现0或多次，控制\\1出现的次数，而\\1指的是第一个字符，即与第一个字符一致`
> `(.)：任意一个字母看为一组并固定`
> `\\1：与第一组一致`
> `*控制\\1出现的次数为0或无数次`
> `\\2：指的是((.)\1*)`


```java
package 练习.正则表达式.分组;

public class 捕获分组的练习 {
    public static void main(String[] args) {
        //需求1:判断一个字符串的开始字符和结束字符是否一致？只考虑一个字符
        //举例：a123a b456b 17891 &abc&
        String redex1 = "(.).+\\1";
        System.out.println("a123a".matches(redex1));
        System.out.println("b456b".matches(redex1));
        System.out.println("17891".matches(redex1));
        System.out.println("&abc&".matches(redex1));
        System.out.println("&abc".matches(redex1));

        System.out.println("====================================");

        //需求2:判断一个字符串的开始部分和结束部分是否一致？可以有多个字符
        //举例：abc123abc b456b 123789123 &!@abc&!@   abc123abd(false)
        String redex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(redex2));
        System.out.println("b456b".matches(redex2));
        System.out.println("123789123".matches(redex2));
        System.out.println("&!@abc&!@".matches(redex2));
        System.out.println("abc123abd".matches(redex2));

        System.out.println("====================================");

        //需求3：判断一个字符串的开始部分和结束部分是否一致？开始部分内部每个字符也需要一致
        //举例： aal23aaa bbb456bbbb 111789111 &&abc&&
        //* 出现0或多次，控制\\1出现的次数，而\\1指的是第一个字符，即与第一个字符一致
        //(.)：任意一个字母看为一组并固定
        //\\1：与第一组一致
        //*控制\\1出现的次数为0或无数次
        //\\2：指的是((.)\1*)
        String redex3 = "((.)\\1*).+\\2";
        System.out.println("aal23aaa".matches(redex3));//true
        System.out.println("bbb456bbbb".matches(redex3));//true
        System.out.println("111789111".matches(redex3));//true
        System.out.println("&&abc&&".matches(redex3));//true
        System.out.println("&&abc".matches(redex3));//false

    }
}
```
<a name="G9cGD"></a>
#### 捕获分组（正则外部）及例题
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712218781291-80d1c10c-c013-48bd-8410-5703e5301a84.png#averageHue=%23fcfcfc&clientId=ucf86e06e-a802-4&from=paste&height=768&id=u4e63d621&originHeight=1536&originWidth=2796&originalType=binary&ratio=2&rotation=0&showTitle=false&size=323421&status=done&style=none&taskId=ueadd8415-aaba-4425-99c8-bc435d327cc&title=&width=1398)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712218811372-d3a922d0-8a07-422b-9e82-80e8f081bbcc.png#averageHue=%23fcfcfc&clientId=ucf86e06e-a802-4&from=paste&height=799&id=u95ad93e0&originHeight=1597&originWidth=2879&originalType=binary&ratio=2&rotation=0&showTitle=false&size=422677&status=done&style=none&taskId=u403e3553-e3c9-4d5f-b967-c52d0e9d848&title=&width=1439.5)

> `String str = "我要学学编编编程程程程程程程";`解释如下：
> `(.)：重复内容的第一个字符`
> `\\1+：重复内容多次出现`
> `$1：把正则表达式第一组的内容拿出来再一次用，因为他是外部的，所以不用\\而用$`


```java
package 练习.正则表达式.分组;

public class 正则外部捕获分组 {
    public static void main(String[] args) {
        /*
        练习 口吃替换
        需求：
        将字符串：我要学学编编编程程程程程程程
        替换为：我要学编程
         */
        String str = "我要学学编编编程程程程程程程";
        //(.)：重复内容的第一个字符
        //\\1+：重复内容多次出现
        //$1：把正则表达式第一组的内容拿出来再一次用，因为他是外部的，所以不用\\而用$
        String s = str.replaceAll("(.)\\1+", "$1");
        System.out.println(s);

    }
}
```
<a name="FqhDy"></a>
#### 非捕获分组 ( ? = )  ( ? : )  ( ? ! ) 	不占用组号
<a name="IIrtw"></a>
## JDK7 以前时间相关类
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712280882564-1e9a8efe-7bf0-4893-8ca4-6e14620e20a5.png#averageHue=%23f3e6e5&clientId=ue019e39b-d4c8-4&from=paste&height=411&id=u2ea33108&originHeight=822&originWidth=1134&originalType=binary&ratio=2&rotation=0&showTitle=false&size=196508&status=done&style=none&taskId=ube84ef6a-9205-4e3f-a9ba-c7ef361b153&title=&width=567)

<a name="pehrn"></a>
### 时间的相关知识点
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712281046971-55e2bb95-0fce-4550-b533-fdc4e9c65530.png#averageHue=%23f8f3f3&clientId=ue019e39b-d4c8-4&from=paste&height=745&id=ucd19cfa8&originHeight=1490&originWidth=2678&originalType=binary&ratio=2&rotation=0&showTitle=false&size=576534&status=done&style=none&taskId=u51c08086-8e65-4601-9d7e-54aa015c533&title=&width=1339)

<a name="TZqXA"></a>
### Date 类
> public date() 		创建date对象，表示当前时间
> public date(long date)		 创建date对象，表示指定时间
> public void settime(long time)		 设置/修改毫秒值
> public long gettime()		 获取时间对象的毫秒值
> ![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712288737667-65878185-49b9-4e2b-ace2-f532e53e4afb.png#averageHue=%23f9f7f7&clientId=ue019e39b-d4c8-4&from=paste&height=565&id=u44c82e3d&originHeight=1130&originWidth=2474&originalType=binary&ratio=2&rotation=0&showTitle=false&size=435649&status=done&style=none&taskId=u51df95b5-e491-42a7-a3a2-19fec980a16&title=&width=1237)


eg:
```java

package 练习.时间;

import java.util.Date;

public class 时间计算 {
    public static void main(String[] args) {
        /*
       public date() 创建date对象，表示当前时间
    public date(long date) 创建date对象，表示指定时间
    public void settime(long time) 设置/修改毫秒值
    public long gettime() 获取时间对象的毫秒值
        */
        Date d1 = new Date();
        System.out.println(d1);//打印的是系统当前时间
        System.out.println(d1.getTime());//打印的是系统当前时间的毫秒

        System.out.println("=====================");

        Date d2 = new Date(0L);//创建指定时间的对象，单位是毫秒
        System.out.println(d2);//打印的是1970.1.1 周四8:00
        System.out.println(d2.getTime());//打印的是1970.1.1 周四8:00距指定时间的毫秒值
        d2.setTime(1000L);//设置毫秒值
        System.out.println(d2);//打印修改后毫秒值的时间（在1970.1.1 周四8:00上叠加）
        System.out.println(d2.getTime());//打印距离1970.1.1 周四8:00的时间的毫秒


    }
}
```

<a name="uXrkt"></a>
### SimpleDateFormat
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712303099075-8e45d65a-be21-41e6-98de-9702416f186d.png#averageHue=%23faf8f8&clientId=ue019e39b-d4c8-4&from=paste&height=493&id=uc5ed6707&originHeight=986&originWidth=2332&originalType=binary&ratio=2&rotation=0&showTitle=false&size=279420&status=done&style=none&taskId=uba5f2a60-e3aa-46d1-8ff6-fe27c00609f&title=&width=1166)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712288866747-b0884214-b47b-4347-a675-d6b31a0bdfa8.png#averageHue=%23f5f5f2&clientId=ue019e39b-d4c8-4&from=paste&height=482&id=u0d25879e&originHeight=964&originWidth=2502&originalType=binary&ratio=2&rotation=0&showTitle=false&size=392701&status=done&style=none&taskId=ub5d61d38-3e53-493c-8234-ae7ce07c23c&title=&width=1251)

 ![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712301006237-e71f29fa-8671-421b-abba-6da9bdfd5dfe.png#averageHue=%23f6efe4&clientId=ue019e39b-d4c8-4&from=paste&height=583&id=ueb4d3741&originHeight=1166&originWidth=2544&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1303389&status=done&style=none&taskId=uc344cdcc-84b2-4f38-a9e5-21fa5c4c5b9&title=&width=1272)


![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712300777214-f6806770-b421-4e27-9294-0d970b749cba.png#averageHue=%23eeefed&clientId=ue019e39b-d4c8-4&from=paste&height=626&id=ue59a9988&originHeight=1252&originWidth=2036&originalType=binary&ratio=2&rotation=0&showTitle=false&size=961632&status=done&style=none&taskId=u5d37d33b-72ed-4171-988e-aa439d7a460&title=&width=1018)
```java
package 练习.时间;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*将字符串2000-11-11转为2000年11月11日表示*/

public class Test1 {
    public static void main(String[] args) throws ParseException {
        String str = "2000-11-11";
        //解析
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");//根据字符串写
        Date date = sdf1.parse(str);
        System.out.println(date); 
        //格式化
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");//根据想要的格式写
        String string = sdf2.format(date);
        System.out.println(string);

    }
}
```
<a name="RYxvE"></a>
### Calendar		获取对象不能 new，而用 getInstance()	
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712326132347-db48a5cb-bd1e-424c-a909-a802048bad35.png#averageHue=%23faf8f8&clientId=uf60f9a4e-64cc-4&from=paste&height=608&id=ueb3f30ff&originHeight=1216&originWidth=2614&originalType=binary&ratio=2&rotation=0&showTitle=false&size=610100&status=done&style=none&taskId=ub9b9c59e-51cc-4989-bccb-1e2bd549a17&title=&width=1307)


![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712303203947-4742da50-9f17-4f9c-a380-2ca14a0ba66e.png#averageHue=%23f2e5e4&clientId=ue019e39b-d4c8-4&from=paste&height=516&id=ua4a89f77&originHeight=1032&originWidth=2282&originalType=binary&ratio=2&rotation=0&showTitle=false&size=374340&status=done&style=none&taskId=u06fb47e9-ba03-464b-b707-b05175aaea8&title=&width=1141)


![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712303225155-434a6dc0-6f64-49c7-8b1c-c1b2c2ffb62c.png#averageHue=%23ece1e1&clientId=ue019e39b-d4c8-4&from=paste&height=629&id=ufc916f1a&originHeight=1258&originWidth=2570&originalType=binary&ratio=2&rotation=0&showTitle=false&size=546661&status=done&style=none&taskId=ub7bdce43-1588-4373-b369-feda77b55d1&title=&width=1285)

public final date gettime() 获取日期对象 的细节：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712303917597-0145e98f-89ab-4c67-83e7-323a1865aa7b.png#averageHue=%23fefefe&clientId=ue019e39b-d4c8-4&from=paste&height=171&id=u6822596f&originHeight=452&originWidth=1676&originalType=binary&ratio=2&rotation=0&showTitle=false&size=401051&status=done&style=none&taskId=uddbac3ff-5bba-44c4-be11-ec9461abd61&title=&width=633)

public int get(int field) 取日历中的某个字段信息 的细节：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712324763619-2c306d9f-0854-4225-ae0a-64c5695a7509.png#averageHue=%23fefdf9&clientId=uf60f9a4e-64cc-4&from=paste&height=298&id=u4f8a7a54&originHeight=304&originWidth=565&originalType=binary&ratio=2&rotation=0&showTitle=false&size=89937&status=done&style=none&taskId=u0d6f580c-ddeb-46b3-938f-b3a9c00fb8e&title=&width=553.5)

```java

package 练习.综合练习;

import java.util.Calendar;

public class 算法水题4 {
    public static void main(String[] args) {
        /*判断任意的一个年份是闰年还是平年
        要求：用jdk7和jdk8两种方式判断
        提示：
              二月有29天是闰年
              一年有366天是闰年*/

        //JDK7
        //键盘录入
        //        System.out.println("请输入一个年份：");
        //        Scanner sc = new Scanner(System.in);
        //        int year1 = Integer.parseInt(sc.nextLine());
        int year1 = 2000;

        //法一：2001.3.1往前减去一天，看看是28号还是29号
        //
        //创建日历对象，默认当前时间
        Calendar instance1 = Calendar.getInstance();
        //修改时间
        instance1.set(year1,Calendar.MARCH,1);
        //day-1
        instance1.add(Calendar.DAY_OF_MONTH,-1);
        int day1 = instance1.get(Calendar.DAY_OF_MONTH);
        System.out.println(day1);
        if(day1 == 29){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }

        //法二：2001.1.1往前减去一天，计算距离2000.1.1共有多少天
        //
        Calendar instance2 = Calendar.getInstance();
        instance2.set(2001, Calendar.JANUARY,1);
        instance2.add(Calendar.DAY_OF_MONTH,-1);
        int day2 = instance2.get(Calendar.DAY_OF_YEAR);
        System.out.println(day2);
        if(day2 == 366){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }
    }
}
```

<a name="fwFND"></a>
## JDK8 新增时间相关类
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712372199413-ef6b13ea-8021-4918-ad49-03c17f41ba62.png#averageHue=%23f4f4f4&clientId=uc74e5773-2ff8-4&from=paste&height=735&id=u2e6d2f3d&originHeight=1470&originWidth=2700&originalType=binary&ratio=2&rotation=0&showTitle=false&size=853313&status=done&style=none&taskId=u79734aef-1767-4420-8431-8706e34d14c&title=&width=1350)
<a name="A4TiG"></a>
### Date 类
<a name="I68FY"></a>
#### ZoneId：时区
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712407060272-e810061c-10cf-43af-b293-8fbf4c214087.png#averageHue=%23b5bcb3&clientId=ue61988f6-6e8a-4&from=paste&height=757&id=u200b28aa&originHeight=1513&originWidth=2624&originalType=binary&ratio=2&rotation=0&showTitle=false&size=3314152&status=done&style=none&taskId=uf7a910c1-dcaa-4f28-b18a-4d7442e0982&title=&width=1312)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712407099658-94f3c5dc-011f-4f0d-8889-3765a92737c9.png#averageHue=%23eddedd&clientId=ue61988f6-6e8a-4&from=paste&height=439&id=ua06db254&originHeight=878&originWidth=2684&originalType=binary&ratio=2&rotation=0&showTitle=false&size=248582&status=done&style=none&taskId=u1d96aa7e-c6d3-4748-b2f9-e19dd696232&title=&width=1342)
```java
package 练习.时间.JDK8.ZoneId;

import java.time.ZoneId;
import java.util.Set;

public class demo1 {
    public static void main(String[] args) {
        /*
        static Set<string> getAvailableZoneIds(); 获取java中支持的所有时区
        static ZoneId systemDefault(); 获取系统默认时区
        static ZoneId of(String zoneId); 获取一个指定时区
         */

        //1.static set<string> getAvailableZoneIds(); 获取java中支持的所有时区获取所有时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);//[Asia/Aden, America/Cuiaba, Etc/GMT+9, Etc/GMT+8, Africa/Nairobi, America/Marigot, Asia/Aqtau, Pacific/Kwajalein, America/El_Salvador, Asia/Pontianak, Africa/Cairo, Pacific/Pago_Pago, Africa/Mbabane, Asia/Kuching, Pacific/Honolulu, Pacific/Rarotonga, America/Guatemala, Australia/Hobart, Europe/London, America/Belize, America/Panama, Asia/Chungking, America/Managua, America/Indiana/Petersburg, Asia/Yerevan, Europe/Brussels, GMT, Europe/Warsaw, America/Chicago, Asia/Kashgar, Chile/Continental, Pacific/Yap, CET, Etc/GMT-1, Etc/GMT-0, Europe/Jersey, America/Tegucigalpa, Etc/GMT-5, Europe/Istanbul, America/Eirunepe, Etc/GMT-4, America/Miquelon, Etc/GMT-3, Europe/Luxembourg, Etc/GMT-2, Etc/GMT-9, America/Argentina/Catamarca, Etc/GMT-8, Etc/GMT-7, Etc/GMT-6, Europe/Zaporozhye, Canada/Yukon, Canada/Atlantic, Atlantic/St_Helena, Australia/Tasmania, Libya, Europe/Guernsey, America/Grand_Turk, Asia/Samarkand, America/Argentina/Cordoba, Asia/Phnom_Penh, Africa/Kigali, Asia/Almaty, US/Alaska, Asia/Dubai, Europe/Isle_of_Man, America/Araguaina, Cuba, Asia/Novosibirsk, America/Argentina/Salta, Etc/GMT+3, Africa/Tunis, Etc/GMT+2, Etc/GMT+1, Pacific/Fakaofo, Africa/Tripoli, Etc/GMT+0, Israel, Africa/Banjul, Etc/GMT+7, Indian/Comoro, Etc/GMT+6, Etc/GMT+5, Etc/GMT+4, Pacific/Port_Moresby, US/Arizona, Antarctica/Syowa, Indian/Reunion, Pacific/Palau, Europe/Kaliningrad, America/Montevideo, Africa/Windhoek, Asia/Karachi, Africa/Mogadishu, Australia/Perth, Brazil/East, Etc/GMT, Asia/Chita, Pacific/Easter, Antarctica/Davis, Antarctica/McMurdo, Asia/Macao, America/Manaus, Africa/Freetown, Europe/Bucharest, Asia/Tomsk, America/Argentina/Mendoza, Asia/Macau, Europe/Malta, Mexico/BajaSur, Pacific/Tahiti, Africa/Asmera, Europe/Busingen, America/Argentina/Rio_Gallegos, Africa/Malabo, Europe/Skopje, America/Catamarca, America/Godthab, Europe/Sarajevo, Australia/ACT, GB-Eire, Africa/Lagos, America/Cordoba, Europe/Rome, Asia/Dacca, Indian/Mauritius, Pacific/Samoa, America/Regina, America/Fort_Wayne, America/Dawson_Creek, Africa/Algiers, Europe/Mariehamn, America/St_Johns, America/St_Thomas, Europe/Zurich, America/Anguilla, Asia/Dili, America/Denver, Africa/Bamako, Europe/Saratov, GB, Mexico/General, Pacific/Wallis, Europe/Gibraltar, Africa/Conakry, Africa/Lubumbashi, Asia/Istanbul, America/Havana, NZ-CHAT, Asia/Choibalsan, America/Porto_Acre, Asia/Omsk, Europe/Vaduz, US/Michigan, Asia/Dhaka, America/Barbados, Europe/Tiraspol, Atlantic/Cape_Verde, Asia/Yekaterinburg, America/Louisville, Pacific/Johnston, Pacific/Chatham, Europe/Ljubljana, America/Sao_Paulo, Asia/Jayapura, America/Curacao, Asia/Dushanbe, America/Guyana, America/Guayaquil, America/Martinique, Portugal, Europe/Berlin, Europe/Moscow, Europe/Chisinau, America/Puerto_Rico, America/Rankin_Inlet, Pacific/Ponape, Europe/Stockholm, Europe/Budapest, America/Argentina/Jujuy, Australia/Eucla, Asia/Shanghai, Universal, Europe/Zagreb, America/Port_of_Spain, Europe/Helsinki, Asia/Beirut, Asia/Tel_Aviv, Pacific/Bougainville, US/Central, Africa/Sao_Tome, Indian/Chagos, America/Cayenne, Asia/Yakutsk, Pacific/Galapagos, Australia/North, Europe/Paris, Africa/Ndjamena, Pacific/Fiji, America/Rainy_River, Indian/Maldives, Australia/Yancowinna, SystemV/AST4, Asia/Oral, America/Yellowknife, Pacific/Enderbury, America/Juneau, Australia/Victoria, America/Indiana/Vevay, Asia/Tashkent, Asia/Jakarta, Africa/Ceuta, Asia/Barnaul, America/Recife, America/Buenos_Aires, America/Noronha, America/Swift_Current, Australia/Adelaide, America/Metlakatla, Africa/Djibouti, America/Paramaribo, Asia/Qostanay, Europe/Simferopol, Europe/Sofia, Africa/Nouakchott, Europe/Prague, America/Indiana/Vincennes, Antarctica/Mawson, America/Kralendijk, Antarctica/Troll, Europe/Samara, Indian/Christmas, America/Antigua, Pacific/Gambier, America/Indianapolis, America/Inuvik, America/Iqaluit, Pacific/Funafuti, UTC, Antarctica/Macquarie, Canada/Pacific, America/Moncton, Africa/Gaborone, Pacific/Chuuk, Asia/Pyongyang, America/St_Vincent, Asia/Gaza, Etc/Universal, PST8PDT, Atlantic/Faeroe, Asia/Qyzylorda, Canada/Newfoundland, America/Kentucky/Louisville, America/Yakutat, America/Ciudad_Juarez, Asia/Ho_Chi_Minh, Antarctica/Casey, Europe/Copenhagen, Africa/Asmara, Atlantic/Azores, Europe/Vienna, ROK, Pacific/Pitcairn, America/Mazatlan, Australia/Queensland, Pacific/Nauru, Europe/Tirane, Asia/Kolkata, SystemV/MST7, Australia/Canberra, MET, Australia/Broken_Hill, Europe/Riga, America/Dominica, Africa/Abidjan, America/Mendoza, America/Santarem, Kwajalein, America/Asuncion, Asia/Ulan_Bator, NZ, America/Boise, Australia/Currie, EST5EDT, Pacific/Guam, Pacific/Wake, Atlantic/Bermuda, America/Costa_Rica, America/Dawson, Asia/Chongqing, Eire, Europe/Amsterdam, America/Indiana/Knox, America/North_Dakota/Beulah, Africa/Accra, Atlantic/Faroe, Mexico/BajaNorte, America/Maceio, Etc/UCT, Pacific/Apia, GMT0, America/Atka, Pacific/Niue, Australia/Lord_Howe, Europe/Dublin, Pacific/Truk, MST7MDT, America/Monterrey, America/Nassau, America/Jamaica, Asia/Bishkek, America/Atikokan, Atlantic/Stanley, Australia/NSW, US/Hawaii, SystemV/CST6, Indian/Mahe, Asia/Aqtobe, America/Sitka, Asia/Vladivostok, Africa/Libreville, Africa/Maputo, Zulu, America/Kentucky/Monticello, Africa/El_Aaiun, Africa/Ouagadougou, America/Coral_Harbour, Pacific/Marquesas, Brazil/West, America/Aruba, America/North_Dakota/Center, America/Cayman, Asia/Ulaanbaatar, Asia/Baghdad, Europe/San_Marino, America/Indiana/Tell_City, America/Tijuana, Pacific/Saipan, SystemV/YST9, Africa/Douala, America/Chihuahua, America/Ojinaga, Asia/Hovd, America/Anchorage, Chile/EasterIsland, America/Halifax, Antarctica/Rothera, America/Indiana/Indianapolis, US/Mountain, Asia/Damascus, America/Argentina/San_Luis, America/Santiago, Asia/Baku, America/Argentina/Ushuaia, Atlantic/Reykjavik, Africa/Brazzaville, Africa/Porto-Novo, America/La_Paz, Antarctica/DumontDUrville, Asia/Taipei, Antarctica/South_Pole, Asia/Manila, Asia/Bangkok, Africa/Dar_es_Salaam, Poland, Atlantic/Madeira, Antarctica/Palmer, America/Thunder_Bay, Africa/Addis_Ababa, Asia/Yangon, Europe/Uzhgorod, Brazil/DeNoronha, Asia/Ashkhabad, Etc/Zulu, America/Indiana/Marengo, America/Creston, America/Punta_Arenas, America/Mexico_City, Antarctica/Vostok, Asia/Jerusalem, Europe/Andorra, US/Samoa, PRC, Asia/Vientiane, Pacific/Kiritimati, America/Matamoros, America/Blanc-Sablon, Asia/Riyadh, Iceland, Pacific/Pohnpei, Asia/Ujung_Pandang, Atlantic/South_Georgia, Europe/Lisbon, Asia/Harbin, Europe/Oslo, Asia/Novokuznetsk, CST6CDT, Atlantic/Canary, America/Knox_IN, Asia/Kuwait, SystemV/HST10, Pacific/Efate, Africa/Lome, America/Bogota, America/Menominee, America/Adak, Pacific/Norfolk, Europe/Kirov, America/Resolute, Pacific/Kanton, Pacific/Tarawa, Africa/Kampala, Asia/Krasnoyarsk, Greenwich, SystemV/EST5, America/Edmonton, Europe/Podgorica, Australia/South, Canada/Central, Africa/Bujumbura, America/Santo_Domingo, US/Eastern, Europe/Minsk, Pacific/Auckland, Africa/Casablanca, America/Glace_Bay, Canada/Eastern, Asia/Qatar, Europe/Kiev, Singapore, Asia/Magadan, SystemV/PST8, America/Port-au-Prince, Europe/Belfast, America/St_Barthelemy, Asia/Ashgabat, Africa/Luanda, America/Nipigon, Atlantic/Jan_Mayen, Brazil/Acre, Asia/Muscat, Asia/Bahrain, Europe/Vilnius, America/Fortaleza, Etc/GMT0, US/East-Indiana, America/Hermosillo, America/Cancun, Africa/Maseru, Pacific/Kosrae, Africa/Kinshasa, Asia/Kathmandu, Asia/Seoul, Australia/Sydney, America/Lima, Australia/LHI, America/St_Lucia, Europe/Madrid, America/Bahia_Banderas, America/Montserrat, Asia/Brunei, America/Santa_Isabel, Canada/Mountain, America/Cambridge_Bay, Asia/Colombo, Australia/West, Indian/Antananarivo, Australia/Brisbane, Indian/Mayotte, US/Indiana-Starke, Asia/Urumqi, US/Aleutian, Europe/Volgograd, America/Lower_Princes, America/Vancouver, Africa/Blantyre, America/Rio_Branco, America/Danmarkshavn, America/Detroit, America/Thule, Africa/Lusaka, Asia/Hong_Kong, Iran, America/Argentina/La_Rioja, Africa/Dakar, SystemV/CST6CDT, America/Tortola, America/Porto_Velho, Asia/Sakhalin, Etc/GMT+10, America/Scoresbysund, Asia/Kamchatka, Asia/Thimbu, Africa/Harare, Etc/GMT+12, Etc/GMT+11, Navajo, America/Nome, Europe/Tallinn, Turkey, Africa/Khartoum, Africa/Johannesburg, Africa/Bangui, Europe/Belgrade, Jamaica, Africa/Bissau, Asia/Tehran, WET, Europe/Astrakhan, Africa/Juba, America/Campo_Grande, America/Belem, Etc/Greenwich, Asia/Saigon, America/Ensenada, Pacific/Midway, America/Jujuy, Africa/Timbuktu, America/Bahia, America/Goose_Bay, America/Virgin, America/Pangnirtung, Asia/Katmandu, America/Phoenix, Africa/Niamey, America/Whitehorse, Pacific/Noumea, Asia/Tbilisi, Europe/Kyiv, America/Montreal, Asia/Makassar, America/Argentina/San_Juan, Hongkong, UCT, Asia/Nicosia, America/Indiana/Winamac, SystemV/MST7MDT, America/Argentina/ComodRivadavia, America/Boa_Vista, America/Grenada, Asia/Atyrau, Australia/Darwin, Asia/Khandyga, Asia/Kuala_Lumpur, Asia/Famagusta, Asia/Thimphu, Asia/Rangoon, Europe/Bratislava, Asia/Calcutta, America/Argentina/Tucuman, Asia/Kabul, Indian/Cocos, Japan, Pacific/Tongatapu, America/New_York, Etc/GMT-12, Etc/GMT-11, America/Nuuk, Etc/GMT-10, SystemV/YST9YDT, Europe/Ulyanovsk, Etc/GMT-14, Etc/GMT-13, W-SU, America/Merida, EET, America/Rosario, Canada/Saskatchewan, America/St_Kitts, Arctic/Longyearbyen, America/Fort_Nelson, America/Caracas, America/Guadeloupe, Asia/Hebron, Indian/Kerguelen, SystemV/PST8PDT, Africa/Monrovia, Asia/Ust-Nera, Egypt, Asia/Srednekolymsk, America/North_Dakota/New_Salem, Asia/Anadyr, Australia/Melbourne, Asia/Irkutsk, America/Shiprock, America/Winnipeg, Europe/Vatican, Asia/Amman, Etc/UTC, SystemV/AST4ADT, Asia/Tokyo, America/Toronto, Asia/Singapore, Australia/Lindeman, America/Los_Angeles, SystemV/EST5EDT, Pacific/Majuro, America/Argentina/Buenos_Aires, Europe/Nicosia, Pacific/Guadalcanal, Europe/Athens, US/Pacific, Europe/Monaco]

        //1.1获取所有时区的数量
        System.out.println(zoneIds.size()); //603

        //2.static ZoneId systemDefault();获取默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);     //Asia/Shanghai

        //3.static ZoneId of(string zoneId);获取指定时区
        ZoneId zoneId1 = ZoneId.of("America/Marigot");
        System.out.println(zoneId1);    //America/Marigot

        

    }
}

```
<a name="PFRIR"></a>
#### Instant：时间戳
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712455096134-ed2fe7ca-dfec-4745-a3c5-446412a97c76.png#averageHue=%23e6d8d8&clientId=uf02769c6-efaf-4&from=paste&height=578&id=u7ee9c6fd&originHeight=1156&originWidth=2426&originalType=binary&ratio=2&rotation=0&showTitle=false&size=566160&status=done&style=none&taskId=u2464fb34-76fc-4bd4-ab29-03530020784&title=&width=1213)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712455370556-796d7fe7-9f32-4186-be48-38cf414527f4.png#averageHue=%23ebf1e5&clientId=uf02769c6-efaf-4&from=paste&height=137&id=u2366a293&originHeight=274&originWidth=1310&originalType=binary&ratio=2&rotation=0&showTitle=false&size=352111&status=done&style=none&taskId=u65f95a0a-b04b-4cab-87b2-63a7231c297&title=&width=655)
```java

package 练习.时间.JDK8.Instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo1 {
    public static void main(String[] args) {
        /*
        static instant now(); 获取当前时间的instant对象（标准时间）
        static instant ofXxx(Long epochMilli); 根据（秒/毫秒/纳秒）获取instant对象
        zonedDatetime atZone(ZoneId zone); 指定时区
        boolean isXxx(Instant otherInstant); 判断系列的方法
        instant minusXxx(Long millisToSubtract); 减少时间系列的方法
        instant plusXxx(Long millisToSubtract); 增加时间系列的方法
         */

        //1.static instant now(); 获取当前时间的Instant对象（标准时间）
        Instant now = Instant.now();
        System.out.println(now);    //2024-04-07T01:58:25.591495500Z

        //2. static instant ofXxx(long epochMilli);根据（秒、毫秒、纳秒）获取Instant对象
        //0L获取时间原点以后的0毫秒的时间 == 时间原点
        Instant instant1 = Instant.ofEpochMilli(0L);    //Milli = millisecond 毫秒
        System.out.println(instant1);   //1970-01-01T00:00:00Z

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);   //1970-01-01T00:00:01Z

        Instant instant = Instant.ofEpochSecond(1L, 1000000000L);
        //epochSecond：毫秒        nanoAdjustment：纳秒
        System.out.println(instant);    //1970-01-01T00:00:02Z

        //3.zonedDatetime atZone(ZoneId zone); 指定时区
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("America/Marigot"));
        System.out.println(zonedDateTime);  //2024-04-06T22:20:14.107989-04:00[America/Marigot]

        //4.boolean isXxx(Instant otherInstant); 判断系列的方法
        Instant instant3 = Instant.ofEpochMilli(0L);
        Instant instant4 = Instant.ofEpochMilli(1000L);

        boolean after = instant3.isAfter(instant4);
        System.out.println(after);  //false

        boolean before = instant3.isBefore(instant4);
        System.out.println(before);  //true


        //5.instant minusXxx(Long millisToSubtract); 减少时间系列的方法
        Instant instant5 = Instant.ofEpochMilli(3000L);
        System.out.println(instant5);   //1970-01-01T00:00:03Z
        Instant instant6 = instant5.minusMillis(3000L);
        System.out.println(instant6);   //1970-01-01T00:00:00Z

        Instant instant7 = instant6.minusSeconds(1970L * 365 * 24 * 60 * 60 * 1000);
        System.out.println(instant7);   //-1966723-12-19T00:00:00Z
        //6.instant plusXxx(Long millisToSubtract); 增加时间系列的方法

    }
}
```
<a name="lTEX1"></a>
#### ZoneDateTime：带时区的时间
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712458590593-7bd0598d-f050-4a92-ab8a-b99c3fdd5796.png#averageHue=%23e5d4d3&clientId=uf02769c6-efaf-4&from=paste&height=490&id=u77898753&originHeight=980&originWidth=2334&originalType=binary&ratio=2&rotation=0&showTitle=false&size=452994&status=done&style=none&taskId=u9f810790-3cce-4007-b35b-14ac8e7cb07&title=&width=1167)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712458663414-535d9ecb-d946-412d-852f-0adfd4e4e13f.png#averageHue=%23fbfbfa&clientId=uf02769c6-efaf-4&from=paste&height=628&id=u90404f5e&originHeight=1256&originWidth=2014&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1013121&status=done&style=none&taskId=uc176f591-ba62-48a9-ab57-c0f2e8875a3&title=&width=1007)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712458699973-fcde7a48-1c33-48e7-b9b2-684e283b39b6.png#averageHue=%23fcfcfb&clientId=uf02769c6-efaf-4&from=paste&height=486&id=u1fd2ec07&originHeight=972&originWidth=1170&originalType=binary&ratio=2&rotation=0&showTitle=false&size=405584&status=done&style=none&taskId=u747f2436-65fb-4237-bb07-f81205bd9c1&title=&width=585)
<a name="RPnjx"></a>
### 日期格式化 SimpleDateFormat 类
<a name="MlY1m"></a>
#### DateTimeFormatter
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712458924467-e33acdcd-437c-4951-b50e-2469f9d277da.png#averageHue=%23ead8d7&clientId=uf02769c6-efaf-4&from=paste&height=440&id=u47eee876&originHeight=880&originWidth=2420&originalType=binary&ratio=2&rotation=0&showTitle=false&size=303927&status=done&style=none&taskId=u71ba5908-ccfb-44e8-888d-be577a7672c&title=&width=1210)<br />不能格式化 instant，因为他是精确的时间，可以格式化的有：

1. LocalDate：仅包含日期信息，没有时间和时区信息。
2. LocalTime：仅包含时间信息，没有日期和时区信息。
3. LocalDateTime：包含日期和时间信息，但没有时区信息。
4. ZonedDateTime：包含日期、时间和时区信息。
<a name="eFGDz"></a>
### 日历 Calendar 类
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712459169470-0f1c3b9b-1f76-4e52-b645-6f3929b896e9.png#averageHue=%23ebdedd&clientId=uf02769c6-efaf-4&from=paste&height=608&id=u9b3c7b2f&originHeight=1216&originWidth=2412&originalType=binary&ratio=2&rotation=0&showTitle=false&size=473773&status=done&style=none&taskId=u458bd997-165a-4152-ab66-b49cae76d63&title=&width=1206)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712459251188-018d2a02-34e3-4dab-bf21-48682653b299.png#averageHue=%23efe3e2&clientId=uf02769c6-efaf-4&from=paste&height=552&id=ub3032723&originHeight=1104&originWidth=2354&originalType=binary&ratio=2&rotation=0&showTitle=false&size=366541&status=done&style=none&taskId=u804410d9-b1ed-423a-8310-c803238511b&title=&width=1177)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712459365308-285bb10b-da29-4a7a-9d1f-bf06ae67e310.png#averageHue=%23f5f4f3&clientId=uf02769c6-efaf-4&from=paste&height=605&id=u38d9d8bb&originHeight=1210&originWidth=1774&originalType=binary&ratio=2&rotation=0&showTitle=false&size=878048&status=done&style=none&taskId=uc04e6ac8-15b9-4c6a-a633-42ed812c423&title=&width=887)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712459389665-a9d4b362-bc6c-457f-8166-ee684ec2417b.png#averageHue=%23fafaf9&clientId=uf02769c6-efaf-4&from=paste&height=667&id=uf0ef2802&originHeight=1334&originWidth=1796&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1041928&status=done&style=none&taskId=uc7dd2d1a-6f9a-4301-9942-79d545ad614&title=&width=898)

<a name="pz0dc"></a>
#### LocalDate：年、月、日 
<a name="dOjM1"></a>
#### LocalTime：时、分、秒 
<a name="vKsed"></a>
#### LocalDateTime：年、月、日、时、分、秒
<a name="UXLwb"></a>
### 工具类
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712461329100-c7408918-b2e0-4edb-acb8-4d0619f35686.png#averageHue=%23fbfaf9&clientId=uf02769c6-efaf-4&from=paste&height=550&id=u497b8f2e&originHeight=1100&originWidth=1804&originalType=binary&ratio=2&rotation=0&showTitle=false&size=246544&status=done&style=none&taskId=ua077129c-e74e-4726-b766-24279e35052&title=&width=902)
<a name="qBkux"></a>
#### Duration：时间间隔（秒、纳秒）
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712461423546-6e0a11ad-298a-4702-b1d8-acfdda1aa007.png#averageHue=%23ebe8de&clientId=uf02769c6-efaf-4&from=paste&height=605&id=u47fe98ec&originHeight=1210&originWidth=1608&originalType=binary&ratio=2&rotation=0&showTitle=false&size=892146&status=done&style=none&taskId=u837f90bf-bfab-4519-9bed-8b267be792f&title=&width=804)
<a name="UqAJf"></a>
#### Period：时间间隔（年、月、日）
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712461375397-9b63ff6b-a418-4896-98f9-f7ed792bc3c9.png#averageHue=%23fafaf9&clientId=uf02769c6-efaf-4&from=paste&height=651&id=u9911560e&originHeight=1302&originWidth=1756&originalType=binary&ratio=2&rotation=0&showTitle=false&size=699019&status=done&style=none&taskId=ua84bbd8f-8e22-4d2e-8da0-6b11a75c3fb&title=&width=878)
<a name="zV2A0"></a>
#### ChronoUnit：时间间隔（所有单位）
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712461474304-ae420cb0-11de-4f13-9cd2-cfd37eae16b9.png#averageHue=%23e3e3d8&clientId=uf02769c6-efaf-4&from=paste&height=644&id=u2bd0850f&originHeight=1288&originWidth=1982&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1666640&status=done&style=none&taskId=u57b6e209-eec2-470c-af79-3304a7970ce&title=&width=991)
<a name="NbeEx"></a>
## 包装类
<a name="eX3eu"></a>
### Integer
<a name="QRELN"></a>
#### 创建对象
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712496440328-98629d8b-2536-4ce2-b5f3-f057db48ce16.png#averageHue=%23f7f5f5&clientId=uf02769c6-efaf-4&from=paste&height=624&id=ue528a73d&originHeight=1248&originWidth=2660&originalType=binary&ratio=2&rotation=0&showTitle=false&size=556568&status=done&style=none&taskId=u095163bc-bbfd-40c1-a9f8-f120e228ff6&title=&width=1330)


![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712461540139-f8d7bef0-8204-4186-b6c2-5a9ecf5888da.png#averageHue=%23faf9f9&clientId=uf02769c6-efaf-4&from=paste&height=524&id=ud2ce99be&originHeight=1048&originWidth=2440&originalType=binary&ratio=2&rotation=0&showTitle=false&size=197556&status=done&style=none&taskId=ubd25ed14-1f51-4424-ac2c-1f4c3c1cce0&title=&width=1220)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712461609230-3fe301d3-ab7d-4b1d-946d-52fc7cd13b2a.png#averageHue=%23f2ebbd&clientId=uf02769c6-efaf-4&from=paste&height=699&id=u5ff47aab&originHeight=1398&originWidth=2669&originalType=binary&ratio=2&rotation=0&showTitle=false&size=830245&status=done&style=none&taskId=u7f97584c-2c2b-4c4a-953d-95890b14cd7&title=&width=1334.5)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712461700731-da54ec28-9b0e-44d9-9f5d-a2a4a8df2ce5.png#averageHue=%23f9f8f5&clientId=uf02769c6-efaf-4&from=paste&height=725&id=u10c03730&originHeight=1449&originWidth=2670&originalType=binary&ratio=2&rotation=0&showTitle=false&size=573313&status=done&style=none&taskId=u38ab3966-d27f-4f96-af86-08f0c2edec9&title=&width=1335)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712461722736-9726099d-58da-45ab-9785-5198fd2ed186.png#averageHue=%23f7eaea&clientId=uf02769c6-efaf-4&from=paste&height=727&id=u28964369&originHeight=1454&originWidth=2684&originalType=binary&ratio=2&rotation=0&showTitle=false&size=358111&status=done&style=none&taskId=u3599cf3a-cf6c-4691-9135-9971ec87051&title=&width=1342)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712495337117-65331245-aa33-4a9f-b03b-e07daaac967a.png#averageHue=%23e9e0e0&clientId=uf02769c6-efaf-4&from=paste&height=681&id=u1bbddd05&originHeight=1362&originWidth=2564&originalType=binary&ratio=2&rotation=0&showTitle=false&size=648259&status=done&style=none&taskId=uc242bfd4-7915-455b-86b9-8e7c62e3f19&title=&width=1282)



![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712496286600-7567bdf5-0940-4e03-8deb-ea660d746992.png#averageHue=%23f3f3f2&clientId=uf02769c6-efaf-4&from=paste&height=619&id=udbff1d72&originHeight=1238&originWidth=2058&originalType=binary&ratio=2&rotation=0&showTitle=false&size=969620&status=done&style=none&taskId=u8ba14eaf-59f5-423a-b1f4-8758ada271b&title=&width=1029)

细节：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712496343944-483e119e-a7b5-462d-a763-4af33bf6e6d8.png#averageHue=%23f4f5e6&clientId=uf02769c6-efaf-4&from=paste&height=142&id=uc925d966&originHeight=284&originWidth=926&originalType=binary&ratio=2&rotation=0&showTitle=false&size=259914&status=done&style=none&taskId=ubc6c94b2-1c5d-4667-832a-708e5f7df25&title=&width=463)👇<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712496314223-8ac2b448-0ac0-4f43-b61b-8aaa959e8b7c.png#averageHue=%23faf9f4&clientId=uf02769c6-efaf-4&from=paste&height=442&id=u62a06732&originHeight=884&originWidth=1492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=630486&status=done&style=none&taskId=u13043761-22a3-4881-a878-fe343e2c552&title=&width=746)

自动拆箱装箱：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712496385220-6f9e6646-610a-4b38-b56d-0bb7aafccf05.png#averageHue=%23fcfcfa&clientId=uf02769c6-efaf-4&from=paste&height=473&id=u1b0f722d&originHeight=946&originWidth=2038&originalType=binary&ratio=2&rotation=0&showTitle=false&size=655397&status=done&style=none&taskId=u50428e10-c6ff-4df7-82f1-00d3808f747&title=&width=1019)
<a name="GYCMd"></a>
#### 成员方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712497562289-850f1aaf-ac57-4fc6-9d5f-c59aca744ba8.png#averageHue=%23e3dbda&clientId=uf02769c6-efaf-4&from=paste&height=666&id=ua4528234&originHeight=1332&originWidth=2653&originalType=binary&ratio=2&rotation=0&showTitle=false&size=470954&status=done&style=none&taskId=ud6a63788-25d0-4b92-81a6-2b25ff4564d&title=&width=1326.5)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712497802565-25d7bc82-83fb-4a0b-bb5f-b3d6b1f6f45e.png#averageHue=%23fbfaf9&clientId=uf02769c6-efaf-4&from=paste&height=550&id=uf19bdb4a&originHeight=1100&originWidth=2052&originalType=binary&ratio=2&rotation=0&showTitle=false&size=733274&status=done&style=none&taskId=uaad1be88-7a22-489d-8667-c7d5e5242f0&title=&width=1026)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712497935813-a80a12bb-e7bf-452e-a3d6-e0c552378eb7.png#averageHue=%23ebe8da&clientId=uf02769c6-efaf-4&from=paste&height=307&id=u616ca2c6&originHeight=614&originWidth=1210&originalType=binary&ratio=2&rotation=0&showTitle=false&size=482490&status=done&style=none&taskId=u011a836b-0c75-40f5-913d-54a8b166ec7&title=&width=605)


<a name="tgcvG"></a>
#### 改进键盘录入
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712498115237-2a35b94d-55a4-4746-83d4-23cca4c332c2.png#averageHue=%23fcfcfb&clientId=uf02769c6-efaf-4&from=paste&height=537&id=u821d2ae1&originHeight=1074&originWidth=2120&originalType=binary&ratio=2&rotation=0&showTitle=false&size=726169&status=done&style=none&taskId=u2dd7ff5b-9a6f-4c25-928e-61e214d0d56&title=&width=1060)

<a name="IJ4yf"></a>
### Character

<a name="fU0qZ"></a>
## 综合练习
<a name="bPFZu"></a>
# lambda 表达式
<a name="dyZyV"></a>
## lambda
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712930846943-e93bb480-b325-4793-999b-609963dcfd89.png#averageHue=%23faf8e2&clientId=u5bc5484d-1293-4&from=paste&height=604&id=ubb502d44&originHeight=1208&originWidth=2372&originalType=binary&ratio=2&rotation=0&showTitle=false&size=389745&status=done&style=none&taskId=uabdc4b07-99f9-4ede-9c44-3b8c2731d92&title=&width=1186)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712930893936-6f60cbec-bab6-4127-9561-2f265095acaa.png#averageHue=%23f1eeed&clientId=u5bc5484d-1293-4&from=paste&height=238&id=u6c3af6d7&originHeight=476&originWidth=1892&originalType=binary&ratio=2&rotation=0&showTitle=false&size=264125&status=done&style=none&taskId=ud4d84e44-5b79-4121-826e-585d4789b9e&title=&width=946)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712930906391-17146c25-1a9c-4991-a321-140977064450.png#averageHue=%23f6f5f5&clientId=u5bc5484d-1293-4&from=paste&height=500&id=u121e4212&originHeight=1000&originWidth=1270&originalType=binary&ratio=2&rotation=0&showTitle=false&size=205246&status=done&style=none&taskId=uff970d71-c780-4b07-8ebc-7748ca4c8df&title=&width=635)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1712930958675-0e6cbd8e-6413-4eed-8e13-3403f0b24827.png#averageHue=%23f5f3e8&clientId=u5bc5484d-1293-4&from=paste&height=571&id=u02c4d887&originHeight=1142&originWidth=2352&originalType=binary&ratio=2&rotation=0&showTitle=false&size=558836&status=done&style=none&taskId=u7b12b390-ad5b-4665-98c8-4b084953b09&title=&width=1176)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713010459334-daee82f2-c76d-4579-800a-3a9af3ef509a.png#averageHue=%23f9f4f3&clientId=u3b5c70d4-c1e7-4&from=paste&height=588&id=uf2de6de7&originHeight=1176&originWidth=2584&originalType=binary&ratio=2&rotation=0&showTitle=false&size=719024&status=done&style=none&taskId=uc340bfab-a2ff-4524-8308-b0899621713&title=&width=1292)



继续简化：

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713010614878-ede0b819-97c9-44bf-9b20-49280428a696.png#averageHue=%23f7f6f5&clientId=u3b5c70d4-c1e7-4&from=paste&height=758&id=ua215da27&originHeight=1516&originWidth=2700&originalType=binary&ratio=2&rotation=0&showTitle=false&size=991034&status=done&style=none&taskId=u8be0612b-3b77-4d1f-a085-8f2b5fc1a49&title=&width=1350)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713010856601-a6956559-8117-4a7c-80a1-40e645a32d8b.png#averageHue=%23f6f4f4&clientId=u3b5c70d4-c1e7-4&from=paste&height=441&id=u8b075a46&originHeight=882&originWidth=2502&originalType=binary&ratio=2&rotation=0&showTitle=false&size=346721&status=done&style=none&taskId=uac8e7c0b-68df-443d-9358-02ad13bc5c1&title=&width=1251)
<a name="DG27g"></a>
## 例题
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713063703694-054a101f-f934-498d-b274-7a85eaa09e3c.png#averageHue=%23efeeed&clientId=u7960635e-91f5-4&from=paste&height=368&id=uc5c70d28&originHeight=736&originWidth=2490&originalType=binary&ratio=2&rotation=0&showTitle=false&size=321411&status=done&style=none&taskId=u8c5ed69c-b6ca-4e12-afae-df35dbde0de&title=&width=1245)
```java
package practise.综合练习.按要求进行排序;

import java.util.Arrays;

public class 按要求进行排序 {
    public static void main(String[] args) {
        GirlFriend girlFriend1 = new GirlFriend("xiaoshishi", 18, 1.67);
        GirlFriend girlFriend2 = new GirlFriend("xiaodandan", 19, 1.72);
        GirlFriend girlFriend3 = new GirlFriend("xiaohuihui", 19, 1.78);

        GirlFriend[] arr = {girlFriend1, girlFriend2, girlFriend3};

        /*//按要求排序
        Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                double tmp = o2.getAge() - o1.getAge(); //年龄相同
                tmp = tmp == 0 ? o2.getHeight() - o1.getHeight() : tmp;   //年龄相同比身高
                tmp = tmp == 0 ? o1.getName().compareTo(o2.getName()) : tmp;

                if (tmp > 0) return 1;
                else if (tmp < 0) return -1;
                else return 0;

            }
        });*/
        //按要求排序
        Arrays.sort(arr, (o1, o2) -> {
            double tmp = o2.getAge() - o1.getAge(); //年龄相同
            tmp = tmp == 0 ? o2.getHeight() - o1.getHeight() : tmp;   //年龄相同比身高
            tmp = tmp == 0 ? o1.getName().compareTo(o2.getName()) : tmp;
            if (tmp > 0) {
                return 1;
            } else if (tmp < 0) {
                return -1;
            } else {
                return 0;
            }
        });


        /*//按年龄排序
        Arrays.sort(arr,(o1, o2) -> o2.getAge()- o1.getAge());

        //按身高排序
        Arrays.sort(arr, (o1, o2) -> (int) (o2.getHeight()-o1.getHeight()));

        //按姓名字母排序
        Arrays.sort(arr,((o1, o2) -> o2.getName().charAt(0)-o1.getName().charAt(0) ));
*/
        System.out.println(Arrays.toString(arr));
    }
}
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713063739286-64247082-9a4d-4f8e-be58-7c32702001a5.png#averageHue=%23f6f2f1&clientId=u7960635e-91f5-4&from=paste&height=614&id=u95b05701&originHeight=1228&originWidth=2550&originalType=binary&ratio=2&rotation=0&showTitle=false&size=507650&status=done&style=none&taskId=u91891aaa-cf0a-4db7-94f5-76764bdd916&title=&width=1275)
```java
package practise.综合练习.斐波那契;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {

        //extracted();

        System.out.println(f(12));
    }
    private static int f(int month){
        if(month == 1 || month == 2){
            return 1;
        }
        return f(month-1)+f(month-2);
    }

    private static void extracted() {
        int[] arr = new int[12];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(Arrays.toString(arr));
    }
}
```
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713065568231-e3446bfa-19fb-40ce-bfaa-fa503c6112fb.png#averageHue=%23f1f0f0&clientId=u7960635e-91f5-4&from=paste&height=248&id=u671d1600&originHeight=496&originWidth=2494&originalType=binary&ratio=2&rotation=0&showTitle=false&size=209879&status=done&style=none&taskId=u523df827-4b26-4351-b595-6b219959985&title=&width=1247)
```java
package practise.综合练习.猴子吃桃子;

public class 猴子吃桃子 {
    public static void main(String[] args) {

        System.out.println(method(1));
    }
    private static int method(int day){
    if(day <= 0 ||day >= 11)return -1;
    if(day == 10 )
        return 1;
    return (method(day+1)+1)*2;
}
}
```
！！！！！！！！！！！难！！！！！！！！！👇<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713066699816-d68d4908-484e-4086-8fe0-57f323d57c05.png#averageHue=%23f5f2f2&clientId=u7960635e-91f5-4&from=paste&height=588&id=u510169d1&originHeight=1176&originWidth=2606&originalType=binary&ratio=2&rotation=0&showTitle=false&size=484911&status=done&style=none&taskId=ue9ae0bd7-e630-4f67-b6b7-c522ca845c6&title=&width=1303)
```java
package practise.综合练习.爬楼梯;

public class 爬楼梯 {
    public static void main(String[] args) {
        System.out.println(method(20));
    }

    private static int method(int stairs){
    if(stairs == 1)
        return 1;
    if(stairs == 2)
        return 2;
    return method(stairs-1)+method(stairs-2);
}
}
```
<a name="RFC3I"></a>
# JavaSwing -- 拼图小游戏
<a name="mzgDq"></a>
## 主界面分析
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711107054937-392d3f84-3205-4c56-b459-8bf6a090f605.png#averageHue=%23f5e8e6&clientId=ubb84bc44-380a-4&from=paste&height=561&id=uebcf3909&originHeight=1122&originWidth=2422&originalType=binary&ratio=2&rotation=0&showTitle=false&size=560844&status=done&style=none&taskId=uc9eff22d-348b-42b3-85aa-66ad2adf55a&title=&width=1211)
<a name="B8AIj"></a>
## 界面设计	JFrame
JFrame 是 JavaBean 类，用于描述界面
<a name="ZR0ap"></a>
### 属性：长、宽		对应 get 、set 方法
<a name="Zx0tC"></a>
### 行为

:::info
this 指的是 JFrame 的对象

//创建界面对象<br />JFrame jframe = new JFrame();<br />//设置界面大小，单位是像素<br />this.setSize(603,680);<br />//设置界面标题<br />this.setTitle("ckkk拼图单机版 v1.0");<br />//设置界面置顶<br />this.setAlwaysOnTop(true);<br />//设置界面居中<br />this.setLocationRelativeTo(null);<br />//设置游戏关闭<br />this.setDefaultCloseOperation(3);//关闭窗口后结束程序<br />//设置关闭模式<br />jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);<br />//取消默认居中放置隐藏容器,只有取消了才会按照xy放置<br />jFrame.setLayout(null);

........

//显示界面，界面默认隐藏，建议写在最后<br />this.setVisible(true);	//或直接调用 show 方法显示
:::
<a name="buqN1"></a>
## 菜单设计	JMenu
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711111428129-6b1dc01a-1bc3-4ced-87cb-83a8dda581e8.png#averageHue=%23fbf9f9&clientId=u31ac6559-7ad8-4&from=paste&height=461&id=u658ea106&originHeight=922&originWidth=1990&originalType=binary&ratio=2&rotation=0&showTitle=false&size=225521&status=done&style=none&taskId=u088baa14-93e8-4788-b982-d5c72340c12&title=&width=995) 
:::info
//创建整个菜单对象<br />JMenuBar jMenuBar = new JMenuBar();<br />//创建菜单上的选项的对象<br />JMenu functionJMenu = new JMenu("功能");<br />JMenu aboutJMenu = new JMenu("关于");<br />//创建选项下面的条目对象<br />JMenuItem replayItem = new JMenuItem("重新游戏");<br />JMenuItem reLoginItem = new JMenuItem("重新登录");<br />JMenuItem closeItem = new JMenuItem("关闭游戏");

JMenuItem wechatItem = new JMenuItem("微信");<br />//将条目添加到选项中<br />functionJMenu.add(replayItem);<br />functionJMenu.add(reLoginItem);<br />functionJMenu.add(closeItem);

aboutJMenu.add(wechatItem);<br />//将选项添加进菜单<br />jMenuBar.add(functionJMenu);<br />jMenuBar.add(aboutJMenu);<br />//将菜单添加进界面<br />this.setJMenuBar(jMenuBar);
:::
<a name="sTaLQ"></a>
## 添加图片：先加载的图片在上方，后加载的图片在下方
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711256789655-bd1e0180-6b56-412e-9b2d-7c387bde9de4.png#averageHue=%23f6f2f1&clientId=ue445fdbe-70ec-4&from=paste&height=570&id=u7b4b4c0b&originHeight=1140&originWidth=2386&originalType=binary&ratio=2&rotation=0&showTitle=false&size=522322&status=done&style=none&taskId=uac7cf3ca-70fc-4e7a-bcd9-fdf1bfc2b6b&title=&width=1193)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711112625203-de50b7c2-9588-419f-bbf5-cebc7ef5c029.png#averageHue=%23efeceb&clientId=u31ac6559-7ad8-4&from=paste&height=595&id=u4b9330e8&originHeight=1190&originWidth=2224&originalType=binary&ratio=2&rotation=0&showTitle=false&size=329294&status=done&style=none&taskId=u71cc42e7-f251-4e36-a267-23d8a7f4cad&title=&width=1112) ![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711165982662-71b1185e-1dc5-4ecc-a3e2-842d43518f19.png#averageHue=%23f5f5f5&clientId=uc6db7961-a2b5-4&from=paste&height=625&id=uf56916e3&originHeight=1250&originWidth=2556&originalType=binary&ratio=2&rotation=0&showTitle=false&size=518411&status=done&style=none&taskId=u6d072bab-b115-46da-9638-4e734d14fad&title=&width=1278)<br />图片对应的类	---	ImageIcon<br />对图片进行设置	---	JLable
:::info
//创建一个图片ImageIcon的对象<br />ImageIcon icon = new ImageIcon("JigsawPuzzlePicture/0.jpg");<br />//创建一个JLabel的对象（管理容器）<br />JLabel jLabel1 = new JLabel(icon);

//上面两句代码可以简化成一句：JLabel jLable = new JLabel(new ImageIcon("JigsawPuzzlePicture/0.jpg));

//指定图片位置<br />jLabel1.setBounds(0,0,105,105);<br />//将管理容器添加到界面当中<br />//this.add(jLabel1);<br />//获取隐藏容器（JFrame中隐藏容器，用来装载组件）<br />//隐藏容器为系统自动创建的对象，无需自己创建,使用时需jFrame.setLayout(null);取消默认居中放置隐藏容器,只有取消了才会按照xy放置，此句子已经写在界面初始化中<br />//将 jLabel 添加进隐藏容器<br />this.getContentPane().add(jLabel1);
:::
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711264781495-ae25d930-ea02-40fc-9763-ee6a6cf416bc.png#averageHue=%23ede8dc&clientId=uede5e3f7-f816-4&from=paste&height=716&id=u27f26e26&originHeight=1432&originWidth=1976&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1045284&status=done&style=none&taskId=uc29b1bab-cd91-4133-85d4-ee9d23c3bff&title=&width=988)
<a name="NtXXn"></a>
## 事件 
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711260623068-c5ffe476-5a0b-4ceb-90d5-67252c9d0ecc.png#averageHue=%23f4f0f0&clientId=uede5e3f7-f816-4&from=paste&height=570&id=u9cd71330&originHeight=1140&originWidth=2376&originalType=binary&ratio=2&rotation=0&showTitle=false&size=815791&status=done&style=none&taskId=u5cc88f68-283a-4091-b7d5-112dccf18a3&title=&width=1188)
<a name="GzHWU"></a>
### 事件的含义
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711170664499-b00a32ff-6835-4aff-abf5-9af251f363f1.png#averageHue=%23f0f0f0&clientId=u95093c95-81ee-4&from=paste&height=467&id=u088d0564&originHeight=934&originWidth=2012&originalType=binary&ratio=2&rotation=0&showTitle=false&size=215028&status=done&style=none&taskId=uf1feb21d-8f1d-4077-9c18-65abf9d4a97&title=&width=1006)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711186398601-c160119d-88ba-46a0-8aaa-a90f08ff9f54.png#averageHue=%23f9f8f8&clientId=uaf3363e9-760a-4&from=paste&height=446&id=ua4f7f0ad&originHeight=892&originWidth=1416&originalType=binary&ratio=2&rotation=0&showTitle=false&size=269743&status=done&style=none&taskId=ucfc1ecfe-4a57-4388-b0f8-c73c5d494a9&title=&width=708)<br />动作监听是前面两个的简化版，只能监听鼠标点击或键盘的空格

<a name="XKVVz"></a>
### 动作监听:
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711188774008-9ffb19c5-6c8b-4589-80d0-3feb8c14acb0.png#averageHue=%23fdfcfa&clientId=ud9d608a4-7bd6-4&from=paste&height=327&id=u701564a3&originHeight=654&originWidth=1392&originalType=binary&ratio=2&rotation=0&showTitle=false&size=399966&status=done&style=none&taskId=u203454d6-bbea-47d3-858d-1c059ffbad9&title=&width=696)<br />// addActionListener 方法的形参 ActionListener 是一个接口，所以需要定义一个实现类去实<br />//现ActionListener 这个接口并重写其中的方法<br />JFrame 的对象.addActionListener(重写的 ActionListener 接口的对象);

实现类对于接口的重写：![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711188721937-231abbd4-c7f3-4588-82eb-34bdf2fdf3fb.png#averageHue=%23313135&clientId=ud9d608a4-7bd6-4&from=paste&height=384&id=u27dee482&originHeight=768&originWidth=1420&originalType=binary&ratio=2&rotation=0&showTitle=false&size=147092&status=done&style=none&taskId=u2e9a5629-3a08-4b4b-85c0-edb39e4b427&title=&width=710)<br />因为此按钮只需要被用一次，所以可以使用匿名内部类改进

或者再改进，直接在定义界面的类实现 ActionListener 接口，然后在JFrame 的对象.addActionListener(this);	//括号中写 this，即是调用本类中重写的方法<br />这样会不会无论点什么按钮都会触发相同反馈？所以就在本类重写的方法中获取当前被操作的对象，用 Object 接收，即 Object source = e.getSource(); ， 然后再用==号去把 source 和按钮对象进行比较
```java
package com.itheima.test.事件监听.动作监听改写版难;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {
    //创建界面对象
    JFrame jFrame = new JFrame();
    JButton jButton1 = new JButton("点我啊");
    JButton jButton2 = new JButton("点我啊");
    public MyJFrame(){
        //设置界面
        jFrame.setSize(603,680);
        //设置界面标题
        jFrame.setTitle("按钮搞怪");
        //界面置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消默认居中放置
        jFrame.setLayout(null);

        //设置按钮位置宽高
        jButton1.setBounds(0,0,100,50);
        //添加事件
        jButton1.addActionListener(this);

        //设置按钮位置宽高
        jButton2.setBounds(100,0,100,50);
        //添加事件
        jButton2.addActionListener(this);

        //把按钮添加到界面中
        jFrame.getContentPane().add(jButton1);
        jFrame.getContentPane().add(jButton2);

        //显示界面
        jFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //获取操作按钮对象
        Object source = e.getSource();
        //判断
        if (jButton1 == source){
            jButton1.setSize(200,200);
        }
        if(jButton2 == source){
            Random r = new Random();
            jButton2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }
}
```
```java
package com.itheima.test.事件监听.动作监听改写版难;

public class Test {
    public static void main(String[] args) {
        new MyJFrame();
    }
}
```
<a name="pBA6n"></a>
### 鼠标监听
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711191039024-a6830777-78fb-4f11-b352-29fb4b1ae322.png#averageHue=%23f6f4f4&clientId=u40347064-54b3-4&from=paste&height=590&id=ub454e4a9&originHeight=1180&originWidth=2332&originalType=binary&ratio=2&rotation=0&showTitle=false&size=387996&status=done&style=none&taskId=ucc9c22f2-1958-4071-b918-5fd3274a83c&title=&width=1166)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711191056781-bc8abb77-a3f5-4163-b76a-e38039941a72.png#averageHue=%23fbf8f8&clientId=u40347064-54b3-4&from=paste&height=517&id=u75687f67&originHeight=1034&originWidth=2400&originalType=binary&ratio=2&rotation=0&showTitle=false&size=347797&status=done&style=none&taskId=ud6a362f8-25f6-44f6-8453-bcf00706375&title=&width=1200)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711191867232-09c0cf18-40c2-409f-844a-78166eff80a0.png#averageHue=%23faf9f8&clientId=u40347064-54b3-4&from=paste&height=541&id=u4bef7a28&originHeight=1082&originWidth=2400&originalType=binary&ratio=2&rotation=0&showTitle=false&size=724283&status=done&style=none&taskId=u03553cdd-8d93-40cd-b359-b89fc72a97a&title=&width=1200)

```java
package com.itheima.test.事件监听.鼠标监听;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener{
    JButton jtb1 = new JButton("点");

    public MyJFrame2(){
        //设置界面大小
        this.setSize(603,680);
        //设置界面标题
        this.setTitle("啦啦啦");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //取消默认居中放置
        this.setLayout(null);
        //设置界面关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //设置按钮位置和大小
        jtb1.setBounds(0,0,100,50);
        //将按钮绑定鼠标事件
        jtb1.addMouseListener(this);



        //按钮添加进隐藏容器
        this.getContentPane().add(jtb1);
        //界面显示
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("滑入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("滑出");
    }
}
```

```java
package com.itheima.test.事件监听.鼠标监听;

public class Test {
    public static void main(String[] args) {
        new MyJFrame2();
    }
}
```
<a name="IHAnN"></a>
### 键盘监听
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711192795754-e94434d2-71c0-41c9-aefc-22d25e1d2ba2.png#averageHue=%23f7f6f4&clientId=u41419ac5-da20-4&from=paste&height=547&id=uc857e878&originHeight=1094&originWidth=2498&originalType=binary&ratio=2&rotation=0&showTitle=false&size=567367&status=done&style=none&taskId=u5978e2a2-679e-4570-9000-3dcbeeec634&title=&width=1249)getKeyChar 直接就是获取到按下的字母<br />e.getKeyCode();获取键盘的序号
<a name="Euw9O"></a>
## 打包成 exe 文件
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1711269130766-0806c529-e1cb-4f30-8e0f-9d884f88824c.png#averageHue=%23f7eceb&clientId=u54b06d9a-9c44-4&from=paste&height=451&id=u1822e64a&originHeight=902&originWidth=2026&originalType=binary&ratio=2&rotation=0&showTitle=false&size=322963&status=done&style=none&taskId=u7375e7fe-c8d0-465f-ab48-a4e71cc11f8&title=&width=1013)
<a name="ou4IS"></a>
# 数据结构
<a name="RilBx"></a>
## 树
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713100948175-3de1633e-a774-4c84-ac7e-2f66ac3ab664.png#averageHue=%23fefdfd&clientId=ub338cbb6-b7c9-4&from=paste&height=621&id=u52be7e3f&originHeight=1242&originWidth=2464&originalType=binary&ratio=2&rotation=0&showTitle=false&size=261471&status=done&style=none&taskId=uccbd4c92-7b0c-4553-9e9b-3875f0b4f3d&title=&width=1232)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713100974379-33b08d35-2467-47fd-8611-da7796566b94.png#averageHue=%23fdf8f8&clientId=ub338cbb6-b7c9-4&from=paste&height=652&id=ue904be98&originHeight=1304&originWidth=2562&originalType=binary&ratio=2&rotation=0&showTitle=false&size=414387&status=done&style=none&taskId=u860076b7-0f5e-4053-a3a0-8ef2d8426b2&title=&width=1281)
<a name="s6kjv"></a>
### 二叉树概念	每一个节点的度<=2
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713098471685-d4a1b624-a974-489e-87dc-a60920785cd6.png#averageHue=%23fbf1f1&clientId=u8023686a-c168-4&from=paste&height=555&id=u3a84faab&originHeight=1110&originWidth=2538&originalType=binary&ratio=2&rotation=0&showTitle=false&size=461380&status=done&style=none&taskId=u8141e003-a025-40ec-882c-31fe404e68d&title=&width=1269)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713098564598-026b6a59-41d3-4514-92ac-9737bb11c963.png#averageHue=%23f7f1ee&clientId=u8023686a-c168-4&from=paste&height=606&id=ubbcb9601&originHeight=1212&originWidth=2552&originalType=binary&ratio=2&rotation=0&showTitle=false&size=833308&status=done&style=none&taskId=u1686be47-cdc8-4de9-9ad0-aa49e3f9482&title=&width=1276)
<a name="GdUUy"></a>
### 二叉查找树
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713098690074-b4590e1a-f506-44b2-97c7-bba7c3cd1656.png#averageHue=%23edefed&clientId=u8023686a-c168-4&from=paste&height=578&id=u9ad772a5&originHeight=1156&originWidth=2492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=646157&status=done&style=none&taskId=u76b1281c-703d-425b-843d-81a2764b74b&title=&width=1246)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713098836240-47a869c9-a284-4225-a05d-b6437cdc9a53.png#averageHue=%23fdfafa&clientId=u8023686a-c168-4&from=paste&height=614&id=u0e980ea1&originHeight=1228&originWidth=2436&originalType=binary&ratio=2&rotation=0&showTitle=false&size=594660&status=done&style=none&taskId=ua23fccf1-3a69-48fe-8310-4e0eebd8096&title=&width=1218)
<a name="RcPvP"></a>
### 二叉树遍历方式
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713098943381-79ead27b-f25e-4060-bcee-89057a79770c.png#averageHue=%23f8efee&clientId=u8023686a-c168-4&from=paste&height=497&id=FhLTE&originHeight=994&originWidth=974&originalType=binary&ratio=2&rotation=0&showTitle=false&size=171497&status=done&style=none&taskId=uc1f67f65-3255-4958-88b1-80cac1167a8&title=&width=487)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713100285810-0cf90ff8-97eb-44e9-94ad-01e75bbcb331.png#averageHue=%23fefcfc&clientId=u8023686a-c168-4&from=paste&height=481&id=u9a1274ab&originHeight=962&originWidth=1432&originalType=binary&ratio=2&rotation=0&showTitle=false&size=270007&status=done&style=none&taskId=u7e71f83c-3f41-4e7c-af7c-394424fd86b&title=&width=716)
<a name="illA2"></a>
#### 前序遍历
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713099117715-0083244a-b86a-4228-a021-77e403b22ec3.png#averageHue=%23fdfcfb&clientId=u8023686a-c168-4&from=paste&height=528&id=uad3bb0e4&originHeight=1056&originWidth=2452&originalType=binary&ratio=2&rotation=0&showTitle=false&size=413735&status=done&style=none&taskId=u1514dc9b-cf30-4b5b-a0f2-e1534c76138&title=&width=1226)<br />![](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1713099849140-36e7824e-c461-44ea-9e18-e955e40cdda2.jpeg)<br />![](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1713100074429-dc0ae711-73d1-4b0e-a528-22e43788b61c.jpeg)

<a name="DFBUz"></a>
#### 中序遍历	小 -> 大
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713099933310-b20b8d34-dbe6-405c-8b74-9e3c22177d67.png#averageHue=%23fdfbfb&clientId=u8023686a-c168-4&from=paste&height=501&id=u69d6b5aa&originHeight=1002&originWidth=2310&originalType=binary&ratio=2&rotation=0&showTitle=false&size=395567&status=done&style=none&taskId=u6404f73f-7d96-46b0-9813-45bb47a8f35&title=&width=1155)<br />![](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1713099849140-36e7824e-c461-44ea-9e18-e955e40cdda2.jpeg)<br />![](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1713100010184-5671cae2-93eb-4c92-be62-0444203fe85b.jpeg)
<a name="r50Vu"></a>
#### 后序遍历
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713100125384-658a9c8d-3342-45f5-856e-dd81ff28a659.png#averageHue=%23fdfbfb&clientId=u8023686a-c168-4&from=paste&height=499&id=u6c1b564e&originHeight=998&originWidth=2364&originalType=binary&ratio=2&rotation=0&showTitle=false&size=395996&status=done&style=none&taskId=u5819c1b6-35bd-4f28-9f37-2afe8c7bde2&title=&width=1182)<br />![](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1713099849140-36e7824e-c461-44ea-9e18-e955e40cdda2.jpeg)<br />![](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1713100182847-ec947423-d7f3-4ed8-be95-be6707c8d4a2.jpeg)
<a name="d0DhX"></a>
#### 层序遍历
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713100212026-078b1876-c9fb-4182-9fec-d2e93ea43368.png#averageHue=%23fdfcfc&clientId=u8023686a-c168-4&from=paste&height=541&id=ud1b0f85b&originHeight=1082&originWidth=2502&originalType=binary&ratio=2&rotation=0&showTitle=false&size=343866&status=done&style=none&taskId=u3704a5dd-a6a6-445b-b7b4-fd03dcccda8&title=&width=1251)<br />![](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1713099849140-36e7824e-c461-44ea-9e18-e955e40cdda2.jpeg)<br />![](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1713100270822-4b975c15-723e-4414-ae9c-3131f33a2356.jpeg)

<a name="jnVbz"></a>
### 二叉查找数弊端	--	引入平衡二叉树
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713100513685-6ac343c0-15fd-4cc2-b587-f9d9003a67a8.png#averageHue=%23f8f5f5&clientId=u8023686a-c168-4&from=paste&height=574&id=u82aea0d7&originHeight=1148&originWidth=2480&originalType=binary&ratio=2&rotation=0&showTitle=false&size=292108&status=done&style=none&taskId=u22bebda1-cde1-40b4-8797-919789a53e8&title=&width=1240)
<a name="CpoTO"></a>
### 平衡二叉树：任意节点的左右子树高度差不超过 1 	
<a name="cBD97"></a>
#### 定义
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713100839402-38737597-5b78-456b-aeb5-789bb5c2451e.png#averageHue=%23f6f5f5&clientId=ub338cbb6-b7c9-4&from=paste&height=603&id=u34d330cd&originHeight=1205&originWidth=1492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=375462&status=done&style=none&taskId=u4ad32d51-240e-4b57-b24d-1b342360bac&title=&width=746)<br />此数不是平衡二叉树，因为节点 10 左子树高度为 0，右子树高度为 3，左右子树高度差为 3。节点 11 左子树高度为 0，右子树高度为 2，左右子树高度差为 2。<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713100869974-aab31546-7141-43f4-b550-7461b5569d37.png#averageHue=%23fdfcfc&clientId=ub338cbb6-b7c9-4&from=paste&height=388&id=ufe8b1657&originHeight=776&originWidth=1002&originalType=binary&ratio=2&rotation=0&showTitle=false&size=154724&status=done&style=none&taskId=u82f7884c-13e3-4cbe-b94b-36e89b09fdc&title=&width=501)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713100893549-a600d15f-dd51-4adf-9540-5f16728179e6.png#averageHue=%23f8f3f3&clientId=ub338cbb6-b7c9-4&from=paste&height=606&id=ufef88a31&originHeight=1212&originWidth=2484&originalType=binary&ratio=2&rotation=0&showTitle=false&size=435057&status=done&style=none&taskId=u476b47c5-8026-4e9d-ab29-e203ad0c253&title=&width=1242)
<a name="Garct"></a>
#### 平衡二叉树的旋转机制：只有添加一个节点后不再是平衡二叉树时才触发
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713278158674-c3801e96-32f4-47d7-9446-6748014628ef.png#averageHue=%23f7f9f7&clientId=u9c90085c-fb7b-4&from=paste&height=494&id=ufe439c03&originHeight=988&originWidth=1892&originalType=binary&ratio=2&rotation=0&showTitle=false&size=417891&status=done&style=none&taskId=uc11384c9-ef67-4dad-a50f-ecdc9383613&title=&width=946)
<a name="FgPfB"></a>
##### 左旋
<a name="p0KZd"></a>
###### 例子一
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713278566793-4150063a-15e6-418a-b88b-0d203bf97a48.png#averageHue=%23f2dad5&clientId=u9c90085c-fb7b-4&from=paste&height=566&id=ue9978fe2&originHeight=1132&originWidth=2590&originalType=binary&ratio=2&rotation=0&showTitle=false&size=382208&status=done&style=none&taskId=u8d87cdf2-7530-4ebb-9bb0-3c1c7e6db1a&title=&width=1295)<br />从添加的节点开始，不断向父节点寻找不平衡的节点（此处的不平衡指的就是该节点左右子树高度差大于一），以此节点为支点进行旋转<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713278783824-0d8a0538-51dc-4e4b-bf71-d35cc5764987.png#averageHue=%23f6f9f7&clientId=u3b5725fa-32a7-4&from=paste&height=569&id=u247d89dc&originHeight=1138&originWidth=2606&originalType=binary&ratio=2&rotation=0&showTitle=false&size=557512&status=done&style=none&taskId=u77fbee1d-e284-49bb-a5af-9918ce4be44&title=&width=1303)<br />左旋：把支点左旋降级，变成左子节点，晋升原来的右子节点。

<a name="IUoLs"></a>
###### 例子二：
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713279112652-22f705bf-dfc5-4005-abe0-419564d02e6d.png#averageHue=%23f5f7f5&clientId=u3b5725fa-32a7-4&from=paste&height=612&id=u4dcb3b2c&originHeight=1224&originWidth=2574&originalType=binary&ratio=2&rotation=0&showTitle=false&size=758573&status=done&style=none&taskId=ua05d058d-3021-483b-9fee-bb7903791ed&title=&width=1287)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713279206338-1641a014-156d-4093-8e4f-48d493a2be4c.png#averageHue=%23f8faf8&clientId=u3b5725fa-32a7-4&from=paste&height=633&id=udc197836&originHeight=1266&originWidth=2588&originalType=binary&ratio=2&rotation=0&showTitle=false&size=771225&status=done&style=none&taskId=uf8085edc-e2dc-4707-ac0c-78aa521cefa&title=&width=1294)<br />可以先不看 9，然后按照例子一的方式左旋，然后把 9 作为原根节点当作右子节点<br />此处 9 的详细解释为：<br />![](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1713280222671-0748d810-7daa-47c9-b5d1-8a5b054e26db.jpeg)<br />![](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1713398888736-562e50f1-0970-427b-b637-fc2823e1b268.jpeg)

<a name="s40Qs"></a>
##### 右旋
<a name="Mg3hA"></a>
###### 例子 1
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713398253668-8a1bd4d4-c456-4aad-a311-cc1b2c3c06e4.png#averageHue=%23f3f1f1&clientId=ua5158a15-244f-4&from=paste&height=586&id=u6b0036fd&originHeight=1172&originWidth=2536&originalType=binary&ratio=2&rotation=0&showTitle=false&size=505287&status=done&style=none&taskId=ue504be16-43b9-4b3a-b2af-a7912591f54&title=&width=1268)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713398297593-fe959e37-681d-4222-a455-15a5e080e221.png#averageHue=%23f2f1f1&clientId=ua5158a15-244f-4&from=paste&height=567&id=u42b47648&originHeight=1133&originWidth=2518&originalType=binary&ratio=2&rotation=0&showTitle=false&size=503273&status=done&style=none&taskId=u397741b1-b14f-4eb6-a03f-76363f325d6&title=&width=1259)
<a name="sCDKp"></a>
###### 例子 2
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713398324917-ad3d95bf-a9ab-4c78-9c86-6b3ed33ef5f2.png#averageHue=%23f1efef&clientId=ua5158a15-244f-4&from=paste&height=619&id=u3e0b7d2f&originHeight=1238&originWidth=2556&originalType=binary&ratio=2&rotation=0&showTitle=false&size=620360&status=done&style=none&taskId=u85f6c142-cca0-4756-8892-41989aebc9e&title=&width=1278)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713398380323-8f3a522d-5235-4c5a-a32b-bf0bc9377a4f.png#averageHue=%23f1f0f0&clientId=ua5158a15-244f-4&from=paste&height=596&id=u6b957cce&originHeight=1192&originWidth=2546&originalType=binary&ratio=2&rotation=0&showTitle=false&size=615635&status=done&style=none&taskId=uff8812b2-418d-4fdc-bfc4-5b0b915d371&title=&width=1273)<br />同左旋一样，此处的 7 为支点旋转，5 本来是 4 的右子节点，但是旋转完 4 的右子节点为 7，所以 5 只能变为 7 的左子节点

![](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1713398837073-d10a22ba-3c0d-4343-b252-a4b2ecfb1905.jpeg)<br />![](https://cdn.nlark.com/yuque/0/2024/jpeg/42587642/1713399031510-6b70da12-c6e1-4145-be31-d533f3bc4ca0.jpeg)

<a name="F6ZHD"></a>
#### 平衡二叉树需要旋转的四种情况
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402875446-e6fe9b68-6ef7-4c7d-bc81-4c4e7fcf5e8c.png#averageHue=%23f6f1f0&clientId=u627f3a6f-8a11-4&from=paste&height=482&id=u006cffa3&originHeight=964&originWidth=1762&originalType=binary&ratio=2&rotation=0&showTitle=false&size=443164&status=done&style=none&taskId=u092cf317-b207-4208-b9f8-05a2c0437aa&title=&width=881)
<a name="cW1qN"></a>
##### 左左：		一次右旋
左左：当根节点左子树的左子树有节点插入，导致二叉树不平衡

在左子树的左子树添加节点导致不平衡：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713399245773-ceda0d12-1dab-4232-bc2a-377272df0ea3.png#averageHue=%23f5f2f2&clientId=ua5158a15-244f-4&from=paste&height=534&id=uf6a05af8&originHeight=1068&originWidth=2008&originalType=binary&ratio=2&rotation=0&showTitle=false&size=345834&status=done&style=none&taskId=ubd2fcf9d-bd4a-4a9b-9762-b17e4a58604&title=&width=1004)

寻找支点：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713399311989-e73fb578-a10f-4304-b930-406a849bdaf4.png#averageHue=%23f6f3f3&clientId=ua5158a15-244f-4&from=paste&height=537&id=ub3d9d361&originHeight=1074&originWidth=2322&originalType=binary&ratio=2&rotation=0&showTitle=false&size=397204&status=done&style=none&taskId=uaa0c24fe-e2db-48a3-a8fb-e82f8935db5&title=&width=1161)

右旋：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713399332490-ccf2e671-ebbb-4d51-a009-ed29e742c771.png#averageHue=%23f5f4f4&clientId=ua5158a15-244f-4&from=paste&height=584&id=deY8E&originHeight=1168&originWidth=2522&originalType=binary&ratio=2&rotation=0&showTitle=false&size=491554&status=done&style=none&taskId=ud966a0b0-0bca-42f4-8a4b-cbdf843896a&title=&width=1261)
<a name="zJGSV"></a>
##### 左右：		先局部的左旋变成左左，然后再整体右旋
在左子树的右子树添加节点导致不平衡：	<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713399633589-f48912f4-f1ee-4514-af0b-60857332eaed.png#averageHue=%23f7f6f6&clientId=ua5158a15-244f-4&from=paste&height=325&id=u34c45f0e&originHeight=650&originWidth=1254&originalType=binary&ratio=2&rotation=0&showTitle=false&size=158265&status=done&style=none&taskId=u34945218-7623-4324-b117-da59a86d557&title=&width=627)

找支点：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402044131-26d5a961-5ed6-40cb-9f12-d368d6a319bf.png#averageHue=%23f4f3f3&clientId=u627f3a6f-8a11-4&from=paste&height=569&id=u8a2c5f8a&originHeight=1137&originWidth=2271&originalType=binary&ratio=2&rotation=0&showTitle=false&size=346467&status=done&style=none&taskId=u2f3253dd-50d9-4595-b7e4-70ddc0b645c&title=&width=1135.5)

右旋：		无法解决<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402094999-1584c646-da6f-4ac9-af63-97b5b8787dad.png#averageHue=%23f7f5f5&clientId=u627f3a6f-8a11-4&from=paste&height=595&id=u6034d476&originHeight=1190&originWidth=1982&originalType=binary&ratio=2&rotation=0&showTitle=false&size=403953&status=done&style=none&taskId=ud5bcfdcd-0dc7-4255-ac3f-a3346bfa479&title=&width=991)<br />此时根节点左子树高度为 1，右子树 4-7-5-6 高度为 3，还是不平衡，所以无法解决

归位：<br />先把紫色圈中的进行局部左旋，将这个左右的情况变成左左<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402251833-a89bca0d-584a-4af9-b34d-4b871edb5106.png#averageHue=%23f7f6f6&clientId=u627f3a6f-8a11-4&from=paste&height=592&id=u2436fa88&originHeight=1184&originWidth=2064&originalType=binary&ratio=2&rotation=0&showTitle=false&size=318828&status=done&style=none&taskId=uf1a72c22-a065-4fc1-b7c9-d04bc5b203d&title=&width=1032)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402313376-259023d9-a86c-4c44-b83b-860a129a4ad0.png#averageHue=%23f7f6f6&clientId=u627f3a6f-8a11-4&from=paste&height=590&id=u9dbd555d&originHeight=1180&originWidth=2086&originalType=binary&ratio=2&rotation=0&showTitle=false&size=327483&status=done&style=none&taskId=u28c9d048-1aac-4824-82df-93563c9c64e&title=&width=1043)<br />然后再当成左左处理，即进行右旋：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402372689-69b4a723-da1a-4098-a89d-c8b2b5a74c1b.png#averageHue=%23f8f7f7&clientId=u627f3a6f-8a11-4&from=paste&height=589&id=ub925fbac&originHeight=1178&originWidth=2370&originalType=binary&ratio=2&rotation=0&showTitle=false&size=420455&status=done&style=none&taskId=u19408fb9-c924-4e70-8325-7294a7d9e28&title=&width=1185)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402380674-d0f068bb-7b40-4f7e-895d-7925cb064ba9.png#averageHue=%23f4f3f2&clientId=u627f3a6f-8a11-4&from=paste&height=576&id=u0608b6ec&originHeight=1152&originWidth=2418&originalType=binary&ratio=2&rotation=0&showTitle=false&size=447381&status=done&style=none&taskId=u135e1db6-59ea-453c-a4c9-ec750ff88cd&title=&width=1209)
<a name="yVGwN"></a>
##### 右右：		一次左旋
在右子树的右子树添加节点导致不平衡：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402492121-87ed3721-6fc9-4385-bdc4-32563e1e9cb9.png#averageHue=%23f2f1f1&clientId=u627f3a6f-8a11-4&from=paste&height=408&id=ua7298862&originHeight=816&originWidth=1492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=180042&status=done&style=none&taskId=u979c70ed-1779-4323-9589-5c1ee3782fd&title=&width=746)<br />找支点，左旋：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402612609-5bedd122-0c16-4741-a26e-91ed95e01e12.png#averageHue=%23f7f6f6&clientId=u627f3a6f-8a11-4&from=paste&height=563&id=ue1fcae08&originHeight=1126&originWidth=2226&originalType=binary&ratio=2&rotation=0&showTitle=false&size=374968&status=done&style=none&taskId=u28aa3044-fef0-4697-be44-26c9cf621b3&title=&width=1113)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402630321-175834a8-d910-4b21-bbfc-ddc018ff8cbf.png#averageHue=%23f4f1f0&clientId=u627f3a6f-8a11-4&from=paste&height=572&id=u0b5f49a8&originHeight=1144&originWidth=2362&originalType=binary&ratio=2&rotation=0&showTitle=false&size=409897&status=done&style=none&taskId=ub82afcb8-8b30-48a7-9c1a-ef167b39775&title=&width=1181)
<a name="uSjo0"></a>
##### 右左：		先局部的右旋变成右右，然后再整体左旋	
一次左旋能变平衡吗？ 没有<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402703899-ef04bc21-e401-40dc-9c76-9905d7c3f57f.png#averageHue=%23f4f3f3&clientId=u627f3a6f-8a11-4&from=paste&height=581&id=u74f4e9a0&originHeight=1162&originWidth=2248&originalType=binary&ratio=2&rotation=0&showTitle=false&size=385208&status=done&style=none&taskId=u56288f99-ab48-4600-bb2f-0b98f54e2b4&title=&width=1124)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402718850-0a5e5ad8-7678-48be-9029-4377c3c2b4c4.png#averageHue=%23f4f0ef&clientId=u627f3a6f-8a11-4&from=paste&height=559&id=u6629a631&originHeight=1118&originWidth=2364&originalType=binary&ratio=2&rotation=0&showTitle=false&size=419007&status=done&style=none&taskId=uc252066b-daea-44dd-8dfc-ce6fe272821&title=&width=1182)<br />局部右旋变成右右：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402777569-f55f70e0-1312-40af-b298-719f9ee9da43.png#averageHue=%23f8f7f6&clientId=u627f3a6f-8a11-4&from=paste&height=588&id=u72e312e9&originHeight=1176&originWidth=2228&originalType=binary&ratio=2&rotation=0&showTitle=false&size=342092&status=done&style=none&taskId=u0c4c1a82-44e2-4595-ba6e-c9ed1cb051b&title=&width=1114)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402787394-428883e0-f1f7-411a-8b64-6909bfe3d655.png#averageHue=%23f6f5f5&clientId=u627f3a6f-8a11-4&from=paste&height=556&id=u70acc262&originHeight=1112&originWidth=1946&originalType=binary&ratio=2&rotation=0&showTitle=false&size=324497&status=done&style=none&taskId=u93658e35-87d7-432e-bd4d-4027193df14&title=&width=973)<br />然后再整体左旋：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402805095-65b043c2-1b37-4fb3-a2b0-8a5be9c52b9a.png#averageHue=%23f8f7f6&clientId=u627f3a6f-8a11-4&from=paste&height=606&id=u6051b4a6&originHeight=1212&originWidth=2234&originalType=binary&ratio=2&rotation=0&showTitle=false&size=417670&status=done&style=none&taskId=uc65db6b7-65cc-4204-8679-ef0f4f98852&title=&width=1117)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402815525-f5728803-388d-4870-9582-b9b29fd02332.png#averageHue=%23f7f6f6&clientId=u627f3a6f-8a11-4&from=paste&height=553&id=uc1f6bb95&originHeight=1106&originWidth=2438&originalType=binary&ratio=2&rotation=0&showTitle=false&size=455259&status=done&style=none&taskId=uc2917cd5-14b7-4a30-827b-8bb81f8fa84&title=&width=1219)

<a name="uoKT1"></a>
#### 总结
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402947107-8fe81cfc-2387-4620-a163-af38ac4ad5f1.png#averageHue=%23faf7f7&clientId=u627f3a6f-8a11-4&from=paste&height=503&id=u1e2840da&originHeight=1006&originWidth=2408&originalType=binary&ratio=2&rotation=0&showTitle=false&size=409671&status=done&style=none&taskId=ufee0034a-6510-4bf4-8dad-f6789c59fe5&title=&width=1204)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713402960020-3653b0ba-872c-47f0-93c7-ff5e010d201a.png#averageHue=%23f9f8f8&clientId=u627f3a6f-8a11-4&from=paste&height=580&id=uc3389164&originHeight=1160&originWidth=2034&originalType=binary&ratio=2&rotation=0&showTitle=false&size=394674&status=done&style=none&taskId=u6a2f90af-fcb0-4fa7-8aed-be212c7ab90&title=&width=1017)




<a name="RTrQ0"></a>
### 数的演变
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713101245856-bef8a93a-68e3-468c-9ba2-b84b925abe13.png#averageHue=%23fbf4f2&clientId=ub338cbb6-b7c9-4&from=paste&height=654&id=u29ea2c59&originHeight=1308&originWidth=2482&originalType=binary&ratio=2&rotation=0&showTitle=false&size=599988&status=done&style=none&taskId=u03c72d50-8284-40e3-acac-b14b1e02f10&title=&width=1241)
<a name="EWbcG"></a>
### 红黑树：自平衡的二叉查找树
送给大家一个口诀: 左跟右,根叶黑,不红红,黑路同
<a name="vkH6u"></a>
#### 定义：
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713403126372-b18623c1-42f5-49c3-8689-71a23b4e3876.png#averageHue=%23efebea&clientId=u627f3a6f-8a11-4&from=paste&height=620&id=u222e5770&originHeight=1240&originWidth=2340&originalType=binary&ratio=2&rotation=0&showTitle=false&size=620588&status=done&style=none&taskId=u7ef9e3d1-b8dc-44c3-84dc-11f84f6ea7a&title=&width=1170)
<a name="l3bpH"></a>
#### 平衡二叉树和红黑树的比较：
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713403171242-e578879a-70be-45f7-abc7-f1113320671e.png#averageHue=%23f8f2f1&clientId=u627f3a6f-8a11-4&from=paste&height=272&id=uab43b193&originHeight=544&originWidth=2118&originalType=binary&ratio=2&rotation=0&showTitle=false&size=194125&status=done&style=none&taskId=ud21cc81d-0c84-4e8e-aacf-2b3ffdb7100&title=&width=1059)
<a name="oe7KV"></a>
#### 红黑规则：
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713403331565-0e272965-265d-425e-a975-d85e321933bc.png#averageHue=%23f0eceb&clientId=u627f3a6f-8a11-4&from=paste&height=652&id=u4984b133&originHeight=1304&originWidth=2624&originalType=binary&ratio=2&rotation=0&showTitle=false&size=828011&status=done&style=none&taskId=u2fb6928e-4dd0-41d0-b75f-1cd082752ab&title=&width=1312)<br />后代叶节点：<br />25 的后代叶节点为框起来的三个<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713403659979-b4f81259-0dda-4c72-8a8d-fb169bc2d0bb.png#averageHue=%23e7e0df&clientId=u627f3a6f-8a11-4&from=paste&height=370&id=ub67757dc&originHeight=740&originWidth=1644&originalType=binary&ratio=2&rotation=0&showTitle=false&size=270514&status=done&style=none&taskId=ue9f2816d-073e-4f7a-ad88-a19e6a1e272&title=&width=822)<br />简单路径：单条路走，不能回头


<a name="TVf29"></a>
#### 添加节点：
<a name="AUlMj"></a>
##### 若添加的节点默认颜色是红色的比黑色效率高
<a name="VW9a5"></a>
###### 添加的节点为黑色：添加了 3 个节点，调整了 2 次
添加一个 20，满足红黑规则：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713403995872-2c4bd75d-b846-4427-8135-daafb09ee726.png#averageHue=%23f5f4f4&clientId=u627f3a6f-8a11-4&from=paste&height=599&id=u9033ffef&originHeight=1198&originWidth=2702&originalType=binary&ratio=2&rotation=0&showTitle=false&size=390254&status=done&style=none&taskId=ucf04f83d-860f-4502-b81d-577624b08dd&title=&width=1351)<br />添加一个 18，违背规则 5：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713403981641-fa96fd83-00b8-4c92-862a-ae42dd1e5019.png#averageHue=%23efeeee&clientId=u627f3a6f-8a11-4&from=paste&height=661&id=ued21c0c1&originHeight=1322&originWidth=2702&originalType=binary&ratio=2&rotation=0&showTitle=false&size=588662&status=done&style=none&taskId=u3882dd3c-d1b7-4a70-9c3b-d37fe4376e9&title=&width=1351)<br />第一次调整：把 18 变成红色：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713404052667-a090acbd-839a-49b1-8e6d-c1406c605700.png#averageHue=%23f1efef&clientId=u627f3a6f-8a11-4&from=paste&height=671&id=u339f5b97&originHeight=1342&originWidth=2742&originalType=binary&ratio=2&rotation=0&showTitle=false&size=551830&status=done&style=none&taskId=udf4fd235-1766-4c14-a5ed-9878e20cc0d&title=&width=1371)<br />再添加 23，又违背了规则 5，在 20 到左边的 nil 这条简单路径上有 2 个黑色节点，但是到右边的 nil 有 3 个黑色节点：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713404080490-43b67882-a3da-4274-b8cc-05639226c9fb.png#averageHue=%23eeecec&clientId=u627f3a6f-8a11-4&from=paste&height=673&id=u984c77bb&originHeight=1346&originWidth=2714&originalType=binary&ratio=2&rotation=0&showTitle=false&size=644174&status=done&style=none&taskId=ufec3f677-bc10-4e1f-b683-6d7b0b870a4&title=&width=1357)<br />第二次调整：把 23 变成红色：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713404206079-77f6fbe8-d609-4194-a28f-aeb400259005.png#averageHue=%23f0ecec&clientId=u627f3a6f-8a11-4&from=paste&height=718&id=u81c8d1e4&originHeight=1436&originWidth=2741&originalType=binary&ratio=2&rotation=0&showTitle=false&size=763465&status=done&style=none&taskId=u6b046f9d-e04a-4127-81dc-e16d5c92b4a&title=&width=1370.5)






<a name="w66A7"></a>
###### 添加的节点为红色：添加了 3 个节点，调整了 1 次
添加 20，违背规则 2：<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713404363832-08aa86fd-e5b4-4b29-9609-5b8e21babdc0.png#averageHue=%23f9f4f4&clientId=u627f3a6f-8a11-4&from=paste&height=660&id=u330a3b16&originHeight=1320&originWidth=2760&originalType=binary&ratio=2&rotation=0&showTitle=false&size=510913&status=done&style=none&taskId=u5e4cd1ba-13d0-4cae-ac40-92b0e35c93f&title=&width=1380)<br />第一次调整：把根节点 20 变为黑色<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713404449669-51319f1b-378b-404a-8b1d-23ea982deba5.png#averageHue=%23f7f4f4&clientId=u627f3a6f-8a11-4&from=paste&height=679&id=u8cc989c5&originHeight=1358&originWidth=2757&originalType=binary&ratio=2&rotation=0&showTitle=false&size=494333&status=done&style=none&taskId=ud9ca6435-b60b-464c-8db5-27e210fe510&title=&width=1378.5)<br />添加 18：没有违背规则，无需调整<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713404482650-b55b0693-fee3-4dfa-9906-e0981ea19e89.png#averageHue=%23f3efef&clientId=u627f3a6f-8a11-4&from=paste&height=551&id=u6a60152d&originHeight=1102&originWidth=2676&originalType=binary&ratio=2&rotation=0&showTitle=false&size=414811&status=done&style=none&taskId=u6286ad64-46b3-4068-a5a4-533fb4f6204&title=&width=1338)<br />添加 23：也没有违背规则，无需调整<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713404510726-3b6077ca-591a-4395-9805-463147c349a8.png#averageHue=%23f5f1f1&clientId=u627f3a6f-8a11-4&from=paste&height=593&id=ua01f2ec9&originHeight=1186&originWidth=2790&originalType=binary&ratio=2&rotation=0&showTitle=false&size=448135&status=done&style=none&taskId=u2ef8eba1-785b-4ebb-aed4-a7630e6729d&title=&width=1395)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713404573935-3b318875-eb0d-4a44-942a-9b274a4b2734.png#averageHue=%23f3efef&clientId=u627f3a6f-8a11-4&from=paste&height=567&id=u3ec02f98&originHeight=1134&originWidth=2644&originalType=binary&ratio=2&rotation=0&showTitle=false&size=526757&status=done&style=none&taskId=ua1c96334-037f-48c1-b274-2ecb2a6330d&title=&width=1322)
<a name="Gl8o7"></a>
##### 添加节点的规则
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713610415330-16fe2bd3-d1b2-4187-b4dd-88dfb122415a.png#averageHue=%23f4eae8&clientId=u305e4c0d-a611-4&from=paste&height=619&id=u4b738b8b&originHeight=1237&originWidth=2536&originalType=binary&ratio=2&rotation=0&showTitle=false&size=801038&status=done&style=none&taskId=ud3da3b55-c4ec-47a8-8e0f-33c9721bf5e&title=&width=1268)
<a name="WXApA"></a>
# Stream 流
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713850928817-9c27b585-3abd-4bb1-9afe-a9274b4bee51.png#averageHue=%23f9f1f1&clientId=ucb1ed42a-f81b-4&from=paste&height=630&id=u4911cdd7&originHeight=1260&originWidth=2492&originalType=binary&ratio=2&rotation=0&showTitle=false&size=887928&status=done&style=none&taskId=u34048c70-a04b-4c77-8317-fcac62270a2&title=&width=1246)
<a name="Vlsce"></a>
## 初爽
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713760456786-fad91414-65aa-4e41-8638-05479dc7d8ce.png#averageHue=%23f5ded0&clientId=u8daf4e41-2bb2-4&from=paste&height=604&id=ue393aac6&originHeight=1208&originWidth=2402&originalType=binary&ratio=2&rotation=0&showTitle=false&size=663291&status=done&style=none&taskId=u737c8fa3-e3d5-4565-bc7c-7ab34265db8&title=&width=1201)
```java
package practise.Stream流;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //法一：正常写
        /*
        //1.把所以张开头的元素存入新集合中
        ArrayList<String> list1 = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("张")) {
                list1.add(s);
            }
        }

        System.out.println(list1);

        //2.把所以张开头且长度为3的元素存入新集合中
        ArrayList<String> list2 = new ArrayList<>();
        for (String s : list1) {
            if( s.length() == 3 ){
                list2.add(s);
            }
        }
        System.out.println(list2);*/


        //法二：stream流
        list.stream().filter(name->name.startsWith("张")).filter(name->name.length() == 3).forEach(name-> System.out.println(name));
    }

}
```
<a name="bOWYM"></a>
## 什么是 Stream 流
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713760535978-77741c85-54c8-4522-bd67-b88703dc045e.png#averageHue=%23fdfbfb&clientId=u8daf4e41-2bb2-4&from=paste&height=472&id=u88770619&originHeight=944&originWidth=2518&originalType=binary&ratio=2&rotation=0&showTitle=false&size=138280&status=done&style=none&taskId=ud74c5fc8-75ec-4d6d-aa71-f747690f933&title=&width=1259)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713760571768-ddba5d60-6b25-4794-a6e9-c798a1ecf78d.png#averageHue=%23f7efed&clientId=u8daf4e41-2bb2-4&from=paste&height=592&id=ue2d1b2cb&originHeight=1184&originWidth=2632&originalType=binary&ratio=2&rotation=0&showTitle=false&size=636627&status=done&style=none&taskId=u897d4016-be8b-4eb2-9e0e-52a05ba0d88&title=&width=1316)![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713760582824-d74aaaab-b832-48b4-8ac1-702b38ecff9e.png#averageHue=%23f7f5f5&clientId=u8daf4e41-2bb2-4&from=paste&height=434&id=u3ac922c7&originHeight=868&originWidth=1470&originalType=binary&ratio=2&rotation=0&showTitle=false&size=217570&status=done&style=none&taskId=u2460ca08-247d-4352-8ce7-f9e4b0235d7&title=&width=735)
<a name="j8k48"></a>
## Stream 流的获取

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713760793112-cc963858-1fbf-45dc-aa8f-fe2effd35e3e.png#averageHue=%23eee2e0&clientId=u8daf4e41-2bb2-4&from=paste&height=664&id=uadc984c5&originHeight=1328&originWidth=2706&originalType=binary&ratio=2&rotation=0&showTitle=false&size=612628&status=done&style=none&taskId=u10a45c5a-bd13-4f59-92ca-339843fe898&title=&width=1353)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713762006146-c8430e0f-2e07-45e3-b02d-deba6703b847.png#averageHue=%23fcfcf9&clientId=u1a5916b1-a082-4&from=paste&height=134&id=u69c4f04b&originHeight=268&originWidth=1452&originalType=binary&ratio=2&rotation=0&showTitle=false&size=252145&status=done&style=none&taskId=uf5dcdf64-570f-4b11-b6cc-21876a386b8&title=&width=726)
```java
package practise.Stream流;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Stream;

public class demo2 {
    public static void main(String[] args) {


        //单列集合
        //
        System.out.println("======================单列集合========================");
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加元素
        Collections.addAll(list, "A", "B", "C", "D", "E");
        //获取到一条流水线，并把集合放在流水线上
        Stream<String> stream1 = list.stream();
        //使用流水线终结方法，打印一条流水线上的所有数据
        stream1.forEach(System.out::println);


        //双列集合
        //
        System.out.println("=====================双列集合==========================");
        //创建集合
        HashMap<String, Integer> hm = new HashMap<>();
        //添加元素
        hm.put("aaa", 111);
        hm.put("bbb", 222);
        hm.put("ccc", 333);
        hm.put("ddd", 444);
        //第一种获取流水线
        System.out.println("---------------第一种获取流水线----------------");

        hm.keySet().stream().forEach(System.out::println);
        //第二种获取流水线
        System.out.println("---------------第二种获取流水线----------------");

        hm.entrySet().stream().forEach(System.out::println);


        //数组
        //
        System.out.println("=====================数组==========================");
        //创建数组
        System.out.println("---------------int[]----------------");

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("---------------String[]----------------");

        String[] str = {"a","b","c"};
        Arrays.stream(str).forEach(System.out::println);

        //一堆零散的数据（必须要同种数据类型）
        //
        System.out.println("=====================一堆零散的数据==========================");
        //创建
        System.out.println("---------------1----------------");
        Stream.of(1,2,3,4,5).forEach(System.out::println);

        System.out.println("---------------2----------------");
        Stream.of("a","b","c","d","e").forEach(System.out::println);

    }


}
```
<a name="Q55Et"></a>
## Stream 流的中间方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713762100913-e2e8a4b3-6ce0-48fc-b153-7d2e49764c18.png#averageHue=%23ece1df&clientId=u1a5916b1-a082-4&from=paste&height=626&id=u30098af1&originHeight=1252&originWidth=2538&originalType=binary&ratio=2&rotation=0&showTitle=false&size=632276&status=done&style=none&taskId=u059b2ad1-d73a-4c9a-8f1b-01ae53fd992&title=&width=1269)


:::info
filter  ：过滤

1. 返回值表示要还是不要，ture留下，false舍弃。
2. s表示依次获取每一个数据 👇

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713762590165-a95722b6-98f7-40c6-b8fc-88e9704bcc4b.png#averageHue=%23404246&clientId=u1a5916b1-a082-4&from=paste&height=59&id=Glbs3&originHeight=118&originWidth=894&originalType=binary&ratio=2&rotation=0&showTitle=false&size=25493&status=done&style=none&taskId=ube365041-8195-40f3-8cab-5f0820993c3&title=&width=447)

3. 中间方法，返回新的stream流，原来的stream流只能使用一次，建议使用链式编程

若再次使用原流，则报错 👇<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713762689372-c08b8042-9894-47bb-9bff-1c5f1ea538bd.png#averageHue=%23f9f7f3&clientId=u1a5916b1-a082-4&from=paste&height=174&id=RhAkC&originHeight=348&originWidth=1154&originalType=binary&ratio=2&rotation=0&showTitle=false&size=232258&status=done&style=none&taskId=u449529b0-3e3a-4231-a801-9f25dde4714&title=&width=577)
:::

> limit	：	获取前几个元素
> 1.  形参是要获取的元素个数，和索引无关


> skip：	跳过前几个元素
> 1.  形参是要获取的元素个数，和索引无关


:::success
distinct：		元素去重

1. 底层是 HashSet（）
:::

:::warning
concat：		合并两个流为一个流

1. 是 steam 的方法，stream.concat(）
:::

> Map：			转换流中的数据类型
> ![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713794015889-955aefee-3843-4424-b8bd-20b924be2d90.png#averageHue=%23353639&clientId=u9c44a99b-82c5-4&from=paste&height=403&id=u58976b09&originHeight=806&originWidth=1216&originalType=binary&ratio=2&rotation=0&showTitle=false&size=108941&status=done&style=none&taskId=u0960983e-6954-4ead-bdb8-abb65b804ec&title=&width=608)



```java

package practise.Stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class demo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张强","张三丰","张良","王二麻子","谢广坤");

        //filter 过滤
        System.out.println("==================filter=====================");
        //
        /* list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {

                return s.startsWith("张");//返回值表示要还是不要，ture留下，false舍弃
            }
        }).forEach(System.out::println);*/

        //s表示依次获取每一个数据
        list.stream().filter(s->s.startsWith("张")).forEach(System.out::println);

        //limit 获取前几个元素
        //
        System.out.println("==================limit=====================");
        list.stream().limit(3).forEach(System.out::println);

        //skip 跳过
        //
        System.out.println("==================skip=====================");
        list.stream().skip(4).forEach(System.out::println);

        //distinct 元素去重，依赖（hashCode和equals方法）
        //
        System.out.println("==================distinct=====================");
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌","张无忌","张无忌","周芷若","赵敏","张强","张三丰","张良","王二麻子","谢广坤");

        list1.stream().distinct().forEach(name-> System.out.println(name));


        //concat   合并a和b两个流为一个流
        //
        System.out.println("==================concat=====================");
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        Collections.addAll(list3,"张无忌","张无忌","张无忌","周芷若","赵敏","张强","张三丰","张良","王二麻子","谢广坤");
        Collections.addAll(list4,"张无忌","张无忌","张无忌","周芷若","赵敏","张强","张三丰","张良","王二麻子","谢广坤");

        Stream.concat(list3.stream(),list4.stream()).forEach(System.out::println);

        
        System.out.println("==================map=====================");
        ArrayList<String> list5 = new ArrayList<>();
        Collections.addAll(list5, "张无忌-12", "周芷若-73", "赵敏-27", "张强-84", "张三丰-73", "张良-26", "王二麻子-26", "谢广坤-46");


        /*
        *参数一：流里面原本的数据类型
        *参数二：要转成之后的类型
        * s：依次表示流里面每一个数据
        * 返回值：表示转换之后的数据
         */
//        list5.stream().map(new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                String[] arr = s.split("-");//以“-”为切割
//                String ageString = arr[1];
//                int age = Integer.parseInt(ageString);
//                return age;
//            }
//        }).forEach(System.out::println);//此时流的类型是整数


//        list5.stream().map(s->Integer.parseInt(s.split("-")[1]) ).forEach(System.out::println);

        list5.stream().map(s->Integer.parseInt(s.split("-")[1])).forEach(System.out::println);


    }
}
```
<a name="b7sSK"></a>
## Stream 流的终结方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713796889903-ec1d0fa0-796b-48ca-8dea-c9f3d87035f5.png#averageHue=%23eddedc&clientId=u9c44a99b-82c5-4&from=paste&height=425&id=u943bfdda&originHeight=850&originWidth=2472&originalType=binary&ratio=2&rotation=0&showTitle=false&size=272687&status=done&style=none&taskId=u2774c729-092c-4ae3-b02c-3cf2ba83e07&title=&width=1236)
```java
package practise.Stream流;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class demo4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-12", "周芷若-73", "赵敏-27", "张强-84", "张三丰-73", "张良-26", "王二麻子-26", "谢广坤-46");

        //forEach()
        /*
         * Consumer的泛型：表示流中数据的类型
         * accept方法的形参：依次表示Stream流里面的每一个数据
         * accept方法体：对每一个数据的处理操作（打印）
         *
         */
        System.out.println("==============forEach==============");
        list.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //        list.stream().forEach(s-> System.out.println(s));


        //long count() 统计
        System.out.println("==============count==============");
        System.out.println(list.stream().count());  //8


        //toArray()     收集数据，放到数组中
        System.out.println("==============toArray==============");
        /*
         * IntFunction的泛型：具体类型的数组
         * apply的形参：流中数据的个数，要跟数组的长度保持一致
         * 返回值：具体类型的数组
         * 方法体：就是创建数组
         */
        String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(list.stream().toArray(value -> new String[value])));


        //collect(Collector collector)      收集流中的数据，放到集合中（List Set Map）
        System.out.println("==============collect==============");
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20", "张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");

        //收集所有男性到list中  --  不会去重
        List<String> l = list1.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toList());
        System.out.println(l);

        //收集所有男性到Set中   --  会去重
        Set<String> set = list1.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toSet());
        System.out.println(set);

        //收集所有男性到Map中
        //键：姓名，值：年龄
        System.out.println("================Map1=================");
        /*
        * toMap(键的规则(function(流中数据类型，键类型)),值的规则(流中数据类型,值的数据类型)))
        *
        *
        * toMap :
        *   参数一：键的生成规则        Function   泛型一：表示流中每一个数据的类型
        *
        *                                       泛型二：表示Map集合中键的数据类型
        *
        *                                       方法apply：形参：依次表示流里面的每一个数据
        *                                                 方法体：生成键的代码
        *                                                 返回值：已经生成的键
        *   参数二：值的生成规则     Function 泛型一：流中的每一个数据的类型
        *
        *                                  泛型二：表示Map中键的数据类型
        *
        *                                  方法apply：形参：依次表示流里面的每一个数据
        *                                            方法体：生成值的代码
        *                                            返回值：已经生成的值
         */



        Map<String, Integer> map = list1.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(new Function<String, String>() {
                                              @Override
                                              public String apply(String s) {
                                                  return s.split("-")[0];
                                              }
                                          },
                        new Function<String, Integer>() {
                            @Override
                            public Integer apply(String s) {
                                return Integer.parseInt(s.split("-")[2]);
                            }
                        }));
        System.out.println(map);


        System.out.println("================Map1=================");
        Map<String, Integer> map2 = list1.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors
                        .toMap(s -> s.split("-")[0]
                                , s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(map2);
    }
}
```
<a name="e2C2q"></a>
# 方法引用
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714103264833-cbe188b4-a13e-46d7-aa94-b160ac0bda05.png#averageHue=%23f9f2f1&clientId=ue43b63f1-017e-4&from=paste&height=535&id=u17b9699d&originHeight=1070&originWidth=2428&originalType=binary&ratio=2&rotation=0&showTitle=false&size=611405&status=done&style=none&taskId=u7fefd4dd-fcc7-458c-b14b-a1c52236fc8&title=&width=1214)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714103346657-5e3b597a-9a98-40fe-a54c-faa48d228627.png#averageHue=%23f5ebe9&clientId=ue43b63f1-017e-4&from=paste&height=713&id=u0c3c0c58&originHeight=1426&originWidth=2662&originalType=binary&ratio=2&rotation=0&showTitle=false&size=770926&status=done&style=none&taskId=u8748a444-04e2-466e-a4ae-d22bfaba30d&title=&width=1331)
<a name="IKoye"></a>
## 定义含义作用基本知识
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713959502080-503822f6-f616-4512-83cf-44f6dc8d55a4.png#averageHue=%23f7f2f1&clientId=u70101d7d-fdf5-4&from=paste&height=568&id=u5acbadd5&originHeight=1136&originWidth=2608&originalType=binary&ratio=2&rotation=0&showTitle=false&size=699826&status=done&style=none&taskId=u99424ec0-b0ba-4226-961b-5e4cc18fdc9&title=&width=1304)


![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713958757348-ae2a03fc-a6d6-4946-be0e-a64b3efc6549.png#averageHue=%23f6eee7&clientId=u70101d7d-fdf5-4&from=paste&height=672&id=ub1bdcbbf&originHeight=1344&originWidth=2638&originalType=binary&ratio=2&rotation=0&showTitle=false&size=570385&status=done&style=none&taskId=u6f586047-946c-4eb5-912a-fc346402c65&title=&width=1319)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713958775387-aeb53b70-4818-43cd-abe8-9dad367ba70e.png#averageHue=%23f9f1ec&clientId=u70101d7d-fdf5-4&from=paste&height=686&id=uc4c349f3&originHeight=1372&originWidth=2574&originalType=binary&ratio=2&rotation=0&showTitle=false&size=502078&status=done&style=none&taskId=u566c79bc-c4c4-48d0-975d-b3bf4881555&title=&width=1287)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713958833779-5b246f7a-fc79-4558-b544-c9d1f9db908b.png#averageHue=%23b3aba0&clientId=u70101d7d-fdf5-4&from=paste&height=632&id=ub05c7272&originHeight=1264&originWidth=2450&originalType=binary&ratio=2&rotation=0&showTitle=false&size=877413&status=done&style=none&taskId=u06a9a6d0-e376-408b-9386-dc3a675080b&title=&width=1225)

:::info
//方法引用<br />        //表示引用demo1类里面的subtraction方法，把这个方法当作抽象方法的方法体<br />        Arrays.sort(arr,demo1::subtraction);    //类名::方法名
:::

```java
package practise.methodCite;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        Integer[] arr = {3, 5, 4, 1, 6, 2};

        //匿名内部类
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));*/

        //lambda
        //lambda的简化
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));

        //方法引用
        //表示引用demo1类里面的subtraction方法，把这个方法当作抽象方法的方法体
        Arrays.sort(arr, demo1::subtraction);    //类名::方法名
    }

    public static int subtraction(int num1, int num2) {
        return num2 - num1;
    }
}
```









<a name="NzsUG"></a>
## 分类
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713959543399-0da5595e-b7d0-4804-9ed6-0f0418984983.png#averageHue=%23d64d40&clientId=u70101d7d-fdf5-4&from=paste&height=589&id=u5550810b&originHeight=1178&originWidth=1914&originalType=binary&ratio=2&rotation=0&showTitle=false&size=466155&status=done&style=none&taskId=uf095e2d4-3a0c-4bfe-92cc-f18754613fb&title=&width=957)

<a name="qlmhV"></a>
### 如何引用静态方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713959616010-8d5cb97d-af5b-47f8-a0ba-a970bc7aca40.png#averageHue=%23f6f5f5&clientId=u70101d7d-fdf5-4&from=paste&height=453&id=u1b3952a3&originHeight=906&originWidth=1300&originalType=binary&ratio=2&rotation=0&showTitle=false&size=160131&status=done&style=none&taskId=u6b7d7117-2a46-4765-9d3f-75eedb122c0&title=&width=650)

```java
package practise.methodCite.引用静态方法;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

        //lambda
        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {

                return Integer.parseInt(s);
            }
        }).forEach(System.out::println);

        System.out.println("===============================");

        //方法引用
        list.stream().map(Integer::parseInt).forEach(System.out::println);

    }
}
```
<a name="mNnZo"></a>
### 如何引用成员方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713960291155-1d273fa8-4c9a-40db-9dd0-ef7d600ae1eb.png#averageHue=%23f9f7f7&clientId=u70101d7d-fdf5-4&from=paste&height=576&id=udbd07dcb&originHeight=1152&originWidth=1396&originalType=binary&ratio=2&rotation=0&showTitle=false&size=271593&status=done&style=none&taskId=u77739771-bd8a-4dcf-abd3-b76bccc8d91&title=&width=698)

```java
package practise.methodCite.引用成员方法;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");
        //方法引用
        list.stream().filter(new StringOperation()::stringJudge).forEach(System.out::println);


    }
}

class StringOperation {
    //成员方法
    public boolean stringJudge(String s) {
        return s.startsWith("张") && s.length() == 3;
    }
}
```


<a name="mKnpx"></a>
### 引用构造方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713960971330-295073a9-a200-4eb6-be38-8c1393e0bbcc.png#averageHue=%23f8f7f6&clientId=u70101d7d-fdf5-4&from=paste&height=420&id=u8edda71f&originHeight=840&originWidth=1372&originalType=binary&ratio=2&rotation=0&showTitle=false&size=191301&status=done&style=none&taskId=u2a84bdfa-3841-4602-b991-5c62dae2b3a&title=&width=686)

:::info
list.stream().map(Student::new).forEach(System.out::println); 

//再写一个构造方法，不需要管返回值，只管形参即可<br />    public Student(String s) {<br />        this.name = s.split(",")[0];<br />        this.age = Integer.parseInt(s.split(",")[1]);<br />    }
:::

```java

package practise.methodCite.引用构造方法;

import java.util.ArrayList;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,14", "周芷若,15", "赵敏,16", "张强,17", "张三丰,18");
        /*  list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                return new Student(s.split(",")[0],Integer.parseInt(s.split(",")[1]));
            }
        }).forEach(System.out::println);*/

        list.stream().map(Student::new).forEach(System.out::println);

    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //再写一个构造方法，不需要管返回值，只管形参即可
    public Student(String s) {
        this.name = s.split(",")[0];
        this.age = Integer.parseInt(s.split(",")[1]);
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }
}
```
<a name="Mu97W"></a>
### 其他调用方式
> 规则：
> 1. 需要有函数式接口
> 2. 被引用的方法必须存在
> 3. 被引用方法的形参，需要跟抽象方法的第二个形参到最后一个形参保持一致，返回值需要保持一致
> 4. 被引用方法的功能需要满足当前的需求
> 
> ![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714102762654-985fd455-6bed-4d21-a059-26c685de9527.png#averageHue=%23fefefe&clientId=ue43b63f1-017e-4&from=paste&height=179&id=u17f9ebee&originHeight=358&originWidth=1658&originalType=binary&ratio=2&rotation=0&showTitle=false&size=316049&status=done&style=none&taskId=u96e6e652-0d3e-4f97-b529-d7ca384202a&title=&width=829)
> ![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714102788584-99dbec15-c86c-417c-a825-d130a0912789.png#averageHue=%23fefdf8&clientId=ue43b63f1-017e-4&from=paste&height=92&id=uc2c97996&originHeight=184&originWidth=1424&originalType=binary&ratio=2&rotation=0&showTitle=false&size=125717&status=done&style=none&taskId=u622daf66-7e38-416e-91bd-bbea1446ae9&title=&width=712)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713961851119-cac8491c-efa7-4128-b308-5c99485ca374.png#averageHue=%23f8f5f5&clientId=u70101d7d-fdf5-4&from=paste&height=383&id=uedeec854&originHeight=766&originWidth=1166&originalType=binary&ratio=2&rotation=0&showTitle=false&size=182292&status=done&style=none&taskId=u89effd8e-3806-40f8-8542-4b811051d64&title=&width=583)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714102644987-c4216e6a-5eab-4abb-bc3b-677e462886e4.png#averageHue=%23797878&clientId=ue43b63f1-017e-4&from=paste&height=810&id=u9b29593c&originHeight=1619&originWidth=2879&originalType=binary&ratio=2&rotation=0&showTitle=false&size=1504192&status=done&style=none&taskId=u984306ea-8cb4-4150-bf46-a1526d7ae43&title=&width=1439.5)



<a name="FTHme"></a>
### 引用数组的构造方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714102812589-3d12bb2e-9932-457a-8c7d-bb9003e81860.png#averageHue=%23faf8f8&clientId=ue43b63f1-017e-4&from=paste&height=419&id=u54cdc1aa&originHeight=838&originWidth=1242&originalType=binary&ratio=2&rotation=0&showTitle=false&size=155568&status=done&style=none&taskId=ue60f2b50-e3d7-410f-a76a-c50af2f0d1e&title=&width=621)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714103203539-451e0624-4b10-47e8-9714-e46bfd71ef17.png#averageHue=%23fefefc&clientId=ue43b63f1-017e-4&from=paste&height=299&id=ud0261a29&originHeight=598&originWidth=832&originalType=binary&ratio=2&rotation=0&showTitle=false&size=189998&status=done&style=none&taskId=u137de7fd-64bd-43e6-9049-02e56ba21c1&title=&width=416)

```java
package practise.methodCite.引用数组的构造方法;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        Integer[] array = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));


    }
}
```
<a name="otylC"></a>
# 异常
<a name="Z5ZlS"></a>
## 异常体系介绍
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714105186236-cf30c2be-30db-45ff-af65-fb10b89c7e37.png#averageHue=%23f7f4f3&clientId=ue43b63f1-017e-4&from=paste&height=659&id=ube0f2471&originHeight=1318&originWidth=2586&originalType=binary&ratio=2&rotation=0&showTitle=false&size=651266&status=done&style=none&taskId=u7b5bf713-485c-48cb-b6f7-88507faee10&title=&width=1293)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714105077185-69a4f3fb-faaf-4e8b-8d88-01e585b5ac63.png#averageHue=%23ece6e4&clientId=ue43b63f1-017e-4&from=paste&height=762&id=u7312b95e&originHeight=1524&originWidth=2846&originalType=binary&ratio=2&rotation=0&showTitle=false&size=550351&status=done&style=none&taskId=u5e48e962-e941-4144-891e-5d35431f572&title=&width=1423)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714105099036-c4ffdf00-0d4b-4cf5-bb94-6c6c1f733468.png#averageHue=%23faf6f6&clientId=ue43b63f1-017e-4&from=paste&height=487&id=uf5b7ae0c&originHeight=974&originWidth=2504&originalType=binary&ratio=2&rotation=0&showTitle=false&size=312972&status=done&style=none&taskId=u9295ad46-e390-4680-9603-4626337eb0b&title=&width=1252)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714105137321-c2274da2-aa88-4e8b-8a26-6badc957963a.png#averageHue=%23f9f2ef&clientId=ue43b63f1-017e-4&from=paste&height=713&id=u813d75d6&originHeight=1426&originWidth=2644&originalType=binary&ratio=2&rotation=0&showTitle=false&size=718841&status=done&style=none&taskId=u7ee9fbfe-d6d4-40cd-8d97-cb44227dbed&title=&width=1322)
<a name="NXpNs"></a>
## 运行时异常 RuntimeException 和编译时异常有什么区别
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714125449344-7dcd2d14-3e32-49cf-907b-1965dd94c789.png#averageHue=%23f5f2f1&clientId=ue43b63f1-017e-4&from=paste&height=413&id=u63272991&originHeight=826&originWidth=2544&originalType=binary&ratio=2&rotation=0&showTitle=false&size=426507&status=done&style=none&taskId=u154bacb6-d8de-4e71-93bb-fb06a836fb5&title=&width=1272)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714105223366-acd47815-f21b-4d15-bf38-4d80ff19fe42.png#averageHue=%23f8f0ec&clientId=ue43b63f1-017e-4&from=paste&height=624&id=ufe6d7940&originHeight=1248&originWidth=2154&originalType=binary&ratio=2&rotation=0&showTitle=false&size=492278&status=done&style=none&taskId=u492921ac-9943-414d-9528-efc2a91cb1d&title=&width=1077)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714125296001-1560f0a8-6da7-4d3e-a110-72c18fdb60e4.png#averageHue=%23fbf8f6&clientId=ue43b63f1-017e-4&from=paste&height=620&id=uabfd6297&originHeight=1240&originWidth=2556&originalType=binary&ratio=2&rotation=0&showTitle=false&size=384803&status=done&style=none&taskId=uf6ed8170-25b3-439f-8151-d6a9f5df494&title=&width=1278)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714125360643-214ad313-1e98-4d2e-8b10-7aa7487e00b0.png#averageHue=%23fdf9f7&clientId=ue43b63f1-017e-4&from=paste&height=570&id=u578d73c8&originHeight=1140&originWidth=2434&originalType=binary&ratio=2&rotation=0&showTitle=false&size=272540&status=done&style=none&taskId=ue1ca4345-f01d-4eb5-83b7-3fbf550c9f3&title=&width=1217)








<a name="X3ufn"></a>
## 异常的作用
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714125610123-669673d5-613c-4114-bc7b-5bb1b7e25d99.png#averageHue=%23f9f8f7&clientId=ue43b63f1-017e-4&from=paste&height=612&id=ud79bcd29&originHeight=1224&originWidth=2336&originalType=binary&ratio=2&rotation=0&showTitle=false&size=323097&status=done&style=none&taskId=u9663fcc8-5394-4bfc-b599-7f40a55c4cb&title=&width=1168)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714125673569-377231fc-52c5-425e-ac27-cfb6e22065ce.png#averageHue=%23eae9e9&clientId=ue43b63f1-017e-4&from=paste&height=677&id=u9136544f&originHeight=1354&originWidth=2787&originalType=binary&ratio=2&rotation=0&showTitle=false&size=730792&status=done&style=none&taskId=ub005f635-d6a0-452b-bab6-ce3f5b8f254&title=&width=1393.5)






<a name="msNiH"></a>
## 异常的处理方式
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714125715408-2958256f-8a05-4ac8-8f6a-4efde946db2c.png#averageHue=%23f8edec&clientId=ue43b63f1-017e-4&from=paste&height=382&id=u655db64f&originHeight=764&originWidth=816&originalType=binary&ratio=2&rotation=0&showTitle=false&size=163520&status=done&style=none&taskId=u58c555a6-6da4-4d89-9dac-1294aff25e2&title=&width=408)
<a name="XJJKZ"></a>
### JVM 默认的处理方式
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714125796856-c35e0070-a5a6-4755-910d-e19ad49aed35.png#averageHue=%23f0eeee&clientId=ue43b63f1-017e-4&from=paste&height=175&id=u44fd5a88&originHeight=350&originWidth=1708&originalType=binary&ratio=2&rotation=0&showTitle=false&size=153404&status=done&style=none&taskId=u9cc4e34b-1160-41b1-9e03-c4f925fe033&title=&width=854)
<a name="zJUNs"></a>
### 自己处理（捕获异常）
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714125828358-a60d137b-7202-4d0f-b069-c3465542460e.png#averageHue=%23f6f0de&clientId=ue43b63f1-017e-4&from=paste&height=442&id=udf195ef6&originHeight=884&originWidth=1202&originalType=binary&ratio=2&rotation=0&showTitle=false&size=251060&status=done&style=none&taskId=u671574f1-d3c6-4387-ad39-0dacdaa97bc&title=&width=601)<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714126380349-ce52c05a-48b1-4008-adda-5b5213bbf4c8.png#averageHue=%23fdfbf9&clientId=ue43b63f1-017e-4&from=paste&height=369&id=ub93e99ef&originHeight=738&originWidth=1784&originalType=binary&ratio=2&rotation=0&showTitle=false&size=631907&status=done&style=none&taskId=ud67ae8a1-f4b2-4395-978d-d514d2797b4&title=&width=892)

```java
package practise.Exceptions;

public class 捕获异常 {
    public static void main(String[] args) {
        //JVM默认处理方案：异常打印在控制台，并停止程序
        /*  int[] arr = {1,2,3,4,5,6};
        System.out.println(arr[10]);
        System.out.println("看看我执行了吗？");*/


        //捕获异常
        //不停止程序
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[10]);//此处吹出现了异常
            //程序在此处创建了一个异常ArrayIndexOutOfBoundsException的对象
            //new ArrayIndexOutOfBoundsException()
            //拿着这个对象去和catch小括号中的变量做对比，看看是否变量能接收这个对象
            //如果被接收，代表该异常被捕获，执行catch里面的代码
            //当catch里面的代码被执行完，他会执行try……catch体系下面的代码
        } catch (ArrayIndexOutOfBoundsException e) {
            //如果出现了
            System.out.println("索引越界了");
        }
        System.out.println("看看我执行了吗？");
    }
}
```

<a name="FJgH0"></a>
### 自己处理（灵魂四问）
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714127758163-a1368c3c-fefc-4ab8-9e4b-664be04394c1.png#averageHue=%23f2efec&clientId=ue43b63f1-017e-4&from=paste&height=598&id=u34ca28fe&originHeight=1195&originWidth=2594&originalType=binary&ratio=2&rotation=0&showTitle=false&size=779195&status=done&style=none&taskId=udf34b9cc-95df-4aac-8be7-ba58a1fec78&title=&width=1297)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714126651630-f109668b-fad8-44b5-9009-90a5221db6ab.png#averageHue=%23d5d1d0&clientId=ue43b63f1-017e-4&from=paste&height=42&id=u64593825&originHeight=83&originWidth=835&originalType=binary&ratio=2&rotation=0&showTitle=false&size=40614&status=done&style=none&taskId=u77c765d1-b171-4c43-8088-4daa9928a6d&title=&width=417.5)<br />会把 try 里面的代码全部执行完毕，不会执行 catch 里面的代码<br />注意：<br />只有当出现了异常才会执行 catch 里面的代码<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714126661644-d7a9228c-7023-4a41-b9a0-ed9b067ad264.png#averageHue=%23d4d1d1&clientId=ue43b63f1-017e-4&from=paste&height=46&id=ud361c175&originHeight=91&originWidth=1025&originalType=binary&ratio=2&rotation=0&showTitle=false&size=47668&status=done&style=none&taskId=u8366bb3b-2085-48c6-8356-dad77a798b3&title=&width=512.5)

1. 若未被捕获的异常在被捕获的异常后，

前一个 catch 被捕获，会直接跳转到 catch 内部的代码，跳过 try 后面的代码，所以	         不会执行后面的未被捕获的异常<br />若未被捕获的异常在被捕获的异常前，<br /> 则会执行 JVM 默认的执行规则 -- 在控制台打印异常，并停止程序

2. 所以需要写多个 catch 与异常对应，若多个 catch 存在父子关系，那么 父类的异常一定要写在下面，因为若写在前面，父类会先接收子类的异常

3. JDK7 以前，

需要写多个 catch<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714127545163-9e56865c-faf0-42ec-b5f3-0b040763466d.png#averageHue=%23f0f4ed&clientId=ue43b63f1-017e-4&from=paste&height=44&id=ue3aea8cf&originHeight=88&originWidth=996&originalType=binary&ratio=2&rotation=0&showTitle=false&size=102824&status=done&style=none&taskId=u15772943-848c-4a2d-adcb-d063a967d4d&title=&width=498)<br />JDK7 以后，<br />若多个 catch 处理方式一样，则可以使用”|“（或者），同时捕获多个异常将异常隔开<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714126669170-d4df19b0-71c1-4e18-8acc-eb283f91b3f4.png#averageHue=%23d4d1d1&clientId=ue43b63f1-017e-4&from=paste&height=53&id=ud4bdbef3&originHeight=105&originWidth=1113&originalType=binary&ratio=2&rotation=0&showTitle=false&size=52713&status=done&style=none&taskId=ue2915c95-045b-4112-a8b0-caea5a3f99f&title=&width=556.5)<br />会打印在控制台并停止程序，相当于 catch 白写了


![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714126676599-80f1152d-b218-4f31-a06e-a5ca5b32a0b6.png#averageHue=%23d2d0cf&clientId=ue43b63f1-017e-4&from=paste&height=50&id=u244de857&originHeight=99&originWidth=1223&originalType=binary&ratio=2&rotation=0&showTitle=false&size=58216&status=done&style=none&taskId=ue0ed4dc6-b500-42e4-a12a-8e781207a6c&title=&width=611.5)<br />不会，会直接跳转到捕获到异常的 catch 语句中，不会执行 try 后面的代码


<a name="AF1Dw"></a>
### Throwable 的成员方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714127813468-8a44085f-9330-4f8a-8574-d3448c0d1666.png#averageHue=%23e6d1ce&clientId=ue43b63f1-017e-4&from=paste&height=320&id=u379ae634&originHeight=640&originWidth=2288&originalType=binary&ratio=2&rotation=0&showTitle=false&size=348707&status=done&style=none&taskId=ua1400f75-38ff-44b0-9d3b-5cdb59b3a15&title=&width=1144)

```java
package practise.Exceptions.Throwable成员方法;

public class demo1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(arr[10]);
        } catch (Exception e) {
            System.out.println(e.getMessage()); //将异常的简短描述打印在控制台
            System.out.println(e.toString());   //将异常转为字符串打印在控制台
            e.printStackTrace();    //仅仅是以红色的字体将异常打印在控制台，不会停止程序
        }

        System.out.println("看看我执行了吗？");

        //正常输出语句
        System.out.println(123);
        //用来打印错误信息的输出语句
        System.err.println(123);
    }
}

```

<a name="thcEc"></a>
### 抛出处理
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714129466011-d840d716-5559-45fa-a9ae-cd94fee05416.png#averageHue=%23f8f2f1&clientId=ue43b63f1-017e-4&from=paste&height=483&id=ua674125b&originHeight=966&originWidth=2300&originalType=binary&ratio=2&rotation=0&showTitle=false&size=569752&status=done&style=none&taskId=uffe7459a-10f5-4397-8408-fd19c9550c6&title=&width=1150)


![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714128498957-521cb2a0-c055-4f70-a32c-fb981668b18c.png#averageHue=%23f6f3e9&clientId=ue43b63f1-017e-4&from=paste&height=582&id=uce4e6c5e&originHeight=1164&originWidth=2672&originalType=binary&ratio=2&rotation=0&showTitle=false&size=477519&status=done&style=none&taskId=u3732bee7-7b5d-4f8e-b61f-d6d650db104&title=&width=1336)
<a name="cEcz8"></a>
### 自定义异常
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714130561164-0ba5c9c3-1e82-4deb-9398-472be1bbb7d0.png#averageHue=%23f6f2f2&clientId=ue43b63f1-017e-4&from=paste&height=467&id=u2dcdfa72&originHeight=934&originWidth=2270&originalType=binary&ratio=2&rotation=0&showTitle=false&size=233783&status=done&style=none&taskId=uca847ce9-334c-4857-8deb-27059390144&title=&width=1135)<br />如果是编译时异常就继承 Exception，如果是运行时异常就继承RuntimeException<br />使用 alt++insert 生成构造方法，选前两个

```java

package practise.Exceptions.自定义异常;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GirlFrieng gf1 = new GirlFrieng();

        while (true) {
            try {
                System.out.println("姓名");
                gf1.setName(sc.nextLine());
                System.out.println("年龄");
                gf1.setAge(Integer.parseInt(sc.nextLine()));
                //若果所有数据都是正确的，跳出循环
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (NameFormatException e) {//父类写在下面
                e.printStackTrace();
            } catch (AgeOutOfBoundsException e) {//父类写在下面
                e.printStackTrace();
            }
        }


        System.out.println(gf1);

    }
}


class GirlFrieng {
    private String name;
    private int age;

    public GirlFrieng() {
    }

    public GirlFrieng(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name)/*throws RuntimeException*/ {
        if (name.length() < 3 || name.length() > 10) {
            throw new NameFormatException(name + "格式有误，长度应该为3-10");
        }
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age)/*throws RuntimeException*/ {
        if (age < 18 || age > 40) {
            throw new AgeOutOfBoundsException(age + "超出了范围");
        }
        this.age = age;
    }

    public String toString() {
        return "GirlFrieng{name = " + name + ", age = " + age + "}";
    }
}
```

```java

package practise.Exceptions.自定义异常;

public class AgeOutOfBoundsException extends RuntimeException {
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
```

```java
package practise.Exceptions.自定义异常;

public class NameFormatException extends RuntimeException {
    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
```
<a name="ls56P"></a>
# File
<a name="LQVq7"></a>
## 路径
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714131455140-f28e658f-75c6-4646-b7b4-64bcaf44da51.png#averageHue=%23fcfaf4&clientId=ue43b63f1-017e-4&from=paste&height=381&id=udd0cd504&originHeight=762&originWidth=2330&originalType=binary&ratio=2&rotation=0&showTitle=false&size=256908&status=done&style=none&taskId=ud56e769a-77c3-41b8-b602-41552d94522&title=&width=1165)

<a name="dfSaU"></a>
## FIle 构造方法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1714131497704-515fb2f8-f835-49d5-ba2d-2fb930ca8ac6.png#averageHue=%23ebdcd9&clientId=ue43b63f1-017e-4&from=paste&height=427&id=ua3596640&originHeight=854&originWidth=2480&originalType=binary&ratio=2&rotation=0&showTitle=false&size=275131&status=done&style=none&taskId=u247db085-a87c-460f-a489-a0f328d9995&title=&width=1240)
<a name="DRixp"></a>
# io 流
<a name="TKCPr"></a>
## io 流的定义和分类
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713955915641-1d0b5042-7086-43f5-ac27-400eccfbb79b.png#averageHue=%23f6f1f1&clientId=u36f63d28-e60e-4&from=paste&height=654&id=yKlsY&originHeight=1308&originWidth=2528&originalType=binary&ratio=2&rotation=0&showTitle=false&size=813067&status=done&style=none&taskId=u7d4d0df9-ca39-4c45-a9f4-0511a404b3e&title=&width=1264)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713955633161-43b34346-1520-4e6e-836b-fcc7858491b4.png#averageHue=%23f9f6f1&clientId=u36f63d28-e60e-4&from=paste&height=640&id=ub9c46ba9&originHeight=1280&originWidth=2292&originalType=binary&ratio=2&rotation=0&showTitle=false&size=674061&status=done&style=none&taskId=u47870cf3-135d-4fcc-aaff-c0f422e0591&title=&width=1146)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713955703862-a0a30bf4-d380-46c7-8d0e-be5fde8d05ca.png#averageHue=%23fbf8f8&clientId=u36f63d28-e60e-4&from=paste&height=604&id=uebe82015&originHeight=1208&originWidth=2508&originalType=binary&ratio=2&rotation=0&showTitle=false&size=462049&status=done&style=none&taskId=u5dbd6051-a2f6-43a4-9ccf-9d2a15d5875&title=&width=1254)<br />word、excel 等 都是非纯文本文件<br />txt、md 都是纯文本文件<br />![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713955801214-e8c8fbc2-a4f9-4af7-a78a-d896c9ba76ae.png#averageHue=%23f8f2f1&clientId=u36f63d28-e60e-4&from=paste&height=593&id=u499d175b&originHeight=1186&originWidth=2580&originalType=binary&ratio=2&rotation=0&showTitle=false&size=526290&status=done&style=none&taskId=uaa075df3-deef-44ce-866c-10a0a0d6425&title=&width=1290)
<a name="ds46y"></a>
## 体系和基本用法
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713955983026-cb91135b-3022-4867-8323-3d5e534bf75c.png#averageHue=%23fbf9f9&clientId=u36f63d28-e60e-4&from=paste&height=673&id=ucb546027&originHeight=1346&originWidth=2720&originalType=binary&ratio=2&rotation=0&showTitle=false&size=464018&status=done&style=none&taskId=u39d5151b-8a4e-4792-b7e2-5be807bb5dc&title=&width=1360)

![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713956046089-d5243b23-12f8-40e2-9f57-308ef4ab120d.png#averageHue=%23f8f5f4&clientId=u36f63d28-e60e-4&from=paste&height=607&id=tge5g&originHeight=1214&originWidth=2418&originalType=binary&ratio=2&rotation=0&showTitle=false&size=515378&status=done&style=none&taskId=u443001cb-0d1e-408e-9652-96d68443d0d&title=&width=1209)
<a name="MXrcU"></a>
### 字节流：能操作所有类型文件 
<a name="h8a72"></a>
#### inputStream	操作本地文件字节输入流
<a name="c6PLQ"></a>
#### outputStream	   操作本地文件字节输出流
![image.png](https://cdn.nlark.com/yuque/0/2024/png/42587642/1713956267998-4ab4b577-612a-4756-80d1-9568afee1660.png#averageHue=%23faf6f5&clientId=u36f63d28-e60e-4&from=paste&height=629&id=u6daf0ab5&originHeight=1258&originWidth=2162&originalType=binary&ratio=2&rotation=0&showTitle=false&size=259169&status=done&style=none&taskId=u715d0834-9cf3-4c01-a5e9-d47c76a31e4&title=&width=1081)




<a name="wdYWz"></a>
### 字符流：只能操作纯文本文件
<a name="OoXZm"></a>
#### 
<a name="P7Kz8"></a>
#### 












<a name="TQhwK"></a>
# 
