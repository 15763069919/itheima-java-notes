package practise.Thread.ThreeWaysToImplementMultithreading.Third_ImplementCallableAndFuture;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    /**
     * @return
     * @throws Exception
     */
    @Override
    public Integer call() throws Exception {
        //��1~100֮��ĺ�
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
