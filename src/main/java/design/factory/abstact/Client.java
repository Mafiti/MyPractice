package design.factory.abstact;

/**
 * Created by TAO on 2018/8/7.
 */
public class Client {

    public static void main(String[] args){

        IFactory factory = new IFactoryImpl();
        factory.createProduct1().show();
        factory.createProduct2().show();
    }

}
