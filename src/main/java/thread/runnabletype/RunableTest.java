package thread.runnabletype;

/**
 * Created by TAO on 2018/8/7.
 */
public class RunableTest {

    public static void main(String[] args){
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();
        new Thread(myRunnable).start();
    }
}
