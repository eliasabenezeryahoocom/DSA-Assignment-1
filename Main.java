package todo_list_application;
public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        // Add tasks to the to-do list
        toDoList.addToDo(new Task("Task 1", "Description of Task 1"));
        toDoList.addToDo(new Task("Task 2", "Description of Task 2"));
        toDoList.addToDo(new Task("Task 3", "Description of Task 3"));

        // Mark a task as completed
        toDoList.markToDoAsCompleted("Task 2");

        // View the to-do list
        toDoList.viewToDoList();
    }
}

