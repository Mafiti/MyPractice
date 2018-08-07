package design.factory.method;

/**
 * Created by TAO on 2018/8/7.
 */
public interface IMessageFactory {
    IMessage createMessage(String messageType);
}
