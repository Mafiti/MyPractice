package design.factory.simple;

/**
 * Created by TAO on 2018/8/7.
 */
public class SimpleFactory {

    public static final int GZ = 1;//广州面条
    public static final int SH = 2;//上海面条
    public static final int LZ = 3;//兰州面条

    public static Noodle createNoddles(int type){
        switch (type){
            case GZ:
                return new GZNoodle();
            case SH:
                return new SHNoodle();
            case LZ:
                return new LZNoodle();
            default:
                return new LZNoodle();
        }
    }
}
