package practise.basePractices;

public class ac找质数
{
    public static void main(String[] args) {
        int i,j,count=0;
        for(i=101;i<=200;i++)
        {
            boolean flag=true;
              for(j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)  //不是质数
                {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}