
package views;

import java.util.Scanner;

public class View {
    private Scanner sc;
    public View() {
        sc = new Scanner(System.in);
    }
    
    
    public void printTitle(String message) {
        System.out.println(message);
    }
    
    public String inputAttribute(String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
