package Assignment_4.question3;

public class Sundae extends IceCream{
    private String iceCreamName;
    private int iceCreamCost;
    private String nameOfToppings;
    private int priceOfTopping;
    private int priceInTotal;

    public Sundae(String iceCreamName, int iceCreamCost, String nameOfToppings, int priceOfToppings){
        super(iceCreamName, iceCreamCost);
        this.nameOfToppings = nameOfToppings;
        this.priceOfTopping = priceOfToppings;
    }

    public int getCost(){
        priceInTotal = this.priceOfTopping + super.getCost();
        return priceInTotal;
    }

    public String getTopping(){
        return nameOfToppings;
    }
}
