public class Todo extends Task {
    public Todo(String content, int status, int order) {
        super(content, status, order);
    }

    /**
     * returns string in console printing format
     */
    public String toString() {
        return "[T]" + super.toString();
    }

    /**
     * returns string in file printing format
     */
    public String toFile() {
        return "T," + super.toFile();
    }
}