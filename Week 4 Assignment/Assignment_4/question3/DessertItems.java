package Assignment_4.question3;

public abstract class DessertItems{
    private String name;

    public DessertItems(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract int getCost();
}
