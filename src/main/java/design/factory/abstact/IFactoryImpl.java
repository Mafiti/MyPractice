package design.factory.abstact;

/**
 * Created by TAO on 2018/8/7.
 */
public class IFactoryImpl implements IFactory {
    @Override
    public IProduct1Impl createProduct1() {
        return new IProduct1Impl();
    }

    @Override
    public IProduct2Impl createProduct2() {
        return new IProduct2Impl();
    }
}
