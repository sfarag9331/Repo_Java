package HW15;

import HW14.Homework_14;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Homework_15 {
    public static void main(String[] args) {

        Homework_15 b = new Homework_15();
        b.twoHourTimeIntervals(5);
        /**
         * Question:
         * Create a method that will take an int as input.
         * return the timeline (hour am/pm) with interval of 2 hour from the current hour.
         */

        // sout(generateTimeline(5));
        // 9pm 11pm 1am 3am 5am

        // sout(generateTimeline(5));       // running the code around 8am
        // 8am 10am 12pm 2pm 4pm


        // sout(generateTimeline(10));       // running the code around 8am
        // 8am 10am 12pm 2pm 4pm 6pm 8pm 10pm 12am 2am
    }

    public void twoHourTimeIntervals (int timeLineLength) {
        Date currentTimeHour = new Date();
        DateFormat hourFormatForInt = new SimpleDateFormat("h");
        DateFormat hourFormatForIntervalTime = new SimpleDateFormat("ha");
        String currHourOfTheDay = hourFormatForInt.format(currentTimeHour);

        int currentHourInt = Integer.valueOf(currHourOfTheDay);
        int [] timeIntervalArray = new int[timeLineLength];


        for (int i = 0; i < timeIntervalArray.length; i++) {

            timeIntervalArray [i] = (currentHourInt + (2 * i));

        } System.out.println(Arrays.toString(timeIntervalArray));


        String [] timeIntervalArrayAAFormat = new String[timeLineLength];

        for (int i=0; i < timeIntervalArray.length; i++){
            timeIntervalArrayAAFormat[i] = hourFormatForIntervalTime.format(timeIntervalArray[i]);

        } System.out.println(Arrays.toString(timeIntervalArrayAAFormat));
    }
}
