package design.factory.method;

import java.util.Map;

/**
 * Created by TAO on 2018/8/7.
 */
public abstract class IMessageImpl implements IMessage {

    // 这里可以理解为生产产品所需要的原材料库。最好是个自定义的对象，这里为了不引起误解使用Map。
    private Map<String, Object> messageParam;

    @Override
    public Map<String, Object> getMessageParam() {
        return messageParam;
    }

    @Override
    public void setMessageParam(Map<String, Object> messageParam) {
        this.messageParam = messageParam;
    }
}
