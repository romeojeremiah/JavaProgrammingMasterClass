import java.sql.SQLOutput;

public class SecondAndMinutesChallenge {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main (String[] args){
        System.out.println(getDurationString(270,13));
        System.out.println(getDurationString(364));
    }

    public static String getDurationString(int minutes, int seconds){
        int hours = 0;


        if ((minutes < 0)|| (seconds < 0 || seconds >59)){
            return INVALID_VALUE_MESSAGE;
        }


            hours = minutes / 60;
            int remainingMinutes = minutes % 60;


        return (hours+"h " + remainingMinutes+"m " + seconds+"s");

    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds /60 ;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);

    }
}
