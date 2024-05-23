package practise.DynamicProxy;

/*
* ������ã�
*   ����һ������
* */


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {

    /*
    * ���������ã�
    *       �����ǵĶ��󣬴���һ������
    *
    * �βΣ�
    *   ����������Ƕ���
    * ����ֵ��
    *   �����Ǵ����Ĵ���
    *
    * */

    public static Star createProxy(BigStar bigStar){
        /*
        ����һ������ָ�����ĸ����������ȥ�������ɵĴ�����
        ��������ָ���ӿڣ���Щ�ӿ�����ָ�����ɵĴ���ʲô��Ҳ��������Щ����
        ������������ָ�����ɵĴ������Ҫ��ʲô����
        * */
        Star star = (Star)Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),   //����һ������ָ�����ĸ����������ȥ�������ɵĴ�����
                new Class[]{Star.class},    //��������ָ���ӿڣ���Щ�ӿ�����ָ�����ɵĴ���ʲô��Ҳ��������Щ����
                new InvocationHandler() {   //������������ָ�����ɵĴ������Ҫ��ʲô����
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        /*
                        * ����һ������Ķ��� == �������Ĵ���Ķ���star
                        * ��������Ҫ���еķ��� sing
                        * ������������sing���������ݵ�ʵ��
                        * */

                        if("sing".equals(method.getName())){
                            System.out.println("׼����Ͳ����Ǯ");
                        }else if("dance".equals(method.getName())){
                            System.out.println("׼����Ͳ����Ǯ");
                        }

                        //ȥ�Ҵ����ǿ�ʼ�����������
                        //����ı�����ʽ�����ô��������泪���������ķ���
                        return method.invoke(bigStar,args);
                    }
                });
        return star;
    }
}
