import javax.swing.JOptionPane;

public class thirdProgram {
    public static void main(String[] args) {
        
        int startingNumber = 23;
        String results;
        String inputRequest;

        //Asks user for input of guess
        results = JOptionPane.showInputDialog(null, "Guess the lucky number");

        //Convert using parseInt
        int guess = Integer.parseInt(results);

        //Logic for input value
        
        if (guess == startingNumber){
            inputRequest = "Great guess";
        } else {
            inputRequest = "Sorry try again";
        }

        //Output end result
        JOptionPane.showMessageDialog(null, inputRequest);
    }
}
