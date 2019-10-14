package Question_5;

public class Cat extends Pet implements Boardable{
    private String hairLength;
    private int sMonth, eMonth;
    private int sDay, eDay;
    private int sYear, eYear;

    public Cat(String name, String ownerName, String color, String hairLength){
        super(name, ownerName, color);
        this.hairLength = hairLength;
    }

    public String getHairLength(){
        return hairLength;
    }

    public String toString(){
        String string = super.toString()+"/n"+"Hair: "+ getHairLength();
        return string;
    }

    @Override
    public void setBoardStart(int month, int day, int year) {
        this.sMonth = month;
        this.sDay = day;
        this.sYear = year;
    }

    @Override
    public void setBoardEnd(int month, int day, int year) {
        this.eMonth = month;
        this.eYear = year;
        this.eDay =day;
    }

    @Override
    public boolean boarding(int month, int day, int year) {
        if(month >= sMonth && month <= eMonth && day >=sDay && day <= eDay && year >= sYear && year <= eYear)
        {
            return true;
        }
        return false;
    }
}
