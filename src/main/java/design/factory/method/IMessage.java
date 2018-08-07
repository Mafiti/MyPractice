package design.factory.method;

import java.util.Map;

/**
 * Created by TAO on 2018/8/7.
 */
public interface IMessage {

    Map<String ,Object> getMessageParam();

    void setMessageParam(Map<String,Object> messageParam);

    void sendMessage() throws Exception;
}
