package todo_list_application; // Declares the package name.

public class Task { // Begins the definition of a public class named Task.

    private String title; // Declares a private String variable named title.
    private String description; // Declares a private String variable named description.
    private boolean completed; // Declares a private boolean variable named completed.

    public Task(String title, String description) { // Defines a public constructor for the Task class that takes two String parameters.
        this.title = title; // Assigns the value of the title parameter to the title field of the class.
        this.description = description; // Assigns the value of the description parameter to the description field of the class.
        this.completed = false; // Sets the completed field of the class to false.
    }

    public String getTitle() { // Defines a public method that returns the title field.
        return title; // Returns the value of the title field.
    }

    public String getDescription() { // Defines a public method that returns the description field.
        return description; // Returns the value of the description field.
    }

    public boolean isCompleted() { // Defines a public method that returns the completed field.

        return completed; // Returns the value of the completed field.
    }

    public void markCompleted() { // Defines a public method that sets the completed field to true.
        completed = true; // Sets the value of the completed field to true.
    }
} // Ends the definition of the Task class.