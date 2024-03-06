
package library;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Validation {
    private Scanner sc;

    public Validation() {
        sc = new Scanner(System.in);
    }

    public int checkNum(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return -1;
        }
    }
    
    public float checkHourFrom(String hour) {
        while (true) {                       
            try {
                float h = Float.parseFloat(hour);
                if (h >= 24 || h < 0) {
                    System.out.print("From: ");
                    hour = sc.nextLine();
                } else {
                    return h;
                }
            } catch (Exception e) {
                System.out.print("From: ");
                hour = sc.nextLine();
            }
        }
    }
    
    public float checkHourTo(String hour, float f) {
        while (true) {                       
            try {
                float h = Float.parseFloat(hour);
                if (h >= 24 || h <= f) {
                    System.out.print("To: ");
                    hour = sc.nextLine();
                } else {
                    return h;
                }
            } catch (Exception e) {
                System.out.print("To: ");
                hour = sc.nextLine();
            }
        }
    }
    
    
    public int checkTypeTask(String s) {
        while (true) {            
            try {
                int c = Integer.parseInt(s);
                if (c < 1 || c > 4) {
                    System.out.print("TTask type: ");
                    s = sc.nextLine();
                } else {
                    return c;
                }
            } catch (Exception e) {
                System.out.print("Task type: ");
                s = sc.nextLine();
            }
        }
    }
    
    public String checkDate(String date) {
        while (true) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
            try {
                String.valueOf(sdf.parse(date));
                return date;
            } catch (Exception e) {
                System.out.println("Date to correct format(dd/mm/yyyy)!!");
                System.out.print("Again: ");
                date = sc.nextLine();
            }
        }
    }

}
