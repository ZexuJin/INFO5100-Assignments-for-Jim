package Assignment_4.question3;

public class Cookie extends DessertItems{
    private int numberOfDozens;
    private int pricePerDozen;
    private int priceInTotal;

    public Cookie(String name, int number, int pricePerDozen){
        super(name);
        this.pricePerDozen = pricePerDozen;
        this.numberOfDozens = number;
    }

    public int getCost(){
        priceInTotal = Math.round(this.numberOfDozens * this.pricePerDozen);
        return this.priceInTotal;
    }

    public int getPricePerDozen(){
        return this.pricePerDozen;
    }

    public int getNumber(){
        return this.numberOfDozens;
    }
}
