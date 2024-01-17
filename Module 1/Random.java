import javax.swing.JOptionPane;

public class Random {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 100);
        JOptionPane.showMessageDialog(null, "The random number is " + number);
    }
}
