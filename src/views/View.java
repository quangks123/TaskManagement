
package views;

public class View {
    public void addTask() {
        System.out.println("------ ADD TASK ------");
    }
    
    public void enterId() {
        System.out.print("ID: ");
    }
    
    public void enterName() {
        System.out.print("Name: ");
    }
    
    public void enterTaskType() {
        System.out.print("Task type: ");
    }
    
    public void enterDate() {
        System.out.print("Date: ");
    }
    
    public void enterTimeFrom() {
        System.out.print("From: ");
    }
    
    public void enterTimeTo() {
        System.out.print("To: ");
    }
    
    public void enterAssignee() {
        System.out.print("Assignee: ");
    }
    
    public void enterReviewer() {
        System.out.print("Reviewer: ");
    }
    
    public void deleteTask() {
        System.out.println("-------- DELETE TASK ---------");
    }
    
    public void showTask() {
        System.out.println("-------- SHOW TASK ---------");
    }
    
    public void anounceSuccess() {
        System.out.println("SUCCESSFUL!!");
    }
    
    public void anounceFailed() {
        System.out.println("FAILED!!");
    }
}
