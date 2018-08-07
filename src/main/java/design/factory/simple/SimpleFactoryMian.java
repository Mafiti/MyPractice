package design.factory.simple;

/**
 * Created by TAO on 2018/8/7.
 */
public class SimpleFactoryMian {

    public static void main(String[] args){

        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.createNoddles(1).produceNoodles();
        simpleFactory.createNoddles(2).produceNoodles();
        simpleFactory.createNoddles(3).produceNoodles();

    }

}
