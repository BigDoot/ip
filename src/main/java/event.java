/**
 * Represents a Task Object that is an event at a certain location.
 */
public class Event extends Task {
    protected String at;

    /**
     * Constructor for this Event object.
     * @param   description  Task Description.
     * @param   at           Location of task.
     */
    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + "(at: " + at + ")";
    }
}
