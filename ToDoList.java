package todo_list_application; // Declares the package name.

public class ToDoList { // Begins the definition of a public class named ToDoList.

    private Node head; // Declares a private Node variable named head. This will be the start of our linked list of tasks.

    public void addToDo(Task task) { // Defines a public method to add a task to the to-do list.
        Node newNode = new Node(task); // Creates a new Node object with the task.

        if (head == null) { // Checks if the head of the list is null, which means the list is empty.
            head = newNode; // If the list is empty, the new node becomes the head of the list.
        } else { // If the list is not empty...
            Node current = head; // We start at the head of the list.
            while (current.getNext() != null) { // And go through the list until we find the last node.
                current = current.getNext(); // Move to the next node.
            }
            current.setNext(newNode); // The new node is added after the last node.
        }
    }

    public void markToDoAsCompleted(String title) { // Defines a public method to mark a task as completed.
        Node current = head; // We start at the head of the list.
        while (current != null) { // And go through the list until we find the task with the given title.
            if (current.getTask().getTitle().equals(title)) { // If the title of the current task matches the given title...
                current.getTask().markCompleted(); // We mark the task as completed.
                break; // And stop searching.
            }
            current = current.getNext(); // Move to the next node.
        }
    }

    public void viewToDoList() { // Defines a public method to view the to-do list.
        Node current = head; // We start at the head of the list.
        while (current != null) { // And go through the list.
            Task task = current.getTask(); // Get the task from the current node.
            System.out.println("Title: " + task.getTitle()); // Print the title of the task.
            System.out.println("Description: " + task.getDescription()); // Print the description of the task.
            System.out.println("Completed: " + task.isCompleted()); // Print whether the task is completed or not.
            System.out.println("--------------------"); // Print a separator.
            current = current.getNext(); // Move to the next node.
        }
    }
} // Ends the definition of the ToDoList class.
