public class Ui {
    public void welcome() {
        String logo = " ____        _        \n" + "|  _ \\ _   _| | _____ \n" + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n" + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello, I'm\n" + logo);
        System.out.println("What can I do for you?");
    }

    public void taskAdded(TaskList list) {
        System.out.println("Got it. I've added this task: ");
        System.out.println(list.get(list.list.size() - 1));
        System.out.println("Now you have " + list.list.size() + " tasks in the list.");
    }

    public void exit() {
        System.out.println("Bye. Hope to see you again soon!");
    }

    public void done(TaskList list, int item) {
        System.out.println("Nice! I've marked this task as done:");
        System.out.println(list.get(item));
    }

    public void list(TaskList list) {
        System.out.print(list);
    }

    public void delete(Task t) {
        System.out.println("Noted. I've removed this task:");
        System.out.println(t);
    }
}