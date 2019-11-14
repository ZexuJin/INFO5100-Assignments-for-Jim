package Assignment_8;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class simpleCalculator extends JFrame{
    private JPanel panel;
    private JTextField textField;
    private JButton jb0, jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, dot, add, sub, multiply, divide, equal;

    public simpleCalculator(){
        this.setBounds(300, 300, 300, 300);
        this.setLayout(new BorderLayout());

        textField = new JTextField(15);

        jb0 = new JButton("0");
        jb1 = new JButton("1");
        jb2 = new JButton("2");
        jb3 = new JButton("3");
        jb4 = new JButton("4");
        jb5 = new JButton("5");
        jb6 = new JButton("6");
        jb7 = new JButton("7");
        jb8 = new JButton("8");
        jb9 = new JButton("9");
        dot = new JButton(".");
        add = new JButton("+");
        sub = new JButton("-");
        multiply = new JButton("x");
        divide = new JButton("/");
        equal = new JButton("=");

        panel = new JPanel();
        panel.setLayout(new GridLayout(4,4));
        //first column
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);
        panel.add(add);
        //second column
        panel.add(jb4);
        panel.add(jb5);
        panel.add(jb6);
        panel.add(sub);
        //third column
        panel.add(jb7);
        panel.add(jb8);
        panel.add(jb9);
        panel.add(multiply);
        //forth column
        panel.add(jb0);
        panel.add(dot);
        panel.add(equal);
        panel.add(divide);


        this.add(textField,BorderLayout.NORTH);
        this.add(panel);
        doMath();
        this.setVisible(true);
    }

    public void doMath(){
        Text(jb0);
        Text(jb1);
        Text(jb2);
        Text(jb3);
        Text(jb4);
        Text(jb5);
        Text(jb6);
        Text(jb7);
        Text(jb8);
        Text(jb9);
        Text(dot);
        Text(add);
        Text(sub);
        Text(multiply);
        Text(divide);

        equal.addActionListener(e -> {

            textField.setText(textField.getText()+equal.getText());

            if(textField.getText().contains("+")){
                double d1,d2;
                StringTokenizer st1 = new StringTokenizer(textField.getText(),"+");
                d1 = Double.parseDouble(st1.nextToken());
                StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
                d2 = Double.parseDouble(st2.nextToken());
                textField.setText(textField.getText()+" "+(d1+d2));
            }

            if(textField.getText().contains("-")){
                double d1,d2;
                StringTokenizer st1 = new StringTokenizer(textField.getText(),"-");
                d1 = Double.parseDouble(st1.nextToken());
                StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
                d2 = Double.parseDouble(st2.nextToken());
                textField.setText(textField.getText()+" "+(d1-d2));
            }

            if(textField.getText().contains("x")){
                double d1,d2;
                StringTokenizer st1 = new StringTokenizer(textField.getText(),"x");
                d1 = Double.parseDouble(st1.nextToken());
                StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
                d2 = Double.parseDouble(st2.nextToken());
                textField.setText(textField.getText()+" "+(d1*d2));
            }

            else{
                double d1,d2;
                StringTokenizer st1 = new StringTokenizer(textField.getText(),"/");
                d1 = Double.parseDouble(st1.nextToken());
                StringTokenizer st2 = new StringTokenizer(st1.nextToken(),"=");
                d2 = Double.parseDouble(st2.nextToken());
                textField.setText(textField.getText()+" "+(d1/d2));
            }
        });
    }

    public void Text(JButton button){
        button.addActionListener(arg0 -> {
            String str = button.getText();
            textField.setText(textField.getText()+str);
        });
    }

    public static void main(String[] args) {
        new simpleCalculator();
    }

}
