public class Switch_Case_Eg1 {
    public static void main(String[] args) {

        // Variable holding day number (1 to 7)
        int day = 6;

        // Variables to store day name and day type
        String dayString;
        String dayType;

        // First switch:
        // Used to convert day number into day name
        switch (day) {

            // If day == 1, this case executes
            case 1:
                dayString = "Monday";
                break; // stops switch execution

            case 2:
                dayString = "Tuesday";
                break;

            case 3:
                dayString = "Wednesday";
                break;

            case 4:
                dayString = "Thursday";
                break;

            case 5:
                dayString = "Friday";
                break;

            case 6:
                dayString = "Saturday";
                break;

            case 7:
                dayString = "Sunday";
                break;

            // Executes only when no case matches
            default:
                dayString = "Invalid day";
        }

        // Second switch:
        // Used to find whether the day is a weekday or weekend
        switch (day) {

            // Multiple cases pointing to the same block
            // If day is 1 to 5, it is a weekday
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Weekday";
                break;

            // If day is 6 or 7, it is a weekend
            case 6:
            case 7:
                dayType = "Weekend";
                break;

            // Executes when day value is not between 1 and 7
            default:
                dayType = "Invalid day type";
        }

        // Prints final result using values set by both switches
        System.out.println(dayString + " is a " + dayType);
    }
}
