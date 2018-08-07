package thread.callabletype;

import java.util.concurrent.Callable;

/**
 * Created by TAO on 2018/8/7.
 */
public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            sum += i;
        }
        return sum;
    }
}
