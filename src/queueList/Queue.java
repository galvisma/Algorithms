package queueList;

import javax.swing.*;

public class Queue {
    private Node startQueue, endQueue;
    String queue = " ";

    // create constructor
    public Queue() {
        startQueue = null;
        endQueue = null;
    }

    // method to know if the queue is empty.
    public boolean EmptyQueue() {
        if (startQueue == null) {
            return true;
        } else {
            return false;
        }
    }

    // method to insert information in the queue
    public void Insert(int inputData) {
        Node recentNode = new Node();
        recentNode.inputData = inputData;
        recentNode.after = null;
        if (EmptyQueue()) {
            startQueue = recentNode;
            endQueue = recentNode;
        } else {
            endQueue.after = recentNode;
            endQueue = recentNode;
        }
    }

    // method to extract information in the queue
    public int Extract() {
        if (!EmptyQueue()) {
            int inputData = startQueue.inputData;
            if (startQueue == endQueue) {
                startQueue = null;
                endQueue = null;
            } else {
                startQueue = startQueue.after;
            }
            return inputData;
        } else {
            return 0;
        }
    }

    // method to display the contents of the queue
    public void DisplayContent() {

        Node route = startQueue;
        String invertedQueue = "";
        while (route != null) {
            queue += route.inputData + " ";
            route = route.after;
        }

        String string[] = queue.split(" ");
        for (int i = string.length - 1; i >= 0; i--) {
            invertedQueue += " " + string[i];
        }
        System.out.println("Content of Queue: " + invertedQueue);


        JOptionPane.showMessageDialog(null, invertedQueue);
        queue = "";
    }
}
