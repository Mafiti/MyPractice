package design.decorator;

/**
 * Created by TAO on 2018/8/7.
 */
public class Meat extends Food {

    private Food basicFood;

    public Meat(Food basicFood) {
        this.basicFood = basicFood;
    }

    @Override
    public String getAllFood() {
        return basicFood.getAllFood()+"+"+this.getFoodName();
    }
}
