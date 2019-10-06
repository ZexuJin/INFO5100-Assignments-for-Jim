package Assignment_4.question1;

public class square extends shape{
    private double side;

    public square(double side){
        super("square");
        this.side = side;
    }

    public void draw(){
        System.out.println("Drawing square");
    }

    public void getArea(){
        double area = side * side;
        System.out.println(area);
    }

    public void getPerimeter(){
        double perimeter = side * 4;
        System.out.println(perimeter);
    }
}
