package design.observer;

/**
 * Created by TAO on 2018/8/7.
 */
public class ObserverMain {

    public static void main(String[] args){

        WeChatService service = new WeChatService();

        Observer userZhang = new User("张三");
        Observer userLi = new User("李四");
        Observer userLao = new User("老王");

        service.registerObserver(userZhang);
        service.registerObserver(userLi);
        service.registerObserver(userLao);

        service.setInfomation("PHP无敌！");

        System.out.println("-----------------------------------------------");

        service.removeObserver(userLao);
        service.setInfomation("Java才无敌！");
    }
}
