package Assignment_4.question3;

public class Candy extends DessertItems{
    private double weight;
    private int pricePerPound;
    private int priceInTotal;

    public Candy(String name, double weight, int pricePerPound){
        super(name);
        this.pricePerPound = pricePerPound;
        this.weight = weight;
    }

    public int getCost(){
        priceInTotal = (int)Math.round(this.weight * this.pricePerPound);
        return priceInTotal;
    }

    public int getPricePerPound(){
        return this.pricePerPound;
    }

    public double getWeight(){
        return this.weight;
    }
}
