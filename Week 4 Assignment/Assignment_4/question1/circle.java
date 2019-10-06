package Assignment_4.question1;

public class circle extends shape{

    private double radius;
    private double PI = 3.14;

    public circle(double radius){
        super("circle");
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Drawing circle");
    }

    public void getArea(){
        double area = PI * radius * radius;
        System.out.println(area);
    }

    public void getPerimeter(){
        double perimeter =  PI * radius * 2;
        System.out.println(perimeter);
    }
}
