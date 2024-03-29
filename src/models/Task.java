
package models;

import library.Validation;

public class Task {
    private Validation val;
    private int id;
    private String name, tasktype, date, assignee, reviewer;
    private float time_from, time_to;
    
    public Task() {
        val = new Validation();
    }

    public Task(int id, String name, int tasktype, String date, float time_from, float time_to, String assignee, String reviewer) {
        setId(id);
        setName(name);
        setTaskType(String.valueOf(tasktype));
        setDate(date);
        setAssignee(assignee);
        setReviewer(reviewer);
        setTime_from(String.valueOf(time_from));
        setTime_to(String.valueOf(time_to));
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
        this.time_from = val.checkHour(time_from, 0);
    }

    public float getTime_to() {
        return time_to;
    }

    public void setTime_to(String time_to) {
        this.time_to = val.checkHour(time_to, time_from);
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
            default:
                tasktype = "";
                break;
        }
    }

    @Override
    public String toString() {
        return String.format("%-3s | %-15s | %-10s | %-10s | %-4s | %-9s | %-8s", id, name, tasktype, date, time_to - time_from, assignee, reviewer);
    }
    
    
}
