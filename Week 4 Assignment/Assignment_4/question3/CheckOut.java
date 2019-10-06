package Assignment_4.question3;

public class CheckOut{
    private DessertItems[] DessertItems;
    private int numberOfItems;

    public CheckOut(){
        this.DessertItems = new DessertItems[100];
        this.numberOfItems = 0;
    }

    public int numberOfItems(){
        return this.numberOfItems;
    }

    public void enterItem(DessertItems dessertItem){
        this.DessertItems[numberOfItems] = dessertItem;
        numberOfItems++;
    }

    public void clear(){
        for(int i = 0; i < numberOfItems; i++){
            this.DessertItems[i] = null;
        }
        numberOfItems = 0;
    }

    public int totalCost(){
        int sum = 0;
        for(int i = 0; i < numberOfItems; i++)
            sum = sum + DessertItems[i].getCost();
        return sum;
    }

    public int totalTax(){
        double totalTax = this.totalCost() * (DessertShop.taxRate / 100.00);
        return (int)Math.round(totalTax);
    }

    //This method prints out the receipt that includes items, prices and tax..
    public String toString(){
        int lengthOfEveryLine = 40;
        String receipt = "           " + DessertShop.storeName + "\n";
        receipt = receipt + "     " + "---------------------------" + "\n\n";

        for(int j = 0; j < numberOfItems; j++){
            String nameOfItem = DessertItems[j].getName();
            String priceOfItem = DessertShop.cents2dollarsAndCents(DessertItems[j].getCost());

            //item is Candy;
            if (DessertItems[j] instanceof Candy){
                int pricePerPound = ((Candy) DessertItems[j]).getPricePerPound();
                String pricePerPoundString = DessertShop.cents2dollarsAndCents(pricePerPound);
                receipt = receipt + ((Candy) DessertItems[j]).getWeight() + " lbs @ " + pricePerPoundString + "/lb" + "\n";
                while(nameOfItem.length() < lengthOfEveryLine - priceOfItem.length()){
                    nameOfItem = nameOfItem + " ";
                }
                receipt = receipt + nameOfItem + priceOfItem + "\n\n";
            }
            else

                //item is Cookie;
                if (DessertItems[j] instanceof Cookie){
                    int pricePerDozen = ((Cookie) DessertItems[j]).getPricePerDozen();
                    String pricePerDozenString = DessertShop.cents2dollarsAndCents(pricePerDozen);
                    receipt = receipt + ((Cookie)DessertItems[j]).getNumber() + " dozens @ " + pricePerDozenString + "/dozen" + "\n";
                    while(nameOfItem.length() < lengthOfEveryLine - priceOfItem.length()){
                        nameOfItem = nameOfItem + " ";
                    }
                    receipt = receipt + nameOfItem + priceOfItem + "\n\n";
                }
                else

                    //item is ice cream;
                    if (DessertItems[j] instanceof IceCream){
                        while(nameOfItem.length() < lengthOfEveryLine - priceOfItem.length()){
                            nameOfItem = nameOfItem + " ";
                        }
                        receipt = receipt + nameOfItem + priceOfItem + "\n\n";
                    }
                    else

                        //item is sundae;
                        {
                            while(nameOfItem.length() < lengthOfEveryLine - priceOfItem.length()){
                                nameOfItem = nameOfItem + " ";
                            }
                            receipt = receipt + nameOfItem + priceOfItem + "\n\n";
                        }
        }

        //print out tax in total;
        String tax = DessertShop.cents2dollarsAndCents(this.totalTax());
        receipt = receipt + "******** Tax in total: " + tax + " ********" + "\n";
        //print out cost in total.
        String totalCost = DessertShop.cents2dollarsAndCents(this.totalCost() + this.totalTax());
        receipt = receipt + "******** Price in total: " + totalCost + " ********"+ "\n";

        return receipt;
    }
}
