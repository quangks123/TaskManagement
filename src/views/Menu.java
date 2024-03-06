
package views;

import java.util.Scanner;
import library.Validation;

public abstract class Menu {
    protected String title;
    protected String[] choices;
    private Scanner sc;
    
    public Menu(String title, String[] choices) {
        this.title = title;
        this.choices = choices;
        sc = new Scanner(System.in);
    }
    
    private void print() {
        System.out.println(title);
        for (int i = 0; i < choices.length; i++) {
            System.out.println((i+1) + ". " + choices[i]);
        }
        System.out.println("-----------------");
        System.out.print("Enter your choice: ");
    }
    
    private int getChoice() {
        print();
        return new Validation().checkNum(sc.nextLine());
    }
    
    public void run() {
        while (true) {            
            int ch = getChoice();
            if ((1 <= ch) && (ch < choices.length)) {
                execute(ch);
            } else if (ch == choices.length){
                break;
            } else {
                System.out.println("Try again!");
                System.out.println("---------------");
            }
        }
    }
    
    public abstract void execute(int ch);
}
