package Assignment_4.question1;

public class shapeTester {
    //Main operation class for testing
    public static void main(String args[]){
        shape s = new shape();
        rectangle r = new rectangle(2.0,3.0);
        circle c = new circle(4.0);
        square sq = new square(4.0);

        r.getArea();
        r.getPerimeter();
        c.getArea();
        c.getPerimeter();
        sq.getArea();
        sq.getPerimeter();
        r.draw();
        s.draw();
        c.draw();
        sq.draw();
    }
}
