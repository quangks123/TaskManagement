
package models;

import library.Validation;

public class Task {
    private Validation val;
    private int id;
    private String name, tasktype, date, assignee, reviewer;
    private float time_from, time_to;
    
    public Task() {
        val = new Validation();
        id = 0;
        time_from = time_to = 0;
        name = tasktype = date = assignee = reviewer = "";
    }

    public Task(int id, String name, String tasktype, String date, String assignee, String reviewer, float time_from, float time_to) {
        this.id = id;
        this.name = name;
        this.tasktype = tasktype;
        this.date = date;
        this.assignee = assignee;
        this.reviewer = reviewer;
        this.time_from = time_from;
        this.time_to = time_to;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTasktype() {
        return tasktype;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = val.checkDate(date);
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public float getTime_from() {
        return time_from;
    }

    public void setTime_from(String time_from) {
        this.time_from = val.checkHourFrom(time_from);
    }

    public float getTime_to() {
        return time_to;
    }

    public void setTime_to(String time_to) {
        this.time_to = val.checkHourTo(time_to, time_from);
    }
    
    public void setTaskType(String s) {
        int ch = val.checkTypeTask(s);
        switch (ch) {
            case 1:
                tasktype = "Code";
                break;
            case 2:
                tasktype = "Test";
                break;
            case 3:
                tasktype = "Design";
                break;
            case 4: 
                tasktype = "Review";
                break;
        }
    }

    @Override
    public String toString() {
        return String.format("%-3s | %-15s | %-10s | %-10s | %-4s | %-9s | %-8s", id, name, tasktype, date, time_from, assignee, reviewer);
    }
    
    
}
