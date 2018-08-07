package design.factory.method;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by TAO on 2018/8/7.
 */
public class IMessageFactoryImpl implements IMessageFactory {

    @Override
    public IMessage createMessage(String messageType) {
        // 这里的方式是：消费者知道自己想要什么产品；若生产何种产品完全由工厂决定，则这里不应该传入控制生产的参数。
        IMessage myMessage;
        Map<String,Object> messageParam = new HashMap<String, Object>(16);
        // 根据某些条件去选择究竟创建哪一个具体的实现对象，条件可以传入的，也可以从其它途径获取。
        // sms
        if ("SMS".equals(messageType)) {
            myMessage = new MessageSms();
            messageParam.put("PHONENUM", "123456789");
        } else
            // OA待办
            if ("OA".equals(messageType)) {
                myMessage = new MessageOaTodo();
                messageParam.put("OAUSERNAME", "testUser");
            } else
                // email
                if ("EMAIL".equals(messageType)) {
                    myMessage = new MessageEmail();
                    messageParam.put("EMAIL", "test@test.com");
                } else
                // 默认生产email这个产品
                {
                    myMessage = new MessageEmail();
                    messageParam.put("EMAIL", "test@test.com");
                }
        myMessage.setMessageParam(messageParam);
        return myMessage;
    }
}
