package todo_list_application; // Declares the package name.

public class Node { // Begins the definition of a public class named Node.

    private Task task; // Declares a private Task variable named task. This will hold the task data for this node.
    private Node next; // Declares a private Node variable named next. This will point to the next node in the list.

    public Node(Task task) { // Defines a public constructor for the Node class that takes a Task parameter.
        this.task = task; // Assigns the value of the task parameter to the task field of the class.
        this.next = null; // Sets the next field of the class to null. This means the node does not point to any other node yet.
    }

    public Task getTask() { // Defines a public method that returns the task field.
        return task; // Returns the value of the task field.
    }

    public Node getNext() { // Defines a public method that returns the next field.
        return next; // Returns the value of the next field.
    }

    public void setNext(Node next) { // Defines a public method that sets the next field to a given Node.
        this.next = next; // Sets the value of the next field to the given Node.
    }
} // Ends the definition of the Node class.
