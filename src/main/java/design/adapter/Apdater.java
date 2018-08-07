package design.adapter;

/**
 * Created by TAO on 2018/8/7.
 */
public class Apdater extends ThreeHoleSocketImpl implements TwoHoleSocket {
    @Override
    public void useTwoHoleSocket() {
        useThreeHoleSocket();
    }
}
