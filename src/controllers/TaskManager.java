
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
                v.addTask();
                Task task = new Task();
                
                task.setId(createID());
                
                v.enterName();
                task.setName(sc.nextLine());
                
                v.enterTaskType();
                task.setTaskType(sc.nextLine());
                
                v.enterDate();
                task.setDate(sc.nextLine());
                
                v.enterTimeFrom();
                task.setTime_from(sc.nextLine());
                
                v.enterTimeTo();
                task.setTime_to(sc.nextLine());
                
                v.enterAssignee();
                task.setAssignee(sc.nextLine());
                
                v.enterReviewer();
                task.setReviewer(sc.nextLine());
                
                tasks.add(task);
                v.anounceSuccess();
                break;
                
            case 2:
                v.deleteTask();
                v.enterId();
                int id = val.checkNum(sc.nextLine());
                for (int i = 0; i < tasks.size(); i++) {
                    if (tasks.get(i).getId() == id) {
                        tasks.remove(i);
                        v.anounceSuccess();
                        return;
                    } 
                }
                v.anounceFailed();      
                break;
                
            case 3:
                v.showTask();
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
