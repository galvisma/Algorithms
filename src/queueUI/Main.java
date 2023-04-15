package queueUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int option = 0, inputData = 0;
        Line queue = new Line();
        do {

            try {
                option = Integer.parseInt(JOptionPane.showInputDialog(null, "Options: \n\n"
                        + "1. Insert \n\n"
                        + "2. Extract \n\n"
                        + "3. Display Content \n\n"
                        + "4. Exit \n\n"));

                switch (option) {
                    case 1:
                        inputData = Integer.parseInt(JOptionPane.showInputDialog(null, "Please Enter a Value"));
                        queue.Insert(inputData);
                        break;
                    case 2:
                        if (!queue.EmptyQueue()) {
                            JOptionPane.showMessageDialog(null, "A node was extracted with the value: " + queue.Extract());
                        } else {
                            JOptionPane.showMessageDialog(null, "The queue is Empty");
                        }
                        break;
                    case 3:
                        queue.DisplayContent();
                        break;
                    case 4:
                        option = 4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid Option");
                        break;
                }
            } catch (NumberFormatException e) {
            }
        } while (option != 4);
    }
}



