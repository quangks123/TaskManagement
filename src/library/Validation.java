
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
    
    public float checkHour(String hour, float min) {                     
        try {
            float h = Float.parseFloat(hour);
            if (h >= 24 || h <= min) {
                return -1;
            } else {
                return h;
            }
        } catch (Exception e) {
            return -1;
        }
    }
    
    
    public int checkTypeTask(String s) {           
        try {
            int c = Integer.parseInt(s);
            return c;
        } catch (Exception e) {
            return 0;
        }

    }
    
    public String checkDate(String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        try {
            String.valueOf(sdf.parse(date));
            return date;
        } catch (Exception e) {
            System.out.println("Date to correct format(dd/mm/yyyy)!!");
            return "";
        }
    }


}
