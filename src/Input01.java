import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        String test = JOptionPane.showInputDialog("Type something");
        //Store the input as a String and print it.
        System.out.println(test);
        //Parse the input as an int.
        int testInt = Integer.parseInt(test);
        //Print its value +1
        testInt++;
        System.out.println(testInt);

        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));

    }
}
