
import java.util.Scanner;
public class TimeConversion {

    public static String timeConversion(String time) {
        String strHour, strMinute, strSecond, strMeridiem;
        String result = "";
        strHour = time.substring(0, 2);
        strMinute = time.substring(3, 5);
        strSecond = time.substring(6, 8);
        strMeridiem = time.substring(8, 10);

        int hour = Integer.parseInt(strHour);
        int minute = Integer.parseInt(strMinute);
        int second = Integer.parseInt(strSecond);

        if (strMeridiem.equalsIgnoreCase("pm") && hour == 12) {
            result = String.format("%02d:%02d:%02d", hour + 12, minute, second);
            if (hour == 12) {
                result = String.format("%02d:%02d:%02d", hour, minute, second);
            }
        }

        if (strMeridiem.equalsIgnoreCase("am")) {
            result = String.format("%02d:%02d:%02d", 12 - hour, minute, second);
            if (hour < 12) {
                result = String.format("%02d:%02d:%02d", hour, minute, second);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String time = in.nextLine();

        System.out.println(timeConversion(time));

    }

}
