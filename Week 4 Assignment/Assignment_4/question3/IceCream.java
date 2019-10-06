package Assignment_4.question3;

public class IceCream extends DessertItems{
    private int price;

    public IceCream(String name, int price){
        super(name);
        this.price = price;
    }

    public int getCost(){
        return this.price;
    }
}
