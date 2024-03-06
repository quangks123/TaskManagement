
package test;

import controllers.TaskManager;

public class Main {
    public static void main(String[] args) {
        String[] choices = {"Add Task", "Delete Task", "Show task", "Exit"};
        new TaskManager("========= Task program =========", choices).run();
    }
}
