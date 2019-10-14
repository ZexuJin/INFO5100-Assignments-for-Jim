package Question_5;

public class Pet {
    private String name;
    private String ownerName;
    private String color;
    private enum sex{MALE, FEMALE, SPAYED, NEUTERED};
    sex petSex;

    public  Pet(String name, String ownerName, String color){
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public String getColor(){
        return color;
    }

    public void setSex(int sexId){
        try{
            if(sexId == 1){ petSex = sex.MALE;}
            else if(sexId == 2){petSex = sex.FEMALE;}
            else if(sexId == 3){petSex = sex.SPAYED;}
            else if(sexId == 4){petSex = sex.NEUTERED;}
        }catch (Exception e){
            throw new IllegalArgumentException("Not valid value!");
        }
    }

    public String getSex(){
        return petSex.toString();
    }

    public String toString() {
        String string = "";
        string = string + getName() + " owned by " + getOwnerName() + "\n"
                + "Color: " + getColor() + "\n"
                + "Sex: " + getSex();
        return string;
    }
}
