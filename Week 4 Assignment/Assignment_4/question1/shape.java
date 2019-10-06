package Assignment_4.question1;

public class shape {
    private String name;
    private double perimeter;
    private double area;

    public shape(){
        this.name = "shape";
    }

    public shape (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void draw(){
        System.out.println("Drawing shape");
    }

    public void getArea(){
        System.out.println("It's not a valid shape!");
    }

    public void getPerimeter(){
        System.out.println("It's not a valid shape!");
    }
}

