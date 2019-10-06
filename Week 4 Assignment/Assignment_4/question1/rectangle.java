package Assignment_4.question1;

public class rectangle extends shape {
    private double length;
    private double width;

    public rectangle(double length, double width){
        super("rectangle");
        this.length = length;
        this.width = width;
    }

    public void draw(){
        System.out.println("Drawing rectangle");
    }

    public void getArea(){
        double area =  length*width;
        System.out.println(area);
    }

    public void getPerimeter(){
        double perimeter = (length + width) * 2;
        System.out.println(perimeter);
    }

}
