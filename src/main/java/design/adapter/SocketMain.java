package design.adapter;

/**
 * Created by TAO on 2018/8/7.
 */
public class SocketMain {
    public static void main(String[] args){
        TwoHoleSocket twoHoleSocket = new Apdater();
        twoHoleSocket.useTwoHoleSocket();
    }
}
