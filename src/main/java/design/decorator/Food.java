package design.decorator;

/**
 * Created by TAO on 2018/8/7.
 */
public class Food {

    private String foodName;

    public Food() {
    }

    public Food(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getAllFood(){
        return foodName;
    }
}
