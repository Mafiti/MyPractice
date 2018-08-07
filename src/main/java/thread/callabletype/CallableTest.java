package thread.callabletype;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by TAO on 2018/8/7.
 */
public class CallableTest {

    public static void main(String[] args){

        Callable<Integer> myCallable = new MyCallable();

        FutureTask<Integer> ft = new FutureTask<Integer>(myCallable);

        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            if (i == 30){
                new Thread(ft).start();
            }
        }

        System.out.println("主线程for循环执行完毕。。");

        try {
            int sum = ft.get();
            System.out.println("sum = "+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
