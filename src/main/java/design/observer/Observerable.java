package design.observer;


/**
 * Created by TAO on 2018/8/7.
 */
public interface Observerable {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
