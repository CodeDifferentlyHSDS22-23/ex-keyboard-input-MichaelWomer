import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "There's no input here, just a message",
                "Title",
                0);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "What is your name?",
                "Question",
                2,
                null,
                null,
                "Type your name.");
        System.out.print("Your name is " + input1 + ".");
        
        String[] acceptableValues = {"Yes", "Maybe", "No"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);

                
    }
}
