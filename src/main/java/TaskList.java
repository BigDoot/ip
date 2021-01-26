import java.util.ArrayList;

/**
 * Manages a tasks of Tasks with the ability to add/remove tasks.
 */
public class TaskList {
    protected ArrayList<Task> tasks;
    protected int numItems;

    /**
     * Constructor for this TaskList object.
     */
    TaskList() {
        this.tasks = new ArrayList<Task>();
        this.numItems = 0;
    }

    /**
     * Returns the number of tasks in the TaskList.
     * @return the size of the TaskList.
     */
    public int getNumItems() {
        return this.numItems;
    }

    /**
     * Adds a Todo Task to the TaskList
     * @param  str description of the task.
     */
    public void addTodo(String str) {
        tasks.add(numItems, new Todo(str));
        numItems++;
    }

    /**
     * Adds a Deadline Task to the TaskList
     * @param  str description of the task.
     * @param  by  deadline of task.
     */
    public void addDeadline(String str, String by) {
        tasks.add(numItems, new Deadline(str, by));
        numItems++;
    }

    /**
     * Adds an Event Task to the TaskList
     * @param  str description of the task.
     * @param  at  location of Event task.
     */
    public void addEvent(String str, String at) {
        tasks.add(numItems, new Event(str, at));
        numItems++;
    }

    /**
     * Prints all tasks in the TaskList
     */
    public void printTasks() {
        for (int i = 0; i < numItems; i++) {
            System.out.println(i+1 + "." + tasks.get(i));
        }
    }

    /**
     * Returns the task at the given index in the TaskList.
     * @param n index of the wanted task.
     * @return task at the given index in the TaskList.
     */
    public Task getAtInd(int n) {
        return tasks.get(n);
    }

    /**
     * Deletes the task at the given index in the TaskList.
     * @param n index of the task to be deleted.
     */
    public void deleteTask(int n) {
        tasks.remove(n);
        numItems--;
    }
}
