package Assignment_4.question2;

public class test {
    public static void main(String[] args) {
        PsychiatristObject psychiatristObject = new PsychiatristObject();
        MoodyObject happyObject = new HappyObject();
        MoodyObject sadObject = new SadObject();

        psychiatristObject.examine(happyObject);
        psychiatristObject.observe(happyObject);
        psychiatristObject.examine(sadObject);
        psychiatristObject.observe(sadObject);
    }
}
