package design.factory.method;

/**
 * Created by TAO on 2018/8/7.
 */
public class MethodMain {

    public static void main(String[] args){
        IMessageFactory factory = new IMessageFactoryImpl();
        IMessage message;

        try {
            message = factory.createMessage("SMS");
            message.sendMessage();

            message = factory.createMessage("OA");
            message.sendMessage();

            message = factory.createMessage("EMAIL");
            message.sendMessage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
