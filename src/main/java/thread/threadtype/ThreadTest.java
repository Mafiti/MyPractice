package thread.threadtype;

/**
 * Created by TAO on 2018/8/7.
 */
public class ThreadTest {

    public static void main(String[] args){

        for (int i = 0; i < 100; i++) {

            System.out.println(Thread.currentThread().getName()+" "+i);

            if (i==30){

                MyThread thread1 = new MyThread();
                MyThread thread2 = new MyThread();

                thread1.start();
                thread2.start();
            }
        }


    }
}
