package design.factory.abstact;

/**
 * Created by TAO on 2018/8/7.
 */
public interface IFactory {
    IProduct1Impl createProduct1();
    IProduct2Impl createProduct2();
}
