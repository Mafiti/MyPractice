package design.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by TAO on 2018/8/7.
 */
public class WeChatService implements Observerable {

    private List<Observer> list;
    private String message;

    public WeChatService(){
        list = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        Iterator<Observer> iterator = list.iterator();
        while (iterator.hasNext()){
            if (o.equals(iterator.next()))
            iterator.remove();
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < list.size(); i++) {
            Observer observer = list.get(i);
            observer.update(message);
        }
    }

    public void setInfomation(String s){
        this.message = s;
        System.out.println("微信服务更新信息："+s);
        notifyObserver();
    }
}
