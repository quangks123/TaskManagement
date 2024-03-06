
package controllers;


import java.util.ArrayList;
import java.util.Scanner;
import library.Validation;
import models.Task;
import views.Menu;
import views.View;

public class TaskManager extends Menu{
    private Validation val;
    private View v;
    private Scanner sc;
    private ArrayList<Task> tasks;

    public TaskManager(String title, String[] choices) {
        super(title, choices);
        v = new View();
        tasks = new ArrayList<>();
        sc = new Scanner(System.in);
        val = new Validation();
    }

    @Override
    public void execute(int ch) {
        switch (ch) {
            case 1:
                v.printTitle("========= Task program =========");
                Task task = new Task();
                task.setId(createID());
                task.setName(v.inputAttribute("Requirement Name: "));
                do {                    
                    task.setTaskType(v.inputAttribute("Task Type: "));
                } while (task.getTasktype().equals(""));
                
                do {                    
                    task.setDate(v.inputAttribute("Date: "));
                } while (task.getDate().equals(""));
                
                do {                    
                    task.setTime_from(v.inputAttribute("From: "));
                } while (task.getTime_from() == -1);
                
                do {                    
                    task.setTime_to(v.inputAttribute("To: "));
                } while (task.getTime_to()== -1);
                  
                task.setAssignee(v.inputAttribute("Assignee: "));
                task.setReviewer(v.inputAttribute("Reviewer: "));
                
                tasks.add(task);
                v.printTitle("Successful!!");
                break;
                
            case 2:
                v.printTitle("---------Delete Task------");
                int id = val.checkNum(v.inputAttribute("ID: "));
                for (int i = 0; i < tasks.size(); i++) {
                    if (tasks.get(i).getId() == id) {
                        tasks.remove(i);
                        v.printTitle("Successful!!");
                        return;
                    } 
                }
                v.printTitle("Failed!!");      
                break;
                
            case 3:
                v.printTitle("------------- Show Task ---------------");
                System.out.println(String.format("%-3s | %-15s | %-10s | %-10s | %-4s | %-9s | %-8s", "ID", "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer"));
                for (Task t : tasks) {
                    System.out.println(t);
                }
                break;
        }
    }
    
    public int createID() {
        return tasks.size() + 1;
    }
}
